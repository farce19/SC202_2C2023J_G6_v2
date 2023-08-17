/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_clinica_grupo6;


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
    // Forma privada que dice la duración y costo de la cita basándose en el tipo de servicio.
    private void calcularDuracionYCosto() {
        // Dependiendo del servicio, se asigna un valor a la duración y al costo.
        switch (servicio) {
            //Se definen los diferentes servicios y su respectiva duración y costo.
    case "Medicina General":
        duracion = 30; // Duración en minutos
        costo = 50.0;  // Costo en dólares (por ejemplo)
        break;
    case "Cirugía Ambulatoria":
        duracion = 120;
        costo = 200.0;
        break;
    case "Cirugía Especializada":
        duracion = 240;
        costo = 500.0;
        break;
    }

        // Se añade un impuesto del 13% al costo original.
        costo += costo * 0.13;
    }

    Object getCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
      
    // Después, tenemos métodos que permiten obtener o cambiar los datos de una cita.
    //Son como "ventanas" para ver o modificar la información.

    // Devuelve el nombre del cliente de la cita.
    public String Cliente() {
        return cliente;
    }

    // Permite cambiar el nombre del cliente de la cita.
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    // Devuelve el teléfono asociado a la cita.
    public String getTelefono() {
        return telefono;
    }

    // Permite cambiar el teléfono asociado a la cita.
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Devuelve el tipo de servicio de la cita.
    public String getServicio() {
        return servicio;
    }

    // Permite cambiar el tipo de servicio de la cita.
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
    
    // Devuelve la duración de la cita.
    public int getDuracion() {
        return duracion;
    }

    // Permite cambiar la duración de la cita.
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    // Devuelve el costo de la cita.
    public double getCosto() {
        return costo;
    }

    // Permite cambiar el costo de la cita.
    public void setCosto(double costo) {
        this.costo = costo;
    }

    // Devuelve el médico que atenderá la cita.
    public Medico getMedico() {
        return medico;
    }

    // Permite cambiar el médico que atenderá la cita.
    public void setMedico(Medico medico){
        this.medico = medico;
    }
}
