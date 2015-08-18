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

    @RequestMapping("/getCategories")
    public String getCategories() {
        return VideoService.getCategories();
    }

    @RequestMapping("/addVideo")
    public String addVideo(String videoInfo) {
        return VideoService.addVideo(videoInfo);
    }

    @RequestMapping("/getVideo")
    public String getVideo(String videoId) {
        return VideoService.getVideo(videoId);
    }

    @RequestMapping("/deleteVideo")
    public static String deleteVideo(String videoId) {
        return VideoService.deleteVideo(videoId);
    }
}
