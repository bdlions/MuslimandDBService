package org.muslimand.service;

import com.shampan.services.LandingPage;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author nazmul hasan
 */
@RestController
@RequestMapping("/landingpage")
public class LandingPageController {

    @RequestMapping("/getLandingPageInfo")
    public String getLandingPageInfo() {
        return LandingPage.getLandingPageInfo();
    }
}
