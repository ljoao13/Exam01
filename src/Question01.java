import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        double salario;
        int ano;
        int tempoEmpresa;
        double bonus;
        double novoSalario;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o ano de entrada na empresa");
        ano = sc.nextInt();
        System.out.println("insira seu salario");
        salario = sc.nextDouble();
        tempoEmpresa = 2019 - ano;

        if (tempoEmpresa >= 5){
            bonus = salario * 0.2;
        }else {
            bonus = salario * 0.1;
        }

        novoSalario = salario+bonus;

        System.out.println("seu salario era de R$ "+salario+" reais");
        System.out.println("Seu bonus foi de R$ "+bonus+" reais");
        System.out.println("Seu novo salário é de R$ "+novoSalario+" reais");

    }
}
