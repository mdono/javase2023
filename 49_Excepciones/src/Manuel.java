
public class Manuel {

    public static void main(String[] args) {
        String cadena1 = "23";
        String cadena2 = "0";
        String respuesta;
        int cociente, numerador, denominador;

        try {
            numerador = Integer.parseInt(cadena1);
            denominador = Integer.parseInt(cadena2);

            rango(numerador, denominador);

            cociente = numerador / denominador;
            respuesta = String.valueOf(cociente);
        } catch (IntervaloExcepcion ex) {
            respuesta = ex.getMessage();
        } catch (NumberFormatException ex) {
            respuesta = "Se han introducido caracteres no numericos";
        } catch (ArithmeticException ex) {
            //respuesta = ex.getMessage();
            respuesta = "Division bajo cero";
        }
        
        System.out.println(respuesta);
    }

    private static void rango(int num, int den)
            throws IntervaloExcepcion {
        if (num > 100 || den < -5) {
            throw new IntervaloExcepcion("Numeros fuera de rango");
        }
    }
}