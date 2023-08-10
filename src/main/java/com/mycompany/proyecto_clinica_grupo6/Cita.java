/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_clinica_grupo6;

/**
 *
 *
 */
class Cita {
    
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
    // Forma privada que dice la duración y costo de la cita basándose en el tipo de servicio.
    private void calcularDuracionYCosto() {
        // Dependiendo del servicio, se asigna un valor a la duración y al costo.
        switch (servicio) {
            //Se definen los diferentes servicios y su respectiva duración y costo.
    case "Medicina General":
        duracion = 30; // Duración en minutos
        costo = 50.0;  // Costo en dólares (por ejemplo)
        break;
    }
    }
}