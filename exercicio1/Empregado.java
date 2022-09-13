package aula10.aula;

public abstract class Empregado implements IEmpregado{
    protected float salario;
    private Data dataNascimento;
    
    public Empregado(Data dataNascimento){
        this.setDataNascimento(dataNascimento);
    }
    
    public Data getDataNascimento(){
        return this.dataNascimento;
    }
    public void setDataNascimento(Data dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public String toString(){
        return "nome: " + this.getClass().getSimpleName()
             + " salario: " + this.salario
             + " nascimento: " + this.dataNascimento;
    }
    
}
