package co.agenciaviajes.negocio;

import java.util.Date;

/**
 * Representa un cliente de la Agencia de viajes
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio A. Hurtado
 */
public class Cliente {

    private String id;
    private String nombres;
    private String apellidos;
    private String genero;
    private String email;
    private Date fechaNac;
    
    // Completar constructor
    
    //Completar getters and setters

    public String toString() {
        return "Id: " + id + " Nombres: " + nombres + " Apellidos: " + apellidos;
    }

}
