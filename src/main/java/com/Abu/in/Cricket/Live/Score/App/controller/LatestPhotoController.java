package com.Abu.in.Cricket.Live.Score.App.controller;


import com.Abu.in.Cricket.Live.Score.App.entities.LatestPhoto;
import com.Abu.in.Cricket.Live.Score.App.services.LatestPhotoService;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Cricket")
@CrossOrigin("*")
public class LatestPhotoController {
    private LatestPhotoService latestPhotoService;

    public LatestPhotoController(LatestPhotoService latestPhotoService) {
        this.latestPhotoService = latestPhotoService;
    }

    @GetMapping("/latestNews")
    ResponseEntity<List<LatestPhoto>> getPhotoDetails(){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("desc ","getting latest new ");
        return new ResponseEntity<>(this.latestPhotoService.getPhotoDetails(),httpHeaders, HttpStatus.OK);
    }

}
