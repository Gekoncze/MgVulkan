package cz.mg.vulkan.jna.arrays;

import com.sun.jna.Pointer;


public class StringArray {
    private final com.sun.jna.StringArray array;
    private final int count;

    public StringArray(String[] strings) {
        this.array = new com.sun.jna.StringArray(strings);
        this.count = strings.length;
    }

    public Pointer getPointer(){
        return array;
    }

    public int count(){
        return count;
    }
}
