/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_clinica_grupo6;

/**
 *
 * 
 */
// Esta es la clase que representa a un médico.
class Medico {

    // Datos del medico
    private String nombre;
    private String especialidad;
    private int horaAlmuerzo;

    // Contructor para crear un nuevo medico y sus datos
    public Medico(String nombre, String especialidad, int horaAlmuerzo) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.horaAlmuerzo = horaAlmuerzo;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //========================================================================================================================================


    // Método que devuelve la hora del almuerzo del médico.
    public int getHoraAlmuerzo() {
        return horaAlmuerzo;
    }
    
    // Método que permite cambiar la hora del almuerzo del médico.
    public void setHoraAlmuerzo(int horaAlmuerzo) {
        this.horaAlmuerzo = horaAlmuerzo;
    }
    
    //El método lo que hace es sobreescribir un metodo sobre otro, es decir, prevenir errores a la hora de ejecutar 
    @Override

    // Este método devuelve una representación en cadena de texto del médico.
    public String toString() {
        return "Medico{" +
                "nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", horaAlmuerzo=" + horaAlmuerzo +
                '}';
    }    
}