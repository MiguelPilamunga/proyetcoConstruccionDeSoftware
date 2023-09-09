package epn.edu.ec.ConstruccionAPI.infrastructure.outputport;

import epn.edu.ec.ConstruccionAPI.dominio.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JPACarro extends JpaRepository<Carro,Long> {
}
