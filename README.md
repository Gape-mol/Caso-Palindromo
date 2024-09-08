# Caso Palindromos

## Paso 1

function esPalindromo(cadena) {

let resultado = "";

resultado = cadena.split('').reverse().join('');

return cadena === resultado;

}

1.1 Discutir y concluir:

- ¿Qué hace el método? R.- El metodo invierte un String otorgado a la funcion y lo invierte, guardandolo en una variable, para luego retornar si estas son iguales (true) o no (false)

- ¿Cómo lo hace? R.- Separa por caracteres la cadena y los invierte y luego los agrega por uno a la variable

- ¿Cómo lo uso? R.- entregandole un String a la funcion 

Dé al menos un ejemplo de su uso (sin codificar nada).

esPalindromo("hola") y eso retornara false

## Paso 3

- 3.1 Discutir en grupo el diseño de un plan de pruebas para este caso..-

- 3.2 A partir de su plan de pruebas, diseñe los casos de pruebas unitarias a implementar (aún no codifique nada!!!), considere al menos 5.

- 3.3 Estando seguros que sus casos de pruebas unitarias son amplios y relevantes, ahora impleméntelos en Java usando JUnit.

- 3.4 ¿Qué resultados arrojan sus Test con estas entradas: “aca”, “acas”, “h”?