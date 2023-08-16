import java.util.Random;
import java.util.Scanner;


public class Roullet {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("----------------------------------------");
        System.out.println("Selecione um número entre 1 e 10 para roletar: ");

        int escolha = scanner.nextInt();

        int escolhaComp =  random.nextInt(10);
        int escolhaPC = escolhaComp + 1;

        if (escolha > 10){
            System.out.println("ESCOLHA UM NÚMERO VÁLIDO!!!");
        } else if (escolhaPC == escolha){
            System.out.println("O PC escolheu: " + escolhaPC);
            System.out.println("VOCÊ PERDEU!!!");
        } else {
            System.out.println("O PC escolheu: " + escolhaPC);
            System.out.println("VOCÊ GANHOU!!!");
        }

    }

}

