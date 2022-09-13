package aula10.aula;

public final class Data {
    private int dia, mes, ano;
    
    public Data(int dia, int mes, int ano){
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }
    
    public int getDia(){return this.dia;}
    public int getMes(){return this.mes;}
    public int getAno(){return this.ano;}
    
    private void setDia(int dia){
        this.dia = dia;
    }
    private void setMes(int mes){
        this.mes = mes;
    }
    private void setAno(int ano){
        this.ano = ano;
    }
    
    public String toString(){
        return this.dia + "/" +
               this.mes + "/" +
               this.ano;
    }
}
