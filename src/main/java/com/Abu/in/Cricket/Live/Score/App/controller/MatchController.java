package com.Abu.in.Cricket.Live.Score.App.controller;


import com.Abu.in.Cricket.Live.Score.App.entities.Match;
import com.Abu.in.Cricket.Live.Score.App.services.CricketService;
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
public class MatchController {

    private final CricketService cricketService;

    public MatchController(CricketService cricketService) {
        this.cricketService = cricketService;
    }
    @GetMapping("/live")
    ResponseEntity<List<Match>> getLiveMatchScore(){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("desc","Getting live Match Score");
        return new ResponseEntity<>(this.cricketService.getLiveMatchScore(),httpHeaders, HttpStatus.OK);
    }

//    @GetMapping
//     ResponseEntity<List<Match>> getAllMatches(){
//        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.add("desc","Getting All Matches");
//        return new ResponseEntity<>(this.cricketService.getAllMatches(),httpHeaders,HttpStatus.OK);
//    }
    List<Match> getU19WorldCupPointTable(){
        return null;
    }


}
