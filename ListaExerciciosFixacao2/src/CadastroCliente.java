
public class CadastroCliente {
    private String nome;
    private String cpf;
    private String enderec;
    
    public void colocarNome(String no){
        nome = no;
    }
    public String pegarNome (){
        return nome;
    }
    
    public void colocarCpf(String c){
        cpf = c;
    }
    public String pegarCpf(){
        return cpf;
    }
    
    public void colocarEnd(String end) {
        enderec = end;
    }
    public String pegarEnd() {
        return enderec;
    }
            
    
}
