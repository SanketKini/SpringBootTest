package org.lea.application.search.service;

import java.util.ArrayList;
import java.util.List;

import org.lea.application.search.model.Country;
import org.lea.application.search.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService{
	@Autowired
    private CountryRepository repository;

    @Override
    public List<Country> findAll() {

        return (List<Country>) new ArrayList<Country>();
    }
}
