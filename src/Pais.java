import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String codigoISO;
    private String nome;
    private double populacao;
    private double dimensaoKm2;
    private List<Pais> fronteiras;

    public Pais(String codigoISO, String nome, double dimensaoKm2) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.dimensaoKm2 = dimensaoKm2;
        this.populacao = 0.0; // Inicializa a população como 0
        this.fronteiras = new ArrayList<>();
    }

    // Getters e setters
    public String getCodigoISO() {
        return codigoISO;
    }

    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public double getDimensaoKm2() {
        return dimensaoKm2;
    }

    public void setDimensaoKm2(double dimensaoKm2) {
        this.dimensaoKm2 = dimensaoKm2;
    }

    public List<Pais> getFronteiras() {
        return fronteiras;
    }

    // Verifica se dois países são iguais com base no código ISO
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pais)) {
            return false;
        }
        Pais other = (Pais) obj;
        return this.codigoISO.equals(other.codigoISO);
    }

    // Verifica se outro país é limítrofe
    public boolean isLimiteCom(Pais outroPais) {
        return this.fronteiras.contains(outroPais);
    }

    // Calcula a densidade populacional
    public double calcularDensidadePopulacional() {
        if (populacao <= 0 || dimensaoKm2 <= 0) {
            return 0.0;
        }
        return populacao / dimensaoKm2;
    }

    // Retorna a lista de vizinhos comuns a dois países
    public List<Pais> vizinhosComuns(Pais outroPais) {
        List<Pais> vizinhosComuns = new ArrayList<>();
        for (Pais vizinho : this.fronteiras) {
            if (outroPais.fronteiras.contains(vizinho)) {
                vizinhosComuns.add(vizinho);
            }
        }
        return vizinhosComuns;
    }
}