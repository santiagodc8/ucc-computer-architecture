## Main Octal
Este código en Java es una aplicación que utiliza la clase `OctalEngine` para convertir un número octal ingresado por el usuario a decimal.

En la función `main`, se crean variables para imprimir la respuesta y almacenar el resultado, así como una variable para almacenar el número octal ingresado por el usuario. Luego, se crea una instancia de la clase `OctalEngine`.

El programa utiliza la clase `Scanner` para capturar la entrada del usuario. Muestra algunos mensajes para solicitar al usuario que ingrese el número octal. Luego, lee el número ingresado por el usuario en la variable `numero` y cierra la instancia de `Scanner`.

El programa utiliza el método `validarOctal` de la instancia de `OctalEngine` para verificar si el número ingresado por el usuario es un número octal válido. Si es así, utiliza el método octalADecimal para convertir el número octal a decimal y almacena el resultado en la variable `resultado`. Si el número ingresado no es un número octal válido, el programa muestra un mensaje de error y no realiza la conversión.

Finalmente, el programa imprime el resultado de la conversión en caso de éxito y un mensaje de error en caso contrario. En ambos casos, muestra una línea de separación para una mejor presentación.

En resumen, este programa en Java utiliza la clase `OctalEngine` para convertir números octales ingresados por el usuario a números decimales y luego mostrar el resultado en la consola.


## Motor Octal a Decimal
Este código define una clase llamada `OctalEngine` que tiene dos métodos: `validarOctal` y `octalADecimal`. Ambos métodos reciben como parámetro un número octal en forma de entero y retornan un booleano (en el caso de `validarOctal`) o un entero (en el caso de `octalADecimal`).

El método `validarOctal` verifica si el número ingresado es un número octal válido, es decir, si solo contiene dígitos del 0 al 7. Para hacer esto, convierte el número a una cadena de caracteres y luego recorre esta cadena verificando cada caracter. Si un caracter no es un dígito octal válido, el método retorna `false`. Si todos los caracteres son válidos, retorna `true`.

El método `octalADecimal` convierte un número octal a decimal. Para hacer esto, utiliza un ciclo infinito que se rompe cuando el número octal es 0. En cada iteración del ciclo, toma el último dígito del número octal (usando el operador módulo `%`), lo convierte a decimal multiplicándolo por la potencia correspondiente de 8, y agrega este valor a un acumulador `decimal`. Luego, divide el número octal por 10 (usando el operador división `/`) y aumenta la potencia en 1. Finalmente, retorna el valor de decimal, que es el número octal convertido a `decimal`.

En resumen, esta clase proporciona dos métodos útiles para trabajar con números octales en Java: uno para validar que un número es octal y otro para convertir un número octal a decimal.