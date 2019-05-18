import java.util.Scanner;
public class DataTeste {
   public static void main(String [] args){
       
       Scanner ler = new Scanner(System.in);
       
       Data dt = new Data();
       
       System.out.print("Dia: ");
       int d1 = ler.nextInt();
       dt.setDia(d1);
       
       System.out.print("Mês: ");
       int m1 = ler.nextInt();
       dt.setMes(m1);
       
       System.out.print("Ano: ");
       int a1 = ler.nextInt();
       dt.setAno(a1);
       
       dt.exibeData();
       
       
   } 
}
