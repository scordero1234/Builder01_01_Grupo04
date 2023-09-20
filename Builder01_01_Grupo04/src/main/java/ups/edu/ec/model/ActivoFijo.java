/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.model;

/**
 *
 * @author c.idrovo
 */
public class ActivoFijo {
    private int codigo;
    private String nombre;
    private Double precio;
    private String procesador;
    private String memoriaRam;
    private String placa;
    private String numeroChasis;
    private int numeroCajones;
    private int numeroPatas; 
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    /**
     * @return the procesador
     */
    public String getProcesador() {
        return procesador;
    }

    /**
     * @param procesador the procesador to set
     */
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    /**
     * @return the memoriaRam
     */
    public String getMemoriaRam() {
        return memoriaRam;
    }

    /**
     * @param memoriaRam the memoriaRam to set
     */
    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the numeroChasis
     */
    public String getNumeroChasis() {
        return numeroChasis;
    }

    /**
     * @param numeroChasis the numeroChasis to set
     */
    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    /**
     * @return the numeroCajones
     */
    public int getNumeroCajones() {
        return numeroCajones;
    }

    /**
     * @param numeroCajones the numeroCajones to set
     */
    public void setNumeroCajones(int numeroCajones) {
        this.numeroCajones = numeroCajones;
    }

    /**
     * @return the numeroPatas
     */
    public int getNumeroPatas() {
        return numeroPatas;
    }

    /**
     * @param numeroPatas the numeroPatas to set
     */
    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }    
}
