package com.example.java_web_final_projectt;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/laptops")
public class LaptopController {
    private final LaptopService laptopService;

    public LaptopController(LaptopService laptopService){
        this.laptopService = laptopService;

    }

    @GetMapping
    public List<Laptop> getLaptops(){
        return laptopService.getAll();
    }

    @PostMapping
    public void addLaptop(@RequestBody Laptop laptop){
        laptopService.add(laptop);
    }

    @PutMapping("/{id}")
    private void updateLaptop(@PathVariable(value = "id") Integer id, @RequestBody Laptop laptop){
        laptopService.update(laptop, id);
    }

   @DeleteMapping("/{id}")
   public void deleteLaptop(@PathVariable (value = "id") Integer id){

        laptopService.delete(id);
   }


}
