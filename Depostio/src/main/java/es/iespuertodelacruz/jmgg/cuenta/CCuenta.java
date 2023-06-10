package es.iespuertodelacruz.jmgg.cuenta;

/**
 * Clase que controlara los datos de la cuenta del usuario
 */
public class CCuenta {


    /**
     * Atributo de tipo String que tendra el nombre del creador de la cuenta
     */
    private String nombre;
    /**
     * Atributo de tipo String que tendra el número de cuenta de
     * esta misma. Este es String, ya que un número de cuenta contiene
     * guiones
     */
    private String cuenta;
    /**
     * Atributo de tipo double que tendra el saldo actual de la
     * cuenta
     */
    private double saldo;

    /**
     * Atributo de tipo double que tendra el tipo de interes
     * de la cuenta
     */
    private double tipoInteres;

    /**
     * Constructor por defecto de la clase
     */
    public CCuenta()
    {
    }

    /**
     * Constructor de la clase cuenta
     * @param nom nombre del creador de la cuenta
     * @param cue numero de cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de interes de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres=tipo;
    }

    /**
     * Devuelve el saldo actual de la cuenta
     * @return saldo
     */
    public double estado()
    {
        return saldo;
    }


    /**
     * Este metodo ingresa el dinero en la cuenta haciendo
     * la suma del saldo actual mas la cantidad recibida en el
     * paramentro.
     * @param cantidad a ingresar
     * @throws Exception si cantidad es menor o igual que cero
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception
                    ("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Este metodo retirara el dinero de la cuenta haciendo
     * la resta del saldo actual menos la cantidad recibida en el
     * parametro.
     * @param cantidad a retirar
     * @throws Exception si cantidad es menor o igual que 0 o si el saldo es menor que cantidad
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
     * @return nombre actual de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre nombre que remplazara el nombre actual de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * @return numero de cuenta actual
     */
    public String getCuenta() {
        return cuenta;
    }
    /**
     * @param cuenta numero de cuenta que remplazara el número de cuenta actual
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    /**
     * @return saldo actual de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * @param saldo saldo que remplazara el saldo actual de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * @return tipo de interes actual de la cuenta
     */
    public double getTipoInteres() {
        return tipoInteres;
    }
    /**
     * @param tipoInteres tipo de Interes que remplazara el actual
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
