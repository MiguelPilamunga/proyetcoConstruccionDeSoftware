package epn.edu.ec.ConstruccionAPI.aplication;

import epn.edu.ec.ConstruccionAPI.dominio.Carro;
import epn.edu.ec.ConstruccionAPI.infrastructure.inputportadapter.CarritoInput;
import epn.edu.ec.ConstruccionAPI.infrastructure.outputport.JPACarro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.logging.LogManager;

@Component
public class carritoUseCase implements CarritoInput {

    @Autowired
    JPACarro jpaCarro;

    @Override
    public List<Carro> getCars() {
        return jpaCarro.findAll();
    }

    @Override
    public Carro createCar(Carro car) {
        return jpaCarro.save(car);
    }

    @Override
    public Carro updateCar(Carro car) {
        if (jpaCarro.findById(car.getId()).isPresent()){
            return jpaCarro.save(car);
        }
        else {
            return car;
        }

    }

    @Override
    public String delete(Long id) {
        if (getByID(id).isPresent()){
            jpaCarro.delete(jpaCarro.findById(id).get());
            return "Auto Borrado";
        }
        else {
           return "Auto no Encontrado";
        }
    }

    public Optional<Carro> getByID(Long id){
        return Optional.of(jpaCarro.getById(id));
    }
}
