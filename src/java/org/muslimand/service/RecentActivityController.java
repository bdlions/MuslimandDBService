package org.muslimand.service;

import com.shampan.services.RecentActivityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nazmul hasan
 */
@RestController
@RequestMapping("/recentactivity")
public class RecentActivityController {
    @RequestMapping("/getRecentActivities")
    public String addFriend(String fromUserId, String toUserId)
    {
        return RecentActivityService.getRecentActivities();
    }
}
