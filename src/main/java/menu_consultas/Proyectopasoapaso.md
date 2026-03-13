Paso a paso - Proyecto JDBC + MySQL
Antes de empezar

Tener MySQL corriendo con tu base de datos y tabla Trabajadores con datos
Tener IntelliJ con un proyecto Maven creado
Tener el driver de MySQL en el pom.xml


1. Crear databaseConexion.java

Crear una clase pública
Crear un método estático que retorne Connection
Dentro definir url, usuario y contraseña de MySQL
Usar un try normal para abrir la conexión y retornarla
En el catch imprimir el error y retornar null
Ojo: NO usar try-with-resources aquí o la conexión se cierra sola


2. Crear Empleado.java

Crear una clase pública
Declarar los atributos privados según las columnas de tu tabla
Crear el constructor con todos los atributos
Generar los getters y setters con Alt+Insert


3. Crear EmpleadoDAO.java

Crear una clase pública
Crear el método buscarPorNombre

Recibe un String como parámetro
Define el query SQL con LIKE y ?
Abre conexión y PreparedStatement con try-with-resources
Asigna el valor al ? con setString concatenando "%"
Ejecuta el query con executeQuery() y guarda en ResultSet
Recorre el ResultSet con while y imprime cada nombre
Maneja el error con catch


Crear el método buscarPorRangoSalarial

Recibe dos double como parámetros, min y max
Define el query SQL con BETWEEN ? AND ?
Abre conexión y PreparedStatement con try-with-resources
Asigna los dos valores con setDouble
Ejecuta y recorre el ResultSet imprimiendo nombre y salario
Maneja el error con catch


Crear el método mostrarOrdenadosSalarios

Sin parámetros
Define el query SQL con ORDER BY salarioT DESC
Abre conexión y PreparedStatement con try-with-resources
Sin set porque no hay ?
Ejecuta y recorre el ResultSet imprimiendo nombre y salario
Maneja el error con catch




4. Crear menu_consulta.java

Crear la clase con el método main
Crear el Scanner
Crear un objeto de EmpleadoDAO
Declarar opcion = -1
Crear el while con condición opcion != 0
Dentro del while:

Imprimir las opciones del menú
Leer la opción con nextInt()
Limpiar el buffer con nextLine()
Crear el switch con los cases
Case 1: pedir nombre, leerlo y llamar buscarPorNombre
Case 2: pedir min y max, leerlos y llamar buscarPorRangoSalarial
Case 3: llamar mostrarOrdenadosSalarios directo
Case 0: mensaje de salir
Default: mensaje de opción inválida




Errores comunes a evitar

try-with-resources en getConexion cierra la conexión antes de usarla
El % solo va con LIKE, nunca con números
Sin sc.nextLine() después de sc.nextInt() el scanner se salta entradas
getString para texto, getDouble para decimales, getInt para enteros