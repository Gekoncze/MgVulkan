package cz.mg.vulkan;

public class VkDescriptorSetAllocateInfo extends VkObject {
    public VkDescriptorSetAllocateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO));
    }

    public VkDescriptorSetAllocateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorSetAllocateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDescriptorSetAllocateInfo(VkPointer pointer) {
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

    public VkDescriptorPool getDescriptorPool() {
        return new VkDescriptorPool(getVkMemory(), getDescriptorPoolNative(getVkAddress()));
    }

    
    public void setDescriptorPool(VkDescriptorPool descriptorPool) {
        setDescriptorPoolNative(getVkAddress(), descriptorPool != null ? descriptorPool.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getDescriptorPoolNative(long address);
    protected static native void setDescriptorPoolNative(long address, long descriptorPool);

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

    public VkDescriptorSetLayout getPSetLayouts() {
        return new VkDescriptorSetLayout(getVkMemory(), getPSetLayoutsNative(getVkAddress()));
    }

    private VkObject pSetLayouts = null;
    public void setPSetLayouts(VkDescriptorSetLayout pSetLayouts) {
        setPSetLayoutsNative(getVkAddress(), pSetLayouts != null ? pSetLayouts.getVkAddress() : VkPointer.NULL);
        this.pSetLayouts = pSetLayouts;
    }

    public VkDescriptorSetLayout.Array getPSetLayoutsQ() {
        return new VkDescriptorSetLayout.Array(getPSetLayouts(), getDescriptorSetCountQ());
    }

    protected static native long getPSetLayoutsNative(long address);
    protected static native void setPSetLayoutsNative(long address, long pSetLayouts);


    public void set(VkDescriptorSetAllocateInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkDescriptorSetAllocateInfo implements cz.mg.collections.array.ReadonlyArray<VkDescriptorSetAllocateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorSetAllocateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO));;
        }

        public Array(VkDescriptorSetAllocateInfo o, int count){
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
        public VkDescriptorSetAllocateInfo get(int i){
            return new VkDescriptorSetAllocateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
