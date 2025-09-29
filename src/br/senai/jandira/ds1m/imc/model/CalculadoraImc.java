package br.senai.jandira.ds1m.imc.model;
import java.util.Scanner;

public class CalculadoraImc {
    String nome;
    double peso;
    double altura;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = leitor.nextLine();


    }
}
