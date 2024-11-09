public class ResultadoEscolar {
    public static void main(String[] args) {
        int numero = 0;

        String status = numero < 0 ? "Negativo" : numero > 0 ? "Positivo" : "Zero";

        System.out.println(status);
    }
}
