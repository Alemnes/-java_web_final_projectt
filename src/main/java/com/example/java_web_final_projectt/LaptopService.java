package com.example.java_web_final_projectt;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LaptopService {

    private final LaptopRepository laptopRepository;

    public LaptopService(LaptopRepository laptopRepository){
        this.laptopRepository = laptopRepository;
    }


    public List<Laptop> getAll(){

        return laptopRepository.findAll();
    }

    public void add(Laptop laptop){
        laptopRepository.save(laptop);

    }

    public boolean delete (int id){
        laptopRepository.deleteById(id);
        return true;
    }

    public void update(Laptop laptop, int id){
        Optional<Laptop> laptop1 = laptopRepository.findById(id);
        if(laptop1.isPresent()) {
            Laptop laptopToUpdate = laptop1.get();

            laptopToUpdate.setBrand(laptop.getBrand());
            laptopToUpdate.setColor(laptop.getColor());
            laptopRepository.save(laptopToUpdate);
        }

    }
}
