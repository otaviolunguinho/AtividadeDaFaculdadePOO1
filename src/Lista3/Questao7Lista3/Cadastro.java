package Lista3.Questao7Lista3;

public class Cadastro {

    public void cadastrarIdade(int idade){
        if(idade < 0 || idade > 120){
            throw new IdadeInvalidaException("Idade inválida: " + idade + ". A idade deve estar entre 0 e 120 anos.");
        }
        System.out.println("Cadastro realizado com sucesso! Idade: " + idade);
    }
}
