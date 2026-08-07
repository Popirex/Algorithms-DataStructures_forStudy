package strutture;

import eccezioni.linkedlistexceptions.ElementNotFoundException;
import java.util.Objects;

public class LinkedList {

    private Element head;
    private int numel;
    

    public LinkedList(){
        this.head = null;
        this.numel = 0;   
    }

    public LinkedList(Element head){
        this.head = head;
        this.numel = 1;
    }

    public void Insert(Element e){
        e.next = this.head;
        if( this.head != null ) this.head.prev = e;
        this.head = e;
        this.numel++;
    }

    public Element Search(Integer k){
        Element x = this.head;
        while( (x != null) && (!Objects.equals(x.key, k)) )  x = x.next;
        
        return x;
    }

    public void Delete(Element x){

        if(x == null) throw new ElementNotFoundException("\nThe given element is null\n");
        
        if(x.prev != null){
            x.prev.next = x.next;
        }
        else{
            this.head = x.next;
        }

        if(x.next != null) x.next.prev = x.prev ;

        this.numel--;
    }

    public void PrintAll(){
        Element x = this.head;
        System.out.print("[");
        while(x != null){
            System.out.print(" " + x.key + ",");
            x = x.next;
        }

        System.out.print("]\n");
    }

    public boolean isEmpty(){
        return this.numel == 0;
    }
    
}
