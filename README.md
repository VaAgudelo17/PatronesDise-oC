# Patrones de Diseño Creacionales 

## Singleton: ejemplo de implementación-Inventario Friki

### Explicación:

🍄Se implemento el patrón Singleton utilizando una enumeración llamada InventarioFriki. Esto define una única instancia llamada INSTANCE, que es la única forma de acceder al inventario friki en toda la aplicación.

🍄El inventario friki contiene una lista de artículos frikis, representados por la clase ArticuloFriki. Esta clase tiene un nombre y una categoría que indica la edad para la cual está destinado el artículo (niño, adolescente o adulto).

🍄Por otra parte, para agregar artículos al inventario, se utiliza el método agregarArticulo(ArticuloFriki articulo), que agrega el artículo a la lista de inventario.

🍄El método mostrarInventario() se encarga de mostrar todos los artículos presentes en el inventario, imprimiendo el nombre y la categoría de cada artículo.

## Definición:
El Patrón Decorador es un patrón de diseño estructural que permite añadir comportamiento adicional a un objeto de manera dinámica, sin modificar su código original. Esto se logra mediante la creación de una clase decoradora que envuelve al objeto original y redefine o extiende sus métodos.

## ejemplo de implementación
### Explicación:

⭐️Se creó una interfaz BaseDeDatos con métodos inserta y registros.

⭐️Se implementó la interfaz BaseDeDatos en una clase BaseDeDatosMemoria que maneja una lista de registros en memoria.

⭐️Se creó una clase Logger que mantiene un registro de mensajes.

⭐️Se creó una clase LoggerDecorador que también implementa BaseDeDatos y envuelve una instancia de BaseDeDatos; tambien añade funcionalidad de logging a los métodos inserta y registros antes de delegar las llamadas a la instancia original de BaseDeDatos.

⭐️Se creó una clase de prueba TestBaseDatosConLogger para verificar que LoggerDecorador añade correctamente los mensajes de log antes de ejecutar las operaciones en la base de datos.

### Resultado:

