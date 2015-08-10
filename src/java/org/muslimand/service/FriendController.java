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

    @RequestMapping("/addFriend")
    public String addFriend(String userId, String friendId) {
        return FriendService.addFriend(userId, friendId);
    }
    
    @RequestMapping("/getFriendList")
    public String getFriendList(String userId) {
        return FriendService.getFriendList(userId);
    }

}
