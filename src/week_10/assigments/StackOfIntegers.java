package week_10.assigments;

public class StackOfIntegers {
    private int[] array;
    private int size;
    private static int DEFAULT_CAPACITY=8;
    StackOfIntegers(){
        this.array=new int[DEFAULT_CAPACITY];
    }

    public StackOfIntegers(int capacity){
        array= new int[capacity];
    }

    public void push(int value){
        if(size>=array.length){
            int[]temp = new int[array.length*2+1];
            System.arraycopy(array,0,temp,0,array.length);
            array=temp;
        }
        array[size]=value;
        size++;
    }

    public int pop(){
        return array[--size];
    }
    public int peek(){
        return array[size-1];
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int getSize(){
        return this.size;
    }
}
