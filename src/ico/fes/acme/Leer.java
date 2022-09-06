/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.acme;

import adts.Arreglo;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Leer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    try{
        BufferedReader datos = new BufferedReader(new FileReader("C:\\Users\\lopez\\Downloads\\junio.dat"));
        datos.readLine();
        String linea1 = null;
        
        while ((linea1=datos.readLine())!=null)
        {
            String coma[] = linea1.split(",");
            Empleado a = new Empleado();
            a.setId(Integer.parseInt(coma[0]));
            a.setNombre(coma[1]);
            a.setPaterno(coma[2]);
            a.setMaterno(coma[3]);
            a.setHorasExtra(Integer.parseInt(coma[4]));
            a.setSueldoBase(Integer.parseInt(coma[5]));
            a.setAnioIngreso(Integer.parseInt(coma[6]));
            
            System.out.println(a);
            System.out.println("Sueldo: "+ a.calcularSueldo());
            
            System.out.println(a.mayor());
          
        }
    }
    
    
    catch(FileNotFoundException ex) {
        System.err.println(ex.getMessage());
        
    }catch (IOException ex) {
            Logger.getLogger(Leer.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}

