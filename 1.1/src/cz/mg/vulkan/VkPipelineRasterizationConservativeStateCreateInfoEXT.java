package cz.mg.vulkan;

public class VkPipelineRasterizationConservativeStateCreateInfoEXT extends VkObject {
    public VkPipelineRasterizationConservativeStateCreateInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT));
    }

    public VkPipelineRasterizationConservativeStateCreateInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineRasterizationConservativeStateCreateInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineRasterizationConservativeStateCreateInfoEXT(VkPointer pointer) {
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

    public VkPipelineRasterizationConservativeStateCreateFlagsEXT getFlags() {
        return new VkPipelineRasterizationConservativeStateCreateFlagsEXT(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkPipelineRasterizationConservativeStateCreateFlagsEXT flags) {
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

    public VkConservativeRasterizationModeEXT getConservativeRasterizationMode() {
        return new VkConservativeRasterizationModeEXT(getVkMemory(), getConservativeRasterizationModeNative(getVkAddress()));
    }

    
    public void setConservativeRasterizationMode(VkConservativeRasterizationModeEXT conservativeRasterizationMode) {
        setConservativeRasterizationModeNative(getVkAddress(), conservativeRasterizationMode != null ? conservativeRasterizationMode.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getConservativeRasterizationModeQ() {
        return getConservativeRasterizationMode().getValue();
    }

    public void setConservativeRasterizationMode(int conservativeRasterizationMode) {
        getConservativeRasterizationMode().setValue(conservativeRasterizationMode);
    }

    protected static native long getConservativeRasterizationModeNative(long address);
    protected static native void setConservativeRasterizationModeNative(long address, long conservativeRasterizationMode);

    public VkFloat getExtraPrimitiveOverestimationSize() {
        return new VkFloat(getVkMemory(), getExtraPrimitiveOverestimationSizeNative(getVkAddress()));
    }

    
    public void setExtraPrimitiveOverestimationSize(VkFloat extraPrimitiveOverestimationSize) {
        setExtraPrimitiveOverestimationSizeNative(getVkAddress(), extraPrimitiveOverestimationSize != null ? extraPrimitiveOverestimationSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getExtraPrimitiveOverestimationSizeQ() {
        return getExtraPrimitiveOverestimationSize().getValue();
    }

    public void setExtraPrimitiveOverestimationSize(float extraPrimitiveOverestimationSize) {
        getExtraPrimitiveOverestimationSize().setValue(extraPrimitiveOverestimationSize);
    }

    protected static native long getExtraPrimitiveOverestimationSizeNative(long address);
    protected static native void setExtraPrimitiveOverestimationSizeNative(long address, long extraPrimitiveOverestimationSize);


    public void set(VkPipelineRasterizationConservativeStateCreateInfoEXT o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPipelineRasterizationConservativeStateCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkPipelineRasterizationConservativeStateCreateInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineRasterizationConservativeStateCreateInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT));;
        }

        public Array(int count, VkPipelineRasterizationConservativeStateCreateInfoEXT o){
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
        public VkPipelineRasterizationConservativeStateCreateInfoEXT get(int i){
            return new VkPipelineRasterizationConservativeStateCreateInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
