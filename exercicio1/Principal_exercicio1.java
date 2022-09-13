package aula10.aula;

public class Principal_exercicio1 {
    public Principal_exercicio1(){
        Empregado [ ] lista = new Empregado[5];  //Vetor é estático
        lista[0] = new Balconista(new Data(13, 9, 2022));
        lista[1] = new Chefe(new Data( 12, 9, 2022));
        lista[2] = new Estagiario(new Data( 14, 9, 2022));

        for(int i=0; i<lista.length; i++)
             System.out.println( lista[ i ] );

    }
    
    public static void main( String [ ] args ) {
        new Principal_exercicio1();
    }

}