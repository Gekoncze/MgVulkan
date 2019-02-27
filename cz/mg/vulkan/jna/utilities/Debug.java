package cz.mg.vulkan.jna.utilities;

import com.sun.jna.Pointer;


public class Debug {
    public static void checkPointer(Pointer pointer, int size){
        if(pointer == null) throw new NullPointerException();
        for(int i = 0; i < size; i++){
            pointer.getByte(i);
        }
    }

    public static String dumpPointer(Pointer pointer, int size){
        String header = pointer == null ? "null" : "" + Pointer.nativeValue(pointer);
        if(pointer == null) return header + " : ?";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i++){
            sb.append(ToString.byteToHexString(pointer.getByte(i)));
            if(i != size - 1) sb.append(" ");
        }
        return header + " : " + sb.toString();
    }
}
