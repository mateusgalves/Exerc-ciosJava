
import java.util.Scanner;

public class EmpregadoTeste {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Empregado e1 = new Empregado();

        System.out.println("-------- Dados dos Empregados ----------");

        System.out.println("----- Empregado 1 -------");

        System.out.println("Entre com o Primeiro nome: ");
        String n1 = ler.nextLine();
        e1.setPnome(n1);

        System.out.println("Entre com o Segundo nome: ");
        String Sn2 = ler.nextLine();
        e1.setSnome(Sn2);

        System.out.println("Salário Mensal R$: ");
        double sM1 = ler.nextDouble();
        e1.setsMes(sM1);
        
        System.out.println("Aumento Salarial de 10%");

        System.out.printf("O novo salário é: ");
        System.out.println(e1.getSmes() * .1 + sM1);

        System.out.println("----- Empregado 2 -------");

        System.out.println ("Entre com o Primeiro nome: \n");
        String Sn3 = ler.nextLine();
        e1.setPnome(Sn3);

        System.out.println("Entre com o segundo nome: ");
        String Sn4 = ler.nextLine();
        e1.setSnome(Sn4);

        System.out.println("Salário Mensal R$: ");
        double sM2 = ler.nextDouble();
        e1.setsMes(sM2);

        System.out.println("Aumento Salarial de 10%");

        System.out.printf("O novo salário é: ");
        System.out.println(e1.getSmes() * .1 + sM2);

    }

}
