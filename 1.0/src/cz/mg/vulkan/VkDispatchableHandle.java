package cz.mg.vulkan;

public class VkDispatchableHandle extends VkHandle {
    public VkDispatchableHandle() {
        super(sizeof());
    }

    public VkDispatchableHandle(long value) {
        super(sizeof());
        setValue(value);
    }

    public VkDispatchableHandle(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDispatchableHandle(VkMemory vkmemory, long vkaddress) {
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

    public static class Array extends VkDispatchableHandle implements cz.mg.collections.array.ReadonlyArray<VkDispatchableHandle> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDispatchableHandle.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDispatchableHandle o){
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
        public VkDispatchableHandle get(int i){
            return new VkDispatchableHandle(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }
    }
}
