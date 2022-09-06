/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.acme;

import adts.Arreglo;

/**
 *
 * @author Cabrera
 */
public class NominaADT {
    String nombreEmpresa;
    Arreglo<Empleado> nomina;
    String rutaArchivo;

    public NominaADT(String ruta) {
        this.rutaArchivo=ruta;
        
    }
    
    
}
