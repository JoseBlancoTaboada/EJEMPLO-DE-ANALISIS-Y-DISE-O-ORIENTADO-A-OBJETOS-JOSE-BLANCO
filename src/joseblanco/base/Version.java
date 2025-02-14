/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joseblanco.base;

import java.io.File;
import java.util.Date;

/**
 *
 * @author elhac
 */
public class Version {

private Date fecha;

private String descripicion;

private File archivo;

private Documento documento;

//Construtor por defecto, no tiene parametros
    public Version() {
    }
    // CONSTRUCTOR CON PARAMETROS

    public Version(Date fecha, String descripicion) {
        this.fecha = fecha;
        this.descripicion = descripicion;
    }
    

}
