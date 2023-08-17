package com.mycompany.proyecto_clinica_grupo6;

import javax.swing.JOptionPane;

public class Clinica {

    // Array que contiene los 5 médicos registrados en la clínica
    private Medico[] medicos = new Medico[5];
    
    // Matriz que representa la agenda de citas de cada médico
    // Cada médico puede tener hasta 10 citas al día
    private Cita[][] agenda = new Cita[5][10];
    
    // Método para registrar un nuevo médico en la clínica
    public void registrarMedico() {
    // Sulicitud de datos del medico
    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del médico:");
    String especialidad = JOptionPane.showInputDialog("Ingrese la especialidad del médico:");
    int horaAlmuerzo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la hora de almuerzo del médico (8-17, formato 24 horas):"));

    // Verificación de validez de hora de almuerzo
    if (horaAlmuerzo < 8 || horaAlmuerzo > 17) {
        JOptionPane.showMessageDialog(null, "Hora de almuerzo inválida.");
        return;
    }

    // Ver si hay espacio en el arreglo de médicos para agregar uno nuevo
    boolean registrado = false;
    for (int i = 0; i < medicos.length; i++) {
        if (medicos[i] == null) {
            medicos[i] = new Medico(nombre, especialidad, horaAlmuerzo);
            registrado = true;
            JOptionPane.showMessageDialog(null, "Médico registrado con éxito.");
            break;
        }
    }
    
    // Si el arreglo de médicos está lleno, muestra un error
    if (!registrado) {
        JOptionPane.showMessageDialog(null, "No hay espacio para registrar más médicos.");
    }
    
    
}
    
     // Método para agendar una cita en la clínica
    public void agendarCita() {
    // solicitar informacionde la cita
    String cliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
    String telefono = JOptionPane.showInputDialog("Ingrese el teléfono del cliente:");
    String servicio = JOptionPane.showInputDialog("Ingrese el servicio (Medicina General, Cirugía Ambulatoria, Cirugía Especializada):");

    // seleccionar hora y medico
    int indexMedico = Integer.parseInt(JOptionPane.showInputDialog("Seleccione un médico (0-4):"));
    int hora = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una hora (8-17, formato 24 horas):")) - 8;

    // Verificación de validez del médico y hora
    if (indexMedico < 0 || indexMedico >= medicos.length || hora < 0 || hora >= 10) {
        JOptionPane.showMessageDialog(null, "Datos inválidos.");
        return;
    }
    // revisar la hora solicitada está disponible
    if (agenda[indexMedico][hora] == null) {
        agenda[indexMedico][hora] = new Cita(cliente, telefono, servicio, medicos[indexMedico]);
        JOptionPane.showMessageDialog(null, "Cita agendada con éxito.");
    } else {
        // Si la hora ya está ocupada, muestra un mensaje de error
        JOptionPane.showMessageDialog(null, "Hora ya ocupada.");
    }
    }
    
    //---------------------------------------------------------------------------------------
    
    
    

    public static void main(String[] args) {
        
        Clinica Clinica = new Clinica();
        boolean continuar = true;

        // Muestra un menú repetidamente hasta que el usuario decida salir
        while (continuar) {
            String option = JOptionPane.showInputDialog("Seleccione una opción: \n1. Registrar Médico \n2. Agendar Cita \n3. Cancelar Cita \n4. Revisar Agenda \n5. Salir");
            
            //falta un case con las opciones, aun no funcional del todo 
    
            JOptionPane.showInputDialog("Cambio para prueba del Git");
    
        }
   }
}
