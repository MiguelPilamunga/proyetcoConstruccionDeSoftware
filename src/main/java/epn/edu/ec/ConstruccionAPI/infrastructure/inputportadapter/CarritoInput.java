package epn.edu.ec.ConstruccionAPI.infrastructure.inputportadapter;

import epn.edu.ec.ConstruccionAPI.dominio.Carro;

import java.util.List;

public interface CarritoInput {
    List<Carro> getCars();

    Carro createCar(Carro car);

    Carro updateCar(Carro car);

    void delete(Long id);
}
