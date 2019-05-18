
import java.util.Scanner;

public class Principal {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("---------Dados Cadastrais------------");

        Clientes c2 = new Clientes();

        System.out.println("Nome: ");
        String n1 = ler.nextLine();
        c2.colocarNome(n1);
      
        System.out.println("Endereço: ");
        String ed = ler.nextLine();
        c2.colocarEnd(ed);

        System.out.println("Carteira de Identidade: ");
        int Id = ler.nextInt();
        c2.colocarRg(Id);

        System.out.println("CPF: ");
        int cpf = ler.nextInt();
        c2.colocarCpf(cpf);
        
        System.out.println ("Qual tipo de conta Deseja? (1 - Conta Corrente; 2 - Conta Poupança:");
        int tipC = ler.nextInt();
        c2.colocarConta (tipC);

        Conta c1 = new Conta();
        
        System.out.println("---------------- MOVIMENTAÇÃO FINANCEIRA -------------------");

        System.out.print("Entre com o número da conta:");
        int n = ler.nextInt();
        c1.colocarNumConta(n);
        
        System.out.print("Entre com o número da Agência: ");
        int a = ler.nextInt();
        c1.colocarAg(a);
        
        System.out.print ("Qual é o tipo da Conta:");
        int t = ler.nextInt();
        c1.colocarTipo(t);
        

        c1.depositar(1000);
        c1.imprimirSaldo();
        System.out.print("Digite o valor que vai depositar: ");
        float s = ler.nextFloat();
        c1.depositar(s);
        c1.imprimirSaldo();

        
        

    }

}
