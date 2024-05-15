# Patrones de Diseño Creacionales 

## Singleton: ejemplo de implementación-Inventario Friki

### Explicación:

🍄Se implemento el patrón Singleton utilizando una enumeración llamada InventarioFriki. Esto define una única instancia llamada INSTANCE, que es la única forma de acceder al inventario friki en toda la aplicación.

🍄El inventario friki contiene una lista de artículos frikis, representados por la clase ArticuloFriki. Esta clase tiene un nombre y una categoría que indica la edad para la cual está destinado el artículo (niño, adolescente o adulto).

🍄Por otra parte, para agregar artículos al inventario, se utiliza el método agregarArticulo(ArticuloFriki articulo), que agrega el artículo a la lista de inventario.

🍄El método mostrarInventario() se encarga de mostrar todos los artículos presentes en el inventario, imprimiendo el nombre y la categoría de cada artículo.
