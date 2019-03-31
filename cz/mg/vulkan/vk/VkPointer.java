package cz.mg.vulkan.vk;

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
        super(sizeof(), vkmemory);
    }

    public VkPointer(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
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

    @Override
    public String toString() {
        return "0x" + Long.toHexString(getValue());
    }

    public static class Array extends VkPointer implements cz.mg.collections.array.ReadonlyArray<VkPointer> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*sizeof()));
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
