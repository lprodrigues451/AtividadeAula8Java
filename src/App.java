import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de repetição ");
        int repetição = leitor.nextInt();

        for (int i = 0; i < repetição ; i++){

            System.out.println(i);
        }

    }
}
