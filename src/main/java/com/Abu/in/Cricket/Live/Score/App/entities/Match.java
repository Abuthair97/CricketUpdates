package com.Abu.in.Cricket.Live.Score.App.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cricket_match")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;
    private String teamHeading;
    private String matchNumberVenue;
    private String battingTeamScore;
    private String battingTeam;
    private String bowlTeamScore;
    private String bowlTeam;
    private  String liveText;
    private String matchLink;
    private String textComplete;

    @Enumerated
    private MatchStatus status;

    private Date date = new   Date();

    public void setMatchStatus(){
        if(this.textComplete.trim().isBlank()){
            this.status=MatchStatus.LIVE;
        }
        else{
            this.status=MatchStatus.COMPLETED;
        }
    }


}
