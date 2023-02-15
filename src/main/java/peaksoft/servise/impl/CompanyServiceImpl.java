package peaksoft.servise.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.model.Company;
import peaksoft.repository.CompanyRepository;
import peaksoft.servise.CompanyService;

import java.util.List;

/**
 * @author :ЛОКИ Kelsivbekov
 * @created 15.02.2023
 */
@Service
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public void save(Company company) {
        companyRepository.save(company);
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.getAllCompanies();
    }

    @Override
    public Company getCompanyById(Long id) {
        return null;
    }

    @Override
    public void deleteCompany(Long id) {
        companyRepository.deleteCompany(id);
    }

    @Override
    public void updateCompany(Long id, Company updatedCompany) {

    }
}
