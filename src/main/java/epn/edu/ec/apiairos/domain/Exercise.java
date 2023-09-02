package epn.edu.ec.apiairos.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "exercise")
public class Exercise {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "name")
  @NotBlank(message = "El nombre no puede estar en blanco")
  @Size(min = 3, max = 100, message = "El nombre debe tener entre 3 y 100 caracteres")
  private String name;

  @Column(name = "description")
  @NotBlank(message = "La descripción no puede estar en blanco")
  private String description;

  @Enumerated(EnumType.STRING)
  @NotNull(message = "La dificultad no puede estar vacia")
  private Difficulty difficulty;
  public enum Difficulty {
    EASY, MEDIUM, HARD
  }
}
