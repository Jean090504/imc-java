package br.senai.sp.jandira.ds1m.imc.model;
import java.util.Scanner;

public class CalculadoraImc {
    String nome;
    double peso;
    double altura;
    double imc;
    String estado;
    int reinicioDePrograma;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do paciente: ");
        nome = leitor.nextLine();

        System.out.println("Digite o peso do paciente (kg): ");
        peso = leitor.nextDouble();

        System.out.println("Digite a altura do paciente (cm): ");
        altura = leitor.nextDouble();

        calcularImc();
    }


    public void calcularImc(){
        double alturaMetros = altura / 100.0;
        imc = peso / (alturaMetros * alturaMetros);

        if(imc < 18.5){
           estado = "O paciente está abaixo do peso.";
        }else if (imc >= 18.5 && imc < 25) {
            estado = "O paciente está no peso ideal.";
        }else if (imc >= 25 && imc < 30){
            estado = "O paciente está levemente acima do peso.";
        } else if (imc >= 30 && imc < 35) {
            estado = "O paciente está com obesidade de grau I, estado do paciente está ficando mais sério!";
        } else if (imc >= 35 && imc < 40) {
            estado = "O paciente está com obesidade de grau II, estado do paciente é severo!";
        } else if (imc >= 40) {
            estado = "O paciente está com obesidade de grau III, estado do paciente é mórbido!";
        }
        exibirResultados();
    }

    public void exibirResultados(){
        System.out.println("-------------------------------------");
        System.out.println("** R E S U L T A D O S **");
        System.out.println("-------------------------------------");
        System.out.println("Nome do paciente: " + nome);
        System.out.println("Peso do paciente " + nome + " (kg): " + peso);
        System.out.println("Altura do paciente " + nome + " (cm): " + altura);
        System.out.println("IMC do paciente " + nome + ": " +String.format("%.2f", imc));
        System.out.println("Status do paciente " + nome + ": " + estado );
        System.out.println("-------------------------------------");

        reiniciarPrograma();
    }

    public void reiniciarPrograma() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Deseja calcular a comissão de outro vendedor?");
        System.out.println("Digite '1' para sim, e '0' para finalizar o programa.");
        reinicioDePrograma = leitura.nextInt();
        if (reinicioDePrograma == 1) {
            obterDados();
        } else {
            System.out.println("Obrigado por usar o programa!");
            System.out.println("Finalizando o programa...");
        }
    }

}

