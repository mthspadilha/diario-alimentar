package dev.padda.diarioalimentar.service;

import dev.padda.diarioalimentar.model.Nutricionista;
import dev.padda.diarioalimentar.repository.NutricionistaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import dev.padda.diarioalimentar.exception.RegisterNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/nutri")
public class NutricionistaService {
    private final NutricionistaRepo nutricionistaRepo;

    @Autowired
    public NutricionistaService(NutricionistaRepo nutricionistaRepo){
        this.nutricionistaRepo = nutricionistaRepo;
    }

    @PostMapping("/adicionar")
    public Nutricionista saveNutricionista(Nutricionista nutricionista){
        return nutricionistaRepo.save(nutricionista);
    }

    @GetMapping("/lista")
    public List<Nutricionista> findAllNutricionista(){
        return nutricionistaRepo.findAll();
    }

    @GetMapping("/edita")
    public Nutricionista updateNutricionista(Nutricionista nutricionista){
        return nutricionistaRepo.save(nutricionista);
    }

    @GetMapping("/lista/{id}")
    public Nutricionista findNutricionistaById(Long id){
        return nutricionistaRepo.findNutricionistaById(id).orElseThrow(()-> new RegisterNotFoundException("Nutri não encontrada"));
    }

}
