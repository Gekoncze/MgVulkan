package cz.mg.vulkan;

public class VkPhysicalDeviceSampleLocationsPropertiesEXT extends VkObject {
    public VkPhysicalDeviceSampleLocationsPropertiesEXT() {
        super(sizeof());
    }

    protected VkPhysicalDeviceSampleLocationsPropertiesEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceSampleLocationsPropertiesEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceSampleLocationsPropertiesEXT(VkPointer pointer) {
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

    public VkSampleCountFlags getSampleLocationSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getSampleLocationSampleCountsNative(getVkAddress()));
    }

    
    public void setSampleLocationSampleCounts(VkSampleCountFlags sampleLocationSampleCounts) {
        setSampleLocationSampleCountsNative(getVkAddress(), sampleLocationSampleCounts != null ? sampleLocationSampleCounts.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSampleLocationSampleCountsQ() {
        return getSampleLocationSampleCounts().getValue();
    }

    public void setSampleLocationSampleCounts(int sampleLocationSampleCounts) {
        getSampleLocationSampleCounts().setValue(sampleLocationSampleCounts);
    }

    protected static native long getSampleLocationSampleCountsNative(long address);
    protected static native void setSampleLocationSampleCountsNative(long address, long sampleLocationSampleCounts);

    public VkExtent2D getMaxSampleLocationGridSize() {
        return new VkExtent2D(getVkMemory(), getMaxSampleLocationGridSizeNative(getVkAddress()));
    }

    
    public void setMaxSampleLocationGridSize(VkExtent2D maxSampleLocationGridSize) {
        setMaxSampleLocationGridSizeNative(getVkAddress(), maxSampleLocationGridSize != null ? maxSampleLocationGridSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getMaxSampleLocationGridSizeNative(long address);
    protected static native void setMaxSampleLocationGridSizeNative(long address, long maxSampleLocationGridSize);

    public VkFloat getSampleLocationCoordinateRange() {
        return new VkFloat(getVkMemory(), getSampleLocationCoordinateRangeNative(getVkAddress()));
    }

    
    public void setSampleLocationCoordinateRange(VkFloat sampleLocationCoordinateRange) {
        setSampleLocationCoordinateRangeNative(getVkAddress(), sampleLocationCoordinateRange != null ? sampleLocationCoordinateRange.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getSampleLocationCoordinateRangeNative(long address);
    protected static native void setSampleLocationCoordinateRangeNative(long address, long sampleLocationCoordinateRange);

    public VkUInt32 getSampleLocationSubPixelBits() {
        return new VkUInt32(getVkMemory(), getSampleLocationSubPixelBitsNative(getVkAddress()));
    }

    
    public void setSampleLocationSubPixelBits(VkUInt32 sampleLocationSubPixelBits) {
        setSampleLocationSubPixelBitsNative(getVkAddress(), sampleLocationSubPixelBits != null ? sampleLocationSubPixelBits.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSampleLocationSubPixelBitsQ() {
        return getSampleLocationSubPixelBits().getValue();
    }

    public void setSampleLocationSubPixelBits(int sampleLocationSubPixelBits) {
        getSampleLocationSubPixelBits().setValue(sampleLocationSubPixelBits);
    }

    protected static native long getSampleLocationSubPixelBitsNative(long address);
    protected static native void setSampleLocationSubPixelBitsNative(long address, long sampleLocationSubPixelBits);

    public VkBool32 getVariableSampleLocations() {
        return new VkBool32(getVkMemory(), getVariableSampleLocationsNative(getVkAddress()));
    }

    
    public void setVariableSampleLocations(VkBool32 variableSampleLocations) {
        setVariableSampleLocationsNative(getVkAddress(), variableSampleLocations != null ? variableSampleLocations.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getVariableSampleLocationsQ() {
        return getVariableSampleLocations().getValue();
    }

    public void setVariableSampleLocations(int variableSampleLocations) {
        getVariableSampleLocations().setValue(variableSampleLocations);
    }

    protected static native long getVariableSampleLocationsNative(long address);
    protected static native void setVariableSampleLocationsNative(long address, long variableSampleLocations);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceSampleLocationsPropertiesEXT implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceSampleLocationsPropertiesEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceSampleLocationsPropertiesEXT.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceSampleLocationsPropertiesEXT o, int count){
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
        public VkPhysicalDeviceSampleLocationsPropertiesEXT get(int i){
            return new VkPhysicalDeviceSampleLocationsPropertiesEXT(getVkMemory(), address(i));
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
