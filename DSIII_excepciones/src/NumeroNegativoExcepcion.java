public class NumeroNegativoExcepcion extends Exception {
    public NumeroNegativoExcepcion() {
        super("Error, el numero debe ser positivo");
    }
    public NumeroNegativoExcepcion(String mensaje) {
        super(mensaje);
    }
}