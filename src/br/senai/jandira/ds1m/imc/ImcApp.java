package br.senai.jandira.ds1m.imc;

import br.senai.jandira.ds1m.imc.model.CalculadoraImc;

public class ImcApp {
    public static void main(String[] args) {
        System.out.println("Iniciando programa...");

        CalculadoraImc imc = new CalculadoraImc();

        imc.obterDados();

    }
}
