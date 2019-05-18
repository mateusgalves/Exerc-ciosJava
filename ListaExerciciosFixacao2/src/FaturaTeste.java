
import java.util.Scanner;

public class FaturaTeste {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Fatura F = new Fatura();

        System.out.println("Código Produto: ");
        String n1 = ler.nextLine();
        F.setNumFat(n1);
        
        System.out.println("Descrição do Produto: ");
        String d1 = ler.nextLine();
        F.setDescricao(d1);
        
        System.out.println("Qnatidade " + F.getDescricao()+ ":");
        int q1 = ler.nextInt();
        F.setQtd(q1);
        
        System.out.println("Insira o preço do Produto:");
        double p1 = ler.nextDouble();
        F.setPreco(p1);
        
        System.out.println("------------------------------- FATURA ----------------------------");
        
        System.out.printf ("Produto: " + F.getNumFat() + "Descrição: " + F.getDescricao() + "\n");
        System.out.println("Quantidade: " + F.getQtd());
        System.out.println("Preço R$: " + F.getPreco());
        System.out.println("Valor total da Fatura: " + (F.getPreco()* F.getQtd()));
        
      
    }
}
