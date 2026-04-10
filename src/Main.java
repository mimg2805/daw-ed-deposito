/**
 * Clase principal.
 */
public class Main {

    /**
     * Método principal.
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual );

        operativa_cuenta(cuenta1, -2300);
        operativa_cuenta(cuenta1, 695);
    }
    
    /**
     * Método para realizar operaciones sobre una cuenta. Modifica el saldo.
     * @param cuenta La cuenta sobre la que se va a operar.
     * @param cantidad La cantidad. Si es positiva, se hará un ingreso. Si es negativa, se hará un retiro.
     */
    public static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        if (cantidad < 0) {
            try {
                cuenta.retirar(cantidad * -1);
            } catch (Exception e) {
                System.out.print("Fallo al retirar");
            }
        } else {
            try {
                System.out.println("Ingreso en cuenta");
                cuenta.ingresar(cantidad);
            } catch (Exception e) {
                System.out.print("Fallo al ingresar");
            }
        }
    }
}
