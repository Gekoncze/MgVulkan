package cz.mg.vulkan;

public class VkSparseImageMemoryRequirements2 extends VkObject {
    public VkSparseImageMemoryRequirements2() {
        super(sizeof());
    }

    protected VkSparseImageMemoryRequirements2(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSparseImageMemoryRequirements2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSparseImageMemoryRequirements2(VkPointer pointer) {
        super(pointer);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSTypeNative(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSTypeNative(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSTypeNative(long address);
    protected static native void setSTypeNative(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNextNative(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNextNative(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNextNative(long address);
    protected static native void setPNextNative(long address, long pNext);

    public VkSparseImageMemoryRequirements getMemoryRequirements() {
        return new VkSparseImageMemoryRequirements(getVkMemory(), getMemoryRequirementsNative(getVkAddress()));
    }

    
    public void setMemoryRequirements(VkSparseImageMemoryRequirements memoryRequirements) {
        setMemoryRequirementsNative(getVkAddress(), memoryRequirements != null ? memoryRequirements.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getMemoryRequirementsNative(long address);
    protected static native void setMemoryRequirementsNative(long address, long memoryRequirements);


    public void set(VkSparseImageMemoryRequirements2 o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkSparseImageMemoryRequirements2 implements cz.mg.collections.array.ReadonlyArray<VkSparseImageMemoryRequirements2> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSparseImageMemoryRequirements2.sizeof()));
            this.count = count;
        }

        public Array(VkSparseImageMemoryRequirements2 o, int count){
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
        public VkSparseImageMemoryRequirements2 get(int i){
            return new VkSparseImageMemoryRequirements2(getVkMemory(), address(i));
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
