package epn.edu.ec.apiairos;

import org.junit.jupiter.api.Test;
import org.springframework.boot.builder.SpringApplicationBuilder;

import static org.junit.jupiter.api.Assertions.*;

class ServletInitializerTest {

    @Test
    void configure() {
        try {
            ServletInitializer servletInitializer = new ServletInitializer();
            SpringApplicationBuilder springApplicationBuilder= servletInitializer.configure(new SpringApplicationBuilder());
            assertNotNull(servletInitializer,"El metodo debe devolver un spring Aplication no nulo");
        }catch (Exception e){
            fail("error de inicializacion :"+e.getMessage());
        }
    }
}