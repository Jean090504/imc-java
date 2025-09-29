package br.senai.jandira.ds1m.imc.model;
import java.util.Scanner;

public class CalculadoraImc {
    String nome;
    double peso;
    double altura;
    double imc;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do paciente: ");
        nome = leitor.nextLine();

        System.out.println("Digite o peso do paciente: ");
        peso = leitor.nextDouble();

        System.out.println("Digite a altura do paciente: (em CM)");
        altura = leitor.nextDouble();

    }

}

