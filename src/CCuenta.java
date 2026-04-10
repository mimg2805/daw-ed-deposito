/**
 * Una clase que representa una cuenta.
 */
public class CCuenta {

    /**
     * El nombre con el que se identifica la cuenta.
     */
    private String nombre;
    
    /**
     * El número de la cuenta, con guiones.
     */
    private String cuenta;
    
    /**
     * El saldo actual de la cuenta.
     */
    private double saldo;
    
    /**
     * El tipo de interés actual de la cuenta.
     */
    private double tipoInterés;

    /**
     * Constructor vacío.
     */
    public CCuenta()
    {
    }

    /**
     * Crea una nueva cuenta.
     * @param nom Nombre de la cuenta.
     * @param cue Número de la cuenta.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Método para obtener el nombre de la cuenta.
     * @return El nombre actual de la cuenta.
     */
    public String getNombre() 
    {
        return nombre;
    }
    
    /**
     * Método para actualizar el nombre de la cuenta.
     * @param nombre El nuevo nombre de la cuenta.
     */
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
    /**
     * Método para obtener el número de la cuenta.
     * @return El número actual de la cuenta.
     */
    public String getCuenta() 
    {
        return cuenta;
    }
    
    /**
     * Método para actualizar el número de la cuenta.
     * @param cuenta El nuevo número de la cuenta.
     */
    public void setCuenta(String cuenta) 
    {
        this.cuenta = cuenta;
    }
    
    /**
     * Método para obtener el número de la cuenta.
     * @return El número actual de la cuenta.
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Método para ingresar una cantidad a la cuenta. Modifica el saldo.
     * @param cantidad La cantidad a ingresar.
     * @throws Exception No se puede ingresar una cantidad negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     * Método para retirar una cantidad de la cuenta. Modifica el saldo.
     * @param cantidad La cantidad a retirar.
     * @throws Exception No se puede retirar una cantidad negativa.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    /**
     * Método para obtener el tipo de interés de la cuenta.
     * @return El tipo de interés actual de la cuenta.
     */
    public double getTipoInteres() 
    {
        return tipoInterés;
    }
    
    /**
     * Método para actualizar el tipo de interés de la cuenta.
     * @param tipoInterés El nuevo tipo de interés de la cuenta.
     */
    public void setTipoInteres(double tipoInterés)
    {
        this.tipoInterés = tipoInterés;
    }
}
