package cz.mg.vulkan;

public class VkMemoryDedicatedRequirements extends VkObject {
    public VkMemoryDedicatedRequirements() {
        super(sizeof());
    }

    protected VkMemoryDedicatedRequirements(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkMemoryDedicatedRequirements(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkMemoryDedicatedRequirements(VkPointer pointer) {
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

    public VkBool32 getPrefersDedicatedAllocation() {
        return new VkBool32(getVkMemory(), getPrefersDedicatedAllocationNative(getVkAddress()));
    }

    
    public void setPrefersDedicatedAllocation(VkBool32 prefersDedicatedAllocation) {
        setPrefersDedicatedAllocationNative(getVkAddress(), prefersDedicatedAllocation != null ? prefersDedicatedAllocation.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPrefersDedicatedAllocationQ() {
        return getPrefersDedicatedAllocation().getValue();
    }

    public void setPrefersDedicatedAllocation(int prefersDedicatedAllocation) {
        getPrefersDedicatedAllocation().setValue(prefersDedicatedAllocation);
    }

    protected static native long getPrefersDedicatedAllocationNative(long address);
    protected static native void setPrefersDedicatedAllocationNative(long address, long prefersDedicatedAllocation);

    public VkBool32 getRequiresDedicatedAllocation() {
        return new VkBool32(getVkMemory(), getRequiresDedicatedAllocationNative(getVkAddress()));
    }

    
    public void setRequiresDedicatedAllocation(VkBool32 requiresDedicatedAllocation) {
        setRequiresDedicatedAllocationNative(getVkAddress(), requiresDedicatedAllocation != null ? requiresDedicatedAllocation.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getRequiresDedicatedAllocationQ() {
        return getRequiresDedicatedAllocation().getValue();
    }

    public void setRequiresDedicatedAllocation(int requiresDedicatedAllocation) {
        getRequiresDedicatedAllocation().setValue(requiresDedicatedAllocation);
    }

    protected static native long getRequiresDedicatedAllocationNative(long address);
    protected static native void setRequiresDedicatedAllocationNative(long address, long requiresDedicatedAllocation);


    public static native long sizeof();

    public static class Array extends VkMemoryDedicatedRequirements implements cz.mg.collections.array.ReadonlyArray<VkMemoryDedicatedRequirements> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkMemoryDedicatedRequirements.sizeof()));
            this.count = count;
        }

        public Array(VkMemoryDedicatedRequirements o, int count){
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
        public VkMemoryDedicatedRequirements get(int i){
            return new VkMemoryDedicatedRequirements(getVkMemory(), address(i));
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
