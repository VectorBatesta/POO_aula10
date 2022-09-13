package aula10.aula;

public class Balconista extends Empregado{
    
    public Balconista(Data dataNascimento){
        super(dataNascimento);
        setPagamento();
    }
    public void setPagamento() {
        this.salario = 100;
    }
}
