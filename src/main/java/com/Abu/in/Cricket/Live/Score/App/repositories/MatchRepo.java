package com.Abu.in.Cricket.Live.Score.App.repositories;

import com.Abu.in.Cricket.Live.Score.App.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MatchRepo extends JpaRepository<Match,Integer> {



 Optional<Match> findByTeamHeading(String teamHeading);
}
