/*
Defesa de Dissertação:

Atributos: Tempo de duração;
           Local da defesa;
           Material utilizado;
           

Métodos:   Marcada;
           Cancelada;
           Desmarcada;
           

Estado:    Aprovada(o);
           Reprovada(o);
 */
package com.mycompany.orientadoaobjetoconcreto;

import java.util.Scanner;

public class DefesaDissertacao {

    String localDaDefesa;
    String materialUtilizado;
    String tempoDeDuracao;
    boolean aprovada;

    void estado() {
        System.out.println("Informe o Local da Defesa: " + this.localDaDefesa);
        System.out.println("Informe o material utilizado: " + this.materialUtilizado);
        System.out.println("Informe o tempo de duração da Defesa de Dissertação: " + this.tempoDeDuracao);
        System.out.println("Qual o status da Defesa? " + (this.aprovada ? "Sim" : "Não"));
    }

    void escrever() {
        if (this.aprovada == true) {
            System.out.println("Está aprovada. Temos mais um Mestre. Parabéns!\n");
        } else {
            System.out.println("Foi reprovada. O aperfeiçoando da pesquisa deve continuar!\n");
        }
    }

    void aprovar() {
        this.aprovada = true;
    }

    void reprovar() {
        this.aprovada = false;
    }

    boolean perguntarResultado() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("A aluna foi aprovada? (Sim/Não)");
        String resposta = teclado.nextLine().toLowerCase();

        if (resposta.equals("sim")) {
            return true;
        } else if (resposta.equals("não") || resposta.equals("nao")) {
            return false;
        } else {
            System.out.println("Resposta inválida! Por favor digite 'sim' ou 'não'.");
            return perguntarResultado();
        }
    }
}
