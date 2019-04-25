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



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSType(long address);
    protected static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNext(long address);
    protected static native void setPNext(long address, long pNext);

    public VkDescriptorUpdateTemplateCreateFlagsKHR getFlags() {
        return new VkDescriptorUpdateTemplateCreateFlagsKHR(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkDescriptorUpdateTemplateCreateFlagsKHR flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlags(long address);
    protected static native void setFlags(long address, long flags);

    public VkUInt32 getDescriptorUpdateEntryCount() {
        return new VkUInt32(getVkMemory(), getDescriptorUpdateEntryCount(getVkAddress()));
    }

    
    public void setDescriptorUpdateEntryCount(VkUInt32 descriptorUpdateEntryCount) {
        setDescriptorUpdateEntryCount(getVkAddress(), descriptorUpdateEntryCount != null ? descriptorUpdateEntryCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getDescriptorUpdateEntryCountQ() {
        return getDescriptorUpdateEntryCount().getValue();
    }

    public void setDescriptorUpdateEntryCount(int descriptorUpdateEntryCount) {
        getDescriptorUpdateEntryCount().setValue(descriptorUpdateEntryCount);
    }

    protected static native long getDescriptorUpdateEntryCount(long address);
    protected static native void setDescriptorUpdateEntryCount(long address, long descriptorUpdateEntryCount);

    public VkDescriptorUpdateTemplateEntryKHR getPDescriptorUpdateEntries() {
        return new VkDescriptorUpdateTemplateEntryKHR(getVkMemory(), getPDescriptorUpdateEntries(getVkAddress()));
    }

    private VkObject pDescriptorUpdateEntries = null;
    public void setPDescriptorUpdateEntries(VkDescriptorUpdateTemplateEntryKHR pDescriptorUpdateEntries) {
        setPDescriptorUpdateEntries(getVkAddress(), pDescriptorUpdateEntries != null ? pDescriptorUpdateEntries.getVkAddress() : VkPointer.NULL);
        this.pDescriptorUpdateEntries = pDescriptorUpdateEntries;
    }

    protected static native long getPDescriptorUpdateEntries(long address);
    protected static native void setPDescriptorUpdateEntries(long address, long pDescriptorUpdateEntries);

    public VkDescriptorUpdateTemplateTypeKHR getTemplateType() {
        return new VkDescriptorUpdateTemplateTypeKHR(getVkMemory(), getTemplateType(getVkAddress()));
    }

    
    public void setTemplateType(VkDescriptorUpdateTemplateTypeKHR templateType) {
        setTemplateType(getVkAddress(), templateType != null ? templateType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getTemplateTypeQ() {
        return getTemplateType().getValue();
    }

    public void setTemplateType(int templateType) {
        getTemplateType().setValue(templateType);
    }

    protected static native long getTemplateType(long address);
    protected static native void setTemplateType(long address, long templateType);

    public VkDescriptorSetLayout getDescriptorSetLayout() {
        return new VkDescriptorSetLayout(getVkMemory(), getDescriptorSetLayout(getVkAddress()));
    }

    
    public void setDescriptorSetLayout(VkDescriptorSetLayout descriptorSetLayout) {
        setDescriptorSetLayout(getVkAddress(), descriptorSetLayout != null ? descriptorSetLayout.getVkAddress() : VkPointer.getNullAddress());
        
    }

    protected static native long getDescriptorSetLayout(long address);
    protected static native void setDescriptorSetLayout(long address, long descriptorSetLayout);

    public VkPipelineBindPoint getPipelineBindPoint() {
        return new VkPipelineBindPoint(getVkMemory(), getPipelineBindPoint(getVkAddress()));
    }

    
    public void setPipelineBindPoint(VkPipelineBindPoint pipelineBindPoint) {
        setPipelineBindPoint(getVkAddress(), pipelineBindPoint != null ? pipelineBindPoint.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getPipelineBindPointQ() {
        return getPipelineBindPoint().getValue();
    }

    public void setPipelineBindPoint(int pipelineBindPoint) {
        getPipelineBindPoint().setValue(pipelineBindPoint);
    }

    protected static native long getPipelineBindPoint(long address);
    protected static native void setPipelineBindPoint(long address, long pipelineBindPoint);

    public VkPipelineLayout getPipelineLayout() {
        return new VkPipelineLayout(getVkMemory(), getPipelineLayout(getVkAddress()));
    }

    
    public void setPipelineLayout(VkPipelineLayout pipelineLayout) {
        setPipelineLayout(getVkAddress(), pipelineLayout != null ? pipelineLayout.getVkAddress() : VkPointer.getNullAddress());
        
    }

    protected static native long getPipelineLayout(long address);
    protected static native void setPipelineLayout(long address, long pipelineLayout);

    public VkUInt32 getSet() {
        return new VkUInt32(getVkMemory(), getSet(getVkAddress()));
    }

    
    public void setSet(VkUInt32 set) {
        setSet(getVkAddress(), set != null ? set.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSetQ() {
        return getSet().getValue();
    }

    public void setSet(int set) {
        getSet().setValue(set);
    }

    protected static native long getSet(long address);
    protected static native void setSet(long address, long set);


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


    public static class Pointer extends VkObject.Pointer {
        public Pointer() {
        }

        public Pointer(long value) {
            setValue(value);
        }

        public Pointer(VkMemory vkmemory) {
            super(vkmemory);
        }

        public Pointer(VkMemory vkmemory, long vkaddress) {
            super(vkmemory, vkaddress);
        }

        public static class Array extends VkDescriptorUpdateTemplateCreateInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDescriptorUpdateTemplateCreateInfoKHR.Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*VkPointer.sizeof()));
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

            public Array(VkDescriptorUpdateTemplateCreateInfoKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDescriptorUpdateTemplateCreateInfoKHR.Pointer get(int i){
                return new VkDescriptorUpdateTemplateCreateInfoKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
