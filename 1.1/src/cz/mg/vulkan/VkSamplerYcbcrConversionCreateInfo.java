package cz.mg.vulkan;

public class VkSamplerYcbcrConversionCreateInfo extends VkObject {
    public VkSamplerYcbcrConversionCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO));
    }

    public VkSamplerYcbcrConversionCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSamplerYcbcrConversionCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSamplerYcbcrConversionCreateInfo(VkPointer pointer) {
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

    public VkFormat getFormat() {
        return new VkFormat(getVkMemory(), getFormatNative(getVkAddress()));
    }

    
    public void setFormat(VkFormat format) {
        setFormatNative(getVkAddress(), format != null ? format.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFormatQ() {
        return getFormat().getValue();
    }

    public void setFormat(int format) {
        getFormat().setValue(format);
    }

    protected static native long getFormatNative(long address);
    protected static native void setFormatNative(long address, long format);

    public VkSamplerYcbcrModelConversion getYcbcrModel() {
        return new VkSamplerYcbcrModelConversion(getVkMemory(), getYcbcrModelNative(getVkAddress()));
    }

    
    public void setYcbcrModel(VkSamplerYcbcrModelConversion ycbcrModel) {
        setYcbcrModelNative(getVkAddress(), ycbcrModel != null ? ycbcrModel.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getYcbcrModelQ() {
        return getYcbcrModel().getValue();
    }

    public void setYcbcrModel(int ycbcrModel) {
        getYcbcrModel().setValue(ycbcrModel);
    }

    protected static native long getYcbcrModelNative(long address);
    protected static native void setYcbcrModelNative(long address, long ycbcrModel);

    public VkSamplerYcbcrRange getYcbcrRange() {
        return new VkSamplerYcbcrRange(getVkMemory(), getYcbcrRangeNative(getVkAddress()));
    }

    
    public void setYcbcrRange(VkSamplerYcbcrRange ycbcrRange) {
        setYcbcrRangeNative(getVkAddress(), ycbcrRange != null ? ycbcrRange.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getYcbcrRangeQ() {
        return getYcbcrRange().getValue();
    }

    public void setYcbcrRange(int ycbcrRange) {
        getYcbcrRange().setValue(ycbcrRange);
    }

    protected static native long getYcbcrRangeNative(long address);
    protected static native void setYcbcrRangeNative(long address, long ycbcrRange);

    public VkComponentMapping getComponents() {
        return new VkComponentMapping(getVkMemory(), getComponentsNative(getVkAddress()));
    }

    
    public void setComponents(VkComponentMapping components) {
        setComponentsNative(getVkAddress(), components != null ? components.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getComponentsNative(long address);
    protected static native void setComponentsNative(long address, long components);

    public VkChromaLocation getXChromaOffset() {
        return new VkChromaLocation(getVkMemory(), getXChromaOffsetNative(getVkAddress()));
    }

    
    public void setXChromaOffset(VkChromaLocation xChromaOffset) {
        setXChromaOffsetNative(getVkAddress(), xChromaOffset != null ? xChromaOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getXChromaOffsetQ() {
        return getXChromaOffset().getValue();
    }

    public void setXChromaOffset(int xChromaOffset) {
        getXChromaOffset().setValue(xChromaOffset);
    }

    protected static native long getXChromaOffsetNative(long address);
    protected static native void setXChromaOffsetNative(long address, long xChromaOffset);

    public VkChromaLocation getYChromaOffset() {
        return new VkChromaLocation(getVkMemory(), getYChromaOffsetNative(getVkAddress()));
    }

    
    public void setYChromaOffset(VkChromaLocation yChromaOffset) {
        setYChromaOffsetNative(getVkAddress(), yChromaOffset != null ? yChromaOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getYChromaOffsetQ() {
        return getYChromaOffset().getValue();
    }

    public void setYChromaOffset(int yChromaOffset) {
        getYChromaOffset().setValue(yChromaOffset);
    }

    protected static native long getYChromaOffsetNative(long address);
    protected static native void setYChromaOffsetNative(long address, long yChromaOffset);

    public VkFilter getChromaFilter() {
        return new VkFilter(getVkMemory(), getChromaFilterNative(getVkAddress()));
    }

    
    public void setChromaFilter(VkFilter chromaFilter) {
        setChromaFilterNative(getVkAddress(), chromaFilter != null ? chromaFilter.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getChromaFilterQ() {
        return getChromaFilter().getValue();
    }

    public void setChromaFilter(int chromaFilter) {
        getChromaFilter().setValue(chromaFilter);
    }

    protected static native long getChromaFilterNative(long address);
    protected static native void setChromaFilterNative(long address, long chromaFilter);

    public VkBool32 getForceExplicitReconstruction() {
        return new VkBool32(getVkMemory(), getForceExplicitReconstructionNative(getVkAddress()));
    }

    
    public void setForceExplicitReconstruction(VkBool32 forceExplicitReconstruction) {
        setForceExplicitReconstructionNative(getVkAddress(), forceExplicitReconstruction != null ? forceExplicitReconstruction.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getForceExplicitReconstructionQ() {
        return getForceExplicitReconstruction().getValue();
    }

    public void setForceExplicitReconstruction(int forceExplicitReconstruction) {
        getForceExplicitReconstruction().setValue(forceExplicitReconstruction);
    }

    protected static native long getForceExplicitReconstructionNative(long address);
    protected static native void setForceExplicitReconstructionNative(long address, long forceExplicitReconstruction);


    public static native long sizeof();

    public static class Array extends VkSamplerYcbcrConversionCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkSamplerYcbcrConversionCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSamplerYcbcrConversionCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO));;
        }

        public Array(int count, VkSamplerYcbcrConversionCreateInfo o){
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
        public VkSamplerYcbcrConversionCreateInfo get(int i){
            return new VkSamplerYcbcrConversionCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
