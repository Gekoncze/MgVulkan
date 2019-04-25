package cz.mg.vulkan;

public class VkSparseImageMemoryRequirements2KHR extends VkObject {
    public VkSparseImageMemoryRequirements2KHR() {
        super(sizeof());
    }

    protected VkSparseImageMemoryRequirements2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSparseImageMemoryRequirements2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSparseImageMemoryRequirements2KHR(VkPointer pointer) {
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


    public static native long sizeof();

    public static class Array extends VkSparseImageMemoryRequirements2KHR implements cz.mg.collections.array.ReadonlyArray<VkSparseImageMemoryRequirements2KHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSparseImageMemoryRequirements2KHR.sizeof()));
            this.count = count;
        }

        public Array(VkSparseImageMemoryRequirements2KHR o, int count){
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
        public VkSparseImageMemoryRequirements2KHR get(int i){
            return new VkSparseImageMemoryRequirements2KHR(getVkMemory(), address(i));
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
