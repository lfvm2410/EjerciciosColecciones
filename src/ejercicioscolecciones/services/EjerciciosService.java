package ejercicioscolecciones.services;

import ejercicioscolecciones.entities.Ejercicios;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis_
 */
public class EjerciciosService {
    
    public void ejercicioColecciones(Ejercicios ejercicios){
        //Lista
        ejercicios.setNumerosA(new ArrayList());
        ejercicios.getNumerosA().add(1);
        ejercicios.getNumerosA().add(2);
        ejercicios.getNumerosA().add(3);
        ejercicios.getNumerosA().add(4);
        ejercicios.getNumerosA().add(5);
        System.out.println(ejercicios.getNumerosA().remove(4));
        //Set
        ejercicios.setNumeros3(new HashSet());
        ejercicios.getNumeros3().add(1);
        ejercicios.getNumeros3().add(2);
        ejercicios.getNumeros3().add(3);
        ejercicios.getNumeros3().add(4);
        ejercicios.getNumeros3().add(5);
        System.out.println(ejercicios.getNumeros3().remove(5));
        //Map
        ejercicios.setAlumnos(new HashMap());
        ejercicios.getAlumnos().put(1, "Luis Fernando");
        ejercicios.getAlumnos().put(2, "Luis");
        ejercicios.getAlumnos().put(3, "Fernando");
        ejercicios.getAlumnos().put(4, "Jimena");
        ejercicios.getAlumnos().put(5, "Karla");
        System.out.println(ejercicios.getAlumnos().remove(5));
    }
    
}
