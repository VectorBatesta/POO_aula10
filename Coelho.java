package aula10;

public final class Coelho extends Animal implements ICoelho {
    public void andar(){
        System.out.println("ANDAR COELHO");
    }
    public int getPernas(){
        return 4;
    }
}
