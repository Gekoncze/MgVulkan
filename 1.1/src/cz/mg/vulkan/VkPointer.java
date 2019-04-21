package cz.mg.vulkan;

public class VkPointer extends VkObject {
    public static final long NULL = 0;

    public VkPointer() {
        super(sizeof());
    }

    public VkPointer(long value) {
        super(sizeof());
        setValue(value);
    }

    public VkPointer(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPointer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public long getValue() {
        return getValue(getVkAddress());
    }

    public void setValue(long value) {
        setValue(getVkAddress(), value);
    }

    public static native long sizeof();
    private static native long getValue(long vkaddress);
    private static native void setValue(long vkaddress, long value);
    public static native long getNullAddress();
    public static native long getSinkAddress();

    @Override
    public String toString() {
        return "0x" + Long.toHexString(getValue());
    }

    public static class Array extends VkPointer implements cz.mg.collections.array.ReadonlyArray<VkPointer> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPointer.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPointer o){
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
        public VkPointer get(int i){
            return new VkPointer(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
