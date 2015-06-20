/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.muslimand.service;

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
    
    
    
}
