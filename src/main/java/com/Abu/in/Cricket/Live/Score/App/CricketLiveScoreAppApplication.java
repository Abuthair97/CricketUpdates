package com.Abu.in.Cricket.Live.Score.App;


import com.Abu.in.Cricket.Live.Score.App.entities.LatestPhoto;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CricketLiveScoreAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CricketLiveScoreAppApplication.class, args);
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
				String photoUrlarr = element.select("div.cb-pos-rel").select("img").attr("alt");
				if(photoIntro.isEmpty() || photoDesc.isEmpty() ||photoUrl.isEmpty()){

				}else{
					System.out.println(" _______________________________");
					System.out.println("PhotoIntro "+photoIntro);
					System.out.println("photDesc "+photoDesc );
					System.out.println("photoTime "+photoTime);
					System.out.println("photoHeading  " +photoHeading);
					System.out.println("PhotoUrl " +photoUrl);
					System.out.println("photoUrlarr "+photoUrlarr);
					System.out.println(" _______________________________");

				}

			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}


	}

				}

