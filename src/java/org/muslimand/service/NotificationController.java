package org.muslimand.service;

import com.shampan.services.NotificationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nazmul hasan
 */
@RestController
@RequestMapping("/notification")
public class NotificationController {
    @RequestMapping("/getNotificationCounter")
    public String getNotificationCounter()
    {
        return NotificationService.getNotificationCounter();
    }
    
    @RequestMapping("/addFriendNotification")
    public String addFriendNotification(String userId, String friendId)
    {
        return NotificationService.addFriendNotification(userId, friendId);
    }
    
    @RequestMapping("/updateStatusGetFriendNotifications")
    public String updateStatusGetFriendNotifications(String userId, String statusTypeId, String offset, String limit)
    {
        return NotificationService.updateStatusGetFriendNotifications(userId, statusTypeId, offset, limit);
    }
    
    @RequestMapping("/getFriendNotifications")
    public String getFriendNotifications(String userId, String offset, String limit)
    {
        return NotificationService.getFriendNotifications(userId, offset, limit);
    }
    
    @RequestMapping("/deleteFriendNotification")
    public String deleteFriendNotification(String userId, String friendId)
    {
        return NotificationService.deleteFriendNotification(userId, friendId);
    }
    
    @RequestMapping("/addGeneralNotificationStatusComment")
    public String addGeneralNotificationStatusComment(String notificationData)
    {
        return NotificationService.addGeneralNotificationStatusComment(notificationData);
    }
    
    @RequestMapping("/addGeneralNotificationStatusLike")
    public String addGeneralNotificationStatusLike(String notificationData)
    {
        return NotificationService.addGeneralNotificationStatusLike(notificationData);
    }
    
    @RequestMapping("/addGeneralNotificationStatusShare")
    public String addGeneralNotificationStatusShare(String notificationData)
    {
        return NotificationService.addGeneralNotificationStatusShare(notificationData);
    }
    
    @RequestMapping("/updateStatusGetGeneralNotifications")
    public String updateStatusGetGeneralNotifications(String userId, String statusTypeId, String offset, String limit)
    {
        return NotificationService.updateStatusGetGeneralNotifications(userId, statusTypeId, offset, limit);
    }
    
    @RequestMapping("/getGeneralNotifications")
    public String getGeneralNotifications(String userId, String offset, String limit)
    {
        return NotificationService.getGeneralNotifications(userId, offset, limit);
    }
}
