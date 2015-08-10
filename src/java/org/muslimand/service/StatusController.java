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
    public String getStatuses(String userId) {
        return StatusService.getStatuses(userId);

    }
    @RequestMapping("/deleteStatus")
    public String deleteStatus(String statusId) {
        return StatusService.deleteStatus(statusId);

    }

    @RequestMapping("/updateStatus")
    public String updateStatus(String statusId, String statusInfo) {
        return StatusService.updateStatus(statusId, statusInfo);

    }

    @RequestMapping("/updateStatusLike")
    public String updateStatusLike(String statusId, String likeInfo) {
        return StatusService.updateStatusLike(statusId, likeInfo);

    }

    @RequestMapping("/addStatusComment")
    public String addStatusComment(String statusId, String commentInfo) {
        return StatusService.addStatusComment(statusId, commentInfo);

    }

    @RequestMapping("/updateStatusShare")
    public String updateStatusShare(String statusId, String shareInfo) {
        return StatusService.updateStatusShare(statusId, shareInfo);

    }

}
