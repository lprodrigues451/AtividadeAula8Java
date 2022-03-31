import java.util.Scanner;

public class Exercicio2Copy2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tabuada, resultado, i = 0 ;

        System.out.println("Digite o valor para tabuada ");
        tabuada = leitor.nextInt();

        do {

            resultado= tabuada * i ;
            System.out.println(tabuada+"x"+ i+"="+resultado);           
            i++;

        }while ( i <= 10 );

    }
    
}
