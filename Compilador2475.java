/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador2475;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

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
           
            StringTokenizer tokens=new StringTokenizer(linea,";");
          
            //display.setText(linea);
           //System.out.print(linea);
          
           String tok;
           
          for(int i=0; i<26; i++){
            while(tokens.hasMoreTokens()){
                
            tok=tokens.nextToken();
             
            String regex =(diccionario.getValor(i));
            //System.out.println(regex);
            
            if(tok.matches(regex)){
                System.out.println("Token: "+tok+" = "+diccionario.getValor2(i));
            }else{
            
          System.out.println("Error: la expresion "+"'"+tok+"'"+" no existe.");
      
            }
            
            } 
            //System.out.println("token: "+tok);
            i=i+1;
            }
          
            
            //JOptionPane.showMessageDialog(null,linea);
            
        } catch (IOException ex) {
           
        }
        // TODO code application logic here
        
    
    }
}
    
   
    

