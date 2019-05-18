    
public class Conta {
   private int numConta;
   private int agencia;
   private int tipo;
   private float saldo;
   
   public void depositar(float valorDep) {
        saldo = saldo + valorDep;
        
    }
   public void sacar(float valorSaque) {
       saldo -= valorSaque;
   }
   public void imprimirSaldo(){
       System.out.println("O saldo da conta Número "+ pegarNumConta() +" é R$ " + saldo);
       
   }
   public void colocarNumConta(int num) {
       numConta = num;
   }
   public int pegarNumConta(){
       return numConta;
   }
   public void colocarAg(int num) {
       agencia = num;
   }
   public int pegarNumAg(){
    return agencia;
}
   public void colocarTipo(int num) {
       tipo = num;
   }
   public int pegarNumTipo(){
   return tipo;     
   }
   
  }
