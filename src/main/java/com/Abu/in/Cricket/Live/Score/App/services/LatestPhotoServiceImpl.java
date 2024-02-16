package com.Abu.in.Cricket.Live.Score.App.services;

import com.Abu.in.Cricket.Live.Score.App.entities.LatestPhoto;
import com.Abu.in.Cricket.Live.Score.App.repositories.LatestPhotoRepo;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class LatestPhotoServiceImpl implements LatestPhotoService {
    private LatestPhotoRepo latestPhotoRepo;

    public LatestPhotoServiceImpl(LatestPhotoRepo latestPhotoRepo) {
        this.latestPhotoRepo = latestPhotoRepo;
    }

    @Override
    public List<LatestPhoto> getPhotoDetails() {
        List<LatestPhoto> detailList = new ArrayList<>();
        try {
            String latestNewsUrl = "https://www.cricbuzz.com/cricket-news/latest-news";
            Document document = Jsoup.connect(latestNewsUrl).get();
            Elements news = document.select("div.cb-lst-itm");
            for(Element element : news){
                String photoHeading =element.select("div.cb-nws-time").text();
                String photoDesc = element.select("h2.cb-nws-hdln").select("a.cb-nws-hdln-ancr").text();
                String photoIntro = element.select("div.cb-nws-intr").text();
                String photoTime = element.select("span.cb-nws-time").text();
                String photoUrl = element.select("div.cb-pos-rel").select("img").attr("src");
                String photoUrlAttr = element.select("div.cb-pos-rel").select("img").attr("alt");
                if(photoIntro.isEmpty() || photoDesc.isEmpty() || photoUrl.isEmpty()){

                }else{
                    LatestPhoto latestPhoto = new LatestPhoto();
                    latestPhoto.setPhotoTime(photoTime);
                    latestPhoto.setPhotoDesc(photoDesc);
                    latestPhoto.setPhotoIntro(photoIntro);
                    latestPhoto.setPhotoHeading(photoHeading);
                    latestPhoto.setPhotoUrl(photoUrl);
                    latestPhoto.setPhotoUrlAttr(photoUrlAttr);

                    detailList.add(latestPhoto);
                    latestPhotoRepo.save(latestPhoto);

                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return detailList;
    }



}
