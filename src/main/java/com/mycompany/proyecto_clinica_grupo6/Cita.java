/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_clinica_grupo6;

/**
 *
<<<<<<< HEAD
 * 
=======
 *
>>>>>>> eeae085d56407f3f1abf276cae34ad45ba29065b
 */
public class Cita {

     // Estos datos se caracterizan por realizar un desglose a una cita: cliente, teléfono, servicio, duración, costo y el médico que atiende.
    private String cliente;
    private String telefono;
    private String servicio;
    private int duracion;
    private double costo;
    private Medico medico;
    

     // Constructor: es una función especial que nos permite crear o inicializar un objeto de tipo Cita con datos específicos.
    public Cita(String cliente, String telefono, String servicio, Medico medico) {
        this.cliente = cliente;
        this.telefono = telefono;
        this.servicio = servicio;
        this.medico = medico;

}
}