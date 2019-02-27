//package cz.mg.vulkan.jna.arrays;
//
//import com.sun.jna.Native;
//import com.sun.jna.Pointer;
//import java.nio.ByteBuffer;
//import java.util.Iterator;
//
//
//public class PointerArray implements Iterable<Pointer> {
//    private final int count;
//    private final int size;
//    private final ByteBuffer buffer;
//    private final Pointer ptr;
//
//    public PointerArray(int count) {
//        this.count = count;
//        this.size = Native.POINTER_SIZE;
//        this.buffer = ByteBuffer.allocateDirect(count * size);
//        this.ptr = Native.getDirectBufferPointer(buffer);
//    }
//
//    public Pointer getPointer() {
//        return ptr;
//    }
//
//    public int count(){
//        return count;
//    }
//
//    public Pointer get(int i){
//        if(i < 0 || i >= count) throw new ArrayIndexOutOfBoundsException("" + i + " out of " + count);
//        int offset = i*size;
//        return ptr.getPointer(offset);
//    }
//
//    public void set(int i, Pointer ptr){
//        if(i < 0 || i >= count) throw new ArrayIndexOutOfBoundsException("" + i + " out of " + count);
//        int offset = i*size;
//        ptr.setPointer(offset, ptr);
//    }
//
//    @Override
//    public Iterator<Pointer> iterator() {
//        return new Iterator<Pointer>() {
//            private int i = 0;
//
//            @Override
//            public boolean hasNext() {
//                return i < count;
//            }
//
//            @Override
//            public Pointer next() {
//                return get(i++);
//            }
//        };
//    }
//}
