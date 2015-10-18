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

    @RequestMapping("/getCategoriesAndAlbums")
    public String getCategoriesAndAlbums(String userId) {
        return PhotoService.getCategoriesAndAlbums(userId);
    }

    @RequestMapping("/getAlbums")
    public String getAlbums(String userId) {
        return PhotoService.getAlbums(userId);
    }

    @RequestMapping("/getAlbum")
    public String getAlbum(String userId,String albumId) {
        return PhotoService.getAlbum(userId,albumId);
    }
    @RequestMapping("/getAlbumInfo")
    public String getAlbumInfo(String userId,String albumId) {
        return PhotoService.getAlbumInfo(userId,albumId);
    }

    @RequestMapping("/createAlbum")
    public String createAlbum(String albumInfo) {
        return PhotoService.createAlbum(albumInfo);
    }

    @RequestMapping("/editAlbum")
    public String editAlbum(String albumId, String albumInfo) {
        return PhotoService.editAlbum(albumId, albumInfo);
    }

    @RequestMapping("/getAlbumComments")
    public String getAlbumComments(String albumId) {
        return PhotoService.getAlbumComments(albumId);
    }

    @RequestMapping("/deleteAlbum")
    public String deleteAlbum(String albumId) {
        return PhotoService.deleteAlbum(albumId);
    }

    @RequestMapping("/addAlbumLike")
    public String addAlbumLike(String albumId, String likeInfo) {
        return PhotoService.addAlbumLike(albumId, likeInfo);
    }

    @RequestMapping("/deleteAlbumLike")
    public String deleteAlbumLike(String albumId, String likeid) {
        return "";
    }

    @RequestMapping("/getAlbumLikeList")
    public String getAlbumLikeList(String albumId) {
        return PhotoService.getAlbumLikeList(albumId);
    }

    @RequestMapping("/addAlbumComment")
    public String addAlbumComment(String albumId, String commentInfo) {
        return PhotoService.addAlbumComment(albumId, commentInfo);
    }

    @RequestMapping("/editAlbumComment")
    public String editAlbumComment(String albumId, String commentId, String commentInfo) {
        return PhotoService.editAlbumComment(albumId, commentId, commentInfo);
    }

    @RequestMapping("/deleteAlbumComment")
    public String deleteAlbumComment(String albumId, String commentId) {
        return PhotoService.deleteAlbumComment(albumId, commentId);
    }

    @RequestMapping("/getPhotos")
    public static String getPhotos(String userId,String albumId) {
        return PhotoService.getPhotos(userId,albumId);
    }

    @RequestMapping("/getUserPhotos")
    public static String getUserPhotos(String userId, int offset, int limit) {
        return PhotoService.getUserPhotos(userId, offset, limit);
    }

    @RequestMapping("/getPhoto")
    public String getPhoto(String userId,String photoId) {
        return PhotoService.getPhoto(userId,photoId);
    }

    @RequestMapping("/getPhotoListByCategory")
    public String getPhotoListByCategory(String albumId, String categoryId, int limit, int offset) {
        return PhotoService.getPhotoListByCategory(albumId, categoryId, limit, offset);
    }

    @RequestMapping("/addPhotos")
    public String addPhotos(String albumId ,String photoList) {
        return PhotoService.addPhotos(albumId,photoList);
    }

    @RequestMapping("/editPhoto")
    public String editPhoto(String photoId, String photoInfo) {
        return PhotoService.editPhoto(photoId, photoInfo);
    }

    @RequestMapping("/getPhotoComments")
    public String getPhotoComments(String photoId) {
        return PhotoService.getPhotoComments(photoId);
    }

    @RequestMapping("/deletePhoto")
    public String deletePhoto(String albumId, String photoId) {
        return PhotoService.deletePhoto(albumId,photoId);
    }

    @RequestMapping("/addPhotoLike")
    public String addPhotoLike(String photoId, String likeInfo) {
        return PhotoService.addPhotoLike(photoId, likeInfo);
    }

    @RequestMapping("/deletePhotoLike")
    public String deletePhotoLike(String photoId, String likeId) {
        return PhotoService.deletePhotoLike(photoId, likeId);
    }

    @RequestMapping("/getPhotoLikeList")
    public String getPhotoLikeList(String photoId) {
        return PhotoService.getPhotoLikeList(photoId);
    }

    @RequestMapping("/addPhotoComment")
    public String addPhotoComment(String photoId, String commentInfo) {
        return PhotoService.addPhotoComment(photoId, commentInfo);
    }

    @RequestMapping("/editPhotoComment")
    public String editPhotoComment(String photoId, String commentId, String commentInfo) {
        return PhotoService.editPhotoComment(photoId, commentId, commentInfo);
    }

    @RequestMapping("/deletePhotoComment")
    public String deletePhotoComment(String photoId, String commentId) {
        return PhotoService.deletePhotoComment(photoId, commentId);
    }

}
