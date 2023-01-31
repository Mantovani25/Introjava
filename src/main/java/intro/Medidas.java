//1 - Pacote
package intro;

//2 - Referências as bibliotecas

//3 - Classe
public class Medidas {
    //3.1 - Atributos - Caracteristicas

    //3.2 - Métodos e Funções
    public static void main(String[] args){

        calcularAreaModoCurto();
        calcularAreaModoExtenso();

    }

    public static void calcularAreaModoCurto(){
        System.out.println("Cálculo de áreas Modo Curto");

        //Calculo de área reduzido
        int largura = 4;
        int comprimento = 3;
        System.out.println("Para a largura de " + largura + "m e o comprimentode de "
                + comprimento + "m a área é de " + largura * comprimento + "m²");
    }
    public static void calcularAreaModoExtenso(){

        System.out.println("Cálculo de áreas Modo Extenso");


        // Calculo de área - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5; // largura recebe 4
        comprimento = 6; // comprimento recebe 3

        resultado = largura * comprimento;
        System.out.println("Para a largura de "
                + largura + "m e o comprimentode de " + comprimento + "m a área é de " + resultado + "m²");
    }

}
