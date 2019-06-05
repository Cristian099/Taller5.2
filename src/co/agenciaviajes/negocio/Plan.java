package co.agenciaviajes.negocio;

import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author Libardo Pantoja, Julio Hurtado, Ricardo Zambrano
 */
public class Plan {

    private Cliente cliente;
    private Date fechaSalida;
    private Date fechaLlegada;
    private String transporte;
    private String alojamiento;
    private String alimentacion;
    private boolean seguroHotelero;
    private boolean impuestoTiqute;
    private String[] tours;
    private int totalAdultos;
    private int totalNinos;
    /**
     * Valor total a pagar
     */
    private int valor;
    
    // Completar constructor
    
    // Completar métodos

    /**
     * Incrementa o suma el valor actual del plan
     * @param incremento incremento a sumar
     */
    public void sumarValor(int incremento) {
        this.valor += incremento;
    }

    public String toString() {
        return "Cliente: " + cliente.toString() + " Transporte:" + transporte + " Alojamiento:" + alojamiento + " Alimentación: " + alimentacion + " Impuesto tiquete: " + impuestoTiqute + " Tours: " + Arrays.toString(tours) + " Valor $: " + valor;
    }
}
