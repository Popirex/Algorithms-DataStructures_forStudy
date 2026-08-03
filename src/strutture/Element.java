package strutture;

public class Element {

    public Integer key; // the actual key of the element of the list
    public Element prev;
    public Element next;

 

    public Element(int key){
        this.key = key;
        this.prev = null;
        this.next = null;
    }

    public Element(int key, Element prev, Element next){
        this.key = key;
        this.prev = prev;
        this.next = next;
    }

    
}
