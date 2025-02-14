/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joseblanco.base;

import java.util.List;

/**
 *
 * @author elhac
 */
public class Promotor extends Empleado {
 
private List<Proyecto> listaDeProyectos;

    public Promotor() {
        super(); //llama al constructor de Empleado
    }

    public Promotor(String nombre, String apellidos) {
        super(nombre, apellidos);
    }


}
