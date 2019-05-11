package atul.service;

import atul.entity.CompaniesEntity;

import java.util.List;

public interface CompaniesService {

    List<CompaniesEntity> getAllCompanies() throws Exception;
}
