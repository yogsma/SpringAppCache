package com.betterjavacode.resources;

import java.util.List;

import com.betterjavacode.interfaces.CompanyManager;
import com.betterjavacode.models.Company;
import org.hibernate.annotations.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import javax.websocket.server.PathParam;

@RestController
@RequestMapping(value="/cachedemo/v1")
public class CompanyController
{


    @Autowired
    public CompanyManager companyManager;


    @RequestMapping(value = "/companies", method= RequestMethod.GET,
    produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @Cacheable("companies")
    public List<Company> getAllCompanies()
    {
        return companyManager.getAllCompanies();
    }


    @RequestMapping(value = "/companies/{id}/", method = RequestMethod.GET, produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @Cacheable(value = "company", key = "#id")
    public Company getCompany(@PathVariable("id") int id)
    {
        return companyManager.getCompany(id);
    }
}
