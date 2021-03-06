/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.muslimand.service;

import com.shampan.services.StatusService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sampan-IT
 */
@RestController
@RequestMapping("/status")
public class StatusController {

    @RequestMapping("/addStatus")
    public String addStatus(String statusInfo) {
        return StatusService.addStatus(statusInfo);
    }

    @RequestMapping("/getStatuses")
    public String getStatuses(String userId, int offset, int limit) {
        return StatusService.getStatuses(userId, offset, limit);

    }

    @RequestMapping("/getUserProfileStatuses")
    public String getUserProfileStatuses(String userId, String mappingId, int offset, int limit) {
        return StatusService.getUserProfileStatuses(userId, mappingId, offset, limit);

    }

    @RequestMapping("/getStatusDetails")
    public String getStatusDetails(String userId, String statusId) {
        return StatusService.getStatusDetails(userId, statusId);

    }

    @RequestMapping("/deleteStatus")
    public String deleteStatus(String statusId) {
        return StatusService.deleteStatus(statusId);

    }

    @RequestMapping("/updateStatus")
    public String updateStatus(String statusId, String statusInfo) {
        return StatusService.updateStatus(statusId, statusInfo);

    }

    @RequestMapping("/addStatusLike")
    public String addStatusLike(String userId, String statusId, String likeInfo) {
        return StatusService.addStatusLike(userId, statusId, likeInfo);

    }
    @RequestMapping("/addStatusCommentLike")
    public String addStatusCommentLike(String statusId, String commentId, String likeInfo) {
        return StatusService.addStatusCommentLike(statusId, commentId, likeInfo);

    }

    @RequestMapping("/addStatusComment")
    public String addStatusComment(String referenceUserInfo, String statusId, String commentInfo) {
        return StatusService.addStatusComment(referenceUserInfo, statusId, commentInfo);

    }

    @RequestMapping("/shareStatus")
    public String shareStatus(String userId, String statusId, String refUserInfo, String shareInfo) {
        return StatusService.shareStatus(userId, statusId, refUserInfo, shareInfo);

    }

    @RequestMapping("/getStatusLikeList")
    public String getStatusLikeList(String statusId) {
        return StatusService.getStatusLikeList(statusId);

    }

    @RequestMapping("/getStatusShareList")
    public String getStatusShareList(String statusId) {
        return StatusService.getStatusShareList(statusId);

    }

    @RequestMapping("/getStatusComments")
    public String getStatusComments(String userId, String statusId) {
        return StatusService.getStatusComments(userId, statusId);

    }
    
    @RequestMapping("/updateStatusComment")
    public String updateStatusComment(String statusId, String commentId, String description) {
        return StatusService.updateStatusComment(statusId, commentId, description);

    }
    @RequestMapping("/deleteStatusComment")
    public String deleteStatusComment(String statusId, String commentId) {
        return StatusService.deleteStatusComment(statusId, commentId);

    }
    @RequestMapping("/getStatusCommentLikeList")
    public String getStatusCommentLikeList(String statusId, String commentId) {
        return StatusService.getStatusCommentLikeList(statusId, commentId);

    }
    @RequestMapping("/getRecentActivities")
    public String getRecentActivities(String userId, int offset, int limit ) {
        return StatusService.getRecentActivities(userId, offset, limit);

    }

}
