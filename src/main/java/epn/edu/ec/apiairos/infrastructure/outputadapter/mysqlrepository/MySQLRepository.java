package epn.edu.ec.apiairos.infrastructure.outputadapter.mysqlrepository;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MySQLRepository {

    @Autowired
     EntityManager entityManager;


}