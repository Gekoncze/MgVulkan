package cz.mg.vulkan.vk;

public class VkNonDispatchableHandle extends VkHandle {
    public VkNonDispatchableHandle() {
        super(sizeof());
    }

    public VkNonDispatchableHandle(long value) {
        super(sizeof());
        setValue(value);
    }

    public VkNonDispatchableHandle(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkNonDispatchableHandle(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    @Override
    public long getValue(){
        return (long) getValue(getVkAddress());
    }

    @Override
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

    public static class Array extends VkNonDispatchableHandle implements cz.mg.collections.array.ReadonlyArray<VkNonDispatchableHandle> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkNonDispatchableHandle.sizeof()));
            this.count = count;
        }

        public Array(int count, VkNonDispatchableHandle o){
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
        public VkNonDispatchableHandle get(int i){
            return new VkNonDispatchableHandle(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
