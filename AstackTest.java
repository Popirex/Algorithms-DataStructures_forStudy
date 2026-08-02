import strutture.AStack;

public class AstackTest {
    
    public static void main( String args[] ){
        
        int size = 10;

        AStack s = new AStack(size);

        for(int i = 1; i < 11; i++){
            s.Push(i);
            s.PrintAll();
        }

        System.out.println("\n\n");

        for(int i = 1; i < 11; i++){
            s.Pop();
            s.PrintAll();
        }




    }

}
