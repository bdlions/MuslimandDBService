/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.muslimand.service;

import com.shampan.services.VideoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sampan-IT
 */
@RestController
@RequestMapping("/video")
public class VideoController {

    @RequestMapping("/getVideoCategories")
    public String getVideoCategories() {
        return VideoService.getVideoCategories();
    }

    @RequestMapping("/addVideo")
    public String addVideo(String videoInfo) {
        return VideoService.addVideo(videoInfo);
    }

    @RequestMapping("/getVideo")
    public String getVideo(String videoId) {
        return VideoService.getVideo(videoId);
    }

    @RequestMapping("/updateVideo")
    public static String updateVideo(String videoId,String videoInfo) {
        return VideoService.updateVideo(videoId,videoInfo);
    }
    @RequestMapping("/deleteVideo")
    public static String deleteVideo(String videoId) {
        return VideoService.deleteVideo(videoId);
    }
    @RequestMapping("/addVideoLike")
    public static String addVideoLike(String videoId,String likeInfo) {
        return VideoService.addVideoLike(videoId,likeInfo);
    }
      @RequestMapping("/getVideoLikeList")
    public static String getVideoLikeList(String videoId) {
        return VideoService.getVideoLikeList(videoId);
    }
      @RequestMapping("/deleteVideoLike")
    public static String deleteVideoLike(String videoId,String likeId) {
        return VideoService.deleteVideoLike(videoId,likeId);
    }
      @RequestMapping("/addVideoComment")
    public static String addVideoComment(String videoId,String commentInfo) {
        return VideoService.addVideoComment(videoId,commentInfo);
    }
      @RequestMapping("/getVideoComments")
    public static String getVideoComments(String videoId) {
        return VideoService.getVideoComments(videoId);
    }
      @RequestMapping("/editVideoComment")
    public static String editVideoComment(String videoId,String commentId, String commentInfo) {
        return VideoService.editVideoComment(videoId, commentId,commentInfo);
    }
}
