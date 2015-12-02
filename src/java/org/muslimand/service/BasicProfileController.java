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

    @RequestMapping("/editWorkPlace")
    public String editWorkPlace(String userId, String workPlaceId, String workPlaceData) {
        String response = BasicProfileService.editWorkPlace(userId, workPlaceId, workPlaceData);
        return response;
    }

    @RequestMapping("editProfessionalSkill")
    public String editProfessionalSkill(String userId, String pSkillId, String pSkillData) {
        String response = BasicProfileService.editProfessionalSkill(userId, pSkillId, pSkillData);
        return response;
    }

    @RequestMapping("editUniversity")
    public String editUniversity(String userId, String universityId, String universityData) {
        String response = BasicProfileService.editUniversity(userId, universityId, universityData);
        return response;
    }

    @RequestMapping("editCollege")
    public String editCollege(String userId, String collegeId, String collegeData) {
        String response = BasicProfileService.editCollege(userId, collegeId, collegeData);
        return response;
    }

    @RequestMapping("editSchool")
    public String editSchool(String userId, String schoolId, String schoolData) {
        String response = BasicProfileService.editSchool(userId, schoolId, schoolData);
        return response;
    }

    @RequestMapping("deleteWrokPlace")
    public String deleteWrokPlace(@RequestParam String userId, @RequestParam String wrokPlaceId) {
        String response = BasicProfileService.deleteWrokPlace(userId, wrokPlaceId);
        return response;
    }

    @RequestMapping("deletePSkill")
    public String deletePSkill(String userId, String pSkillId) {
        String response = BasicProfileService.deletePSkill(userId, pSkillId);
        return response;
    }

    @RequestMapping("deleteUniversity")
    public String deleteUniversity(String userId, String universityId) {
        String response = BasicProfileService.deleteUniversity(userId, universityId);
        return response;
    }

    @RequestMapping("deleteCollege")
    public String deleteCollege(String userId, String collegeId) {
        String response = BasicProfileService.deleteCollege(userId, collegeId);
        return response;
    }

    @RequestMapping("deleteSchool")
    public String deleteSchool(String userId, String schoolId) {
        String response = BasicProfileService.deleteSchool(userId, schoolId);
        return response;
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

    @RequestMapping("/editCurrentCity")
    public String editCurrentCity(@RequestParam String userId, @RequestParam String cityData) {
        String response = BasicProfileService.editCurrentCity(userId, cityData);
        return response;
    }

    @RequestMapping("/deleteCurrentCity")
    public String deleteCurrentCity(@RequestParam String userId) {
        String response = BasicProfileService.deleteCurrentCity(userId);
        return response;
    }

    @RequestMapping("/addHomeTown")
    public String addHomeTown(@RequestParam String userId, @RequestParam String additionalData) {
        String response = BasicProfileService.addHomeTown(userId, additionalData);
        return response;
    }

    @RequestMapping("/editHomeTown")
    public String editHomeTown(@RequestParam String userId, @RequestParam String townData) {
        String response = BasicProfileService.editHomeTown(userId, townData);
        return response;
    }

    @RequestMapping("/deleteHomeTown")
    public String deleteHomeTown(@RequestParam String userId) {
        String response = BasicProfileService.deleteHomeTown(userId);
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

    @RequestMapping("/editMobilePhone")
    public String editMobilePhone(@RequestParam String userId, @RequestParam String mobileId, @RequestParam String mobilePhoneInfo) {
        String response = BasicProfileService.editMobilePhone(userId, mobileId, mobilePhoneInfo);
        return response;
    }

    @RequestMapping("/deleteMobilePhone")
    public String deleteMobilePhone(@RequestParam String userId, @RequestParam String phoneId) {
        String response = BasicProfileService.deleteMobilePhone(userId, phoneId);
        return response;
    }

    @RequestMapping("/addAddress")
    public String addAddress(String userId, String addressInfo) {
        String response = BasicProfileService.addAddress(userId, addressInfo);
        return response;
    }

    @RequestMapping("/editAddress")
    public String editAddress(@RequestParam String userId, @RequestParam String addressInfo) {
        String response = BasicProfileService.editAddress(userId, addressInfo);
        return response;
    }

    @RequestMapping("/deleteAddress")
    public String deleteAddress(@RequestParam String userId, @RequestParam String addressId) {
        String response = BasicProfileService.deleteAddress(userId, addressId);
        return response;
    }

    @RequestMapping("/addWebsite")
    public String addWebsite(@RequestParam String userId, @RequestParam String websiteInfo) {
        String response = BasicProfileService.addWebsite(userId, websiteInfo);
        return response;
    }

    @RequestMapping("/editWebsite")
    public String editWebsite(@RequestParam String userId, @RequestParam String websiteInfo) {
        String response = BasicProfileService.editWebsite(userId, websiteInfo);
        return response;
    }

    @RequestMapping("/deleteWebsite")
    public String deleteWebsite(@RequestParam String userId, @RequestParam String websiteId) {
        String response = BasicProfileService.deleteWebsite(userId, websiteId);
        return response;
    }

    @RequestMapping("/addEmail")
    public String addEmail(@RequestParam String userId, @RequestParam String emailInfo) {
        String response = BasicProfileService.addEmail(userId, emailInfo);
        return response;
    }

    @RequestMapping("/editEmail")
    public String editEmail(@RequestParam String userId, @RequestParam String emailId, @RequestParam String emailInfo) {
        String response = BasicProfileService.editEmail(userId, emailId, emailInfo);
        return response;
    }
    @RequestMapping("/editRelationshipStatus")
    public String editRelationshipStatus(@RequestParam String userId, @RequestParam String relationshipStatus) {
//        String response = BasicProfileService.editRelationshipStatus(userId, relationshipStatus);
        return "";
    }
    @RequestMapping("/deleteEmail")
    public String deleteEmail(@RequestParam String userId, @RequestParam String emailId) {
        String response = BasicProfileService.deleteEmail(userId, emailId);
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
