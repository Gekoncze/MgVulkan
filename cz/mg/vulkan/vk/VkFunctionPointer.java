package cz.mg.vulkan.vk;

public class VkFunctionPointer extends VkObject {
    public static final long NULL = 0;

    public VkFunctionPointer() {
        super(sizeof());
    }

    public VkFunctionPointer(long value) {
        super(sizeof());
        setValue(value);
    }

    public VkFunctionPointer(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkFunctionPointer(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }

    public VkFunctionPointer(VkInstance instance, VkString name) {
        super(sizeof());
        load(getVkAddress(), instance == null ? VkInstance.NULL.getVkAddress() : instance.getVkAddress(), name.getVkAddress());
        if(getValue() == NULL) throw new RuntimeException("Could not load vulkan function " + name.getString());
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
    private static native void load(long vkaddress, long instance, long string);

    @Override
    public String toString() {
        return "0x" + Long.toHexString(getValue());
    }

    public static class Array extends VkFunctionPointer implements cz.mg.collections.array.ReadonlyArray<VkFunctionPointer> {
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
        public VkFunctionPointer get(int i){
            return new VkFunctionPointer(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
