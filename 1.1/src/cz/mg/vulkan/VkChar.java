package cz.mg.vulkan;

public class VkChar extends VkObject {
    public VkChar() {
        super(sizeof());
    }

    public VkChar(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkChar(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkChar(byte value) {
        super(sizeof());
        setValue(value);
    }

    public byte getValue(){
        return getValueNative(getVkAddress());
    }

    public void setValue(byte value){
        setValueNative(getVkAddress(), value);
    }

    public static native long sizeof();
    protected static native byte getValueNative(long vkaddress);
    protected static native void setValueNative(long vkaddress, byte value);

    @Override
    public String toString() {
        return "" + getValue();
    }

    public static class Array extends VkChar implements cz.mg.collections.array.ReadonlyArray<VkChar> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkChar.sizeof()));
            this.count = count;
        }

        public Array(int count, VkChar o){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        public Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }

        public Array(byte... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
        }

        public byte getValueAt(int i){
            return getValueNative(addressAt(i));
        }

        public void setValueAt(int i, byte value){
            setValueNative(addressAt(i), value);
        }



        @Override
        public int count(){
            return count;
        }

        @Override
        public VkChar get(int i){
            return new VkChar(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }
    }

    public static class Pointer extends VkObject.Pointer {
        public Pointer() {
        }

        public Pointer(long value) {
            setValue(value);
        }

        public Pointer(VkMemory vkmemory) {
            super(vkmemory);
        }

        public Pointer(VkMemory vkmemory, long vkaddress) {
            super(vkmemory, vkaddress);
        }

        public static class Array extends VkChar.Pointer implements cz.mg.collections.array.ReadonlyArray<VkChar.Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*VkPointer.sizeof()));
                this.count = count;
            }

            public Array(VkMemory vkmemory, int count) {
                super(vkmemory);
                this.count = count;
            }

            public Array(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress);
                this.count = count;
            }

            public Array(VkChar[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            public Array(long... values){
                this(values.length);
                for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
            }

            public long getValueAt(int i){
                return getValueNative(addressAt(i));
            }

            public void setValueAt(int i, long value){
                setValueNative(addressAt(i), value);
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkChar.Pointer get(int i){
                return new VkChar.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
