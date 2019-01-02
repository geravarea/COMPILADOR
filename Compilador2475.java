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



/**
 *
 * @author Gerardo Vargas
 */
public class Compilador2475 {
    static Diccionario diccionario= new Diccionario();
    
  
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File entrada;
        entrada = new File("C:\\Users\\Gerardo Vargas\\Desktop\\NetBeans\\entrada.txt");
        
            try {
                BufferedReader leer = new BufferedReader(new FileReader(entrada));
                String linea=leer.readLine();

                String s=(linea);
                String[]tokens=s.split("[;]");
               
               int i;
               int x;
                for( x=0; x<tokens.length; x++){
                    boolean bandera=false;
                    for(i=0; i<26; i++){
                      //System.out.println(diccionario.getValor(x));  
                      
                        String regex =(diccionario.getValor(i)); 
                          //System.out.println(diccionario.getValor(x));
                        if(tokens[x].equals(regex)){  
                            bandera=true;
                            break;
                        }
                       
                    }
                     if(bandera==true){
                            System.out.println("Token: "+tokens[x]+" = "+diccionario.getValor2(i)); 
                        try (FileWriter escritura = new FileWriter("C:\\Users\\Gerardo Vargas\\Desktop\\NetBeans\\salida.lib")) {
                            escritura.write("Token: "+diccionario.getValor2(i));
                             escritura.write("\n");
                        }
                                
                        }else{  
                            
                            System.out.println("Error: la expresion "+"'"+tokens[x]+"'"+" no existe."+diccionario.getValor2(i));
                                
                    }
                     
            
                   
                }
                
           }catch (IOException ex){}
             // TODO code application logic here 
    }
    
}

    
   
    

