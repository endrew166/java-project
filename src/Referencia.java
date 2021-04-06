package io.github.jiangdequan;

import java.util.logging.Level;

public class Referencia {

    public void testar() {
        int[] Level = new int[] { 1, 2, 3, 4, 5 };
        for (int i = 0; i < Level.length; i++) {
            System.out.println("Level do personagem:" + Level[i]);
        }
        demostrarLevelBufado(Level);
        Classe classe = new Classe("Mago");
        System.out.println("Classe escolhida foi:" + classe.getNome());
        mudarClasse();
    }

    public void demostrarLevelBufado(int Level[]) {
        for (int i = 0; i < Level.length; i++) {
            Level[i] *= 2;
            System.out.println("Level do personagem com xp elevado:" + Level[i]);
        }
    }

    public void mudarClasse() {
        Classe classe = new Classe("Paladino");
        System.out.println("Voce mudou de calsse:" + classe.getNome());

    }
}