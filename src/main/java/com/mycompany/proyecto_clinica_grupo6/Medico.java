
package com.mycompany.proyecto_clinica_grupo6;


// Esta es la clase que representa a un médico.

class Medico {
    // Estos son los datos que caracterizan a un médico: nombre, especialidad y hora de almuerzo.
    private String nombre;
    private String especialidad;
    private int horaAlmuerzo;

    // Contructor para crear un nuevo medico y sus datos

    public Medico(String nombre, String especialidad, int horaAlmuerzo) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.horaAlmuerzo = horaAlmuerzo;
    }

    // Estos son métodos para obtener y modificar los datos del médico.

    // Método que devuelve el nombre del médico.
    public String getNombre() {
        return nombre;
    }

    // Método que permite cambiar el nombre del médico.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método que devuelve la especialidad del médico.
    public String getEspecialidad() {
        return especialidad;
    }

    // Método que permite cambiar la especialidad del médico.
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
<<<<<<< HEAD
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //========================================================================================================================================


=======
>>>>>>> 26bb8b1f641f148ca5505203988ac45f01fa6442
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