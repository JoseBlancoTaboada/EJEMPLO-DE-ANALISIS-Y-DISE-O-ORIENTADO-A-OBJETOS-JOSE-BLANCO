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
public class Documento {

private String codigo;

private String descripcion;

private String tipo;

private Tarea tarea;

private List<Version> listaDeVersiones;    

// CONSTRUCTORES
    public Documento() {
    }
// CONSTRUCTOR CON PARAMETROS

 public Documento(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    

}
