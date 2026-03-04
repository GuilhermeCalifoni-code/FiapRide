FIAPRIDE - Sistema de Gestão de Passageiros
O FIAPRIDE é uma aplicação Java simples desenvolvida para gerenciar o fluxo de pagamento e saldo de passageiros. O sistema permite simular a entrada de um usuário, recarga de saldo, pagamento de passagens e visualização de dados cadastrais via console.

🚀 Funcionalidades
Menu Interativo: Interface via terminal com opções numeradas.

Gestão de Saldo: Adição de valores ao saldo do passageiro.

Pagamento de Passagem: Débito automático de um valor fixo (R$ 10,00) com verificação de saldo insuficiente.

Exibição de Dados: Consulta de nome, CPF e saldo atualizado.

📂 Estrutura do Projeto
O projeto segue o padrão de pacotes Java, organizado da seguinte forma:

Plaintext
src/
└── br/
    └── com/
        └── fiapride/
            ├── main/
            │   └── SistemaPrincipal.java  # Classe com o método main e lógica do menu
            └── model/
                └── Passageiro.java      # Classe de modelo com os atributos do passageiro
🛠️ Tecnologias Utilizadas
Java 17+ (ou superior)

Scanner API: Para leitura de dados no terminal.

📝 Como Executar
Certifique-se de ter o JDK instalado em sua máquina.

Clone ou baixe os arquivos do projeto.

Navegue até a pasta src.

Compile as classes:

Bash
javac br/com/fiapride/model/Passageiro.java br/com/fiapride/main/SistemaPrincipal.java
Execute o programa:

Bash
java br.com.fiapride.main.SistemaPrincipal
💻 Exemplo de Uso
Ao iniciar o programa, você verá o menu principal:

Digite 1 para entrar no sistema.

No menu do passageiro, você pode escolher carregar saldo (opção 2) antes de realizar um pagamento (opção 1), garantindo que a transação seja aprovada.
