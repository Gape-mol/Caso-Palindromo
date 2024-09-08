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

Se considera hacer 5 pruebas. La primera para asegurarse que el programa funciona correctamente, se usará el comando "assertTrue(Main.esPalindromo("anita lava la tina"))" y debería pasar la prueba.
Para la segunda se usará "assertFalse(Main.esPalindromo("hola"))" para asegurar el caso en que la cadena entregada no sea un palindromo.
En la tercera se usará "assertFalse(Main.esPalindromo("Anita lava la tina"))" para confirmar que el codigo dirá que no es palindromo si la cadena empieza con una mayuscula.
Para la cuarta prueba se usará "assertTrue(Main.esPalindromo(""))" para ver que entrega el codigo al recibir una cadena vacía.
Y por ultimo, "assertTrue(Main.esPalindromo("a"))" para el caso en que se entregue un solo caracter.

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
