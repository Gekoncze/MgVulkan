package cz.mg.vulkan;

public class VkPipelineCoverageToColorStateCreateInfoNV extends VkObject {
    public VkPipelineCoverageToColorStateCreateInfoNV() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO_NV));
    }

    public VkPipelineCoverageToColorStateCreateInfoNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineCoverageToColorStateCreateInfoNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineCoverageToColorStateCreateInfoNV(VkPointer pointer) {
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

    public VkPipelineCoverageToColorStateCreateFlagsNV getFlags() {
        return new VkPipelineCoverageToColorStateCreateFlagsNV(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkPipelineCoverageToColorStateCreateFlagsNV flags) {
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

    public VkBool32 getCoverageToColorEnable() {
        return new VkBool32(getVkMemory(), getCoverageToColorEnableNative(getVkAddress()));
    }

    
    public void setCoverageToColorEnable(VkBool32 coverageToColorEnable) {
        setCoverageToColorEnableNative(getVkAddress(), coverageToColorEnable != null ? coverageToColorEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCoverageToColorEnableQ() {
        return getCoverageToColorEnable().getValue();
    }

    public void setCoverageToColorEnable(int coverageToColorEnable) {
        getCoverageToColorEnable().setValue(coverageToColorEnable);
    }

    protected static native long getCoverageToColorEnableNative(long address);
    protected static native void setCoverageToColorEnableNative(long address, long coverageToColorEnable);

    public VkUInt32 getCoverageToColorLocation() {
        return new VkUInt32(getVkMemory(), getCoverageToColorLocationNative(getVkAddress()));
    }

    
    public void setCoverageToColorLocation(VkUInt32 coverageToColorLocation) {
        setCoverageToColorLocationNative(getVkAddress(), coverageToColorLocation != null ? coverageToColorLocation.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCoverageToColorLocationQ() {
        return getCoverageToColorLocation().getValue();
    }

    public void setCoverageToColorLocation(int coverageToColorLocation) {
        getCoverageToColorLocation().setValue(coverageToColorLocation);
    }

    protected static native long getCoverageToColorLocationNative(long address);
    protected static native void setCoverageToColorLocationNative(long address, long coverageToColorLocation);


    public void set(VkPipelineCoverageToColorStateCreateInfoNV o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPipelineCoverageToColorStateCreateInfoNV implements cz.mg.collections.array.ReadonlyArray<VkPipelineCoverageToColorStateCreateInfoNV> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineCoverageToColorStateCreateInfoNV.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO_NV));;
        }

        public Array(int count, VkPipelineCoverageToColorStateCreateInfoNV o){
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
        public VkPipelineCoverageToColorStateCreateInfoNV get(int i){
            return new VkPipelineCoverageToColorStateCreateInfoNV(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
