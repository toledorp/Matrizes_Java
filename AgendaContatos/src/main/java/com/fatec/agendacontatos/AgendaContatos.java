/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.fatec.agendacontatos;

/**
 *
 * @author fatec-dsm2
 */
public class AgendaContatos {

    private String[][] contatos;
    private int quantidade;

    public AgendaContatos() {
        contatos = new String[5][2];
        quantidade = 0;
    }

    public void adicionarContato(int linha, String nome, String telefone) {
        if (linha >= 0 && linha < 5) {
            contatos[linha][0] = nome;
            contatos[linha][1] = telefone;
            if (linha >= quantidade) {
                quantidade = linha + 1;
            }
        }
    }

    public void exibirContatos() {
        for (int i = 0; i < quantidade; i++) {
            if (contatos[i][0] != null) {
                System.out.println(contatos[i][0] + " - " + contatos[i][1]);
            }
        }
    }

    public void buscarTelefone(String nome) {
        for (int i = 0; i < quantidade; i++) {
            if (contatos[i][0] != null && contatos[i][0].equals(nome)) {
                System.out.println("Telefone de " + nome + " : " + contatos[i][1]);
                return;
            }
        }
        System.out.println("Contato nao encontrado: " + nome);
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato(0, "Ana", "9999-1111");
        agenda.adicionarContato(1, "Bruno", "98888-2222");
        agenda.adicionarContato(2, "Carla", "97777-3333");
        agenda.exibirContatos();
        agenda.buscarTelefone("Bruno");
    }
}
