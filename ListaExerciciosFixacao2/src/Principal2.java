
import java.util.Scanner;

public class Principal2 {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.println("-------------- DADOS CADASTRAIS DO CLIENTE ----------------");

        CadastroCliente c1 = new CadastroCliente();

        System.out.println("Entre com o seu Nome: ");
        String n1 = ler.nextLine();
        c1.colocarNome(n1);

        System.out.println("Entre com o seu CPF: ");
        String cpf1 = ler.nextLine();
        c1.colocarCpf(cpf1);

        System.out.println("Entre com o seu endereço completo: ");
        String end1 = ler.nextLine();
        c1.colocarEnd(end1);

        System.out.println("------------------ COMPRA DA PASSAGEM -----------------------");

        ComprarPassagem cp1 = new ComprarPassagem();

        System.out.println("Informe a forma de Pagamento: " + "1 - Dinheiro; 2 - Débito; 3 - Crédito.");
        String fp = ler.nextLine();
        cp1.ColocarFormaPgto(fp);

        System.out.println("Infome o País de Origem: ");
        String po1 = ler.nextLine();
        cp1.colocarPaisOrigem(po1);

        System.out.println("Informe a Cidade de Origem: ");
        String co1 = ler.nextLine();
        cp1.colocarCidadeOrigem(co1);

        System.out.println("Informe o País de Destino: ");
        String Pd1 = ler.nextLine();
        cp1.colocarPaisDestino(Pd1);

        System.out.println("Informe a Cidade de Destino: ");
        String cd1 = ler.nextLine();
        cp1.colocarCidadeDestino(cd1);

        System.out.println("Informe o dia da Ida: ");
        int dida = ler.nextInt();
        cp1.colocarDiaIda(dida);
        
        
        System.out.println("Informe o mês da Ida: ");
        int mida = ler.nextInt();
        cp1.colocarMesIda(mida);
        
        System.out.println("Informe o ano da Ida: ");
        int ai = ler.nextInt();
        cp1.colocarAnoIda(ai);
        
        
         System.out.println("Informe o dia da volta: ");
        int dvl = ler.nextInt();
        cp1.colocarDiaVolta(dvl);
        
        
        System.out.println("Informe o mês da volta: ");
        int mvl = ler.nextInt();
        cp1.colocarMesVolta(mvl);
        
        System.out.println("Informe o ano da volta: ");
        int avl = ler.nextInt();
        cp1.colocarAnoVolta(avl);                       

       

        System.out.println("Informe o valor da passagem: R$ ");
        float vp = ler.nextFloat();
        cp1.colocarValor(vp);

        System.out.println("Obrigado por escolher a nossa Agência Aérea!");
        System.out.printf("Origem: " + cp1.pegarCidadeOrigem() + " - " + cp1.pegarPaisOrigem() + "    " + "Destino: " + cp1.pegarCidadeDestino() + " - " + cp1.pegarPaisOrigem() + "\n");
        System.out.println("Valor: R$ " + cp1.pegarValor());
        System.out.println("Nome do Passageiro: " + c1.pegarNome());
        System.out.println("CPF: " + c1.pegarCpf());
        System.out.printf ("Data de Ida: " + cp1.pegarDiaIda() + "/" + cp1.pegarMesIda() + "/" + cp1.pegarAnoIda() + "\n");
        System.out.printf ("Data de Volta: " + cp1.pegarDiaVolta() + "/" + cp1.pegarMesVolta() + "/" + cp1.pegarAnoVolta() + "\n");
        System.out.println("Desejamos que tenha um excelente voô!!!!!");
    }

}
