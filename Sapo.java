package aula10;

public final class Sapo implements IAnimal {
    public void andar(){
        System.out.println("ANDAR SAPO");
    }
    public int getPernas(){
        return 2;
    }
    //Sobrescrita
    public boolean temPelos(){
        return false;
    }
}