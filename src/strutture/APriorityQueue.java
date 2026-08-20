import eccezioni.queueexceptionspopirex.*;
package strutture;

public class APriorityQueue {


    // in this version the VALUE is the index in the VAL array, while it's priority is the actual number stored in that index.
    // for convention, -1 signals that a value is not present in the array
    private int[] VAL;
    private int length;

    public APriorityQueue(int size){
        this.VAL = new int[size + 1];
        this.length = size;
    }

    public void Enqueue(int i , int priority){
        if( (i > this.length) || (this.VAL[i] != -1)) throw new FullQueueException("Item already added or too large for the queue!");
        this.VAL[i] = priority;
    }

    public void DecreaseKey(int i , int priority){
        if( (this.VAL[i] < priority) || (this.VAL[i] == -1) ) throw new GenericQueueError("Error");
        this.VAL[i] = priority;
    }

    public int ExtractMin(){
        int minIndex = -1;
        int minPriority = Integer.MAX_VALUE; // in my papers infinity is used, since we are using signed 32 bits integers i'll go with the maximun integer supported by this format.

        for(int i = 0; i <= this.length; i++){
            if( (this.VAL[i] < minPriority) && (this.VAL[i] != -1) ){
                minPriority = this.VAL[i];
                minIndex = i;
            }
        } 

        if(minIndex == -1) throw new EmptyQueueException("Number not found in the queue");
        this.VAL[minIndex]--;
        return minIndex;

    }

}
