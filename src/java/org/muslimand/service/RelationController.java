package org.muslimand.service;

import com.shampan.services.RelationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nazmul hasan
 */
@RestController
@RequestMapping("/relation")
public class RelationController {
    @RequestMapping("/addFriend")
    public String addFriend(String fromUserId, String toUserId)
    {
        return RelationService.addFriend(fromUserId, toUserId);
    }
    
    @RequestMapping("/blockNonFriend")
    public String blockNonFriend(String fromUserId, String toUserId)
    {
        return RelationService.blockNonFriend(fromUserId, toUserId);
    }
    
    @RequestMapping("/blockFriend")
    public String blockFriend(String fromUserId, String toUserId)
    {
        return RelationService.blockFriend(fromUserId, toUserId);
    }
    
    @RequestMapping("/approveFriend")
    public String approveFriend(String fromUserId, String toUserId)
    {
        return RelationService.approveFriend(fromUserId, toUserId);
    }
    
    @RequestMapping("/removeFriendRequest")
    public String removeFriendRequest(String fromUserId, String toUserId)
    {
        return RelationService.removeFriendRequest(fromUserId, toUserId);
    }
    
    @RequestMapping("/unblockFriend")
    public String unblockFriend(String fromUserId, String toUserId)
    {
        return RelationService.unblockFriend(fromUserId, toUserId);
    }
    
    @RequestMapping("/removeFriend")
    public String removeFriend(String fromUserId, String toUserId)
    {
        return RelationService.removeFriend(fromUserId, toUserId);
    }
    
    @RequestMapping("/getRelationList")
    public String getRelationList(String userId, String relationTypeId, String offset, String limit)
    {
        return RelationService.getRelationList(userId, relationTypeId, offset, limit);
    }
    
    @RequestMapping("/getRelationType")
    public String getRelationType(String fromUserId, String toUserId)
    {
        return RelationService.getRelationType(fromUserId, toUserId);
    }
}
