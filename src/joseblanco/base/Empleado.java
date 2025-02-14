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
public class Empleado {

    //PROPIEDADES
protected String dni;

protected String nombre;

protected String apellidos;

protected String dirección;

protected String teléfono;

protected String email;

protected Date fechaContrato;

protected Empresa empresa;

protected List<Proyecto> listaDeProyectos;

protected List<Tarea> listaDeTareas;    

//Construtor por defecto, no tiene parametros    
public Empleado() {
    }

// CONSTRUCTOR CON PARAMETROS

    public Empleado(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

}
