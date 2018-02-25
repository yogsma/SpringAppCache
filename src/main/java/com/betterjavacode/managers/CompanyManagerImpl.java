package com.betterjavacode.managers;

import com.betterjavacode.interfaces.CompanyManager;
import com.betterjavacode.models.Company;
import com.betterjavacode.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CompanyManagerImpl implements CompanyManager
{
    private CompanyRepository companyRepository;

    @Autowired
    public void setCompanyRepository(CompanyRepository companyRepository)
    {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getAllCompanies()
    {
        List<Company> listCompanies = (List<Company>) companyRepository.findAll();
        return listCompanies;
    }

    @Override
    public Company getCompany(int id)
    {
        Company c = companyRepository.findOne(Integer.valueOf(id));
        return c;
    }
}
