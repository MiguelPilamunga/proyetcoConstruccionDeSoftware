package epn.edu.ec.apiairos.infrastructure.outputport;

import epn.edu.ec.apiairos.domain.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExercisesJPA extends JpaRepository<Exercise,Long> {
}
