import java.util.Scanner;

public class Exercicio2Copy {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tabuada, resultado, i = 0 ;


        System.out.println("Digite o valor para tabuada ");
        tabuada = leitor.nextInt();

        while ( i <= 10 ){

            resultado= tabuada * i ;

            System.out.println(tabuada+"*"+ i+"="+resultado);
            
            i++;

        }

    }
    
}
