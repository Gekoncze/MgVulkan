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

    public VkPipelineRasterizationStateCreateFlags getFlags() {
        return new VkPipelineRasterizationStateCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkPipelineRasterizationStateCreateFlags flags) {
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

    public VkBool32 getDepthClampEnable() {
        return new VkBool32(getVkMemory(), getDepthClampEnable(getVkAddress()));
    }

    
    public void setDepthClampEnable(VkBool32 depthClampEnable) {
        setDepthClampEnable(getVkAddress(), depthClampEnable != null ? depthClampEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDepthClampEnableQ() {
        return getDepthClampEnable().getValue();
    }

    public void setDepthClampEnable(int depthClampEnable) {
        getDepthClampEnable().setValue(depthClampEnable);
    }

    protected static native long getDepthClampEnable(long address);
    protected static native void setDepthClampEnable(long address, long depthClampEnable);

    public VkBool32 getRasterizerDiscardEnable() {
        return new VkBool32(getVkMemory(), getRasterizerDiscardEnable(getVkAddress()));
    }

    
    public void setRasterizerDiscardEnable(VkBool32 rasterizerDiscardEnable) {
        setRasterizerDiscardEnable(getVkAddress(), rasterizerDiscardEnable != null ? rasterizerDiscardEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getRasterizerDiscardEnableQ() {
        return getRasterizerDiscardEnable().getValue();
    }

    public void setRasterizerDiscardEnable(int rasterizerDiscardEnable) {
        getRasterizerDiscardEnable().setValue(rasterizerDiscardEnable);
    }

    protected static native long getRasterizerDiscardEnable(long address);
    protected static native void setRasterizerDiscardEnable(long address, long rasterizerDiscardEnable);

    public VkPolygonMode getPolygonMode() {
        return new VkPolygonMode(getVkMemory(), getPolygonMode(getVkAddress()));
    }

    
    public void setPolygonMode(VkPolygonMode polygonMode) {
        setPolygonMode(getVkAddress(), polygonMode != null ? polygonMode.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPolygonModeQ() {
        return getPolygonMode().getValue();
    }

    public void setPolygonMode(int polygonMode) {
        getPolygonMode().setValue(polygonMode);
    }

    protected static native long getPolygonMode(long address);
    protected static native void setPolygonMode(long address, long polygonMode);

    public VkCullModeFlags getCullMode() {
        return new VkCullModeFlags(getVkMemory(), getCullMode(getVkAddress()));
    }

    
    public void setCullMode(VkCullModeFlags cullMode) {
        setCullMode(getVkAddress(), cullMode != null ? cullMode.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCullModeQ() {
        return getCullMode().getValue();
    }

    public void setCullMode(int cullMode) {
        getCullMode().setValue(cullMode);
    }

    protected static native long getCullMode(long address);
    protected static native void setCullMode(long address, long cullMode);

    public VkFrontFace getFrontFace() {
        return new VkFrontFace(getVkMemory(), getFrontFace(getVkAddress()));
    }

    
    public void setFrontFace(VkFrontFace frontFace) {
        setFrontFace(getVkAddress(), frontFace != null ? frontFace.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFrontFaceQ() {
        return getFrontFace().getValue();
    }

    public void setFrontFace(int frontFace) {
        getFrontFace().setValue(frontFace);
    }

    protected static native long getFrontFace(long address);
    protected static native void setFrontFace(long address, long frontFace);

    public VkBool32 getDepthBiasEnable() {
        return new VkBool32(getVkMemory(), getDepthBiasEnable(getVkAddress()));
    }

    
    public void setDepthBiasEnable(VkBool32 depthBiasEnable) {
        setDepthBiasEnable(getVkAddress(), depthBiasEnable != null ? depthBiasEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDepthBiasEnableQ() {
        return getDepthBiasEnable().getValue();
    }

    public void setDepthBiasEnable(int depthBiasEnable) {
        getDepthBiasEnable().setValue(depthBiasEnable);
    }

    protected static native long getDepthBiasEnable(long address);
    protected static native void setDepthBiasEnable(long address, long depthBiasEnable);

    public VkFloat getDepthBiasConstantFactor() {
        return new VkFloat(getVkMemory(), getDepthBiasConstantFactor(getVkAddress()));
    }

    
    public void setDepthBiasConstantFactor(VkFloat depthBiasConstantFactor) {
        setDepthBiasConstantFactor(getVkAddress(), depthBiasConstantFactor != null ? depthBiasConstantFactor.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getDepthBiasConstantFactorQ() {
        return getDepthBiasConstantFactor().getValue();
    }

    public void setDepthBiasConstantFactor(float depthBiasConstantFactor) {
        getDepthBiasConstantFactor().setValue(depthBiasConstantFactor);
    }

    protected static native long getDepthBiasConstantFactor(long address);
    protected static native void setDepthBiasConstantFactor(long address, long depthBiasConstantFactor);

    public VkFloat getDepthBiasClamp() {
        return new VkFloat(getVkMemory(), getDepthBiasClamp(getVkAddress()));
    }

    
    public void setDepthBiasClamp(VkFloat depthBiasClamp) {
        setDepthBiasClamp(getVkAddress(), depthBiasClamp != null ? depthBiasClamp.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getDepthBiasClampQ() {
        return getDepthBiasClamp().getValue();
    }

    public void setDepthBiasClamp(float depthBiasClamp) {
        getDepthBiasClamp().setValue(depthBiasClamp);
    }

    protected static native long getDepthBiasClamp(long address);
    protected static native void setDepthBiasClamp(long address, long depthBiasClamp);

    public VkFloat getDepthBiasSlopeFactor() {
        return new VkFloat(getVkMemory(), getDepthBiasSlopeFactor(getVkAddress()));
    }

    
    public void setDepthBiasSlopeFactor(VkFloat depthBiasSlopeFactor) {
        setDepthBiasSlopeFactor(getVkAddress(), depthBiasSlopeFactor != null ? depthBiasSlopeFactor.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getDepthBiasSlopeFactorQ() {
        return getDepthBiasSlopeFactor().getValue();
    }

    public void setDepthBiasSlopeFactor(float depthBiasSlopeFactor) {
        getDepthBiasSlopeFactor().setValue(depthBiasSlopeFactor);
    }

    protected static native long getDepthBiasSlopeFactor(long address);
    protected static native void setDepthBiasSlopeFactor(long address, long depthBiasSlopeFactor);

    public VkFloat getLineWidth() {
        return new VkFloat(getVkMemory(), getLineWidth(getVkAddress()));
    }

    
    public void setLineWidth(VkFloat lineWidth) {
        setLineWidth(getVkAddress(), lineWidth != null ? lineWidth.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getLineWidthQ() {
        return getLineWidth().getValue();
    }

    public void setLineWidth(float lineWidth) {
        getLineWidth().setValue(lineWidth);
    }

    protected static native long getLineWidth(long address);
    protected static native void setLineWidth(long address, long lineWidth);


    public static native long sizeof();

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
