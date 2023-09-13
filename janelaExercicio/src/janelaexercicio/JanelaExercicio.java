

package janelaExercicio.JanelaExercicio;

/**
 *
 * @author Natan Ogliari
 */
public class JanelaExercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        diminuiLetras ltpqn = new diminuiLetras();
        ltpqn.lowCase();
        */
        
        try{
            diminuiLetras ltpqn = new diminuiLetras();
            ltpqn.lowCase();
        }catch(NullPointerException e){
           System.out.println("Exeção NullPointerException Identiifcada:\n");
           System.out.println("Método diminuiLetras() tratado\n" + e);
        }
        
    }
    
}
