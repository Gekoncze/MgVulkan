package cz.mg.vulkan;

public class VkInt8 extends VkObject {
    public VkInt8() {
        super(sizeof());
    }

    public VkInt8(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkInt8(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkInt8(byte value) {
        super(sizeof());
        setValue(value);
    }

    public byte getValue(){
        return getValue(getVkAddress());
    }

    public void setValue(byte value){
        setValue(getVkAddress(), value);
    }

    public static native long sizeof();
    protected static native byte getValue(long vkaddress);
    protected static native void setValue(long vkaddress, byte value);

    @Override
    public String toString() {
        return "" + getValue();
    }

    public static class Array extends VkInt8 implements cz.mg.collections.array.ReadonlyArray<VkInt8> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkInt8.sizeof()));
            this.count = count;
        }

        public Array(int count, VkInt8 o){
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
            for(int i = 0; i < values.length; i++) get(i).setValue(values[i]);
        }



        @Override
        public int count(){
            return count;
        }

        @Override
        public VkInt8 get(int i){
            return new VkInt8(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkInt8.Pointer implements cz.mg.collections.array.ReadonlyArray<VkInt8.Pointer> {
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

            public Array(VkInt8[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkInt8.Pointer get(int i){
                return new VkInt8.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
