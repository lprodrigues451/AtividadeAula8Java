import java.util.Scanner;

public class Exercicio3Copy {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int i, n = 0;

        for ( i = 1 ; i <= 10 ; i++){

        System.out.println("Digite o valor o "+ i);
        n = leitor.nextInt();

        }

        if(n > 100){

            System.out.println("numero "+n);

        }

    }
    
}
