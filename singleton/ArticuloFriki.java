package singleton;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

enum Categoria {
    NIÑO, ADOLESCENTE, ADULTO
}

class ArticuloFriki implements Serializable {
    private final String nombre;
    private final Categoria categoria;

    public ArticuloFriki(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}

enum InventarioFriki {
    INSTANCE; 
    private List<ArticuloFriki> inventario = new ArrayList<>();

    public void agregarArticulo(ArticuloFriki articulo) {
        System.out.println("Agregando artículo friki al inventario: " + articulo.getNombre());
        inventario.add(articulo);
    }

    public void mostrarInventario() {
        System.out.println("Inventario friki:");
        for (ArticuloFriki articulo : inventario) {
            System.out.println(articulo.getNombre() + " - Categoría: " + articulo.getCategoria());
        }
    }
}


