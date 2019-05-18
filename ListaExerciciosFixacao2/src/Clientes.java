
public class Clientes {

    private String nome;
    private String endereco;
    private int rg;
    private int cpf;
    private int tipoConta;

    public void colocarNome(String no) {
        nome = no;
    }

    public String pegarNome() {
        return nome;
    }

    public void colocarEnd(String end) {
        endereco = end;
    }

    public String pegarEnd() {
        return endereco;
    }

    public void colocarRg(int id) {
        rg = id;
    }

    public int pegarRg() {
        return rg;
    }

    public void colocarCpf(int cpf1) {
        cpf = cpf1;
    }

    public int pegar1() {
        return cpf;
    }

    public void colocarConta(int opCont) {
        tipoConta = opCont;
    }

    public int pegarConta() {
        return tipoConta;
    }

}
