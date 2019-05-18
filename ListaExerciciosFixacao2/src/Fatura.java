
public class Fatura {

    private String numFat;
    private String descricao;
    private int qtd;
    private double preco;
    private double fatura;

    public void setNumFat(String nf) {
        numFat = nf;
    }

    public String getNumFat() {
        return numFat;
    }

    public void setDescricao(String desc) {
        descricao = desc;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setQtd(int q) {
        if (q > 0) {
            qtd = q;
        } else {
            qtd = 0;
        }
    }

    public int getQtd() {
        return qtd;
    }

    public void setPreco(double p) {
        preco = p;
    }

    public double getPreco() {
        return preco;
    }

    public void valorPreco(double p1) {

        if (preco > 0.0) {
            preco = p1;
        } else {
            preco = 0.0;
        }

    }

  }
