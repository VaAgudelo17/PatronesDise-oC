# Patrones de Diseño 

## Singleton: ejemplo de implementación-Inventario Friki

### Explicación:

🍄Se implemento el patrón Singleton utilizando una enumeración llamada InventarioFriki. Esto define una única instancia llamada INSTANCE, que es la única forma de acceder al inventario friki en toda la aplicación.

🍄El inventario friki contiene una lista de artículos frikis, representados por la clase ArticuloFriki. Esta clase tiene un nombre y una categoría que indica la edad para la cual está destinado el artículo (niño, adolescente o adulto).

🍄Por otra parte, para agregar artículos al inventario, se utiliza el método agregarArticulo(ArticuloFriki articulo), que agrega el artículo a la lista de inventario.

🍄El método mostrarInventario() se encarga de mostrar todos los artículos presentes en el inventario, imprimiendo el nombre y la categoría de cada artículo.


## Decorator: ejemplo de implementación

### Definición:

El Patrón Decorador es un patrón de diseño estructural que permite añadir comportamiento adicional a un objeto de manera dinámica, sin modificar su código original. Esto se logra mediante la creación de una clase decoradora que envuelve al objeto original y redefine o extiende sus métodos.

### Explicación:

⭐️Se creó una interfaz BaseDeDatos con métodos inserta y registros.

⭐️Se implementó la interfaz BaseDeDatos en una clase BaseDeDatosMemoria que maneja una lista de registros en memoria.

⭐️Se creó una clase Logger que mantiene un registro de mensajes.

⭐️Se creó una clase LoggerDecorador que también implementa BaseDeDatos y envuelve una instancia de BaseDeDatos; tambien añade funcionalidad de logging a los métodos inserta y registros antes de delegar las llamadas a la instancia original de BaseDeDatos.

⭐️Se creó una clase de prueba TestBaseDatosConLogger para verificar que LoggerDecorador añade correctamente los mensajes de log antes de ejecutar las operaciones en la base de datos.

### Resultado:
<img width="934" alt="Captura de Pantalla 2024-05-24 a la(s) 17 55 29" src="https://github.com/VaAgudelo17/PatronesDise-oC/assets/114451968/2b939287-9ca4-489e-b937-0450cfabceb4">

## Mediator: ejemplo de implementación

### Definición:
El patrón Mediator se utiliza para reducir las dependencias directas entre los componentes de un sistema, promoviendo así un acoplamiento más débil. Introduce un objeto mediador que se encarga de coordinar las interacciones entre los componentes, permitiendo que estos se comuniquen entre sí de manera indirecta a través del mediador.

### Explicación:
⭕️ Se creó una interfaz Mediator que define los métodos necesarios para gestionar las interacciones entre los dispositivos.

⭕️ Se implementó una clase ConcreteMediator que actúa como mediador y contiene referencias a los dispositivos del coche.

⭕️ Se modificaron las clases Coche, Radio y Telefono para que reciban una referencia al mediador y notifiquen al mediador sobre los eventos relevantes en lugar de interactuar directamente entre sí.

⭕️ Se adaptó el test para inicializar los objetos con el mediador y verificar que el comportamiento del sistema se mantiene correctamente.

### Resultado:
<img width="1347" alt="Captura de Pantalla 2024-05-24 a la(s) 14 09 51" src="https://github.com/VaAgudelo17/PatronesDise-oC/assets/114451968/37379f2b-23b2-4794-8bd2-840445e77912">

## Strategy: ejemplo de implementación 
### Definición:
El patrón Strategy es un patrón de diseño de software que permite definir una familia de algoritmos, encapsular cada uno de ellos y hacerlos intercambiables. Esto permite que el algoritmo varíe independientemente de los clientes que lo utilicen.
### Explicación:
Se implementa el patrón Strategy para manejar diferentes formas de pago en una aplicación de comercio electrónico. Se definen dos estrategias de pago: una para PayPal y otra para tarjeta de crédito. Ambas estrategias implementan una interfaz común PayStrategy que define métodos para recopilar detalles de pago y procesar el pago.
El código cliente (Demo) utiliza estas estrategias de pago de manera intercambiable. El usuario puede seleccionar productos para comprar y elegir entre PayPal y tarjeta de crédito como método de pago. Dependiendo de la elección del usuario, el programa interactúa con la estrategia de pago correspondiente para recopilar los detalles de pago y procesar la transacción

### Resultado:
<img width="744" alt="Captura de Pantalla 2024-05-24 a la(s) 17 34 35" src="https://github.com/VaAgudelo17/PatronesDise-oC/assets/114451968/1cc618d9-e45a-458d-8487-1ff8708471ab">

## State: ejemplo de implementación 
### Definición:
El Patrón State es un patrón de diseño de comportamiento que permite a un objeto cambiar su comportamiento cuando su estado interno cambia. Este patrón se utiliza cuando un objeto puede tener múltiples estados y su comportamiento varía en función de su estado actual.

### Explicación:
Se implementa el Patrón State para modelar los diferentes estados de una tarjeta de crédito y cómo su comportamiento cambia en función de esos estados. Se definen clases para representar cada estado posible de la tarjeta (como "Activa", "Desactivada" y "Bloqueada"), así como una clase para el contexto que utiliza estos estados (la clase User).

### Resultado:
<img width="744" alt="Captura de Pantalla 2024-05-24 a la(s) 17 34 35" src="https://github.com/VaAgudelo17/PatronesDise-oC/assets/114451968/8db30b1e-3e35-4b38-8668-781bb2dfd49c">











