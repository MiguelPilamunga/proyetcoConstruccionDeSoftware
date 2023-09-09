package epn.edu.ec.ConstruccionAPI.infrastructure.inputport.http;

import epn.edu.ec.ConstruccionAPI.dominio.Carro;
import epn.edu.ec.ConstruccionAPI.infrastructure.inputportadapter.CarritoInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carro")
public class APICarro {

    @Autowired
    CarritoInput carritoInput;

    @GetMapping("/getAll")
    public List<Carro> getAllCars(){
        return carritoInput.getCars();
    }

    @PostMapping("/save")
    public Carro saveCar(@RequestBody Carro carro){

        return carritoInput.createCar(carro);
    }

    @DeleteMapping("/delete")
    public void deleteCar(@RequestBody Long id){
        carritoInput.delete(id);
    }

    @PutMapping("/update")
    public Carro updateCar(@RequestBody Carro carro){
        return carritoInput.updateCar(carro);
    }

    @GetMapping("/getAll2")
    public List<Carro> getAllCars2(){
        return carritoInput.getCars();
    }

}
