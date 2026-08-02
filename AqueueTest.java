import strutture.AQueue;

public class AqueueTest {
    public static void main(String[] args) {
        
        int size = 10;

        AQueue Q = new AQueue(size);

        for(int i = 0; i < size; i++){
           Q.Enqueue(i);
           Q.PrintAll(); 
        }

        System.out.println("\n\n");

        for(int i = 0; i < size; i++){
            Q.Dequeue();
            Q.PrintAll();
        }

        Q.PrintAll();

    }
}
