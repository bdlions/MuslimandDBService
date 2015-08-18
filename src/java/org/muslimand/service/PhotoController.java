/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.muslimand.service;

import com.shampan.services.PhotoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sampan-IT
 */
@RestController
@RequestMapping("/photo")
public class PhotoController {

    @RequestMapping("/getCategories")
    public String getCategories() {
        return PhotoService.getCategories();
    }

    @RequestMapping("/createAlbum")
    public String createAlbum(String albumInfo) {
        return PhotoService.createAlbum(albumInfo);
    }
    
    @RequestMapping("/getCategoriesAndAlbums")
    public String getCategoriesAndAlbums(String userId) {
        return PhotoService.getCategoriesAndAlbums(userId);
    }
    
    
    @RequestMapping("/getAlbums")
    public String getAlbums(String userId) {
        return PhotoService.getAlbums(userId);
    }

    @RequestMapping("/getAlbum")
    public String getAlbum(String albumId) {
        return PhotoService.getAlbum(albumId);
    }

    @RequestMapping("/addAlbumLike")
    public String addAlbumLike(String albumId, String likeInfo) {
        return PhotoService.addAlbumLike(albumId, likeInfo);
    }

    @RequestMapping("/addAlbumComment")
    public String addAlbumComment(String albumId, String commentInfo) {
        return PhotoService.addAlbumComment(albumId, commentInfo);
    }

    @RequestMapping("/addPhoto")
    public String addPhoto(String photoInfo) {
        return PhotoService.addPhoto(photoInfo);
    }

    @RequestMapping("/getPhoto")
    public String getPhoto(String photoId) {
        return PhotoService.getPhoto(photoId);
    }

    @RequestMapping("/updatePhoto")
    public String updatePhoto(String photoId, String image) {
        return PhotoService.updatePhoto(photoId, image);
    }

    @RequestMapping("/deletePhoto")
    public String deletePhoto(String photoId) {
        return PhotoService.deletePhoto(photoId);
    }

    @RequestMapping("/getPhotos")
    public static String getPhotos(String albumId) {
        return PhotoService.getPhotos(albumId);
    }
}
