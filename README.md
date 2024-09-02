# Caso Palindromo

# Palindromo

function esPalindromo(cadena) {

let resultado = "";

resultado = cadena.split('').reverse().join('');

return cadena === resultado;

}

el metodo en js analiza una cadena de texto devolviendo true si es un palindromo y false si no lo es, mediante el .split divide la cadena un una lista de caracteres los cuales invierte su orden utilizando el .reverse y lo compara con la cadena original.
¿Qué resultados arrojan sus Test con estas entradas: “aca”, “acas”, “h”?
a) es palindromo (true)
b) no es palindromo (false)
c) es palindromo (true)

- Caso de prueba 1:

Input: 200 (número entero)

Output: ????
R: no funcionara dando el error (incompatible types)o dira que no es palindromo(false) si ingreso un valor entero amenos que pasemos el entero a cadena previamente.

- Caso de prueba 2:

Input: “” (cadena vacía)

Output: ????
R: Deberia devolver que es un palindromo(true) ya que tambien se toma comom si fuese una cadena(nada es igual que nada escrito tanto al derecho como al reves)
- Caso de prueba 3:

Input: “aaabccbaaa”

Output: ????
R: deberia devolver que es un palindromo(true) ya que el largo de la cadena deberia de ser irelevante (en casos donde la cadena es de un largo "prudente")
- Caso de prueba 4:

Input: “ahabccbaaa”

Output: ????
Deberia devolver que no es un palindromo(false) ya que esa cadena de texto no se escribe de igual manera al derecho como al reves

- Caso de prueba 5:

Input: “La tele letal”

Output: ????
R: En este caso deberia devolver que no es palindromo(false) pero es debido a la mayuscula al inicio de la frase.
