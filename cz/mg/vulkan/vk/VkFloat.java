package cz.mg.vulkan.vk;

public class VkFloat extends VkObject {
    public VkFloat() {
        super(sizeof());
    }

    public VkFloat(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkFloat(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkFloat(float value) {
        super(sizeof());
        setValue(value);
    }

    public float getValue(){
        return getValue(getVkAddress());
    }

    public void setValue(float value){
        setValue(getVkAddress(), value);
    }

    public static native long sizeof();
    protected static native float getValue(long vkaddress);
    protected static native void setValue(long vkaddress, float value);

    @Override
    public String toString() {
        return "" + getValue();
    }

    public static class Array extends VkFloat implements cz.mg.collections.array.ReadonlyArray<VkFloat> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkFloat.sizeof()));
            this.count = count;
        }

        public Array(int count, VkFloat o){
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

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkFloat get(int i){
            return new VkFloat(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkFloat.Pointer implements cz.mg.collections.array.ReadonlyArray<VkFloat.Pointer> {
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

            public Array(VkFloat[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkFloat.Pointer get(int i){
                return new VkFloat.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
