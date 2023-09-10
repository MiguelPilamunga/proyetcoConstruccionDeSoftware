package epn.edu.ec.ConstruccionAPI.infrastructure.inputport.http;

import epn.edu.ec.ConstruccionAPI.dominio.Carro;
import epn.edu.ec.ConstruccionAPI.infrastructure.inputportadapter.CarritoInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carro")
public class APICarro {

    @Autowired
    CarritoInput carritoInput;

    @GetMapping(value = "getAll" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Carro> getAllCars(){
        return carritoInput.getCars();
    }

    @PostMapping(value = "save")
    public Carro saveCar(@RequestBody Carro carro){
        return carritoInput.createCar(carro);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCar(@PathVariable("id") Long id){
        return carritoInput.delete(id);
    }

    @PutMapping("/update")
    public Carro updateCar(@RequestBody Carro carro){
        return carritoInput.updateCar(carro);
    }


}
