package org.muslimand.service;

import com.shampan.services.BasicProfileService;
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
    
    //--------------------------------- About Works and Educations ------------------------------------//
    @RequestMapping("/getWorksEducation")
    public String getWorksEducation(String userId) {
        return BasicProfileService.getWorksEducation(userId);
    }

    @RequestMapping("/addWorkPlace")
    public String addWorkPlace(@RequestParam String userId, @RequestParam String workPlaceData) {
        String response = BasicProfileService.addWorkPlace(userId, workPlaceData);
        return response;
    }
    @RequestMapping("/UpdateWorkPlace")
    public String UpdateWorkPlace(@RequestParam String userId, @RequestParam String workPlaceId,@RequestParam String workPlaceData) {
        String response = BasicProfileService.UpdateWorkPlace(userId, workPlaceId,workPlaceData);
        return response;
    }
    
    @RequestMapping("/addProfessionalSkill")
    public String addPSkill(@RequestParam String userId, @RequestParam String professionalSkillData) {
        String response = BasicProfileService.addProfessionalSkill(userId, professionalSkillData);
        return response;
    }

    @RequestMapping("/addUniversity")
    public String addUniversity(@RequestParam String userId, @RequestParam String universityData) {
        String response = BasicProfileService.addUniversity(userId, universityData);
        return response;
    }

    @RequestMapping("/addCollege")
    public String addCollege(@RequestParam String userId, @RequestParam String collegeData) {
        String response = BasicProfileService.addCollege(userId, collegeData);
        return response;
    }

    @RequestMapping("/addSchool")
    public String addSchool(@RequestParam String userId, @RequestParam String schoolData) {
        String response = BasicProfileService.addSchool(userId, schoolData);
        return response;
    }
    
    @RequestMapping("editWorkPlace")
    public String editWorkPlace() {
        
        return "";
    }
    
    @RequestMapping("editProfessionalSkill")
    public String editProfessionalSkill() {
        
        return "";
    }
    
    @RequestMapping("editUniversity")
    public String editUniversity() {
        
        return "";
    }
    
    @RequestMapping("editCollege")
    public String editCollege() {
        
        return "";
    }
    
    @RequestMapping("editSchool")
    public String editSchool() {
        
        return "";
    }

    
    
    @RequestMapping("/getOverview")
    public String getOverview(String userId) {
        return BasicProfileService.getOverview(userId);
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
    
    @RequestMapping("/getAboutFQuote")
    public String getAboutFQuote(@RequestParam String userId) {
        String aboutFQuote = BasicProfileService.getAboutFQuote(userId);
        return aboutFQuote;
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

}
