package cz.mg.vulkan;

public class VkInt32 extends VkObject {
    public VkInt32() {
        super(sizeof());
    }

    public VkInt32(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkInt32(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkInt32(int value) {
        super(sizeof());
        setValue(value);
    }

    public int getValue(){
        return getValueNative(getVkAddress());
    }

    public void setValue(int value){
        setValueNative(getVkAddress(), value);
    }

    public static native long sizeof();
    protected static native int getValueNative(long vkaddress);
    protected static native void setValueNative(long vkaddress, int value);

    @Override
    public String toString() {
        return "" + getValue();
    }

    public static class Array extends VkInt32 implements cz.mg.collections.array.ReadonlyArray<VkInt32> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkInt32.sizeof()));
            this.count = count;
        }

        public Array(int count, VkInt32 o){
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

        public Array(int... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
        }

        public int getValueAt(int i){
            return getValueNative(addressAt(i));
        }

        public void setValueAt(int i, int value){
            setValueNative(addressAt(i), value);
        }



        @Override
        public int count(){
            return count;
        }

        @Override
        public VkInt32 get(int i){
            return new VkInt32(getVkMemory(), addressAt(i));
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

        public static class Array extends VkInt32.Pointer implements cz.mg.collections.array.ReadonlyArray<VkInt32.Pointer> {
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

            public Array(VkInt32[] a) {
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
            public VkInt32.Pointer get(int i){
                return new VkInt32.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
