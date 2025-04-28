import java.util.Scanner; //importar uma classe externa

public class AppEscola { //PascalCasing quando começa com maiuscula
    //main
    //public = público
    //static = da classe
    //void retorno vazio
    //main = principal
    //String args[] = parâmetro inicial (classe)
    public static void main(String args[]){
        Scanner teclado  = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = teclado.nextLine();
        System.out.println("Qual a sua idade?");
        int idade = teclado.nextInt();
        System.out.println("Tem Faculdade: 0-não e 1-sim");
        boolean temFaculdade = teclado.nextBoolean(); 
        //método principal 
        //para criar um objeto= crie a classe = new Construtor(parâmetros que são os valores);
        Aluno aluno = new Aluno(nome,idade,temFaculdade);
        System.out.println(aluno.getNome());
        
        System.out.println(aluno.getTemFaculdade());
        //Desafio
        // Implementar uma interface com usuário
        //Scanner.
  }
}
