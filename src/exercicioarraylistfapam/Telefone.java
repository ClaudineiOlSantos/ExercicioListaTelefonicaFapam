package exercicioarraylistfapam;

/**
 * @author claudinei
 */
public class Telefone {
    private String ddd;
    private String numero;
    private String nome;

    public Telefone() {
    }

    public Telefone(String ddd, String numero, String nome) {
        this.ddd = ddd;
        this.numero = numero;
        this.nome = nome;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome:" + nome + ", " + ddd + "-" + numero;
    }

}