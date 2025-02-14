/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joseblanco.base;

import java.util.Date;

/**
 *
 * @author elhac
 */
public class ManoDeObra {

    //PROPIEDADES
private Empleado trabajador;

private Proyecto proyecto;

private Date FechaInicio;

private Date FechaFin;

private String rol;  

//Construtor por defecto, no tiene parametros 

    public ManoDeObra() {
    }

    public ManoDeObra(Empleado trabajador, Proyecto proyecto) {
        this.trabajador = trabajador;
        this.proyecto = proyecto;
    }

    
}
