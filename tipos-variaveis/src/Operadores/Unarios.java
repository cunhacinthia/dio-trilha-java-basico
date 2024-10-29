package Operadores;

public class Unarios {
        public static void main(String[] args) {
            
            int numero = 5;

            numero = - numero; //converte para o negativo

            System.out.println(numero);

            numero = + numero; //aqui não retornou para positivo, pois o + é um operador aritimético para somar

            System.out.println(numero);

            numero = numero * -1;

            System.out.println(numero);


        }
}
