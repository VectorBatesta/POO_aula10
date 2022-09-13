package aula10.aula;

public class Estagiario extends Empregado{
    
    public Estagiario(Data dataNascimento){
        super(dataNascimento);
        setPagamento();
    }
    public void setPagamento() {
        this.salario = 10;
    }
}
