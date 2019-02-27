package cz.mg.vulkan.jna.types;

import com.sun.jna.IntegerType;


public class VkBool32 extends IntegerType {
    private static final int SIZE = 4;

    public VkBool32() {
        this(0);
    }

    public VkBool32(int value) {
        super(SIZE, value);
    }

    public static class ByReference extends com.sun.jna.ptr.ByReference {
        public ByReference() {
            this(0);
        }

        public ByReference(int value) {
            super(SIZE);
            setValue(value);
        }

        public void setValue(int value) {
            this.getPointer().setInt(0, value);
        }

        public int getValue() {
            return this.getPointer().getInt(0);
        }
    }
}
