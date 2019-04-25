package cz.mg.vulkan;

public class VkDouble extends VkObject {
    public VkDouble() {
        super(sizeof());
    }

    public VkDouble(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDouble(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkDouble(double value) {
        super(sizeof());
        setValue(value);
    }

    public double getValue(){
        return getValueNative(getVkAddress());
    }

    public void setValue(double value){
        setValueNative(getVkAddress(), value);
    }

    public static native long sizeof();
    protected static native double getValueNative(long vkaddress);
    protected static native void setValueNative(long vkaddress, double value);

    @Override
    public String toString() {
        return "" + getValue();
    }

    public static class Array extends VkDouble implements cz.mg.collections.array.ReadonlyArray<VkDouble> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDouble.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDouble o){
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

        public Array(double... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
        }

        public double getValueAt(int i){
            return getValueNative(addressAt(i));
        }

        public void setValueAt(int i, double value){
            setValueNative(addressAt(i), value);
        }



        @Override
        public int count(){
            return count;
        }

        @Override
        public VkDouble get(int i){
            return new VkDouble(getVkMemory(), addressAt(i));
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

        public static class Array extends VkDouble.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDouble.Pointer> {
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

            public Array(VkDouble[] a) {
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
            public VkDouble.Pointer get(int i){
                return new VkDouble.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
