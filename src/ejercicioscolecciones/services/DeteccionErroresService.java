/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscolecciones.services;

import ejercicioscolecciones.entities.DeteccionErrores;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author luis_
 */
public class DeteccionErroresService {
    
     public void deteccionErrores1(){
        ArrayList<Integer> listado = new ArrayList();
        TreeSet<Integer> treeset = new TreeSet();
        HashMap<Integer, String> personas = new HashMap();
    }
     
    public void deteccionErrores2(){
        HashMap<Integer, String> personas = new HashMap();
        Integer p1 = 1;
        String n1 = "Albus";
        Integer p2 = 2;
        String n2 = "Severus";
        personas.put(p1, n1);
        personas.put(p2, n2);
    }
    
    public void deteccionErrores3(){
        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();
        while (it.hasNext()){
            if (it.next().equals("café")){
                System.out.println("Removed!");
                it.remove();
            }
        }
    }
    
}
