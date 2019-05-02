package cz.mg.vulkan;

public class VkNonDispatchableHandle extends VkHandle {
    public VkNonDispatchableHandle() {
        super(sizeof());
    }

    protected VkNonDispatchableHandle(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkNonDispatchableHandle(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkNonDispatchableHandle(VkPointer pointer) {
        super(pointer);
    }

    public VkNonDispatchableHandle(long value) {
        super(sizeof());
        setValue(value);
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
        return "0x" + Long.toHexString(getValue());
    }

    public static class Array extends VkNonDispatchableHandle implements cz.mg.collections.array.ReadonlyArray<VkNonDispatchableHandle> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkNonDispatchableHandle.sizeof()));
            this.count = count;
        }

        public Array(VkNonDispatchableHandle o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkNonDispatchableHandle get(int i){
            return new VkNonDispatchableHandle(getVkMemory(), address(i));
        }

        protected long address(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
