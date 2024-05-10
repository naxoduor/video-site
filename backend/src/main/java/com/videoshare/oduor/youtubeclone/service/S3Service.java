package com.videoshare.oduor.youtubeclone.service;

//import io.awspring.cloud.s3.ObjectMetadata;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;
//import software.amazon.awssdk.core.sync.RequestBody;
//import software.amazon.awssdk.services.s3.S3Client;
//import software.amazon.awssdk.services.s3.model.GetUrlRequest;
//import software.amazon.awssdk.services.s3.model.ObjectCannedACL;
//import software.amazon.awssdk.services.s3.model.PutObjectRequest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

//@Service
@RequiredArgsConstructor
public class S3Service implements FileService{

//    public static final String BUCKET_NAME = "youtubedemo-nax";
//    private final S3Client s3Client;

    @Override
    public String uploadVideo(MultipartFile file){
//        var filenameExtension = StringUtils.getFilenameExtension(file.getOriginalFilename());
//        var key = UUID.randomUUID().toString() + "." + filenameExtension;
//
//        Map<String, String> metadata= new HashMap<>();
//        metadata.put("contentLength", String.valueOf(file.getSize()));
//        metadata.put("contentType", file.getContentType());
//        PutObjectRequest putObjectRequest = PutObjectRequest.builder()
//                .bucket(BUCKET_NAME)
//                .key(key)
//                .metadata(metadata)
//                .acl(ObjectCannedACL.PUBLIC_READ)
//                .build();
//        try {
//            s3Client.putObject(putObjectRequest, RequestBody.fromInputStream(file.getInputStream(), file.getSize()));
//        }
//        catch(IOException ioException) {
//            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "An exception occured while uploading the file");
//        }
//        return GetUrlRequest.builder()
//                .bucket(BUCKET_NAME)
//                .key(key)
//                .build().toString();
        return "string";
    }
}
