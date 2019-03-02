package cz.mg.vulkan.jna.arrays;

import com.sun.jna.Memory;
import com.sun.jna.Pointer;


public class IntArray {
    private static final int INT_SIZE = 4;

    private final int count;
    private final int elementSize;
    private final Pointer pointer;

    public IntArray(int count) {
        this.count = count;
        this.elementSize = INT_SIZE;
        this.pointer = new Memory(count * elementSize);
    }

    public IntArray(int[] array) {
        this(array.length);
        for(int i = 0; i < array.length; i++) set(i, array[i]);
    }

    public Pointer getPointer() {
        return pointer;
    }

    public int count(){
        return count;
    }

    public int size(){
        return count * elementSize;
    }

    public int get(int i){
        if(i < 0 || i >= count) throw new ArrayIndexOutOfBoundsException("" + i + " out of " + count);
        return pointer.getInt(i*elementSize);
    }

    public void set(int i, int value){
        if(i < 0 || i >= count) throw new ArrayIndexOutOfBoundsException("" + i + " out of " + count);
        pointer.setInt(i*elementSize, value);
    }
}
