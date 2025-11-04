public class Computador {
    // Atributos privados da classe
    private String marca;
    private String modelo;
    private double preco;
    private String processador;
    private int memoria;

    public Computador() {

         // Construtor padrão que inicializa os atributos com valores padrão.

         this.marca = "";
         this.modelo = "";
         this.preco = 0.0;
         this.processador = "";
         this.memoria = 0;
    }
     //Construtor que inicializa os atributos com os valores fornecido
    public Computador( String marca, String modelo, double preco, String processador, int memoria ) {
         this.marca = "marca";
         this.modelo = "modelo";
         this.preco = preco;
         this.processador = "processador";
         this.memoria = memoria;

    }





//metodos geters e seters.
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public String getProcessador() { return processador; }
    public void setProcessador(String processador) { this.processador = processador; }

    public int getMemoria() { return memoria; }
    public void setMemoria(int memoria) { this.memoria = memoria; }

    //Imprime as informações do computador no console.
    public void imprimir() {
        System.out.println("---------------------------------");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço: R$ " + String.format("%.2f", preco));
        System.out.println("Processador: " + processador);
        System.out.println("Memória (GB): " + memoria);
        System.out.println("-------------------------------");
    }


    }


