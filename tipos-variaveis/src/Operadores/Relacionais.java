package operadores;

public class Relacionais {
    public static void main(String[] args) {
        String nomeUm = "Cinthia";
        String nomeDois = new String("Cinthia");

        System.out.println(nomeUm.equals(nomeDois)); //Quando estivermos falando de objeto ou texto, usamos um método chamado equals. Esse método compara conteúdos, nesse caso temos dois objetos

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 > numero2) { //true
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);
    }
}
