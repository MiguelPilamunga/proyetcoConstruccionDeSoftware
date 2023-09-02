package epn.edu.ec.apiairos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApiAirosApplicationTest {

    @Test
    void main() {
        try {
            ApiAirosApplication.main(new String[]{});
        } catch (Exception e) {
            fail("el error es: " + e.getMessage());
        }
    }
}