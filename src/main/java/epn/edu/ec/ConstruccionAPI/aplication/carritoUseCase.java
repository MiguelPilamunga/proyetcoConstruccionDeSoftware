package epn.edu.ec.ConstruccionAPI.aplication;

import epn.edu.ec.ConstruccionAPI.dominio.Carro;
import epn.edu.ec.ConstruccionAPI.infrastructure.inputportadapter.CarritoInput;
import epn.edu.ec.ConstruccionAPI.infrastructure.outputport.JPACarro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

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
        return jpaCarro.save(car);
    }

    @Override
    public void delete(Long id) {
        jpaCarro.delete(jpaCarro.findById(id).get());
    }
}
