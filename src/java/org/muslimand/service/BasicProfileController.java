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

    @RequestMapping("/getOverview")
    public String getOverview(String userId) {
        return BasicProfileService.getOverview(userId);
    }
    
    @RequestMapping("/getWorksEducation")
    public String getWorksEducation(String userId) {
        return BasicProfileService.getWorksEducation(userId);
    }

    @RequestMapping("/getCityTown")
    public String getCityTown(@RequestParam String userId) {
        String cityTown = BasicProfileService.getCityTown(userId);
        return cityTown;
    }
    @RequestMapping("/getFamilyRelation")
    public String getFamilyRelation(@RequestParam String userId) {
        String familyRelations = BasicProfileService.getFamilyRelation(userId);
        return familyRelations;
    }
    @RequestMapping("/getContactBasicInfo")
    public String getContactBasicInfo(@RequestParam String userId) {
        String BasicInfo = BasicProfileService.getContactBasicInfo(userId);
        return BasicInfo;
    }
    @RequestMapping("/getAboutFQuote")
    public String getAboutFQuote(@RequestParam String userId) {
        String aboutFQuote = BasicProfileService.getAboutFQuote(userId);
        return aboutFQuote;
    }

    @RequestMapping("/addWorkPlace")
    public String addWorkPlace(@RequestParam String userId, @RequestParam String additionalData) {
        String response = BasicProfileService.addWorkPlace(userId, additionalData);
        return response;
    }
    @RequestMapping("/addAbout")
    public String addAbout(@RequestParam String userId, @RequestParam String aboutInfo) {
        String response = BasicProfileService.addAbout(userId, aboutInfo);
        return response;
    }
    @RequestMapping("/addFQuote")
    public String addFQuote(@RequestParam String userId, @RequestParam String fQuoteInfo) {
        String response = BasicProfileService.addFQuote(userId, fQuoteInfo);
        return response;
    }

    @RequestMapping("/addPSkill")
    public String addPSkill(@RequestParam String userId, @RequestParam String additionalData) {
        String response = BasicProfileService.addPSkill(userId, additionalData);
        return response;
    }

    @RequestMapping("/addUniversity")
    public String addUniversity(@RequestParam String userId, @RequestParam String additionalData) {
        String response = BasicProfileService.addUniversity(userId, additionalData);
        return response;
    }

    @RequestMapping("/addCollege")
    public String addCollege(@RequestParam String userId, @RequestParam String additionalData) {
        String response = BasicProfileService.addCollege(userId, additionalData);
        return response;
    }

    @RequestMapping("/addSchool")
    public String addSchool(@RequestParam String userId, @RequestParam String additionalData) {
        String response = BasicProfileService.addSchool(userId, additionalData);
        return response;
    }
    @RequestMapping("/addCurrentCity")
    public String addCurrentCity(@RequestParam String userId, @RequestParam String additionalData) {
        String response = BasicProfileService.addCurrentCity(userId, additionalData);
        return response;
    }
    @RequestMapping("/addHomeTown")
    public String addHomeTown(@RequestParam String userId, @RequestParam String additionalData) {
        String response = BasicProfileService.addHomeTown(userId, additionalData);
        return response;
    }
    @RequestMapping("/addRelationshipStatus")
    public String addRelationshipStatus(@RequestParam String userId, @RequestParam String relationshipStatus) {
        String response = BasicProfileService.addRelationshipStatus(userId, relationshipStatus);
        return response;
    }
    @RequestMapping("/addMobilePhone")
    public String addMobilePhone(@RequestParam String userId, @RequestParam String mobilePhoneInfo) {
        String response = BasicProfileService.addMobilePhone(userId, mobilePhoneInfo);
        return response;
    }
    @RequestMapping("/addAddress")
    public String addAddress(@RequestParam String userId, @RequestParam String addressInfo) {
        String response = BasicProfileService.addAddress(userId, addressInfo);
        return response;
    }
    @RequestMapping("/addWebsite")
    public String addWebsite(@RequestParam String userId, @RequestParam String websiteInfo) {
        String response = BasicProfileService.addWebsite(userId, websiteInfo);
        return response;
    }
    @RequestMapping("/addEmail")
    public String addEmail(@RequestParam String userId, @RequestParam String emailInfo) {
        String response = BasicProfileService.addEmail(userId, emailInfo);
        return response;
    }

}
