
package com.mycompany.orientadoaobjetoconcreto;

import java.util.Locale;
import java.util.Scanner;

public class OrientadoAObjetoDefesaD {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Digite o local da defesa: ");
        String locald1 = teclado.nextLine();
        System.out.println("Digite o material utilizado: ");
        String materiald1 = teclado.nextLine();
        System.out.println("Digite o tempo de duração da defesa: ");
        String tempod1 = teclado.nextLine();
        
        DefesaDissertacao d1 = new DefesaDissertacao();

        d1.localDaDefesa = locald1;
        d1.materialUtilizado = materiald1;
        d1.tempoDeDuracao = tempod1;
        
        boolean respostaResultado = d1.perguntarResultado();
        d1.aprovada = respostaResultado;
        
        d1.estado();
        d1.escrever();
    }
}
