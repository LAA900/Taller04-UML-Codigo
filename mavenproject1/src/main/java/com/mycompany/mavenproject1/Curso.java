/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;

/**
 *
 * @author CltControl
 */
public class Curso {
    
    
    private String id;
    private String nombre;
    private boolean estadoDisponible;
    
    
    private ArrayList<Estudiante> estudiantesInscritos = new ArrayList<>();
    private ArrayList<Estudiante> estudiantesEnEsperaDeInscripcion = new ArrayList<>();
    private Profesor responsable;
    private ArrayList<Foro> foros = new ArrayList<>();
    private ArrayList<ActividadSumativa> actividadesSumativas = new ArrayList<>();
    
    public Curso (Estudiante estudiantesInscritos, Estudiante estudiantesEnEsperaDeInscripcion, Profesor responsable ) {
        estudiantesInscritos = estudiantesInscritos;
        estudiantesEnEsperaDeInscripcion = estudiantesEnEsperaDeInscripcion;
        responsable = responsable;
    }
    
}
