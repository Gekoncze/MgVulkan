package cz.mg.vulkan.jna.types;

import com.sun.jna.IntegerType;
import com.sun.jna.Native;


public class size_t extends IntegerType {
    public size_t() {
        this(0);
    }

    public size_t(long value) {
        super(Native.SIZE_T_SIZE, value);
    }

    public static class ByReference extends com.sun.jna.ptr.ByReference {
        public ByReference() {
            this(0);
        }

        public ByReference(long value) {
            super(Native.SIZE_T_SIZE);
            setValue(value);
        }

        public void setValue(long value) {
            this.getPointer().setLong(0, value);
        }

        public long getValue() {
            return this.getPointer().getLong(0);
        }
    }
}
