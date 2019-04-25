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



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
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

    public VkPipelineMultisampleStateCreateFlags getFlags() {
        return new VkPipelineMultisampleStateCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkPipelineMultisampleStateCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlags(long address);
    protected static native void setFlags(long address, long flags);

    public VkSampleCountFlagBits getRasterizationSamples() {
        return new VkSampleCountFlagBits(getVkMemory(), getRasterizationSamples(getVkAddress()));
    }

    
    public void setRasterizationSamples(VkSampleCountFlagBits rasterizationSamples) {
        setRasterizationSamples(getVkAddress(), rasterizationSamples != null ? rasterizationSamples.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getRasterizationSamplesQ() {
        return getRasterizationSamples().getValue();
    }

    public void setRasterizationSamples(int rasterizationSamples) {
        getRasterizationSamples().setValue(rasterizationSamples);
    }

    protected static native long getRasterizationSamples(long address);
    protected static native void setRasterizationSamples(long address, long rasterizationSamples);

    public VkBool32 getSampleShadingEnable() {
        return new VkBool32(getVkMemory(), getSampleShadingEnable(getVkAddress()));
    }

    
    public void setSampleShadingEnable(VkBool32 sampleShadingEnable) {
        setSampleShadingEnable(getVkAddress(), sampleShadingEnable != null ? sampleShadingEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSampleShadingEnableQ() {
        return getSampleShadingEnable().getValue();
    }

    public void setSampleShadingEnable(int sampleShadingEnable) {
        getSampleShadingEnable().setValue(sampleShadingEnable);
    }

    protected static native long getSampleShadingEnable(long address);
    protected static native void setSampleShadingEnable(long address, long sampleShadingEnable);

    public VkFloat getMinSampleShading() {
        return new VkFloat(getVkMemory(), getMinSampleShading(getVkAddress()));
    }

    
    public void setMinSampleShading(VkFloat minSampleShading) {
        setMinSampleShading(getVkAddress(), minSampleShading != null ? minSampleShading.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMinSampleShadingQ() {
        return getMinSampleShading().getValue();
    }

    public void setMinSampleShading(float minSampleShading) {
        getMinSampleShading().setValue(minSampleShading);
    }

    protected static native long getMinSampleShading(long address);
    protected static native void setMinSampleShading(long address, long minSampleShading);

    public VkSampleMask getPSampleMask() {
        return new VkSampleMask(getVkMemory(), getPSampleMask(getVkAddress()));
    }

    private VkObject pSampleMask = null;
    public void setPSampleMask(VkSampleMask pSampleMask) {
        setPSampleMask(getVkAddress(), pSampleMask != null ? pSampleMask.getVkAddress() : VkPointer.NULL);
        this.pSampleMask = pSampleMask;
    }

    protected static native long getPSampleMask(long address);
    protected static native void setPSampleMask(long address, long pSampleMask);

    public VkBool32 getAlphaToCoverageEnable() {
        return new VkBool32(getVkMemory(), getAlphaToCoverageEnable(getVkAddress()));
    }

    
    public void setAlphaToCoverageEnable(VkBool32 alphaToCoverageEnable) {
        setAlphaToCoverageEnable(getVkAddress(), alphaToCoverageEnable != null ? alphaToCoverageEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAlphaToCoverageEnableQ() {
        return getAlphaToCoverageEnable().getValue();
    }

    public void setAlphaToCoverageEnable(int alphaToCoverageEnable) {
        getAlphaToCoverageEnable().setValue(alphaToCoverageEnable);
    }

    protected static native long getAlphaToCoverageEnable(long address);
    protected static native void setAlphaToCoverageEnable(long address, long alphaToCoverageEnable);

    public VkBool32 getAlphaToOneEnable() {
        return new VkBool32(getVkMemory(), getAlphaToOneEnable(getVkAddress()));
    }

    
    public void setAlphaToOneEnable(VkBool32 alphaToOneEnable) {
        setAlphaToOneEnable(getVkAddress(), alphaToOneEnable != null ? alphaToOneEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAlphaToOneEnableQ() {
        return getAlphaToOneEnable().getValue();
    }

    public void setAlphaToOneEnable(int alphaToOneEnable) {
        getAlphaToOneEnable().setValue(alphaToOneEnable);
    }

    protected static native long getAlphaToOneEnable(long address);
    protected static native void setAlphaToOneEnable(long address, long alphaToOneEnable);


    public static native long sizeof();

    public static class Array extends VkPipelineMultisampleStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineMultisampleStateCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineMultisampleStateCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO));;
        }

        public Array(int count, VkPipelineMultisampleStateCreateInfo o){
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
