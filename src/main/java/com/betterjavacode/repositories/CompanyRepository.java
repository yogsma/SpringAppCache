package com.betterjavacode.repositories;

import com.betterjavacode.models.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Integer>
{

}
