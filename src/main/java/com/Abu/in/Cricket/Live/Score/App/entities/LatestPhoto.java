package com.Abu.in.Cricket.Live.Score.App.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "latest_photo")
public class LatestPhoto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int photoId;
    private String photoUrl;
    private String photoUrlAttr;
    private String photoHeading;
    private String photoDesc;
    private String photoIntro;
    private String photoTime;


}
