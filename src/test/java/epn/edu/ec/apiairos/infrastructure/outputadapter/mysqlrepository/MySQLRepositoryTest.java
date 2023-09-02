package epn.edu.ec.apiairos.infrastructure.outputadapter.mysqlrepository;

import epn.edu.ec.apiairos.infrastructure.outputport.ExercisesJPA;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MySQLRepositoryTest {

    @Autowired
    ExercisesJPA exercisesJPA;

    @Test
    void save() {
        Assertions.assertTrue(true);
    }

    @Test
    void getById() {
    }

    @Test
    void getAll() {
    }
}