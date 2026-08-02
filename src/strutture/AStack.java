package strutture;
import eccezioni.stackexceptionspopirex.*;
import java.util.Arrays;

public class AStack{

    private Integer[] VAL = null;
    private int top;
    private final int max;

    public AStack(int max){
        this.max = max;
        this.top = 0;
        this.VAL = new Integer[max];
    }

    public boolean  Empty(){
        return this.top == 0;
    }

    public void Push(int x){

        if(this.top == this.max) throw new FullStackException("No item can be added to a full stack, you have " + this.top + "/" + this.max + " items.\n");

        this.VAL[this.top] = x;

        this.top +=1;
    }

    public int Pop(){
        if(this.Empty()) throw new EmptyStackException("No item can be popped from empty stack\n");

        this.top -= 1;
        int val = this.VAL[this.top];

        this.VAL[this.top] = null;
        
        return val;
    }

    public void PrintAll(){
        System.out.println(Arrays.toString(this.VAL));
    }

}