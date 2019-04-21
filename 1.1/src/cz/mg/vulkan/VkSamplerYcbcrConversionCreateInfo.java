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

    public VkFormat getFormat() {
        return new VkFormat(getVkMemory(), getFormat(getVkAddress()));
    }

    
    public void setFormat(VkFormat format) {
        setFormat(getVkAddress(), format != null ? format.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getFormatQ() {
        return getFormat().getValue();
    }

    public void setFormat(int format) {
        getFormat().setValue(format);
    }

    private static native long getFormat(long address);
    private static native void setFormat(long address, long format);

    public VkSamplerYcbcrModelConversion getYcbcrModel() {
        return new VkSamplerYcbcrModelConversion(getVkMemory(), getYcbcrModel(getVkAddress()));
    }

    
    public void setYcbcrModel(VkSamplerYcbcrModelConversion ycbcrModel) {
        setYcbcrModel(getVkAddress(), ycbcrModel != null ? ycbcrModel.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getYcbcrModelQ() {
        return getYcbcrModel().getValue();
    }

    public void setYcbcrModel(int ycbcrModel) {
        getYcbcrModel().setValue(ycbcrModel);
    }

    private static native long getYcbcrModel(long address);
    private static native void setYcbcrModel(long address, long ycbcrModel);

    public VkSamplerYcbcrRange getYcbcrRange() {
        return new VkSamplerYcbcrRange(getVkMemory(), getYcbcrRange(getVkAddress()));
    }

    
    public void setYcbcrRange(VkSamplerYcbcrRange ycbcrRange) {
        setYcbcrRange(getVkAddress(), ycbcrRange != null ? ycbcrRange.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getYcbcrRangeQ() {
        return getYcbcrRange().getValue();
    }

    public void setYcbcrRange(int ycbcrRange) {
        getYcbcrRange().setValue(ycbcrRange);
    }

    private static native long getYcbcrRange(long address);
    private static native void setYcbcrRange(long address, long ycbcrRange);

    public VkComponentMapping getComponents() {
        return new VkComponentMapping(getVkMemory(), getComponents(getVkAddress()));
    }

    
    public void setComponents(VkComponentMapping components) {
        setComponents(getVkAddress(), components != null ? components.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getComponents(long address);
    private static native void setComponents(long address, long components);

    public VkChromaLocation getXChromaOffset() {
        return new VkChromaLocation(getVkMemory(), getXChromaOffset(getVkAddress()));
    }

    
    public void setXChromaOffset(VkChromaLocation xChromaOffset) {
        setXChromaOffset(getVkAddress(), xChromaOffset != null ? xChromaOffset.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getXChromaOffsetQ() {
        return getXChromaOffset().getValue();
    }

    public void setXChromaOffset(int xChromaOffset) {
        getXChromaOffset().setValue(xChromaOffset);
    }

    private static native long getXChromaOffset(long address);
    private static native void setXChromaOffset(long address, long xChromaOffset);

    public VkChromaLocation getYChromaOffset() {
        return new VkChromaLocation(getVkMemory(), getYChromaOffset(getVkAddress()));
    }

    
    public void setYChromaOffset(VkChromaLocation yChromaOffset) {
        setYChromaOffset(getVkAddress(), yChromaOffset != null ? yChromaOffset.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getYChromaOffsetQ() {
        return getYChromaOffset().getValue();
    }

    public void setYChromaOffset(int yChromaOffset) {
        getYChromaOffset().setValue(yChromaOffset);
    }

    private static native long getYChromaOffset(long address);
    private static native void setYChromaOffset(long address, long yChromaOffset);

    public VkFilter getChromaFilter() {
        return new VkFilter(getVkMemory(), getChromaFilter(getVkAddress()));
    }

    
    public void setChromaFilter(VkFilter chromaFilter) {
        setChromaFilter(getVkAddress(), chromaFilter != null ? chromaFilter.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getChromaFilterQ() {
        return getChromaFilter().getValue();
    }

    public void setChromaFilter(int chromaFilter) {
        getChromaFilter().setValue(chromaFilter);
    }

    private static native long getChromaFilter(long address);
    private static native void setChromaFilter(long address, long chromaFilter);

    public VkBool32 getForceExplicitReconstruction() {
        return new VkBool32(getVkMemory(), getForceExplicitReconstruction(getVkAddress()));
    }

    
    public void setForceExplicitReconstruction(VkBool32 forceExplicitReconstruction) {
        setForceExplicitReconstruction(getVkAddress(), forceExplicitReconstruction != null ? forceExplicitReconstruction.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getForceExplicitReconstructionQ() {
        return getForceExplicitReconstruction().getValue();
    }

    public void setForceExplicitReconstruction(int forceExplicitReconstruction) {
        getForceExplicitReconstruction().setValue(forceExplicitReconstruction);
    }

    private static native long getForceExplicitReconstruction(long address);
    private static native void setForceExplicitReconstruction(long address, long forceExplicitReconstruction);


    public static native long sizeof();

    public static class Array extends VkSamplerYcbcrConversionCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkSamplerYcbcrConversionCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSamplerYcbcrConversionCreateInfo.sizeof()));
            this.count = count;
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

        public static class Array extends VkSamplerYcbcrConversionCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSamplerYcbcrConversionCreateInfo.Pointer> {
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

            public Array(VkSamplerYcbcrConversionCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSamplerYcbcrConversionCreateInfo.Pointer get(int i){
                return new VkSamplerYcbcrConversionCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
