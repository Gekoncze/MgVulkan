package cz.mg.vulkan.jna.objects;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.nio.ByteBuffer;


public abstract class NativeObject<S extends Structure>{
    private final int size;
    private final ByteBuffer buffer;
    private final Pointer pointer;
    private final S value;
    private final S reference;

    public NativeObject(Class structure, Class reference, Class value) {
        this.size = Native.getNativeSize(value);
        this.buffer = ByteBuffer.allocateDirect(size);
        this.pointer = Native.getDirectBufferPointer(buffer);
        try {
            this.value = (S)value.getConstructor(Pointer.class).newInstance(pointer);
            this.reference = (S)reference.getConstructor(Pointer.class).newInstance(pointer);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    public int getSize() {
        return size;
    }

    public Pointer getPointer() {
        return pointer;
    }

    public S byValue() {
        return value;
    }

    public S byReference() {
        return reference;
    }

    public void read(){
        value.read();
    }

    public void writeValue(){
        value.write();
    }

    public void writeReference(){
        reference.write();
    }
}
