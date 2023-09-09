package epn.edu.ec.ConstruccionAPI.infrastructure.inputport.http;

import epn.edu.ec.ConstruccionAPI.dominio.Carro;
import epn.edu.ec.ConstruccionAPI.infrastructure.outputport.JPACarro;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class APICarroTest {

    @Autowired
    JPACarro jpaCarro;
    @Test
    void saveCar() {

        jpaCarro.save(Carro.builder()
                        .anioFabricacion(2012)
                        .marca("toyota")
                        .modelo("ddd")
                        .precio(12000)
                .build());
    }
}