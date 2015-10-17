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
        return StatusService.getStatuses(userId,offset,limit);

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
    public String addStatusLike(String statusId, String likeInfo) {
        return StatusService.addStatusLike(statusId, likeInfo);

    }

    @RequestMapping("/addStatusComment")
    public String addStatusComment(String statusId, String commentInfo) {
        return StatusService.addStatusComment(statusId, commentInfo);

    }

    @RequestMapping("/shareStatus")
    public String shareStatus(String statusId, String refUserInfo,String shareInfo) {
        return StatusService.shareStatus(statusId, refUserInfo,shareInfo);

    }
    @RequestMapping("/getStatusLikeList")
    public String getStatusLikeList(String statusId) {
        return StatusService.getStatusLikeList(statusId);

    }
    @RequestMapping("/getStatusComments")
    public String getStatusComments(String statusId) {
        return StatusService.getStatusComments(statusId);

    }

}
