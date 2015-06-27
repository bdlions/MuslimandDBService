/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.muslimand.service;

import com.shampan.db.services.BasicProfileService;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sampan-IT
 */
@RestController
@RequestMapping("/basicProfile")
public class BasicProfileController {
     @RequestMapping("/getBasicInfo")
    public String getBasicInfo(@RequestParam(value = "name", defaultValue = "Alamgir") String name) {
        return name;
    }
    
    @RequestMapping("/getWorksEducation")
    public String getWorksEducation(String userId) {
        return BasicProfileService.getWorksEducation(userId);
    }
    @RequestMapping("/addWorkPlace")
    public String addWorkPlace( @RequestParam String userId , @RequestParam String additionalData) {
            String response =  BasicProfileService.addWorkPlace(userId,additionalData);
        return response;
    }
    
    @RequestMapping("/addPSkill")
    public String addPSkill( @RequestParam String userId , @RequestParam String additionalData) {
            String response =  BasicProfileService.addPSkill(userId,additionalData);
        return response;
    }
    @RequestMapping("/addUniversity")
    public String addUniversity( @RequestParam String userId , @RequestParam String additionalData) {
            String response =  BasicProfileService.addUniversity(userId,additionalData);
        return response;
    }
    @RequestMapping("/addCollege")
    public String addCollege( @RequestParam String userId , @RequestParam String additionalData) {
            String response =  BasicProfileService.addCollege(userId,additionalData);
        return response;
    }
    
    @RequestMapping("/addSchool")
    public String addSchool( @RequestParam String userId , @RequestParam String additionalData) {
            String response =  BasicProfileService.addSchool(userId,additionalData);
        return response;
    }
    
    
    
}