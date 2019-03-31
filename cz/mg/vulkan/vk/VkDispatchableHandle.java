package cz.mg.vulkan.vk;

public class VkDispatchableHandle extends VkObject {
    public VkDispatchableHandle() {
        super(sizeof());
    }

    public VkDispatchableHandle(long value) {
        super(sizeof());
        setValue(value);
    }

    public VkDispatchableHandle(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkDispatchableHandle(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }

    public long getValue(){
        return (long) getValue(getVkAddress());
    }

    public void setValue(long value){
        setValue(getVkAddress(), value);
    }

    public static native long sizeof();
    private static native long getValue(long vkaddress);
    private static native void setValue(long vkaddress, long value);

    @Override
    public String toString() {
        return "" + getValue();
    }

    public static class Array extends VkDispatchableHandle implements cz.mg.collections.array.ReadonlyArray<VkDispatchableHandle> {
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
        public VkDispatchableHandle get(int i){
            return new VkDispatchableHandle(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
