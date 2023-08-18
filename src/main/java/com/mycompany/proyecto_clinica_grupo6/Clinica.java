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
    String nombre = JOptionPane.showInputDialog("Ingrese el médico iniciando en 0 sucesivamente(0-4):");
    String especialidad = JOptionPane.showInputDialog("Ingrese la especialidad del médico (Medicina General, Cirugía Ambulatoria, Cirugía Especializada):");
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
    
    public void cancelarCita() {
    //usuario ingresará información de la cita que quiere cancelar
    String cliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente para cancelar:");
    int indexMedico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el médico que lo iba a atender (0-4):"));
    int hora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la hora de la cita (8-17, formato 24 horas):")) - 8;

    //Espacio de consulta de nedico y la hora del mismo
    if (indexMedico < 0 || indexMedico >= medicos.length || hora < 0 || hora >= 10) {
        JOptionPane.showMessageDialog(null, "Datos inválidos.");
        return;
    }

    // consulta si la cita existe y pertenece al cliente
    if (agenda[indexMedico][hora] != null && agenda[indexMedico][hora].getCliente().equals(cliente)) {
        agenda[indexMedico][hora] = null;
        JOptionPane.showMessageDialog(null, "Cita cancelada con éxito.");
    } else {
        // Si no se encuentra la cita, mostrará error
        JOptionPane.showMessageDialog(null, "No se encontró la cita.");
    }
}
    
    public void revisarAgenda() {
    int indexMedico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el médico (0-4):"));
    
    // Verificación de validez de índice del médico
    if (indexMedico < 0 || indexMedico >= medicos.length) {
        JOptionPane.showMessageDialog(null, "Datos inválidos.");
        return;
    }

    StringBuilder agendaStr = new StringBuilder();

    // Recorre la agenda y muestra las citas programadas, incluyendo la hora de almuerzo
    for (int hora = 0; hora < 10; hora++) {
        if (medicos[indexMedico].getHoraAlmuerzo() == hora + 8) {
            agendaStr.append((hora + 8) + ":00 HORA DE ALMUERZO\n");
        } else if (agenda[indexMedico][hora] == null) {
            agendaStr.append((hora + 8) + ":00 --VACIO--\n");
        } else {
            Cita cita = agenda[indexMedico][hora];
            agendaStr.append((hora + 8) + ":00 " + cita.getCliente() + " - " + cita.getTelefono() + "\n");
        }
    }

    // Muestra la agenda completa del médico seleccionado
    JOptionPane.showMessageDialog(null, agendaStr.toString());
    }

    public static void main(String[] args) {
        
        Clinica Clinica = new Clinica();
        boolean continuar = true;

        // Muestra un menú repetidamente hasta que el usuario decida salir
        while (continuar) {
            String option = JOptionPane.showInputDialog("Seleccione una opción: \n1. Registrar Médico \n2. Agendar Cita \n3. Cancelar Cita \n4. Revisar Agenda \n5. Salir");
                // El switch esta presentando algunos error a corregir (Encargado Marco)
                //Se llaman funciones de la clase cita, solo se debe esperar a que se carguen a la main por el encargado
                switch (option) {
                    case "1":
                       Clinica.registrarMedico();
                       break;
                    case "2":
                        Clinica.agendarCita();
                        break;
                    case "3":
                        Clinica.cancelarCita();
                       break;
                   case "4":
                        Clinica.revisarAgenda();
                        break;
                   case "5":
                       continuar = false;
                        JOptionPane.showMessageDialog(null, "Adiós!");
                        break;
                    default:
                    // Si la opción ingresada no es válida, muestra un mensaje de error
                     JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
                        break;
            }
   
        }
    }        
} 