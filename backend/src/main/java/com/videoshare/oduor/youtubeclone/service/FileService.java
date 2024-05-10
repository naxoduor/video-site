package com.videoshare.oduor.youtubeclone.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {

    String uploadVideo(MultipartFile multipartFile);
}
