package singleton;

public class Main {
    public static void main(String[] args) {
      
        InventarioFriki.INSTANCE.agregarArticulo(new ArticuloFriki("Sable de luz", Categoria.NIÑO));
        InventarioFriki.INSTANCE.agregarArticulo(new ArticuloFriki("Manga de attack of titan", Categoria.ADOLESCENTE));
        InventarioFriki.INSTANCE.agregarArticulo(new ArticuloFriki("Figura coleccionable de batman", Categoria.ADULTO));
        InventarioFriki.INSTANCE.mostrarInventario();
    }
}