//package cz.mg.vulkan.jna.arrays;
//
//import com.sun.jna.Native;
//import com.sun.jna.Pointer;
//import java.nio.ByteBuffer;
//import java.util.Iterator;
//
//
//public class CharArray implements Iterable<Character> {
//    private final int count;
//    private final int size;
//    private final ByteBuffer buffer;
//    private final Pointer ptr;
//
//    public CharArray(int count) {
//        this.count = count;
//        this.size = 1;
//        this.buffer = ByteBuffer.allocateDirect(count * size);
//        this.ptr = Native.getDirectBufferPointer(buffer);
//    }
//
//    public CharArray(String s) {
//        this.count = s.length();
//        this.size = 1;
//        this.buffer = ByteBuffer.allocateDirect(count * size);
//        this.ptr = Native.getDirectBufferPointer(buffer);
//        for(int i = 0; i < count; i++) set(i, s.charAt(i));
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
//    public char get(int i){
//        if(i < 0 || i >= count) throw new ArrayIndexOutOfBoundsException("" + i + " out of " + count);
//        int offset = i*size;
//        return (char) ptr.getByte(offset);
//    }
//
//    public void set(int i, char ch){
//        if(i < 0 || i >= count) throw new ArrayIndexOutOfBoundsException("" + i + " out of " + count);
//        int offset = i*size;
//        ptr.setByte(offset, (byte)ch);
//    }
//
//    @Override
//    public Iterator<Character> iterator() {
//        return new Iterator<Character>() {
//            private int i = 0;
//
//            @Override
//            public boolean hasNext() {
//                return i < count;
//            }
//
//            @Override
//            public Character next() {
//                return get(i++);
//            }
//        };
//    }
//}
