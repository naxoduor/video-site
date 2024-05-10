package com.videoshare.oduor.youtubeclone.repository;

import com.videoshare.oduor.youtubeclone.model.Video;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VideoRepository extends MongoRepository<Video, String> {

}
