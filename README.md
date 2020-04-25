# EjerciciosCap3

Ejercicio 1:
30.9 (Latín cerdo) Escriba una aplicación que codifique frases en español a frases en latín cerdo. El latín cerdo es una forma de lenguaje codificado. Existen muchas variaciones en los métodos utilizados para formar frases en latín cerdo. Por cuestiones de simpleza, utilice el siguiente algoritmo: 
Para formar una frase en latín cerdo a partir de una frase en español, divida la frase en palabras con un objeto de la clase StringTokenizer. Para traducir cada palabra en español a una palabra en latín cerdo, coloque la primera letra de la palabra en español al final de la palabra, y agregue las letras “ae”. De esta forma, la palabra “salta” se convierte a “altasae”, la palabra “el” se convierte en “leae” y la palabra “computadora” se convierte en “omputadoracae”. Los espacios en blanco entre las palabras permanecen como espacios en blanco. Suponga que la frase en español consiste en palabras separadas por espacios en blanco, que no hay signos de puntuación y que todas las palabras tienen dos o más letras. El método imprimirPalabraEnLatin deberá mostrar cada palabra. Cada token devuelto de nextToken se pasará al método imprimirPalabraEnLatin para imprimir la palabra en latín cerdo. Permita al usuario introducir el enunciado. Use un área de texto para ir mostrando cada uno de los enunciados convertidos. 

Ejercicio 2:
30.21 (Análisis de textos) La disponibilidad de computadoras con capacidades de manipulación de cadenas ha dado como resultado algunos métodos interesantes para analizar los escritos de grandes autores. Se ha dado mucha impor- tancia para saber si realmente vivió William Shakespeare. Algunos estudiosos creen que existe una gran evidencia que indica que en realidad fue Cristopher Marlowe quien escribió las obras maestras que se atribuyen a Shakespeare. Los investigadores han utilizado computadoras para buscar similitudes en los escritos de estos dos autores. En este ejercicio se examinan tres métodos para analizar textos mediante una computadora. 
a)  Escriba una aplicación que lea una línea de texto desde el     teclado e imprima una tabla que indique el número de ocurrencias de cada letra del alfabeto en el texto. Por ejemplo,     la frase: 
                 Ser o no ser: ése es el dilema: 
                contiene una “a”, ninguna “b”, ninguna “c”, etcétera. 

b)  Escriba una aplicación que lea una línea de texto e imprima una tabla que indique el número de palabras de una letra, de dos letras, de tres letras, etcétera, que aparezcan en el texto. Por ejemplo, en la figura 30.25 se muestra la cuenta para la frase:  
            
                ¿Qué es más noble para el espíritu?
                
                
                Longitud de palabra    Ocurrencias
                        1                  0
                        2                  2
                        3                  2
                        4                  1
                        5                  1
                        6                  0
                        7                  0
                        8                  1
                
c)  Escriba una aplicación que lea una línea de texto e imprima una tabla que indique el número de ocurrencias de cada         palabra distinta en el texto. La primera versión de su programa debe incluir las palabras en la tabla, en el mismo orden en el cual aparecen en el texto. Por ejemplo, las líneas:          
                Ser o no ser: ése es el dilema
                ¿Qué es más noble para el espíritu?

contiene la palabra “ser” dos veces, La palabra “o” una vez, la palabra “ése” una vez, etcétera. Una muestra 
más interesante (y útil) podría ser intentar con las palabras ordenadas alfabéticamente. 

Ejercicio 3:
30.22 (Impresión de fechas en varios formatos) Las fechas se imprimen en varios formatos comunes. Dos de los formatos más utilizados son: 
            
            04/25/1955 y Abril 25, 1955
            
Escriba una aplicación que lea una fecha en el primer formato e imprima dicha fecha en el segundo formato. 
