package modelo;
// Generated 03-abr-2018 14:43:39 by Hibernate Tools 4.3.1


import java.io.Serializable;

/**
 * Persona generated by hbm2java
 */
public class Persona  implements java.io.Serializable {


     private int id;
     private String nombre;
     private String apellido;
     private int edad;

    public Persona() {
    }

	
    public Persona(int id) {
        this.id = id;
    }
    public Persona(int id, String nombre, String apellido, int edad) {
       this.id = id;
       this.nombre = nombre;
       this.apellido = apellido;
       this.edad = edad;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Serializable getEdad() {
        return this.edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }




}


