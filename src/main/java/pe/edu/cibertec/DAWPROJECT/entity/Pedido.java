package pe.edu.cibertec.DAWPROJECT.response;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name = "pedido")
public class GreetingResponse {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer idPedido;
     private Integer cantidad;
     private Double precioUnitario;
     private Double subtotal;
     private String idProducto;
     private String idMesa;
     private String idUsuario;
}
