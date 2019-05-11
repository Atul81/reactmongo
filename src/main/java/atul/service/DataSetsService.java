package atul.service;

import atul.entity.DataSetsEntity;

import java.util.List;

public interface DataSetsService {

    List<DataSetsEntity> getAllDataSets() throws Exception;
}
