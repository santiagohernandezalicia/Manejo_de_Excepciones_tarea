public class Cadena {
    public char caracterEn(String cadena, int posicion) throws Exception {
        if (posicion >= 0 && posicion < cadena.length()) {
            return cadena.charAt(posicion);
        } else {
            throw new Exception("Posición fuera de los límites de la cadena.");
        }
    }
}
