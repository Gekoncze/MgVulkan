package cz.mg.vulkan;

public class VkDescriptorUpdateTemplateCreateInfoKHR extends VkObject {
    public VkDescriptorUpdateTemplateCreateInfoKHR() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO_KHR));
    }

    public VkDescriptorUpdateTemplateCreateInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorUpdateTemplateCreateInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDescriptorUpdateTemplateCreateInfoKHR(VkPointer pointer) {
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

    public VkDescriptorUpdateTemplateCreateFlagsKHR getFlags() {
        return new VkDescriptorUpdateTemplateCreateFlagsKHR(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkDescriptorUpdateTemplateCreateFlagsKHR flags) {
        setFlagsNative(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlagsNative(long address);
    protected static native void setFlagsNative(long address, long flags);

    public VkUInt32 getDescriptorUpdateEntryCount() {
        return new VkUInt32(getVkMemory(), getDescriptorUpdateEntryCountNative(getVkAddress()));
    }

    
    public void setDescriptorUpdateEntryCount(VkUInt32 descriptorUpdateEntryCount) {
        setDescriptorUpdateEntryCountNative(getVkAddress(), descriptorUpdateEntryCount != null ? descriptorUpdateEntryCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDescriptorUpdateEntryCountQ() {
        return getDescriptorUpdateEntryCount().getValue();
    }

    public void setDescriptorUpdateEntryCount(int descriptorUpdateEntryCount) {
        getDescriptorUpdateEntryCount().setValue(descriptorUpdateEntryCount);
    }

    protected static native long getDescriptorUpdateEntryCountNative(long address);
    protected static native void setDescriptorUpdateEntryCountNative(long address, long descriptorUpdateEntryCount);

    public VkDescriptorUpdateTemplateEntryKHR getPDescriptorUpdateEntries() {
        return new VkDescriptorUpdateTemplateEntryKHR(getVkMemory(), getPDescriptorUpdateEntriesNative(getVkAddress()));
    }

    private VkObject pDescriptorUpdateEntries = null;
    public void setPDescriptorUpdateEntries(VkDescriptorUpdateTemplateEntryKHR pDescriptorUpdateEntries) {
        setPDescriptorUpdateEntriesNative(getVkAddress(), pDescriptorUpdateEntries != null ? pDescriptorUpdateEntries.getVkAddress() : VkPointer.NULL);
        this.pDescriptorUpdateEntries = pDescriptorUpdateEntries;
    }

    protected static native long getPDescriptorUpdateEntriesNative(long address);
    protected static native void setPDescriptorUpdateEntriesNative(long address, long pDescriptorUpdateEntries);

    public VkDescriptorUpdateTemplateTypeKHR getTemplateType() {
        return new VkDescriptorUpdateTemplateTypeKHR(getVkMemory(), getTemplateTypeNative(getVkAddress()));
    }

    
    public void setTemplateType(VkDescriptorUpdateTemplateTypeKHR templateType) {
        setTemplateTypeNative(getVkAddress(), templateType != null ? templateType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getTemplateTypeQ() {
        return getTemplateType().getValue();
    }

    public void setTemplateType(int templateType) {
        getTemplateType().setValue(templateType);
    }

    protected static native long getTemplateTypeNative(long address);
    protected static native void setTemplateTypeNative(long address, long templateType);

    public VkDescriptorSetLayout getDescriptorSetLayout() {
        return new VkDescriptorSetLayout(getVkMemory(), getDescriptorSetLayoutNative(getVkAddress()));
    }

    
    public void setDescriptorSetLayout(VkDescriptorSetLayout descriptorSetLayout) {
        setDescriptorSetLayoutNative(getVkAddress(), descriptorSetLayout != null ? descriptorSetLayout.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getDescriptorSetLayoutNative(long address);
    protected static native void setDescriptorSetLayoutNative(long address, long descriptorSetLayout);

    public VkPipelineBindPoint getPipelineBindPoint() {
        return new VkPipelineBindPoint(getVkMemory(), getPipelineBindPointNative(getVkAddress()));
    }

    
    public void setPipelineBindPoint(VkPipelineBindPoint pipelineBindPoint) {
        setPipelineBindPointNative(getVkAddress(), pipelineBindPoint != null ? pipelineBindPoint.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPipelineBindPointQ() {
        return getPipelineBindPoint().getValue();
    }

    public void setPipelineBindPoint(int pipelineBindPoint) {
        getPipelineBindPoint().setValue(pipelineBindPoint);
    }

    protected static native long getPipelineBindPointNative(long address);
    protected static native void setPipelineBindPointNative(long address, long pipelineBindPoint);

    public VkPipelineLayout getPipelineLayout() {
        return new VkPipelineLayout(getVkMemory(), getPipelineLayoutNative(getVkAddress()));
    }

    
    public void setPipelineLayout(VkPipelineLayout pipelineLayout) {
        setPipelineLayoutNative(getVkAddress(), pipelineLayout != null ? pipelineLayout.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getPipelineLayoutNative(long address);
    protected static native void setPipelineLayoutNative(long address, long pipelineLayout);

    public VkUInt32 getSet() {
        return new VkUInt32(getVkMemory(), getSetNative(getVkAddress()));
    }

    
    public void setSet(VkUInt32 set) {
        setSetNative(getVkAddress(), set != null ? set.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSetQ() {
        return getSet().getValue();
    }

    public void setSet(int set) {
        getSet().setValue(set);
    }

    protected static native long getSetNative(long address);
    protected static native void setSetNative(long address, long set);


    public static native long sizeof();

    public static class Array extends VkDescriptorUpdateTemplateCreateInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkDescriptorUpdateTemplateCreateInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorUpdateTemplateCreateInfoKHR.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO_KHR));;
        }

        public Array(int count, VkDescriptorUpdateTemplateCreateInfoKHR o){
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
        public VkDescriptorUpdateTemplateCreateInfoKHR get(int i){
            return new VkDescriptorUpdateTemplateCreateInfoKHR(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
