package dev.padda.diarioalimentar.service;

import dev.padda.diarioalimentar.model.Nutricionista;
import dev.padda.diarioalimentar.repository.NutricionistaRepo;
import org.graalvm.compiler.core.common.NumUtil;
import org.springframework.beans.factory.annotation.Autowired;
import dev.padda.diarioalimentar.exception.RegisterNotFoundException;

import java.util.List;

public class NutricionistaService {
    private final NutricionistaRepo nutricionistaRepo;

    @Autowired
    public NutricionistaService(NutricionistaRepo nutricionistaRepo){
        this.nutricionistaRepo = nutricionistaRepo;
    }

    public Nutricionista saveNutricionista(Nutricionista nutricionista){
        return nutricionistaRepo.save(nutricionista);
    }

    public List<Nutricionista> findAllNutricionista(){
        return nutricionistaRepo.findAll();
    }

    public Nutricionista updateNutricionista(Nutricionista nutricionista){
        return nutricionistaRepo.save(nutricionista);
    }

    public Nutricionista findNutricionistaById(Long id){
        return nutricionistaRepo.findNutricionistaById(id).orElseThrow(()-> new RegisterNotFoundException("Nutri não encontrada"));
    }

}
