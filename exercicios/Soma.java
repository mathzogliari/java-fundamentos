public class Soma {
    public static void main(String[] args) {
        int a = 7;
        int b = 5;
        int resultado = a + b; // guarda a soma em outra variável
        System.out.println("A soma é: " + resultado);
    }
}
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
public class Tabuada {
    public static void main(String[] args) {
        int numero = 7;
        // o for repete o bloco com i de 1 até 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
public class MaiorDoArray {
    public static void main(String[] args) {
        int[] numeros = {4, 17, 9, 23, 8};
        int maior = numeros[0]; // começa assumindo que o primeiro é o maior
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i]; // achou um maior, atualiza
            }
        }
        System.out.println("O maior número é: " + maior);
    }
}
