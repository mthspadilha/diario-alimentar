package dev.padda.diarioalimentar.repository;

import dev.padda.diarioalimentar.model.Nutricionista;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NutricionistaRepo extends JpaRepository<Nutricionista, Long> {
    void deleteNutricionistaById(Long id);

    Optional <Nutricionista> findNutricionistaById(Long id);
}
