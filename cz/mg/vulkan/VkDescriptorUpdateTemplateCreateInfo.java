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



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkDescriptorUpdateTemplateCreateFlags getFlags() {
        return new VkDescriptorUpdateTemplateCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkDescriptorUpdateTemplateCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkUInt32 getDescriptorUpdateEntryCount() {
        return new VkUInt32(getVkMemory(), getDescriptorUpdateEntryCount(getVkAddress()));
    }

    
    public void setDescriptorUpdateEntryCount(VkUInt32 descriptorUpdateEntryCount) {
        setDescriptorUpdateEntryCount(getVkAddress(), descriptorUpdateEntryCount != null ? descriptorUpdateEntryCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setDescriptorUpdateEntryCount(int descriptorUpdateEntryCount) {
        getDescriptorUpdateEntryCount().setValue(descriptorUpdateEntryCount);
    }

    private static native long getDescriptorUpdateEntryCount(long address);
    private static native void setDescriptorUpdateEntryCount(long address, long descriptorUpdateEntryCount);

    public VkDescriptorUpdateTemplateEntry getPDescriptorUpdateEntries() {
        return new VkDescriptorUpdateTemplateEntry(getVkMemory(), getPDescriptorUpdateEntries(getVkAddress()));
    }

    private VkObject pDescriptorUpdateEntries = null;
    public void setPDescriptorUpdateEntries(VkDescriptorUpdateTemplateEntry pDescriptorUpdateEntries) {
        setPDescriptorUpdateEntries(getVkAddress(), pDescriptorUpdateEntries != null ? pDescriptorUpdateEntries.getVkAddress() : VkPointer.NULL);
        this.pDescriptorUpdateEntries = pDescriptorUpdateEntries;
    }

    private static native long getPDescriptorUpdateEntries(long address);
    private static native void setPDescriptorUpdateEntries(long address, long pDescriptorUpdateEntries);

    public VkDescriptorUpdateTemplateType getTemplateType() {
        return new VkDescriptorUpdateTemplateType(getVkMemory(), getTemplateType(getVkAddress()));
    }

    
    public void setTemplateType(VkDescriptorUpdateTemplateType templateType) {
        setTemplateType(getVkAddress(), templateType != null ? templateType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setTemplateType(int templateType) {
        getTemplateType().setValue(templateType);
    }

    private static native long getTemplateType(long address);
    private static native void setTemplateType(long address, long templateType);

    public VkDescriptorSetLayout getDescriptorSetLayout() {
        return new VkDescriptorSetLayout(getVkMemory(), getDescriptorSetLayout(getVkAddress()));
    }

    
    public void setDescriptorSetLayout(VkDescriptorSetLayout descriptorSetLayout) {
        setDescriptorSetLayout(getVkAddress(), descriptorSetLayout != null ? descriptorSetLayout.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getDescriptorSetLayout(long address);
    private static native void setDescriptorSetLayout(long address, long descriptorSetLayout);

    public VkPipelineBindPoint getPipelineBindPoint() {
        return new VkPipelineBindPoint(getVkMemory(), getPipelineBindPoint(getVkAddress()));
    }

    
    public void setPipelineBindPoint(VkPipelineBindPoint pipelineBindPoint) {
        setPipelineBindPoint(getVkAddress(), pipelineBindPoint != null ? pipelineBindPoint.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setPipelineBindPoint(int pipelineBindPoint) {
        getPipelineBindPoint().setValue(pipelineBindPoint);
    }

    private static native long getPipelineBindPoint(long address);
    private static native void setPipelineBindPoint(long address, long pipelineBindPoint);

    public VkPipelineLayout getPipelineLayout() {
        return new VkPipelineLayout(getVkMemory(), getPipelineLayout(getVkAddress()));
    }

    
    public void setPipelineLayout(VkPipelineLayout pipelineLayout) {
        setPipelineLayout(getVkAddress(), pipelineLayout != null ? pipelineLayout.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getPipelineLayout(long address);
    private static native void setPipelineLayout(long address, long pipelineLayout);

    public VkUInt32 getSet() {
        return new VkUInt32(getVkMemory(), getSet(getVkAddress()));
    }

    
    public void setSet(VkUInt32 set) {
        setSet(getVkAddress(), set != null ? set.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setSet(int set) {
        getSet().setValue(set);
    }

    private static native long getSet(long address);
    private static native void setSet(long address, long set);


    public static native long sizeof();

    public static class Array extends VkDescriptorUpdateTemplateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkDescriptorUpdateTemplateCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorUpdateTemplateCreateInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDescriptorUpdateTemplateCreateInfo o){
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

        public static class Array extends VkDescriptorUpdateTemplateCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDescriptorUpdateTemplateCreateInfo.Pointer> {
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

            public Array(VkDescriptorUpdateTemplateCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDescriptorUpdateTemplateCreateInfo.Pointer get(int i){
                return new VkDescriptorUpdateTemplateCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
