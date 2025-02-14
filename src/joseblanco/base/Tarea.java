/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joseblanco.base;

import java.util.Date;
import java.util.List;

/**
 *
 * @author elhac
 */
public class Tarea {
 
    //PROPIEDADES
private String descripción;

private String tipo;

private Date fechaInicioEstimado;

private Date fechalnicioreal;

private int duraciónEstimada;

private int duraciónReal;

private List<Empleado> listaDeEmpleados;

private Proyecto proyecto;

private  List<Documento> listaDeDocumentos; 

//Construtor por defecto, no tiene parametros    
public Tarea() {
    }
// CONSTRUCTOR CON PARAMETROS

    public Tarea(String descripción, String tipo) {
        this.descripción = descripción;
        this.tipo = tipo;
    }

    
}
