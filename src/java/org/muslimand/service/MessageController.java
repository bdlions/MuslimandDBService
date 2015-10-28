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
    public String addMessage()
    {
        return MessageService.addMessage();
    }
    
    @RequestMapping("/getMessageSummaryList")
    public String getMessageSummaryList(String userId, String offset, String limit)
    {
        return MessageService.getMessageSummaryList(userId, offset, limit);
    }
    
    @RequestMapping("/getMessageList")
    public String getMessageList(String groupId, String offset, String limit)
    {
        return MessageService.getMessageList(groupId, offset, limit);
    }
}
