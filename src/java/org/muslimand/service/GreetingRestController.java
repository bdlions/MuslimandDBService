package org.muslimand.service;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.google.gson.JsonObject;
import com.shampan.db.services.LandingPage;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.muslimand.service.Greeting;
/**
 *
 * @author alamgir
 */
@RestController
@RequestMapping("/ctrl")
public class GreetingRestController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name, @RequestParam(value = "userId") String userId) {
        System.out.println(userId);
        JSONObject object = new JSONObject();
        object.put("name", name);
        object.put("userId", userId);
        
        return object.toString();
    }
    
    @RequestMapping("/arrayTest")
    public String arrayTest(@RequestParam(value = "input", defaultValue = "{}") String input) {
        JSONObject object = new JSONObject(input);
        return object.getString("name");
    }
    
    
    @RequestMapping("/getCountryAndReligion")
    public String getCountryAndReligion() {
        return LandingPage.getCountryAndReligion();
    }
}
