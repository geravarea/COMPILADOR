/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador2475;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Gerardo Vargas
 */
public class Compilador2475 {

    static Diccionario diccionario = new Diccionario();
    static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    static DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
    static Date date = new Date();

    public static void main(String[] args) {
        System.out.println("-------------DOCUMENTO PROCESADO----------------");
        System.out.println("FECHA:" + dateFormat.format(date));
        System.out.println("HORA:" + hourFormat.format(date));
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        File entrada;
        entrada = new File("C:\\Users\\Gerardo Vargas\\Desktop\\NetBeans\\entrada.txt");
        //Se lee lo que contiene el archivo entrada.txt y se guarda en el String linea
        try {
            BufferedReader leer = new BufferedReader(new FileReader(entrada));
            String linea = leer.readLine();

            //usamos el metodo split para separar con tokens el contenido del String linea 
            String[] tokens = linea.split("[,\\s]+");
            String sFichero = "C:\\Users\\Gerardo Vargas\\Desktop\\NetBeans\\salida.gera";
            File escritura = new File(sFichero);
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(sFichero))) {
                bw.write("------------------------------------------------");
                bw.newLine();
                bw.write("             DOCUMENTO PROCESADO                ");
                bw.newLine();
                bw.write("------------------------------------------------");
                bw.newLine();
                bw.newLine();
                bw.newLine();
                bw.write("------------------------------------------------");
                bw.newLine();
                bw.write("FECHA:" + dateFormat.format(date) + "                " + "HORA:" + hourFormat.format(date));
                bw.newLine();
                bw.write("------------------------------------------------");
                //bw.newLine();
                //bw.write("HORA:" +hourFormat.format(date));
                //bw.newLine();
                bw.newLine();
                //bw.write("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                bw.newLine();
                int i;
                int x;
                //Expresion regular para numeros y decimales
                String regex2 = ("^[0-9]*(\\.[0-9])?$+");
                //Expresion regular para las variables
                String regex3 = ("[A-Z0-978]+");
                 //Expresion regular para los textos
                 String regex4 = ("\\'[a-zA-Z0-9]{0,100}'+");
                //Este ciclo recorre los tokens uno por uno
                for (x = 0; x < tokens.length; x++) {
                    boolean bandera = false;
                    //Este siclo recorre todo el diccionario de simbolos
                    for (i = 0; i < 33; i++) {

                        String regex = (diccionario.getValor(i));

                        //si alguno de los tokens es igual a algun valor del diccionario
                        if (tokens[x].equals(regex) || tokens[x].matches(regex2) || tokens[x].matches(regex3) || tokens[x].matches(regex4)) {

                            bandera = true;
                            break;
                        }
                    }
                    if (bandera == true) {

                        if (tokens[x].matches(regex2)) {
                            System.out.println("\033[35mToken: val " + tokens[x]);
                            bw.write("Token: val " + tokens[x]);
                            bw.newLine();

                        }  else if (tokens[x].matches(regex3)) {

                            System.out.println("\033[33mToken: var " + tokens[x]);
                            bw.write("Token: var " + tokens[x]);
                            bw.newLine();
                            
                        } 
                        else if (tokens[x].matches(regex4)) {

                            System.out.println("\033[36mToken: text " + tokens[x]);
                            bw.write("Token: Text " + tokens[x]);
                            bw.newLine();
                        }
                        else {
                            System.out.println("Token: " + tokens[x] + " -> " + diccionario.getValor2(i));
                            bw.write("Token: " + tokens[x] + " " + diccionario.getValor2(i));
                            bw.newLine();
                        }

                    } else {

                        System.err.println("\033[31mError: la expresion " + "'" + tokens[x] + "'" + " tiene un error de sintaxis!");
                        bw.write("Error: " + "(" + tokens[x] + ")" + " tiene un error de sintaxis! ");
                        bw.newLine();
                    }
                }
            }
        } catch (IOException ex) {
        }

    }

}

    

