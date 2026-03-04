package br.com.fiapride.main;
import br.com.fiapride.model.Passageiro;
import java.util.Scanner;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        Passageiro passageiro1 = new Passageiro();
        passageiro1.nome = "Ana Silva";
        passageiro1.cpf = "423.858.038.95";
        passageiro1.saldo = 00.00;

        String menu1 = """ 
                --- BEM-VINDO AO FIAPRIDE ---
                1 - Entrar
                2 - Sair
                """;
        String menu2 = """
                \n--- MENU DO PASSAGEIRO ---
                1 - Pagar (R$ 10,00)
                2 - Adicionar Saldo
                3 - Mostrar Informações
                4 - Sair
                """;

        // Menu inicial
        System.out.println(menu1);
        int opcao = leitura.nextInt();

        if (opcao == 1) {
            int opcao2 = 0;
            while (opcao2 != 4) {
                //Menu Secundario
                System.out.println(menu2);
                opcao2 = leitura.nextInt();

                if (opcao2 == 1) {
                    double valorPassagem = 10.0;
                    if (passageiro1.saldo >= valorPassagem) {
                        passageiro1.saldo -= valorPassagem;
                        System.out.println("Pagamento realizado! Saldo atual: R$" + passageiro1.saldo);
                    } else {
                        System.out.println("Saldo insuficiente! Saldo atual: R$" + passageiro1.saldo);
                    }
                }
                else if (opcao2 == 2) {
                    System.out.println("Quanto deseja adicionar?");
                    double valorAdicional = leitura.nextDouble();
                    passageiro1.saldo += valorAdicional;
                    System.out.println("Saldo atualizado: R$" + passageiro1.saldo);
                }
                else if (opcao2 == 3) {
                    System.out.println("\n--- DADOS DO PASSAGEIRO ---");
                    System.out.println("Nome: " + passageiro1.nome);
                    System.out.println("CPF: " + passageiro1.cpf);
                    System.out.println("Saldo: R$" + passageiro1.saldo);
                }
                else if (opcao2 == 4) {
                    System.out.println("Saindo da conta...");
                }
            }
        }

        System.out.println("Programa finalizado. Até logo!");
        leitura.close();
    }
}