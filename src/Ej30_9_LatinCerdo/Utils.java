/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej30_9_LatinCerdo;

import static Ej30_9_LatinCerdo.UILatin.txtLatin;
import static Ej30_9_LatinCerdo.UILatin.txtSpanish;


import java.util.StringTokenizer;

/**
 *
 * @author gustavo
 */
public class Utils {
    static char palabra[];
    static String[] palabras;
    static String[] traducido;
    static int contador = 0;
    static int totalLetras;
    static String cadena;
    StringTokenizer tokens;
    public int nDatos;
    StringBuilder builder;

    public void initVar(String enunciado) {
        StringTokenizer tokens = new StringTokenizer(enunciado);
        StringBuilder builder = new StringBuilder();
        nDatos = tokens.countTokens();
        palabras = new String[nDatos];
        traducido = new String[nDatos];

    }

    public void tokensClass(String enunciado) {
        StringTokenizer tokens = new StringTokenizer(enunciado);
        while (tokens.hasMoreElements()) {
            palabras[contador] = tokens.nextToken();
            contador++;
        }
    }

    public void imprimirPalabraEnLatin(String enunciado) {
        // procesa el enunciado del usuario

        for (int i = 0; i < nDatos; i++) {
            cadena = palabras[i];
            palabra = cadena.toCharArray();
            totalLetras = cadena.length() - 1;

            String s4 = new String(palabra, 1, totalLetras);
            String s5 = s4 + palabra[0] + "ae";
            traducido[i] = s5;
        }

        concat();

    }

    public static void concat() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < traducido.length; i++) {
            builder.append(traducido[i] + " ");
        }
        txtLatin.setText(builder.toString());
    }

    public void cleanVar() {
        palabras = null;
        traducido = null;
        contador = 0;
        totalLetras = 0;
        cadena = null;
        nDatos = 0;
        palabra = null;
builder = null;
tokens =null;
txtLatin.setText("");
txtSpanish.setText("");
    }

}
