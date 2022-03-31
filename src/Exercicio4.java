import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n, resultado, i ;


        System.out.println("Por favor insira um valor: ");
        n = leitor.nextInt();

        for ( i = 1; i <= n ; i++){

            if (i % 2 == 0){

                System.out.println(i); 

            }

             

        }

    }
}
