package cz.mg.vulkan;

public class VkHdrMetadataEXT extends VkObject {
    public VkHdrMetadataEXT() {
        super(sizeof());
    }

    protected VkHdrMetadataEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkHdrMetadataEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkHdrMetadataEXT(VkPointer pointer) {
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

    public VkXYColorEXT getDisplayPrimaryRed() {
        return new VkXYColorEXT(getVkMemory(), getDisplayPrimaryRedNative(getVkAddress()));
    }

    
    public void setDisplayPrimaryRed(VkXYColorEXT displayPrimaryRed) {
        setDisplayPrimaryRedNative(getVkAddress(), displayPrimaryRed != null ? displayPrimaryRed.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getDisplayPrimaryRedNative(long address);
    protected static native void setDisplayPrimaryRedNative(long address, long displayPrimaryRed);

    public VkXYColorEXT getDisplayPrimaryGreen() {
        return new VkXYColorEXT(getVkMemory(), getDisplayPrimaryGreenNative(getVkAddress()));
    }

    
    public void setDisplayPrimaryGreen(VkXYColorEXT displayPrimaryGreen) {
        setDisplayPrimaryGreenNative(getVkAddress(), displayPrimaryGreen != null ? displayPrimaryGreen.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getDisplayPrimaryGreenNative(long address);
    protected static native void setDisplayPrimaryGreenNative(long address, long displayPrimaryGreen);

    public VkXYColorEXT getDisplayPrimaryBlue() {
        return new VkXYColorEXT(getVkMemory(), getDisplayPrimaryBlueNative(getVkAddress()));
    }

    
    public void setDisplayPrimaryBlue(VkXYColorEXT displayPrimaryBlue) {
        setDisplayPrimaryBlueNative(getVkAddress(), displayPrimaryBlue != null ? displayPrimaryBlue.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getDisplayPrimaryBlueNative(long address);
    protected static native void setDisplayPrimaryBlueNative(long address, long displayPrimaryBlue);

    public VkXYColorEXT getWhitePoint() {
        return new VkXYColorEXT(getVkMemory(), getWhitePointNative(getVkAddress()));
    }

    
    public void setWhitePoint(VkXYColorEXT whitePoint) {
        setWhitePointNative(getVkAddress(), whitePoint != null ? whitePoint.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getWhitePointNative(long address);
    protected static native void setWhitePointNative(long address, long whitePoint);

    public VkFloat getMaxLuminance() {
        return new VkFloat(getVkMemory(), getMaxLuminanceNative(getVkAddress()));
    }

    
    public void setMaxLuminance(VkFloat maxLuminance) {
        setMaxLuminanceNative(getVkAddress(), maxLuminance != null ? maxLuminance.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMaxLuminanceQ() {
        return getMaxLuminance().getValue();
    }

    public void setMaxLuminance(float maxLuminance) {
        getMaxLuminance().setValue(maxLuminance);
    }

    protected static native long getMaxLuminanceNative(long address);
    protected static native void setMaxLuminanceNative(long address, long maxLuminance);

    public VkFloat getMinLuminance() {
        return new VkFloat(getVkMemory(), getMinLuminanceNative(getVkAddress()));
    }

    
    public void setMinLuminance(VkFloat minLuminance) {
        setMinLuminanceNative(getVkAddress(), minLuminance != null ? minLuminance.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMinLuminanceQ() {
        return getMinLuminance().getValue();
    }

    public void setMinLuminance(float minLuminance) {
        getMinLuminance().setValue(minLuminance);
    }

    protected static native long getMinLuminanceNative(long address);
    protected static native void setMinLuminanceNative(long address, long minLuminance);

    public VkFloat getMaxContentLightLevel() {
        return new VkFloat(getVkMemory(), getMaxContentLightLevelNative(getVkAddress()));
    }

    
    public void setMaxContentLightLevel(VkFloat maxContentLightLevel) {
        setMaxContentLightLevelNative(getVkAddress(), maxContentLightLevel != null ? maxContentLightLevel.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMaxContentLightLevelQ() {
        return getMaxContentLightLevel().getValue();
    }

    public void setMaxContentLightLevel(float maxContentLightLevel) {
        getMaxContentLightLevel().setValue(maxContentLightLevel);
    }

    protected static native long getMaxContentLightLevelNative(long address);
    protected static native void setMaxContentLightLevelNative(long address, long maxContentLightLevel);

    public VkFloat getMaxFrameAverageLightLevel() {
        return new VkFloat(getVkMemory(), getMaxFrameAverageLightLevelNative(getVkAddress()));
    }

    
    public void setMaxFrameAverageLightLevel(VkFloat maxFrameAverageLightLevel) {
        setMaxFrameAverageLightLevelNative(getVkAddress(), maxFrameAverageLightLevel != null ? maxFrameAverageLightLevel.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public float getMaxFrameAverageLightLevelQ() {
        return getMaxFrameAverageLightLevel().getValue();
    }

    public void setMaxFrameAverageLightLevel(float maxFrameAverageLightLevel) {
        getMaxFrameAverageLightLevel().setValue(maxFrameAverageLightLevel);
    }

    protected static native long getMaxFrameAverageLightLevelNative(long address);
    protected static native void setMaxFrameAverageLightLevelNative(long address, long maxFrameAverageLightLevel);


    public static native long sizeof();

    public static class Array extends VkHdrMetadataEXT implements cz.mg.collections.array.ReadonlyArray<VkHdrMetadataEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkHdrMetadataEXT.sizeof()));
            this.count = count;
        }

        public Array(VkHdrMetadataEXT o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkHdrMetadataEXT get(int i){
            return new VkHdrMetadataEXT(getVkMemory(), address(i));
        }

        protected long address(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
