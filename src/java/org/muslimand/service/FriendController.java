/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.muslimand.service;

import com.shampan.services.FriendService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sampan-IT
 */
@RestController
@RequestMapping("/friend")
public class FriendController {

    @RequestMapping("/addRequest")
    public String addRequest(String userId, String friendId,String typeId) {
        return FriendService.addRequest(userId, friendId,typeId);
    }
    @RequestMapping("/changeRelationShipStatus")
    public String changeRelationShipStatus(String userId, String friendId, String typeId) {
        return FriendService.changeRelationShipStatus(userId, friendId, typeId);
    }
    @RequestMapping("/deleteRequest")
    public String deleteRequest(String userId, String friendId) {
        return FriendService.deleteRequest(userId, friendId);
    }

    @RequestMapping("/getFriendList")
    public String getFriendList(String userId, int offset, int limit,String statusType) {
        return FriendService.getFriendList(userId, offset, limit,statusType);
    }
    @RequestMapping("/getRelationShipStatus")
    public String getRelationShipStatus(String userId, String friendId) {
        return FriendService.getRelationShipStatus(userId, friendId);
    }

}
