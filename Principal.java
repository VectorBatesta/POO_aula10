package aula10;

public class Principal {

    public static void main(String[] args) {
        Principal obj = new Principal();
        obj.iniciar();
    }
    
    public void iniciar(){
        Coelho coelho = new Coelho();
        coelho.andar();
        System.out.println(coelho.temPelos());
    }
    
}
