package atul.service.serviceImpl;

import atul.entity.CompaniesEntity;
import atul.repo.CompaniesRepo;
import atul.service.CompaniesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class CompaniesServiceImpl implements CompaniesService {

    private static final Logger companiesServiceLog = Logger.getLogger("CompaniesServiceImpl");
    @Autowired
    private CompaniesRepo companiesRepo;

    @Override
    public List<CompaniesEntity> getAllCompanies() throws Exception {
        List<CompaniesEntity> companiesEntityList = companiesRepo.findAll();
        if (!companiesEntityList.isEmpty())
            return companiesEntityList;
        else
            throw new Exception("Company List is Empty");
    }
}
