import java.io.FileWriter; // classe para escrever no arquivo
import java.io.IOException; //classe para tratar exceções do arquivo
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // declaração de variáveis
        String nome; //referência
        int opcaoTransporte; //camelCasing
        //int - primitivo
        //inter - class
        String meioTransporte = "";

        // classe para teclado
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("== Pesquisa de Transporte Diário");
        System.out.println("Digite seu nome:");
        nome = scanner.nextLine();
        System.out.println(nome);
        System.out.println("Como você vai ao trabalho?");
        // utf - 8 - João
        System.out.println("1- Metrô");
        System.out.println("2- ônibus");
        System.out.println("3- Caminhada");
        System.out.println("4- Uber");
        System.out.println("5- Táxi");
        System.out.println("6- Carro");
        System.out.println("Escolha uma opção de (1-6)");

        // exercicio
        // faça como eu fiz
        // leia a opção transporte e mostre a opção lida
        // casting (conversão) - texto/número

        opcaoTransporte =  scanner.nextInt();
        System.out.println(opcaoTransporte);

        switch(opcaoTransporte){

            case 1: 
            System.out.println("1- Metrô");
            meioTransporte = "Metrô";
            break;
            case 2: 
            System.out.println("2- Ônibus");
            meioTransporte = "Ônibus";
            break;
            case 3:
            System.out.println("3- Caminhada");
            meioTransporte = "Caminhada";
            break;
            case 4:
            System.out.println("4- Uber");
            meioTransporte = "Uber";
            break;
            case 5:
            System.out.println("5- Táxi");
            meioTransporte = "Táxi";
            break;
            case 6:
            System.out.println("6- Carro");
            System.out.println("nome");

        }
        try(FileWriter escritor = new FileWriter("dados.txt",true)){
            escritor.write(nome+","+meioTransporte+"\n");
            System.out.println("dados gravados com sucesso");

        }catch(IOException e){
           System.out.println("Erro ao gravar os dados"+e.getMessage());
        }
        
    }
}
