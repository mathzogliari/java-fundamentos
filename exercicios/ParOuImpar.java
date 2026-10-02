public class ParOuImpar {
    public static void main(String[] args) {
        int numero = 8;
        // % devolve o resto da divisão: se for 0, o número é par
        if (numero % 2 == 0) {
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é ímpar");
        }
    }
}
