// Definindo a classe "Carro"
class Carro {
    // Atributos da classe
    private String marca;  // Atributo privado para encapsulamento
    private String modelo; // Atributo privado para encapsulamento
    private int anoFabricacao; // Atributo privado para encapsulamento
    private String cor; // Atributo privado para encapsulamento
    private int velocidade; // Atributo privado para encapsulamento


    // Corrigindo os parâmetros do construtor
    Carro(String marca, String modelo, int anoFabricacao, String cor, int velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
        this.velocidade = velocidade;
    }


    // Método getter para obter a marca do carro
    public String getMarca() {
        return marca;
    }


    // Método getter para obter o ano de fabricação do carro
    public int getAnoFabricacao() {
        return anoFabricacao;
    }


    // Método getter para obter o modelo do carro
    public String getModelo() {
        return modelo;
    }


    // Método getter para obter a cor do carro
    public String getCor() {
        return cor;
    }


    // Método getter para obter a velocidade do carro
    public int getVelocidade() {
        return velocidade;
    }
}


// Classe principal que contém o método main
public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Carro chamado "carro1"
        Carro carro1 = new Carro("Mercedes", "ModeloXYZ", 2022, "Azul", 120);


        // Usando os métodos getters para obter e imprimir as informações do carro
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Cor: " + carro1.getCor());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("AnoFabricacao: " + carro1.getAnoFabricacao());
        System.out.println("Velocidade: " + carro1.getVelocidade());
    }
}

