package operadores;

public class Unarios {
        public static void main(String[] args) {
            
            int numero = 5;

            numero = - numero; //converte para o negativo

            System.out.println(numero);

            numero = + numero; //aqui não retornou para positivo, pois o + é um operador aritimético para somar

            System.out.println(numero);

            numero = numero * -1; //aqui já transformou de voltar para o positivo, pois foi necessário realizar essa multiplicação com -1

            System.out.println(numero); 

        }
}
