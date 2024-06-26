## Video de ensayo:
https://youtu.be/WDzYs4B70vE

# Sistema de Gestión de Inventario

Este proyecto es una implementación de un sistema de inventario utilizando la estructura de una lista enlazada en el lenguaje de programación Java. El sistema permite agregar, buscar, actualizar la cantidad y eliminar productos del inventario, así como mostrar el inventario completo.

## Requisitos para la Instalación y Ejecución

- **Java Development Kit (JDK)**: Asegúrese de tener instalado el JDK en su sistema. Este código fue escrito y probado con JDK 8, pero debería funcionar con cualquier versión más reciente de JDK.
- **Programa**: NetBeans.
- **Sistema Operativo**: Este código es multiplataforma y puede ejecutarse en cualquier sistema operativo que soporte Java, como Windows, macOS y Linux.

## Instrucciones de Instalación y Ejecución

1. **Instalar el JDK**:
   - Descargue e instale el JDK desde el sitio oficial de Oracle o de OpenJDK.
   - Configure la variable de entorno `JAVA_HOME` apuntando a la carpeta de instalación del JDK.
   - Añada el directorio `bin` del JDK al PATH de su sistema.

2. **Descargar el Código**:
   - Copie el código proporcionado en un archivo llamado `Main.java`.

3. **Compilar el Código**:
   - Abra una terminal o línea de comandos.
   - Navegue hasta el directorio donde guardó el archivo `Main.java`.
   - Ejecute el siguiente comando para compilar el código:
     ```sh
     javac Main.java
     ```

4. **Ejecutar el Programa**:
   - En la misma terminal o línea de comandos, ejecute el siguiente comando para ejecutar el programa:
     ```sh
     java Main
     ```

## Descripción de las Funcionalidades

El programa ofrece las siguientes funcionalidades:

1. **Agregar Productos**:
   - La función `addProduct` permite agregar nuevos productos al inventario. Cada producto tiene un ID, nombre, descripción, precio y cantidad.

2. **Buscar Producto**:
   - La función `findProduct` busca un producto en el inventario por su ID y devuelve el producto si se encuentra. Si no, devuelve `null`.

3. **Actualizar Cantidad**:
   - La función `updateQuantity` permite actualizar la cantidad de un producto específico en el inventario usando su ID. Si el producto es encontrado, se actualiza su cantidad y la función devuelve `true`. Si no, devuelve `false`.

4. **Eliminar Producto**:
   - La función `removeProduct` elimina un producto del inventario utilizando su ID. Si el producto es encontrado y eliminado, la función devuelve `true`. Si no, devuelve `false`.

5. **Mostrar Inventario**:
   - La función `displayInventory` muestra todos los productos presentes en el inventario, imprimiendo sus detalles (ID, nombre, descripción, precio y cantidad).

## Ejemplo de Uso

El programa en el método `main` realiza las siguientes acciones:
1. Crea un inventario y agrega varios productos.
2. Muestra el inventario inicial.
3. Busca un producto específico y muestra su información.
4. Actualiza la cantidad de un producto.
5. Muestra el inventario después de la actualización.
6. Elimina un producto del inventario.
7. Muestra el inventario final después de la eliminación.
