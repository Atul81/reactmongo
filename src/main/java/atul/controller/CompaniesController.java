package atul.controller;

import atul.entity.CompaniesEntity;
import atul.entity.ProductEntity;
import atul.misc.FindAllGenerics;
import atul.model.Response;
import atul.service.CompaniesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/companies")
public class CompaniesController {

    private static final Logger companiesLog = Logger.getLogger("CompaniesController");

    private final static FindAllGenerics findAllGenericsInst = new FindAllGenerics();

    @Autowired
    private CompaniesService companiesServices;

    @GetMapping("/findAllCompanies")
    public ResponseEntity<Response<List<CompaniesEntity>>> getAllCompanies() throws Exception {
        companiesLog.info("Inside fetching all products detail");
        List<CompaniesEntity> allCompanies = companiesServices.getAllCompanies();
        companiesLog.info(findAllGenericsInst.getObjectPrinting(allCompanies));
        if (null != allCompanies) {
            companiesLog.info("Fetched all Company List");
            return findAllGenericsInst.findAllResponseEntity(allCompanies);
        } else
            throw new Exception("Null Value Expected");
    }
}
