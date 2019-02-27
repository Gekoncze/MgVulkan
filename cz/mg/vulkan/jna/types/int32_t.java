package cz.mg.vulkan.jna.types;

import com.sun.jna.IntegerType;


public class int32_t extends IntegerType {
    private static final int SIZE = 4;

    public int32_t() {
        this(0);
    }

    public int32_t(int value) {
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
