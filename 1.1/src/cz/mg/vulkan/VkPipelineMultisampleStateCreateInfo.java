package cz.mg.vulkan;

public class VkPipelineMultisampleStateCreateInfo extends VkObject {
    public VkPipelineMultisampleStateCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO));
    }

    public VkPipelineMultisampleStateCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineMultisampleStateCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineMultisampleStateCreateInfo(VkPointer pointer) {
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

    public VkPipelineMultisampleStateCreateFlags getFlags() {
        return new VkPipelineMultisampleStateCreateFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkPipelineMultisampleStateCreateFlags flags) {
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

    public VkSampleCountFlagBits getRasterizationSamples() {
        return new VkSampleCountFlagBits(getVkMemory(), getRasterizationSamplesNative(getVkAddress()));
    }

    
    public void setRasterizationSamples(VkSampleCountFlagBits rasterizationSamples) {
        setRasterizationSamplesNative(getVkAddress(), rasterizationSamples != null ? rasterizationSamples.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getRasterizationSamplesQ() {
        return getRasterizationSamples().getValue();
    }

    public void setRasterizationSamples(int rasterizationSamples) {
        getRasterizationSamples().setValue(rasterizationSamples);
    }

    protected static native long getRasterizationSamplesNative(long address);
    protected static native void setRasterizationSamplesNative(long address, long rasterizationSamples);

    public VkBool32 getSampleShadingEnable() {
        return new VkBool32(getVkMemory(), getSampleShadingEnableNative(getVkAddress()));
    }

    
    public void setSampleShadingEnable(VkBool32 sampleShadingEnable) {
        setSampleShadingEnableNative(getVkAddress(), sampleShadingEnable != null ? sampleShadingEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSampleShadingEnableQ() {
        return getSampleShadingEnable().getValue();
    }

    public void setSampleShadingEnable(int sampleShadingEnable) {
        getSampleShadingEnable().setValue(sampleShadingEnable);
    }

    protected static native long getSampleShadingEnableNative(long address);
    protected static native void setSampleShadingEnableNative(long address, long sampleShadingEnable);

    public VkFloat getMinSampleShading() {
        return new VkFloat(getVkMemory(), getMinSampleShadingNative(getVkAddress()));
    }

    
    public void setMinSampleShading(VkFloat minSampleShading) {
        setMinSampleShadingNative(getVkAddress(), minSampleShading != null ? minSampleShading.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMinSampleShadingQ() {
        return getMinSampleShading().getValue();
    }

    public void setMinSampleShading(float minSampleShading) {
        getMinSampleShading().setValue(minSampleShading);
    }

    protected static native long getMinSampleShadingNative(long address);
    protected static native void setMinSampleShadingNative(long address, long minSampleShading);

    public VkSampleMask getPSampleMask() {
        return new VkSampleMask(getVkMemory(), getPSampleMaskNative(getVkAddress()));
    }

    private VkObject pSampleMask = null;
    public void setPSampleMask(VkSampleMask pSampleMask) {
        setPSampleMaskNative(getVkAddress(), pSampleMask != null ? pSampleMask.getVkAddress() : VkPointer.NULL);
        this.pSampleMask = pSampleMask;
    }

    protected static native long getPSampleMaskNative(long address);
    protected static native void setPSampleMaskNative(long address, long pSampleMask);

    public VkBool32 getAlphaToCoverageEnable() {
        return new VkBool32(getVkMemory(), getAlphaToCoverageEnableNative(getVkAddress()));
    }

    
    public void setAlphaToCoverageEnable(VkBool32 alphaToCoverageEnable) {
        setAlphaToCoverageEnableNative(getVkAddress(), alphaToCoverageEnable != null ? alphaToCoverageEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAlphaToCoverageEnableQ() {
        return getAlphaToCoverageEnable().getValue();
    }

    public void setAlphaToCoverageEnable(int alphaToCoverageEnable) {
        getAlphaToCoverageEnable().setValue(alphaToCoverageEnable);
    }

    protected static native long getAlphaToCoverageEnableNative(long address);
    protected static native void setAlphaToCoverageEnableNative(long address, long alphaToCoverageEnable);

    public VkBool32 getAlphaToOneEnable() {
        return new VkBool32(getVkMemory(), getAlphaToOneEnableNative(getVkAddress()));
    }

    
    public void setAlphaToOneEnable(VkBool32 alphaToOneEnable) {
        setAlphaToOneEnableNative(getVkAddress(), alphaToOneEnable != null ? alphaToOneEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAlphaToOneEnableQ() {
        return getAlphaToOneEnable().getValue();
    }

    public void setAlphaToOneEnable(int alphaToOneEnable) {
        getAlphaToOneEnable().setValue(alphaToOneEnable);
    }

    protected static native long getAlphaToOneEnableNative(long address);
    protected static native void setAlphaToOneEnableNative(long address, long alphaToOneEnable);


    public void set(VkPipelineMultisampleStateCreateInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPipelineMultisampleStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineMultisampleStateCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineMultisampleStateCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO));;
        }

        public Array(VkPipelineMultisampleStateCreateInfo o, int count){
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
        public VkPipelineMultisampleStateCreateInfo get(int i){
            return new VkPipelineMultisampleStateCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
