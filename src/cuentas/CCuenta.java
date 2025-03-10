package cuentas;

/**
 * Permite crear cuentas bancarias para usuarios y que puedan gestionarlas
 * @author VORPC
 * @version 1.2
 * @since 1.1
 */
public class CCuenta {

	/**
	 * Nombre del titular de la cuenta
	 */
    private String nombre;
    
    /**
     * Número de cuenta
     */
    private String cuenta;
    
    /**
     * Saldo de la cuenta
     */
    private double saldo;
    
    /**
     * Tipo de interés de la cuenta
     */
    private double tipoInterés;

    /**
     * Constructor por defecto de la clase CCuenta.
     * Inicializa los valores de la cuenta con valores por defecto.
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con parámetros para inicializar la cuenta con valores específicos.
     * @param nom  El nombre del titular de la cuenta.
     * @param cue  El número de la cuenta.
     * @param sal  El saldo inicial de la cuenta.
     * @param tipo  El tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Permite consultar el saldo actual de la cuenta
     * @return el saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Permite hacer un ingreso en la cuenta
     * @param cantidad  Importe a ingresar
     * @throws Exception  Si la cantidad es negativa
     * @see #retirar(double)
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira una cantidad de dinero de la cuenta. Para ver cómo ingresar, consulta {@link #ingresar(double)}
     * @param cantidad  La cantidad de dinero a retirar.
     * @throws Exception  Si la cantidad es negativa o si no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Consultar el tipo de interés
     * @return Tipo de interés de la cuenta
     */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * Establecer el tipo de interés
	 * @param tipoInterés  Tipo de interés de la cuenta
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
	 * Consultar el saldo de la cuenta
	 * @return saldo de la cuenta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Establecer el saldo de la cuenta
	 * @param saldo  Saldo de la cuenta
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Obtener el número de cuenta
	 * @return número de cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Establecer el número de cuenta
	 * @param cuenta número de cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Obtener el nombre del titular
	 * @return nombre del titular
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establecer el nombre del titular de la cuenta
	 * @param nombre de la cuenta
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
