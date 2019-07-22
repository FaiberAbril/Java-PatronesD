
import java.util.ArrayList;
import java.util.List;

public class ComponenteCatalogo implements catalogo {

    protected Object[] descripcionVehiculos = {
        "berlina 5 puertas", 600, "compacto 3 puertas", 4000,
        "espace 5 puertas", 800, "brak 5 puertas ", 7000,
        "cupe 2 puertas", 900, "utilizario 3 puetas", 5000
    };

    @Override
    public List<String> buscaVehiculos(int precioMin, int precioMax) {

        int indice, tamaño;
        List<String> resultado = new ArrayList<String>();
        tamaño = descripcionVehiculos.length / 2;

        for (int i = 0; i < tamaño; i++) {
            int precio = (Integer) descripcionVehiculos[2 * i];

            if ((precio >= precioMin) && (precio <= precioMax)) {
                resultado.add((String) descripcionVehiculos[2 * i]);
            }
        }

        return resultado;

    }

}
