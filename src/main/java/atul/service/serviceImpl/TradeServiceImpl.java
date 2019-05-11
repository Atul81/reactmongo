package atul.service.serviceImpl;

import atul.entity.TradeEntity;
import atul.misc.FindAllGenerics;
import atul.repo.TradeRepo;
import atul.service.TradeService;
import com.mongodb.BasicDBObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

@Service
public class TradeServiceImpl implements TradeService {

    private static final Logger tradeServiceLog = Logger.getLogger("TradeServiceImpl");

    private static EntityManagerFactory entityManagerFactory;

    private final FindAllGenerics findAllGenerics = new FindAllGenerics();

    @Autowired
    private TradeRepo tradeRepo;


    @Override
    public List<TradeEntity> getAllTradeData() throws Exception {
        List<TradeEntity> tradeEntityList = tradeRepo.findAll();
        if (!tradeEntityList.isEmpty())
            return tradeEntityList;
        else
            throw new Exception("Trade List is Empty");
    }

    @Override
    public Boolean newTradeInsertion(TradeEntity tradeEntity) throws Exception {
        tradeServiceLog.info("Inside insert trade operation");
        BasicDBObject documentDetail = new BasicDBObject(); // for inserting Object in form of JSON;
        // Map<Object, Date> dateObj = new HashMap<>();
        if (findAllGenerics.getObjectPrinting(tradeEntity.getTimeStamp()).replaceAll("//s", "").equalsIgnoreCase("{}")) { // Time Stamp empty check.
            tradeServiceLog.info("TimeStamp Object is empty");
            documentDetail.put("dateStamp", new Date());
            tradeEntity.setTimeStamp(documentDetail);
        }
        tradeServiceLog.info(findAllGenerics.getObjectPrinting(tradeEntity));
        TradeEntity newInsertRet = tradeRepo.insert(tradeEntity);
        if (newInsertRet.get_id().equalsIgnoreCase(tradeEntity.get_id()))
            return true;
        else
            throw new Exception("Insertion Failed, Please check the logs");
    }

    @Override
    @Transactional
    public Boolean deleteOneTrade(String tradeId) throws Exception {
        tradeServiceLog.info("Inside deletion of trade by Id");
        String query = "db.trade.deleteOne({_id : " + "'" + tradeId + "'" + "})";
        tradeServiceLog.info(query);
        entityManagerFactory = Persistence.createEntityManagerFactory("one");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.createNativeQuery(query).executeUpdate();
        // tradeServiceLog.info(String.valueOf(i));
        return null;
    }
}
