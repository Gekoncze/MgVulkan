package cz.mg.vulkan.jna.types;

import com.sun.jna.IntegerType;


public class VkSampleMask extends IntegerType {
    private static final int SIZE = 4;

    public VkSampleMask() {
        this(0);
    }

    public VkSampleMask(int value) {
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
