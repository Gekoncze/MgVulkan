package cz.mg.vulkan.jna.types;

import com.sun.jna.IntegerType;


public class uint64_t extends IntegerType {
    private static final int SIZE = 8;

    public uint64_t() {
        this(0);
    }

    public uint64_t(long value) {
        super(SIZE, value);
    }

    public static class ByReference extends com.sun.jna.ptr.ByReference {
        public ByReference() {
            this(0);
        }

        public ByReference(long value) {
            super(SIZE);
            setValue(value);
        }

        public void setValue(long value) {
            this.getPointer().setLong(0, value);
        }

        public long getValue() {
            return this.getPointer().getInt(0);
        }
    }
}
