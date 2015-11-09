package org.muslimand.service;

import com.shampan.services.MessageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nazmul hasan
 */
@RestController
@RequestMapping("/message")
public class MessageController {
    public MessageController()
    {
    
    }
    
    @RequestMapping("/addMessage")
    public String addMessage(String userIdList,String senderId,String message)
    {
        return MessageService.addMessage(userIdList,senderId,message);
    }
    
    @RequestMapping("/getMessageSummaryList")
    public String getMessageSummaryList(String userId, int offset, int limit)
    {
        return MessageService.getMessageSummaryList(userId, offset, limit);
    }
    
    @RequestMapping("/getMessageList")
    public String getMessageList(String groupId, int offset, int limit)
    {
        return MessageService.getMessageList(groupId, offset, limit);
    }
}
