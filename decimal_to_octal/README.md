## Main Decimal
Este código en Java es una aplicación que utiliza la clase `DecimalEngine` para convertir un número decimal ingresado por el usuario a octal.

En la función `main`, se crean variables para imprimir la respuesta y almacenar el resultado, así como una variable para almacenar el número decimal ingresado por el usuario. Luego, se crea una instancia de la clase `DecimalEngine`.

El programa utiliza la clase `Scanner` para capturar la entrada del usuario. Muestra algunos mensajes para solicitar al usuario que ingrese el número decimal. Luego, lee el número ingresado por el usuario en la variable numero y cierra la instancia de `Scanner`.

El programa utiliza el método `validarDecimal` de la instancia de `DecimalEngine` para verificar si el número ingresado por el usuario es un número decimal válido. Si es así, utiliza el método `decimalAOctal` para convertir el número decimal a octal y almacena el resultado en la variable `resultado`. Si el número ingresado no es un número decimal válido, el programa muestra un mensaje de error y no realiza la conversión.

Finalmente, el programa imprime el resultado de la conversión en caso de éxito y un mensaje de error en caso contrario. En ambos casos, muestra una línea de separación para una mejor presentación.

En resumen, este programa en Java utiliza la clase `DecimalEngine` para convertir números decimales ingresados por el usuario a números octales y luego mostrar el resultado en la consola.

## Motor Decimal a Octal
Este código en Java contiene una clase llamada `DecimalEngine`, que se encarga de realizar la conversión de un número decimal a su equivalente en octal. La clase tiene dos métodos públicos:

1) `validarDecimal(int decimal)`: Este método se encarga de validar que el número ingresado es un número entero. Siempre retorna `true` y muestra un mensaje indicando que el número es decimal.

2) `decimalAOctal(int decimal)`: Este método realiza la conversión de un número decimal a su equivalente en octal. Primero declara una variable residuo que almacena el resultado del `residuo` de la división del número decimal entre 8. Luego, declara una cadena vacía llamada `octal` que se utilizará para almacenar el número octal resultante.

A continuación, se utiliza un ciclo `while` para obtener los dígitos del número octal. El ciclo se repite mientras el número decimal sea mayor que cero. En cada iteración, se calcula el residuo y se almacena en la variable residuo. Luego, se utiliza el arreglo `caracteresOctales` para obtener el caracter correspondiente al residuo, y se concatena a la cadena `octal`. Finalmente, se divide el número decimal entre 8 y se actualiza el valor de la variable `decimal` con el resultado.

Después de que el ciclo `while` termina, se devuelve la cadena `octal`, que contiene el número octal resultante. 