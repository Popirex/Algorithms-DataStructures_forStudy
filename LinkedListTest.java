import strutture.Element;
import strutture.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList L = new LinkedList();

        L.PrintAll();


        for(int i = 1; i <= 10; i++){
            
            L.Insert(new Element(i));
            L.PrintAll();
        }

        L.PrintAll();
    }

}
