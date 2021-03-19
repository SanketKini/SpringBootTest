package org.lea.application.search.service;

import java.util.ArrayList;
import java.util.List;

import org.lea.application.search.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CountryService{
	private Logger LOG = LoggerFactory.getLogger(CountryService.class);
	/*@Autowired
    private CountryRepository repository;*/

    public List<Country> findAll() {
    	LOG.debug("Within service");
        return (List<Country>) new ArrayList<Country>();
    }
    
    public String doNothing() {
    	LOG.debug("Within service");
        return "Service Call works";
    }
}
