package cz.mg.vulkan;

public class VkDispatchableHandle extends VkHandle {
    public VkDispatchableHandle() {
        super(sizeof());
    }

    protected VkDispatchableHandle(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDispatchableHandle(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDispatchableHandle(VkPointer pointer) {
        super(pointer);
    }

    public VkDispatchableHandle(long value) {
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
        return "" + getValue();
    }

    public static class Array extends VkDispatchableHandle implements cz.mg.collections.array.ReadonlyArray<VkDispatchableHandle> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDispatchableHandle.sizeof()));
            this.count = count;
        }

        public Array(VkDispatchableHandle o, int count){
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
        public VkDispatchableHandle get(int i){
            return new VkDispatchableHandle(getVkMemory(), address(i));
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
