package peaksoft.repository;

import peaksoft.model.Company;

import java.util.List;

/**
 * @author :ЛОКИ Kelsivbekov
 * @created 15.02.2023
 */
public interface CompanyRepository {
    void save(Company company);

    List<Company> getAllCompanies();

    Company getCompanyById(Long id);

    void deleteCompany(Long id);

    void updateCompany( Long id,Company updatedCompany);
}
