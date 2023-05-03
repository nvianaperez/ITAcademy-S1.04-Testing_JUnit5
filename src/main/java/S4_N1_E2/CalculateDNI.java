package S4_N1_E2;

public class CalculateDNI {

    public static final String JUEGO_CARACTERES = "TRWAGMYFPDXBNJZSQVHLCKE";

    public String calculateDNI(String dni) {
        String letra="";
        try {
            if(dni.length() <= 9) {
                int modulo = Integer.parseInt(dni) % 23;
                letra = String.valueOf(JUEGO_CARACTERES.charAt(modulo));
            } else {
                throw new Exception("Error: el DNI no és correcte");
            }
        } catch (Exception e){
            e.getMessage();
        }
        return letra;
    }


}
