package br.com.fiapride.main;
import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {
    public static void main(String[] args) {
        // Primeiro passageiro usando a class Passageiro
        Passageiro passageiro1 = new Passageiro();
        passageiro1.nome = "Ana Silva";
        passageiro1.saldo = 50.00;

        // Segundo Passageiro
        Passageiro passageiro2 = new Passageiro();
        passageiro2.nome = "Carlos Souza";
        passageiro2.saldo = 12.50;


        // Exibir dados
        System.out.println("-- Sistema FiapRide ---");
        System.out.println("Passageiro: "+ passageiro1.nome + "| tem o total de R$"+ passageiro1.saldo);
        System.out.println("Passageiro: "+ passageiro2.nome + "| Tem o total de R$"+passageiro2.saldo);
    }
}
