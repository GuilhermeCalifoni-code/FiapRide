package microdesafio.main;
import microdesafio.model.Aviao;

public class principal {
    public static void main(String[] args) {
        Aviao aviao1 = new Aviao();
        aviao1.modelo = "Airbus A318";
        aviao1.radar = "Ligado";
        aviao1.comprimentoFusolagem = 120.10;

        Aviao aviao2 = new Aviao();
        aviao2.modelo = "Airbus A319";
        aviao2.radar = "Desligado";
        aviao2.comprimentoFusolagem = 100.10;

        System.out.println("----- Modelos de Avião -----");
        System.out.println("Temos o Modelo: "+ aviao1.modelo + " | ele esta com o radar "+ aviao1.radar +" | tem o tamanho "+ aviao1.comprimentoFusolagem);
        System.out.println("Temos o Modelo: "+ aviao2.modelo + " | ele esta com o radar "+ aviao2.radar +" | tem o tamanho "+ aviao2.comprimentoFusolagem);
    }
}
