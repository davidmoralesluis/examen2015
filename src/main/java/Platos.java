import java.io.Serializable;


public class Platos implements Serializable{
    private String codigop;
    private String nomep;

    private int peso;
    private int graxa;


    public Platos(String codigop, String nomep, int peso, int graxa) {
        this.codigop = codigop;
        this.nomep = nomep;
        this.peso = peso;
        this.graxa = graxa;
    }

    public String getCodigop() {
        return codigop;
    }

    public void setCodigop(String codigop) {
        this.codigop = codigop;
    }

    public String getNomep() {
        return nomep;
    }

    public void setNomep(String nomep) {
        this.nomep = nomep;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getGraxa() {
        return graxa;
    }

    public void setGraxa(int graxa) {
        this.graxa = graxa;
    }

    @Override
    public String toString() {
        return "Platos{" +
                "codigop='" + codigop + '\'' +
                ", nomep='" + nomep + '\'' +
                ", peso=" + peso +
                ", graxa=" + graxa +
                '}';
    }
}
