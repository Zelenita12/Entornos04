package Cuentas;
/**
     * @author Elena Garcia
     * 
     * @version v 0.1 Febrero 2022
     * 
     * Se crea una clase para representar una cuenta bancaria
     */

public class CCuenta {

    /**
     * @return the nombre test
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
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
     /** 
     * @param nombre Es tipo String y da el nombre del propietario de la cuenta.
     * @param cuenta Es tipo Strind y da el nombre de la cuenta.
     * @param saldo El tipo souble y recoge el saldo de la cuenta
     * @param tipoInteres Es tipo double y recoge el tipo de interés.
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
    * El constructor de la clase cuenta. 
    */
    public CCuenta() {
    }
    /**
    * Este constructor se encarga de recoger los diferentes parametros. 
    */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
    /**
     * @return the saldo
     */
    public double estado() {
        return getSaldo();
    }
    /**
    * Este método se encarga de ingresar la cantidad de dinero 
    * Lanza una excepción
    */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }
    /**
    * Este método se encarga de iingresar la cantidad de dinero 
    * Lanza una excepción
    */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }
}
