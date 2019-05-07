package cz.mg.vulkan;

public class VkDescriptorSetVariableDescriptorCountAllocateInfoEXT extends VkObject {
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO_EXT));
    }

    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(VkPointer pointer) {
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

    public VkUInt32 getDescriptorSetCount() {
        return new VkUInt32(getVkMemory(), getDescriptorSetCountNative(getVkAddress()));
    }

    
    public void setDescriptorSetCount(VkUInt32 descriptorSetCount) {
        setDescriptorSetCountNative(getVkAddress(), descriptorSetCount != null ? descriptorSetCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDescriptorSetCountQ() {
        return getDescriptorSetCount().getValue();
    }

    public void setDescriptorSetCount(int descriptorSetCount) {
        getDescriptorSetCount().setValue(descriptorSetCount);
    }

    protected static native long getDescriptorSetCountNative(long address);
    protected static native void setDescriptorSetCountNative(long address, long descriptorSetCount);

    public VkUInt32 getPDescriptorCounts() {
        return new VkUInt32(getVkMemory(), getPDescriptorCountsNative(getVkAddress()));
    }

    private VkObject pDescriptorCounts = null;
    public void setPDescriptorCounts(VkUInt32 pDescriptorCounts) {
        setPDescriptorCountsNative(getVkAddress(), pDescriptorCounts != null ? pDescriptorCounts.getVkAddress() : VkPointer.NULL);
        this.pDescriptorCounts = pDescriptorCounts;
    }

    public VkUInt32.Array getPDescriptorCountsQ() {
        return new VkUInt32.Array(getPDescriptorCounts(), getDescriptorSetCountQ());
    }

    protected static native long getPDescriptorCountsNative(long address);
    protected static native void setPDescriptorCountsNative(long address, long pDescriptorCounts);


    public void set(VkDescriptorSetVariableDescriptorCountAllocateInfoEXT o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkDescriptorSetVariableDescriptorCountAllocateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkDescriptorSetVariableDescriptorCountAllocateInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO_EXT));;
        }

        public Array(VkDescriptorSetVariableDescriptorCountAllocateInfoEXT o, int count){
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
        public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT get(int i){
            return new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
