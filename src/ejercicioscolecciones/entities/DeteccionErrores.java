package ejercicioscolecciones.entities;


import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis_
 */
public class DeteccionErrores {
    
   private ArrayList<Integer> listado;
   private TreeSet<Integer> treeset;
   private HashMap<Integer, String> personas;

    public ArrayList<Integer> getListado() {
        return listado;
    }

    public void setListado(ArrayList<Integer> listado) {
        this.listado = listado;
    }

    public TreeSet<Integer> getTreeset() {
        return treeset;
    }

    public void setTreeset(TreeSet<Integer> treeset) {
        this.treeset = treeset;
    }

    public HashMap<Integer, String> getPersonas() {
        return personas;
    }

    public void setPersonas(HashMap<Integer, String> personas) {
        this.personas = personas;
    }
   
   
    
}
