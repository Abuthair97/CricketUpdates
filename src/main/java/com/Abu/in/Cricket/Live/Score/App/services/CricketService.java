package com.Abu.in.Cricket.Live.Score.App.services;

import com.Abu.in.Cricket.Live.Score.App.entities.Match;

import java.util.List;

public interface CricketService {
    List<Match> getLiveMatchScore();
//    List<Match> getAllMatches();
    List<Match> getU19WorldCupPointTable();
}
