package org.lea.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.lea.application.search.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
	
    private CountryService countryService;
    
    @RequestMapping("/hello")
    public String getHello() {
        LOGGER.debug("This works");
        String serviceOut = countryService.doNothing();
        LOGGER.debug(serviceOut);
        return "Welcome to a working application";
    }

    @RequestMapping("/countries")
    public ModelAndView getCountries() {

    	Map<String, Object> params = new HashMap<String, Object>();
        params.put("countries", countryService.findAll());
        LOGGER.debug("This worked");

        return new ModelAndView("showCountries", params);
    }

}
