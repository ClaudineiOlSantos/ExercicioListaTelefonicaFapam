package exercicioarraylistfapam;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author claudinei
 */
public class ExercicioArrayListFapam {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int resposta = 0;
        int index = 0;
        ListaTelefonica lista = new ListaTelefonica();

        do {
            System.out.println("|------------------------------------|");
            System.out.println("|#######>> LISTA TELEFÔNICA <<#######|");
            System.out.println("|------------------------------------|");
            System.out.println("|1 - Cadastrar");
            System.out.println("|2 - Remover");
            System.out.println("|3 - Listar");
            System.out.println("|0 - Sair");
            System.out.println("|------------------------------------|");

            System.out.println("\n O que deseja fazer?");
            resposta = input.nextInt();
            switch (resposta) {
                case 1:
                    String ddd,
                     numero,
                     nome;
                    System.out.println("\n Informe o ddd:");
                    ddd = input.next();
                    System.out.println("\n Informe o número:");
                    numero = input.next();
                    System.out.println("\n Informe o Nome do contato:");
                    nome = input.next();

                    lista.addTelefone(new Telefone(ddd, numero, nome));
                    break;
                case 2:
                    index = 0;
                    System.out.println(lista.getLista());

                    System.out.println("\n Inform o Id do telefone a ser removido");
                    index = input.nextInt();
                    try {
                        lista.removeTelefone(index - 1);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                    break;
                case 3:
                    index = 0;
                    System.out.println(lista.getLista());
                    break;
                default:
                    break;
            }
        } while (resposta != 0);
    }

}
