package com.Abu.in.Cricket.Live.Score.App.repositories;

import com.Abu.in.Cricket.Live.Score.App.entities.LatestPhoto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface LatestPhotoRepo extends JpaRepository<LatestPhoto,Integer> {


//    Optional<LatestPhoto> findByPhotoHeading(String photoHeading);
}
