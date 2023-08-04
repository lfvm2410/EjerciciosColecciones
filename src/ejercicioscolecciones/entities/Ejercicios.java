/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscolecciones.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author luis_
 */
public class Ejercicios {
    
    private ArrayList<Integer> numerosA;
    private HashSet<Integer> numeros3;
    private HashMap<Integer, String> alumnos;

    public ArrayList<Integer> getNumerosA() {
        return numerosA;
    }

    public void setNumerosA(ArrayList<Integer> numerosA) {
        this.numerosA = numerosA;
    }

    public HashSet<Integer> getNumeros3() {
        return numeros3;
    }

    public void setNumeros3(HashSet<Integer> numeros3) {
        this.numeros3 = numeros3;
    }

    public HashMap<Integer, String> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(HashMap<Integer, String> alumnos) {
        this.alumnos = alumnos;
    }
    
}
