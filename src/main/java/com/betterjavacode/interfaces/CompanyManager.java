package com.betterjavacode.interfaces;

import com.betterjavacode.models.Company;
import java.util.List;

public interface CompanyManager
{
    public List<Company> getAllCompanies();

    public Company getCompany(int id);
}
