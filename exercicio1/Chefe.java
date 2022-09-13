package aula10.aula;

public final class Chefe extends Empregado {
    
    public Chefe(Data dataNascimento){
        super(dataNascimento);
        setPagamento();
    }
    public void setPagamento() {
        this.salario = 1000;
    }
    
}
