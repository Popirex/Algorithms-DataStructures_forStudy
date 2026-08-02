package strutture;

import eccezioni.queueexceptionspopirex.EmptyQueueException;
import eccezioni.queueexceptionspopirex.FullQueueException;
import java.util.Arrays;

/*

Struttura dati che utilizza un array di appoggio, segue la regola di inserimento/rimozione FIFO ( First in First out )

Dati relativi alla coda:
- lenght -> dimensione massima della coda
- dim -> dimensione attuale della coda
- VAL -> array di appoggio che contiene i numeri
- head -> punta all'indice del primo elemento
- tail -> punta all'indice dell'ultimo elemento inserito

*/


public class AQueue {

    private final int length;
    private int dim;
    private Integer[] VAL = null;
    private int head;
    private int tail;

    public AQueue(int len){
        this.length = len;
        this.dim = 0;
        this.VAL = new Integer[len];
        this.head = 0;
        this.tail = 0;
    }

    public boolean Empty(){
        return this.dim == 0;
    }

    public void Enqueue(int x){

        if( this.dim == this.length) throw new FullQueueException("Can't add item to a full queue, you have " + this.dim + "/" + this.length + " items.\n");

        this.VAL[this.tail] = x;

        if(this.tail == this.length - 1) this.tail = 0;
        else this.tail += 1;

        this.dim += 1;

    }

    public int Dequeue(){

        if(this.dim == 0) throw new EmptyQueueException("Can't remove item from an empty queue, you have " + this.dim + "/" + this.length + " items.\n");

        int x = this.VAL[this.head];
        this.VAL[this.head] = null; // to mantain a clean array with nulls where an element is dequeued ( avoids ghosts values )

        if( this.head == this.length - 1) this.head = 0;
        else this.head += 1;

        this.dim -= 1;

        return x;
    }

    public void PrintAll(){
        System.out.println(Arrays.toString(this.VAL));
    }

}
