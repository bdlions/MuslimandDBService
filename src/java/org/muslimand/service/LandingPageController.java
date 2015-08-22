package org.muslimand.service;

import com.shampan.db.services.LandingPage;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author nazmul hasan
 */
@RestController
@RequestMapping("/landingpage")
public class LandingPageController {

    @RequestMapping("/getCountryAndReligion")
    public String getCountryAndReligion() {
        return LandingPage.getCountryAndReligion();
    }
}
