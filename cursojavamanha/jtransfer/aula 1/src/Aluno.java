/*encapsulamento */
//public
//private
//protected
//package
public class Aluno { //classe

    //variáveis = atributos
    //características dos objetos = atributos 
    private String nome; //atributo do tipo texto
    private int idade; //atributo do tipo número
    private boolean temFaculdade; //atributo do tipo booleano (0 e 1)
    // o construtuor constroi os objetos 
    public Aluno(){
        //cria um objeto mas sem uma variável, por isso esse construtor está vazio
    }
    public Aluno(String nome,int idade,boolean temFaculdade){
        //construtor com parametros para colocar as variáveis
        this.nome = nome;
        this.idade = idade;
        this.temFaculdade = temFaculdade;
    }
    public String getNome(){ //método para pegar nome
        return nome;

    }
    public int getIdade(){ //método para pegar idade
        return idade;
    
    }
    public boolean getTemFaculdade(){ //método para pegar temFaculdade
        return temFaculdade;
    }
    // classes Wrappers = usado em problemas mais complexos
    /*
     * Considerando a explicação do professor:
     * tipo primitivo x classes wrappers
     * 
     * você tem que descobrir quantos alunos 
     * tem faculdade (sim ou não)
     * temFaculdade
     * sim/não - 0 ou 1 
     * Como declarar um atributo booleano?
     */
    
}
