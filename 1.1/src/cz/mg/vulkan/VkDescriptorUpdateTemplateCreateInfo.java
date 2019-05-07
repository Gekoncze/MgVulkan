package cz.mg.vulkan;

public class VkDescriptorUpdateTemplateCreateInfo extends VkObject {
    public VkDescriptorUpdateTemplateCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO));
    }

    public VkDescriptorUpdateTemplateCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDescriptorUpdateTemplateCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDescriptorUpdateTemplateCreateInfo(VkPointer pointer) {
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

    public VkDescriptorUpdateTemplateCreateFlags getFlags() {
        return new VkDescriptorUpdateTemplateCreateFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkDescriptorUpdateTemplateCreateFlags flags) {
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

    public VkDescriptorUpdateTemplateEntry getPDescriptorUpdateEntries() {
        return new VkDescriptorUpdateTemplateEntry(getVkMemory(), getPDescriptorUpdateEntriesNative(getVkAddress()));
    }

    private VkObject pDescriptorUpdateEntries = null;
    public void setPDescriptorUpdateEntries(VkDescriptorUpdateTemplateEntry pDescriptorUpdateEntries) {
        setPDescriptorUpdateEntriesNative(getVkAddress(), pDescriptorUpdateEntries != null ? pDescriptorUpdateEntries.getVkAddress() : VkPointer.NULL);
        this.pDescriptorUpdateEntries = pDescriptorUpdateEntries;
    }

    public VkDescriptorUpdateTemplateEntry.Array getPDescriptorUpdateEntriesQ() {
        return new VkDescriptorUpdateTemplateEntry.Array(getPDescriptorUpdateEntries(), getDescriptorUpdateEntryCountQ());
    }

    protected static native long getPDescriptorUpdateEntriesNative(long address);
    protected static native void setPDescriptorUpdateEntriesNative(long address, long pDescriptorUpdateEntries);

    public VkDescriptorUpdateTemplateType getTemplateType() {
        return new VkDescriptorUpdateTemplateType(getVkMemory(), getTemplateTypeNative(getVkAddress()));
    }

    
    public void setTemplateType(VkDescriptorUpdateTemplateType templateType) {
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


    public void set(VkDescriptorUpdateTemplateCreateInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkDescriptorUpdateTemplateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkDescriptorUpdateTemplateCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorUpdateTemplateCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO));;
        }

        public Array(VkDescriptorUpdateTemplateCreateInfo o, int count){
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
        public VkDescriptorUpdateTemplateCreateInfo get(int i){
            return new VkDescriptorUpdateTemplateCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
