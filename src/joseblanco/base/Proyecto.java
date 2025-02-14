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
public class Proyecto {
    //PROPIEDADES
private String nombreClave;

private String denominacion;

private Date fechalnicio;

private Date fechaFin;

private String estado;

private Empresa empresa;

private Promotor empleadoPromotor;

private List<Empleado> listaDeEmpleados;

private List<Tarea> listaDeTareas;    

//Construtor por defecto, no tiene parametros 

    public Proyecto() {
    }
// CONSTRUCTOR CON PARAMETROS

    public Proyecto(String nombreClave, String denominacion) {
        this.nombreClave = nombreClave;
        this.denominacion = denominacion;
    }
    
}
