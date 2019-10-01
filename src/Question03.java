import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        double altura;
        double peso;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira sua altura: ");
        altura = sc.nextDouble();
        System.out.println("Insira seu peso: ");
        peso = sc.nextDouble();

        if (altura <1.20) {
            if (peso<=60) {
                System.out.println("Você é do tipo A");
            }
            if((peso > 60) && (peso <=90)){
                System.out.println("Você é do tipo D");
            }
            if (peso>90) {
                System.out.println("Você é do tipo G");
            }
        }

        if ((altura >=1.20)&&(altura <=1.70)) {
            if (peso<=60) {
                System.out.println("Você é do tipo B");
            }
            if((peso > 60) && (peso <=90)){
                System.out.println("Você é do tipo E");
            }
            if (peso>90) {
                System.out.println("Você é do tipo H");
            }
        }

        if (altura > 1.70) {
            if (peso<=60) {
                System.out.println("Você é do tipo C");
            }
            if((peso >= 60) && (peso <=90)){
                System.out.println("Você é do tipo F");
            }
            if (peso>90) {
                System.out.println("Você é do tipo I");
            }
        }

    }
}
