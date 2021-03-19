package org.lea.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.lea.application.search.model.Country;
import org.lea.application.search.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@ComponentScan (basePackages = "org.lea.application.search")
public class HelloController {
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
	
	@Autowired
    private CountryService countryService;

	@RequestMapping("/countries")
    public ModelAndView getCountries() {

    	List<Country> countries = countryService.findAll();

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("countries", countries);

        return new ModelAndView("showCountries", params);
    }

}
