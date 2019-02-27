package cz.mg.vulkan.jna.arrays;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Iterator;


public abstract class NativeArray<S extends Structure> implements Iterable<S> {
    private final int count;
    private final int elementSize;
    private final Pointer pointer;
    private final S[] values;

    public NativeArray(int count, Class structure, Class reference, Class value) {
        this.count = count;
        this.elementSize = Native.getNativeSize(value);
        this.pointer = new Memory(count * elementSize);
        this.values = (S[]) java.lang.reflect.Array.newInstance(structure, count);
        for(int i = 0; i < count; i++){
            int offset = i * elementSize;
            try {
                this.values[i] = (S)structure.getConstructor(Pointer.class).newInstance(pointer.share(offset));
            } catch (ReflectiveOperationException e) {
                throw new RuntimeException(e.getClass().getSimpleName() + ": " + e.getMessage());
            }
        }
    }

    public Pointer getPointer() {
        return pointer;
    }

    public int count(){
        return count;
    }

    public int size(){
        return count* elementSize;
    }

    public S get(int i){
        if(i < 0 || i >= count) throw new ArrayIndexOutOfBoundsException("" + i + " out of " + count);
        return values[i];
    }

    public void read(){
        for(S s : this) s.read();
    }

    public void write(){
        for(S s : this) s.write();
    }

    @Override
    public Iterator<S> iterator() {
        return new Iterator<S>() {
            private int i = 0;

            @Override
            public boolean hasNext() {
                return i < count;
            }

            @Override
            public S next() {
                return values[i++];
            }
        };
    }
}
