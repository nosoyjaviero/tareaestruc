/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesArboles;

import java.io.*;

/**
 * @author Bryán Segura
 * @author Javier López
 * @author Nikole Moraga
 */
public class Main {
//

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        Person persona = new Person();
        persona.insertNodo(8, "javi", "lopex", "valverde");
        persona.insertNodo(3, "messi ", "lopez", "valverde");
        persona.insertNodo(1, "cr7 ", "lopez", "valverde");
        persona.insertNodo(6, "xavi ", "lopez", "valverde");
        persona.insertNodo(4, "link ", "lopez", "valverde");
        persona.insertNodo(7, "clack ", "lopez", "valverde");
        persona.insertNodo(10, "naruto ", "lopez", "valverde");
        persona.insertNodo(14, "niko ", "lopez", "valverde");
        persona.insertNodo(13, "bryan ", "lopez", "valverde");

       File archivo =new File("C://Users//Javier//Desktop//Datos.txt") ;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

           
            String linea;
            while ((linea = br.readLine()) != null) {
                
                String[] datos = linea.split(",");
                
                if (datos != null) {
                   persona.insertNodo(Integer.valueOf(datos[0]),datos[5],datos[6],datos[7]);
                 
                }
                

            }
        } catch (Exception e) {
            e.printStackTrace();
            
        } finally {
           
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        
        
        long inicio = System.currentTimeMillis();
        System.out.println("Preorden ");
        persona.preOrden(persona.returnRoot());
        System.out.println("");
        System.out.println("postorden");
        persona.postOrden(persona.returnRoot());
        System.out.println("");
        System.out.println("Simetrico");
        persona.simetrico(persona.returnRoot());
    }

}
