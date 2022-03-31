import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tabuada, resultado, i ;


        System.out.println("Digite o valor para tabuada ");
        tabuada = leitor.nextInt();

        for ( i = 0; i <= 10 ; i++){

            resultado= tabuada * i ;

            System.out.println(tabuada+"*"+ i+"="+resultado);  

        }

    }
    
}
