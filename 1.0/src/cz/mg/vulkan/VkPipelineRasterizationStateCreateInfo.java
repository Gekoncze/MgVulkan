package cz.mg.vulkan;

public class VkPipelineRasterizationStateCreateInfo extends VkObject {
    public VkPipelineRasterizationStateCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO));
    }

    public VkPipelineRasterizationStateCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineRasterizationStateCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineRasterizationStateCreateInfo(VkPointer pointer) {
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

    public VkPipelineRasterizationStateCreateFlags getFlags() {
        return new VkPipelineRasterizationStateCreateFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkPipelineRasterizationStateCreateFlags flags) {
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

    public VkBool32 getDepthClampEnable() {
        return new VkBool32(getVkMemory(), getDepthClampEnableNative(getVkAddress()));
    }

    
    public void setDepthClampEnable(VkBool32 depthClampEnable) {
        setDepthClampEnableNative(getVkAddress(), depthClampEnable != null ? depthClampEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDepthClampEnableQ() {
        return getDepthClampEnable().getValue();
    }

    public void setDepthClampEnable(int depthClampEnable) {
        getDepthClampEnable().setValue(depthClampEnable);
    }

    protected static native long getDepthClampEnableNative(long address);
    protected static native void setDepthClampEnableNative(long address, long depthClampEnable);

    public VkBool32 getRasterizerDiscardEnable() {
        return new VkBool32(getVkMemory(), getRasterizerDiscardEnableNative(getVkAddress()));
    }

    
    public void setRasterizerDiscardEnable(VkBool32 rasterizerDiscardEnable) {
        setRasterizerDiscardEnableNative(getVkAddress(), rasterizerDiscardEnable != null ? rasterizerDiscardEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getRasterizerDiscardEnableQ() {
        return getRasterizerDiscardEnable().getValue();
    }

    public void setRasterizerDiscardEnable(int rasterizerDiscardEnable) {
        getRasterizerDiscardEnable().setValue(rasterizerDiscardEnable);
    }

    protected static native long getRasterizerDiscardEnableNative(long address);
    protected static native void setRasterizerDiscardEnableNative(long address, long rasterizerDiscardEnable);

    public VkPolygonMode getPolygonMode() {
        return new VkPolygonMode(getVkMemory(), getPolygonModeNative(getVkAddress()));
    }

    
    public void setPolygonMode(VkPolygonMode polygonMode) {
        setPolygonModeNative(getVkAddress(), polygonMode != null ? polygonMode.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPolygonModeQ() {
        return getPolygonMode().getValue();
    }

    public void setPolygonMode(int polygonMode) {
        getPolygonMode().setValue(polygonMode);
    }

    protected static native long getPolygonModeNative(long address);
    protected static native void setPolygonModeNative(long address, long polygonMode);

    public VkCullModeFlags getCullMode() {
        return new VkCullModeFlags(getVkMemory(), getCullModeNative(getVkAddress()));
    }

    
    public void setCullMode(VkCullModeFlags cullMode) {
        setCullModeNative(getVkAddress(), cullMode != null ? cullMode.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCullModeQ() {
        return getCullMode().getValue();
    }

    public void setCullMode(int cullMode) {
        getCullMode().setValue(cullMode);
    }

    protected static native long getCullModeNative(long address);
    protected static native void setCullModeNative(long address, long cullMode);

    public VkFrontFace getFrontFace() {
        return new VkFrontFace(getVkMemory(), getFrontFaceNative(getVkAddress()));
    }

    
    public void setFrontFace(VkFrontFace frontFace) {
        setFrontFaceNative(getVkAddress(), frontFace != null ? frontFace.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFrontFaceQ() {
        return getFrontFace().getValue();
    }

    public void setFrontFace(int frontFace) {
        getFrontFace().setValue(frontFace);
    }

    protected static native long getFrontFaceNative(long address);
    protected static native void setFrontFaceNative(long address, long frontFace);

    public VkBool32 getDepthBiasEnable() {
        return new VkBool32(getVkMemory(), getDepthBiasEnableNative(getVkAddress()));
    }

    
    public void setDepthBiasEnable(VkBool32 depthBiasEnable) {
        setDepthBiasEnableNative(getVkAddress(), depthBiasEnable != null ? depthBiasEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDepthBiasEnableQ() {
        return getDepthBiasEnable().getValue();
    }

    public void setDepthBiasEnable(int depthBiasEnable) {
        getDepthBiasEnable().setValue(depthBiasEnable);
    }

    protected static native long getDepthBiasEnableNative(long address);
    protected static native void setDepthBiasEnableNative(long address, long depthBiasEnable);

    public VkFloat getDepthBiasConstantFactor() {
        return new VkFloat(getVkMemory(), getDepthBiasConstantFactorNative(getVkAddress()));
    }

    
    public void setDepthBiasConstantFactor(VkFloat depthBiasConstantFactor) {
        setDepthBiasConstantFactorNative(getVkAddress(), depthBiasConstantFactor != null ? depthBiasConstantFactor.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getDepthBiasConstantFactorQ() {
        return getDepthBiasConstantFactor().getValue();
    }

    public void setDepthBiasConstantFactor(float depthBiasConstantFactor) {
        getDepthBiasConstantFactor().setValue(depthBiasConstantFactor);
    }

    protected static native long getDepthBiasConstantFactorNative(long address);
    protected static native void setDepthBiasConstantFactorNative(long address, long depthBiasConstantFactor);

    public VkFloat getDepthBiasClamp() {
        return new VkFloat(getVkMemory(), getDepthBiasClampNative(getVkAddress()));
    }

    
    public void setDepthBiasClamp(VkFloat depthBiasClamp) {
        setDepthBiasClampNative(getVkAddress(), depthBiasClamp != null ? depthBiasClamp.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getDepthBiasClampQ() {
        return getDepthBiasClamp().getValue();
    }

    public void setDepthBiasClamp(float depthBiasClamp) {
        getDepthBiasClamp().setValue(depthBiasClamp);
    }

    protected static native long getDepthBiasClampNative(long address);
    protected static native void setDepthBiasClampNative(long address, long depthBiasClamp);

    public VkFloat getDepthBiasSlopeFactor() {
        return new VkFloat(getVkMemory(), getDepthBiasSlopeFactorNative(getVkAddress()));
    }

    
    public void setDepthBiasSlopeFactor(VkFloat depthBiasSlopeFactor) {
        setDepthBiasSlopeFactorNative(getVkAddress(), depthBiasSlopeFactor != null ? depthBiasSlopeFactor.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getDepthBiasSlopeFactorQ() {
        return getDepthBiasSlopeFactor().getValue();
    }

    public void setDepthBiasSlopeFactor(float depthBiasSlopeFactor) {
        getDepthBiasSlopeFactor().setValue(depthBiasSlopeFactor);
    }

    protected static native long getDepthBiasSlopeFactorNative(long address);
    protected static native void setDepthBiasSlopeFactorNative(long address, long depthBiasSlopeFactor);

    public VkFloat getLineWidth() {
        return new VkFloat(getVkMemory(), getLineWidthNative(getVkAddress()));
    }

    
    public void setLineWidth(VkFloat lineWidth) {
        setLineWidthNative(getVkAddress(), lineWidth != null ? lineWidth.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getLineWidthQ() {
        return getLineWidth().getValue();
    }

    public void setLineWidth(float lineWidth) {
        getLineWidth().setValue(lineWidth);
    }

    protected static native long getLineWidthNative(long address);
    protected static native void setLineWidthNative(long address, long lineWidth);


    public void set(VkPipelineRasterizationStateCreateInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPipelineRasterizationStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineRasterizationStateCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineRasterizationStateCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO));;
        }

        public Array(int count, VkPipelineRasterizationStateCreateInfo o){
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
        public VkPipelineRasterizationStateCreateInfo get(int i){
            return new VkPipelineRasterizationStateCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
