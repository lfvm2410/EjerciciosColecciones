/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscolecciones;

import ejercicioscolecciones.entities.Ejercicios;
import ejercicioscolecciones.services.DeteccionErroresService;
import ejercicioscolecciones.services.EjerciciosService;

/**
 *
 * @author luis_
 */
public class EjerciciosColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DeteccionErroresService deteccionErroresService = new DeteccionErroresService();
        deteccionErroresService.deteccionErrores1();
        EjerciciosService ejerciciosService = new EjerciciosService();
        ejerciciosService.ejercicioColecciones(new Ejercicios());
        deteccionErroresService.deteccionErrores2();
        deteccionErroresService.deteccionErrores3();
    }
    
}
