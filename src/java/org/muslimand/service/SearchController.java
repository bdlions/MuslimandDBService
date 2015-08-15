/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.muslimand.service;

import com.shampan.services.SearchService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Sampan-IT
 */
@RestController
@RequestMapping("/search")
public class SearchController {
    
      @RequestMapping("/getUsers")
    public String getUsers(String searchValue) {
        return SearchService.getUsers(searchValue);
    }
    
    
    
}
