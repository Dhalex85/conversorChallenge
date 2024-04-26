#AluraLatam y #Oraclenexteducation
Conversor de divisas.

Bienvenido al conversor de divisas by Dhalex, la esencia de este reto es poner a prueba lo aprendido durante el curso,
principalmente el uso de metodos para consumir una API, transformar Json a objetos y hacer uso de los conceptos básicos de programación de cursos anteriores.

Su funcionamiento es sencillo, contamos con un menu para seleccionar una accion, ya sea seleccionar un tipo de conversion entre las divisas disponibles, revisar el historial de conversiones o bien salir del programa.

El corazón de este programa es el elegir una API que nos proporcione los datos para poder convertir divisas, en este caso opté por divisas populares que son: dolar, euro, pesos mexicanos y pesos argentinos.

En la siguiente captura podemos ver el codigo que hace una peticion GET a la API que elegimos, obteniendo un JSON que dentro contiene otro JSON con las divisas y su valor según la petición.

![Captura de pantalla 2024-04-25 214612](https://github.com/Dhalex85/conversorChallenge/assets/25412172/84c3ffd3-c3ca-4a50-aa3b-5e2c6d2deab8)

Tras acceder al objeto Json que contiene las divisas y su valor, guardamos los valores que requerimos en un Record para hacer uso de ellos.
En la clase Main hacemos uso de los conceptos básicos como IF, Switch-case, lectura de datos a través de scanner, ciclos etc. se hacen algunas validaciones para que el dato ingresado sea válido y la ejecucion del programa funcione.

En el siguiente video podemos ver el programa funcionando:

https://github.com/Dhalex85/conversorChallenge/assets/25412172/3d4bbf4f-1e59-41d5-a09a-5a7f9d039f81

Obteniendo algunas conversiones y podemos ver el historial de transacciones que fue agregado como un extra al programa.
El historial se almacena y se imprime como se muestra continuacion: 
![Captura de pantalla 2024-04-25 214547](https://github.com/Dhalex85/conversorChallenge/assets/25412172/9396621b-2284-4452-b3c0-451b68c5fb2f)

Este programa fue realizado en JAVA v21 por Daniel Espinoza, estudiante del grupo 6. 

