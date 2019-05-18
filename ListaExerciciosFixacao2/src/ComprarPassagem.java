
public class ComprarPassagem {

    private String paisOrigem;
    private String cidadeOrigem;
    private String paisDestino;
    private String cidadeDestino;
    private int diaIda;
    private int mesIda;
    private int anoIda;
    private int diaVolta;
    private int mesVolta;
    private int anoVolta;
    private String formaPgto;
    private float valorPassagem;

    public void colocarPaisOrigem(String po) {
        paisOrigem = po;
    }

    public String pegarPaisOrigem() {
        return paisOrigem;
    }

    public void colocarCidadeOrigem(String ci) {
        cidadeOrigem = ci;
    }

    public String pegarCidadeOrigem() {
        return cidadeOrigem;
    }

    public void colocarPaisDestino(String pd) {
        paisDestino = pd;
    }

    public String pegarPaisDestino() {
        return paisDestino;
    }

    public void colocarCidadeDestino(String cd) {
        cidadeDestino = cd;
    }

    public String pegarCidadeDestino() {
        return cidadeDestino;
    }

    public void colocarDiaIda(int dia) {
        diaIda = dia;
    }

    public int pegarDiaIda() {
        return diaIda;
    }

    
   public void colocarMesIda(int mida) {
   mesIda = mida;
    }

    public int pegarMesIda() {
        return mesIda;
    }
    
     
   public void colocarAnoIda(int aida) {
   anoIda = aida;
    }

    public int pegarAnoIda() {
        return anoIda;
    }
     
    
    public void colocarDiaVolta(int dvl) {
        diaVolta = dvl;
    }

    public int pegarDiaVolta() {
        return diaVolta;
    }

    
   public void colocarMesVolta(int mvl) {
   mesVolta = mvl;
    }

    public int pegarMesVolta() {
        return mesVolta;
    }
    
     
   public void colocarAnoVolta(int avl) {
   anoVolta = avl;
    }

    public int pegarAnoVolta() {
        return anoVolta;
    }
     
    

    public void ColocarFormaPgto(String fp) {
        formaPgto = fp;
    }

    public String pegarFormaPgto() {
        return formaPgto;
    }

    public void colocarValor(float cv) {
        valorPassagem = cv;
    }

    public float pegarValor() {
        return valorPassagem;
    }
}
