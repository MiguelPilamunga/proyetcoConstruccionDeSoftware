package epn.edu.ec.apiairos.infrastructure.inputadapter;

import epn.edu.ec.apiairos.domain.Exercise;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("/exercices")
public class ExerciseAPI {

    @GetMapping("/getAll")
    public List<Exercise> getAllExercises()
    {
        List<Exercise> exercises = new ArrayList<>();
        exercises.add(Exercise.builder()
                .difficulty(Exercise.Difficulty.MEDIUM)
                        .name("sdds")
                        .description("sasa")
                        .id(12L)
                .build());
        return exercises;
    }

}
