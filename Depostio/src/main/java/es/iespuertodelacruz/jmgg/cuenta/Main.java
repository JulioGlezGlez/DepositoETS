package es.iespuertodelacruz.jmgg.cuenta;

/**
 * Parte grafica que vera el usuario
 */
public class Main {
    /**
     * Main de la parte grafica
     * @param args
     */
    public static void main(String[] args) {
        float cantidad=0;
        operativa_cuenta(0);
    }

    /**
     * Este metodo dara el saldo actual que tiene en cuenta el usuario Antonio López.
     * @param cantidad que se va a meter en cuenta
     */
    private static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        double saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

}
