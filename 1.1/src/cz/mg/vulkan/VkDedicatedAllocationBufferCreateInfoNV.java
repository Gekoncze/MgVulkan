package cz.mg.vulkan;

public class VkDedicatedAllocationBufferCreateInfoNV extends VkObject {
    public VkDedicatedAllocationBufferCreateInfoNV() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_BUFFER_CREATE_INFO_NV));
    }

    public VkDedicatedAllocationBufferCreateInfoNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDedicatedAllocationBufferCreateInfoNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDedicatedAllocationBufferCreateInfoNV(VkPointer pointer) {
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

    public VkBool32 getDedicatedAllocation() {
        return new VkBool32(getVkMemory(), getDedicatedAllocationNative(getVkAddress()));
    }

    
    public void setDedicatedAllocation(VkBool32 dedicatedAllocation) {
        setDedicatedAllocationNative(getVkAddress(), dedicatedAllocation != null ? dedicatedAllocation.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDedicatedAllocationQ() {
        return getDedicatedAllocation().getValue();
    }

    public void setDedicatedAllocation(int dedicatedAllocation) {
        getDedicatedAllocation().setValue(dedicatedAllocation);
    }

    protected static native long getDedicatedAllocationNative(long address);
    protected static native void setDedicatedAllocationNative(long address, long dedicatedAllocation);


    public void set(VkDedicatedAllocationBufferCreateInfoNV o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkDedicatedAllocationBufferCreateInfoNV implements cz.mg.collections.array.ReadonlyArray<VkDedicatedAllocationBufferCreateInfoNV> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDedicatedAllocationBufferCreateInfoNV.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_BUFFER_CREATE_INFO_NV));;
        }

        public Array(int count, VkDedicatedAllocationBufferCreateInfoNV o){
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
        public VkDedicatedAllocationBufferCreateInfoNV get(int i){
            return new VkDedicatedAllocationBufferCreateInfoNV(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
