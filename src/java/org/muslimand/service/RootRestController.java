/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.muslimand.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alamgir
 */
@RestController
public class RootRestController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String root() {
        return "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n"
                + "    \"http://www.w3.org/TR/html4/loose.dtd\">\n"
                + "\n"
                + "<html>\n"
                + "    <head>\n"
                + "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n"
                + "        <title>Muslimand Data service</title>\n"
                + "    </head>\n"
                + "\n"
                + "    <body>\n"
                + "        <div style=\"color: red; font-size: 20pt; font-weight: bold;\">Restricted area!!!</div>\n"
                + "    </body>\n"
                + "</html>\n"
                + "";
        
//        return "<div style=\"color: red; font-size: 20pt; font-weight: bold;\">Restricted area!!!</div>";
    }
}
