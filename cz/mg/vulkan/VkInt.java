package cz.mg.vulkan;

public class VkInt extends VkObject {
    public VkInt() {
        super(sizeof());
    }

    public VkInt(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkInt(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkInt(int value) {
        super(sizeof());
        setValue(value);
    }

    public int getValue(){
        return getValue(getVkAddress());
    }

    public void setValue(int value){
        setValue(getVkAddress(), value);
    }

    public static native long sizeof();
    protected static native int getValue(long vkaddress);
    protected static native void setValue(long vkaddress, int value);

    @Override
    public String toString() {
        return "" + getValue();
    }

    public static class Array extends VkInt implements cz.mg.collections.array.ReadonlyArray<VkInt> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkInt.sizeof()));
            this.count = count;
        }

        public Array(int count, VkInt o){
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
            for(int i = 0; i < values.length; i++) get(i).setValue(values[i]);
        }



        @Override
        public int count(){
            return count;
        }

        @Override
        public VkInt get(int i){
            return new VkInt(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkInt.Pointer implements cz.mg.collections.array.ReadonlyArray<VkInt.Pointer> {
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

            public Array(VkInt[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkInt.Pointer get(int i){
                return new VkInt.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
