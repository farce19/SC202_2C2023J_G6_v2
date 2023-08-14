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
    
    /*
    *
    * En este espacio se desarrollara la partede consulta de agenda
    * Encargado Marco
    *
    */
    

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
                       Clinica.RegistrarMedico();
                       break;
                    case "2":
                        Clinica.AgendarCita();
                        break;
                    case "3":
                        Clinica.CancelarCita();
                       break;
                   case "4":
                        Clinica.RevisarAgenda();
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