package pe.edu.cibertec.DAWPROJECT.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.text.DecimalFormat;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class DetallePedido {
    private Long idPedido;
    private Integer cantidad;
    private Double precioUnitario;
    private Double subtotal;
    private Integer idProducto;
    private Integer idMesa;
    private Integer idUser;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date fechaPedido;

    @JsonProperty("precioUnitario")
    public String getPrecioUnitarioFormateado() {
        if (precioUnitario != null) {
            DecimalFormat formatoPrecio = new DecimalFormat("#,##0.00");
            String precioFormateado = formatoPrecio.format(precioUnitario);
            return "S/." + precioFormateado;
        } else {
            return null;
        }
    }



    @JsonProperty("subtotal")
    public String getSubtotalFormateado() {
        if (subtotal != null) {
            DecimalFormat formatoPrecio = new DecimalFormat("#,##0.00");
            String subtotalFormateado = formatoPrecio.format(subtotal);
            return "S/." + subtotalFormateado;
        } else {
            return null;
        }
    }

}
