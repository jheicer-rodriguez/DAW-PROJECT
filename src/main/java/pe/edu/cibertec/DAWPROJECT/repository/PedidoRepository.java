package pe.edu.cibertec.DAWPROJECT.repository;

import org.springframework.data.repository.CrudRepository;
import pe.edu.cibertec.DAWPROJECT.entity.Pedido;

public interface pedidoRespository extends CrudRepository<Pedido, Integer> {
}
