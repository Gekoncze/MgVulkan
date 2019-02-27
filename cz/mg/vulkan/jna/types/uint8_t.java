package cz.mg.vulkan.jna.types;

import com.sun.jna.IntegerType;


public class uint8_t extends IntegerType {
    private static final int SIZE = 4;

    public uint8_t() {
        this((byte) 0);
    }

    public uint8_t(byte value) {
        super(SIZE, value);
    }

    public static class ByReference extends com.sun.jna.ptr.ByReference {
        public ByReference() {
            this((byte) 0);
        }

        public ByReference(byte value) {
            super(SIZE);
            setValue(value);
        }

        public void setValue(byte value) {
            this.getPointer().setByte(0, value);
        }

        public byte getValue() {
            return this.getPointer().getByte(0);
        }
    }
}
