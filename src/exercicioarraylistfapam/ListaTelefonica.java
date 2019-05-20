package exercicioarraylistfapam;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author claudinei
 */
public class ListaTelefonica {

    private List<Telefone> lista;

    public ListaTelefonica() {
        this.lista = new ArrayList<>();
    }

    public String getLista() {
        String listaT = "\n\n|--------------------------------------\n";
        listaT += "|-----------LISTA TELEFÔNICA-----------\n";
        listaT += "|--------------------------------------\n";

        for (int c = 0; c < this.lista.size(); c++) {
            listaT += "| ID: " + (c + 1) + " - " + this.lista.get(c).toString() + "\n";
        }

        listaT += "|--------------------------------------\n";
        return listaT;
    }

    public void setLista(List<Telefone> lista) {
        this.lista = lista;
    }

    public void addTelefone(Telefone t) {
        this.lista.add(t);
    }

    public void removeTelefone(int id) throws Exception {
        try {
            this.lista.remove(id);

        } catch (Exception e) {
            throw new Exception("Telefone informado não existe na lista...");
        }
    }

    public void removeTelefone(Telefone t) {
        this.lista.remove(t);
    }

}
