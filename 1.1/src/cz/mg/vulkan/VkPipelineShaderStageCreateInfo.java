package cz.mg.vulkan;

public class VkPipelineShaderStageCreateInfo extends VkObject {
    public VkPipelineShaderStageCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO));
    }

    public VkPipelineShaderStageCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineShaderStageCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineShaderStageCreateInfo(VkPointer pointer) {
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

    public VkPipelineShaderStageCreateFlags getFlags() {
        return new VkPipelineShaderStageCreateFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkPipelineShaderStageCreateFlags flags) {
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

    public VkShaderStageFlagBits getStage() {
        return new VkShaderStageFlagBits(getVkMemory(), getStageNative(getVkAddress()));
    }

    
    public void setStage(VkShaderStageFlagBits stage) {
        setStageNative(getVkAddress(), stage != null ? stage.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getStageQ() {
        return getStage().getValue();
    }

    public void setStage(int stage) {
        getStage().setValue(stage);
    }

    protected static native long getStageNative(long address);
    protected static native void setStageNative(long address, long stage);

    public VkShaderModule getModule() {
        return new VkShaderModule(getVkMemory(), getModuleNative(getVkAddress()));
    }

    
    public void setModule(VkShaderModule module) {
        setModuleNative(getVkAddress(), module != null ? module.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getModuleNative(long address);
    protected static native void setModuleNative(long address, long module);

    public VkChar getPName() {
        return new VkChar(getVkMemory(), getPNameNative(getVkAddress()));
    }

    private VkObject pName = null;
    public void setPName(VkChar pName) {
        setPNameNative(getVkAddress(), pName != null ? pName.getVkAddress() : VkPointer.NULL);
        this.pName = pName;
    }

    public String getPNameQ() {
        return new VkString(getPName()).toString();
    }

    public void setPName(String pName) {
        setPName(new VkString(pName));
    }

    protected static native long getPNameNative(long address);
    protected static native void setPNameNative(long address, long pName);

    public VkSpecializationInfo getPSpecializationInfo() {
        return new VkSpecializationInfo(getVkMemory(), getPSpecializationInfoNative(getVkAddress()));
    }

    private VkObject pSpecializationInfo = null;
    public void setPSpecializationInfo(VkSpecializationInfo pSpecializationInfo) {
        setPSpecializationInfoNative(getVkAddress(), pSpecializationInfo != null ? pSpecializationInfo.getVkAddress() : VkPointer.NULL);
        this.pSpecializationInfo = pSpecializationInfo;
    }

    protected static native long getPSpecializationInfoNative(long address);
    protected static native void setPSpecializationInfoNative(long address, long pSpecializationInfo);


    public void set(VkPipelineShaderStageCreateInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPipelineShaderStageCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineShaderStageCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineShaderStageCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO));;
        }

        public Array(int count, VkPipelineShaderStageCreateInfo o){
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
        public VkPipelineShaderStageCreateInfo get(int i){
            return new VkPipelineShaderStageCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
