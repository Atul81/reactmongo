package atul.service.serviceImpl;

import atul.entity.DataSetsEntity;
import atul.repo.DataSetsRepo;
import atul.service.DataSetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class DataSetsServiceImpl implements DataSetsService {

    @Autowired
    private DataSetsRepo dataSetsRepo;

    private static final Logger dataSetsServiceLog = Logger.getLogger("DataSetsServiceImpl");

    @Override
    public List<DataSetsEntity> getAllDataSets() throws Exception {
        List<DataSetsEntity> dataSetsEntities = dataSetsRepo.findAll();
        if (!dataSetsEntities.isEmpty())
            return dataSetsEntities;
        else
            throw new Exception("Data Sets List is Empty");
    }
}
