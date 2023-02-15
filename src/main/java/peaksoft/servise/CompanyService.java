package peaksoft.servise;

import peaksoft.model.Company;

import java.util.List;

/**
 * @author :ЛОКИ Kelsivbekov
 * @created 15.02.2023
 */
public interface CompanyService {
    void save(Company company);

    List<Company> getAllCompanies();

    Company getCompanyById(Long id);

    void deleteCompany(Long id);

    void updateCompany( Long id,Company updatedCompany);
}
