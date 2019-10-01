import java.util.Scanner;

public class Question02 {
    public  static void main (String[] args){
        int code;
        double salario;
        double bonus;
        double salarioFinal;
        Scanner sc = new Scanner(System.in);
        System.out.println("1- Escriturário\n2- Secretário\n3- Caixa");
        System.out.println("Insira o codigo do seu cargo");
        code = sc.nextInt();
        System.out.println("Insira seu Salário:");
        salario = sc.nextDouble();

        if (code==1){
            bonus = salario*0.5;
            salarioFinal = salario+bonus;
            System.out.println("Cargo: Escriturário");
            System.out.println("Seu salário era de R$ "+salario);
            System.out.println("Seu bonus foi de R$ "+bonus);
            System.out.println("Seu novo salário é de R$ "+salarioFinal);
        }

        if (code==2){
            bonus = salario*0.35;
            salarioFinal = salario+bonus;
            System.out.println("Cargo: Secretário");
            System.out.println("Seu salário era de R$ "+salario);
            System.out.println("Seu bonus foi de R$ "+bonus);
            System.out.println("Seu novo salário é de R$ "+salarioFinal);
        }

        if (code==3){
            bonus = salario*0.2;
            salarioFinal = salario+bonus;
            System.out.println("Cargo: Caixa");
            System.out.println("Seu salário era de R$ "+salario);
            System.out.println("Seu bonus foi de R$ "+bonus);
            System.out.println("Seu novo salário é de R$ "+salarioFinal);
        }

    }
}
