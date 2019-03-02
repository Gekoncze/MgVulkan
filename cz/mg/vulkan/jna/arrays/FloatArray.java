package cz.mg.vulkan.jna.arrays;

import com.sun.jna.Memory;
import com.sun.jna.Pointer;


public class FloatArray {
    private static final int FLOAT_SIZE = 4;

    private final int count;
    private final int elementSize;
    private final Pointer pointer;

    public FloatArray(int count) {
        this.count = count;
        this.elementSize = FLOAT_SIZE;
        this.pointer = new Memory(count * elementSize);
    }

    public FloatArray(float[] array) {
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

    public float get(int i){
        if(i < 0 || i >= count) throw new ArrayIndexOutOfBoundsException("" + i + " out of " + count);
        return pointer.getFloat(i*elementSize);
    }

    public void set(int i, float value){
        if(i < 0 || i >= count) throw new ArrayIndexOutOfBoundsException("" + i + " out of " + count);
        pointer.setFloat(i*elementSize, value);
    }
}
