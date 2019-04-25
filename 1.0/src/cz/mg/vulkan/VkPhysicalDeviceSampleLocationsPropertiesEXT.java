package cz.mg.vulkan;

public class VkPhysicalDeviceSampleLocationsPropertiesEXT extends VkObject {
    public VkPhysicalDeviceSampleLocationsPropertiesEXT() {
        super(sizeof());
    }

    public VkPhysicalDeviceSampleLocationsPropertiesEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceSampleLocationsPropertiesEXT(VkMemory vkmemory, long vkaddress) {
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

    public VkSampleCountFlags getSampleLocationSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getSampleLocationSampleCounts(getVkAddress()));
    }

    
    public void setSampleLocationSampleCounts(VkSampleCountFlags sampleLocationSampleCounts) {
        setSampleLocationSampleCounts(getVkAddress(), sampleLocationSampleCounts != null ? sampleLocationSampleCounts.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSampleLocationSampleCountsQ() {
        return getSampleLocationSampleCounts().getValue();
    }

    public void setSampleLocationSampleCounts(int sampleLocationSampleCounts) {
        getSampleLocationSampleCounts().setValue(sampleLocationSampleCounts);
    }

    protected static native long getSampleLocationSampleCounts(long address);
    protected static native void setSampleLocationSampleCounts(long address, long sampleLocationSampleCounts);

    public VkExtent2D getMaxSampleLocationGridSize() {
        return new VkExtent2D(getVkMemory(), getMaxSampleLocationGridSize(getVkAddress()));
    }

    
    public void setMaxSampleLocationGridSize(VkExtent2D maxSampleLocationGridSize) {
        setMaxSampleLocationGridSize(getVkAddress(), maxSampleLocationGridSize != null ? maxSampleLocationGridSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getMaxSampleLocationGridSize(long address);
    protected static native void setMaxSampleLocationGridSize(long address, long maxSampleLocationGridSize);

    public VkFloat getSampleLocationCoordinateRange() {
        return new VkFloat(getVkMemory(), getSampleLocationCoordinateRange(getVkAddress()));
    }

    
    public void setSampleLocationCoordinateRange(VkFloat sampleLocationCoordinateRange) {
        setSampleLocationCoordinateRange(getVkAddress(), sampleLocationCoordinateRange != null ? sampleLocationCoordinateRange.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getSampleLocationCoordinateRange(long address);
    protected static native void setSampleLocationCoordinateRange(long address, long sampleLocationCoordinateRange);

    public VkUInt32 getSampleLocationSubPixelBits() {
        return new VkUInt32(getVkMemory(), getSampleLocationSubPixelBits(getVkAddress()));
    }

    
    public void setSampleLocationSubPixelBits(VkUInt32 sampleLocationSubPixelBits) {
        setSampleLocationSubPixelBits(getVkAddress(), sampleLocationSubPixelBits != null ? sampleLocationSubPixelBits.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSampleLocationSubPixelBitsQ() {
        return getSampleLocationSubPixelBits().getValue();
    }

    public void setSampleLocationSubPixelBits(int sampleLocationSubPixelBits) {
        getSampleLocationSubPixelBits().setValue(sampleLocationSubPixelBits);
    }

    protected static native long getSampleLocationSubPixelBits(long address);
    protected static native void setSampleLocationSubPixelBits(long address, long sampleLocationSubPixelBits);

    public VkBool32 getVariableSampleLocations() {
        return new VkBool32(getVkMemory(), getVariableSampleLocations(getVkAddress()));
    }

    
    public void setVariableSampleLocations(VkBool32 variableSampleLocations) {
        setVariableSampleLocations(getVkAddress(), variableSampleLocations != null ? variableSampleLocations.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getVariableSampleLocationsQ() {
        return getVariableSampleLocations().getValue();
    }

    public void setVariableSampleLocations(int variableSampleLocations) {
        getVariableSampleLocations().setValue(variableSampleLocations);
    }

    protected static native long getVariableSampleLocations(long address);
    protected static native void setVariableSampleLocations(long address, long variableSampleLocations);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceSampleLocationsPropertiesEXT implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceSampleLocationsPropertiesEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceSampleLocationsPropertiesEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceSampleLocationsPropertiesEXT o){
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
        public VkPhysicalDeviceSampleLocationsPropertiesEXT get(int i){
            return new VkPhysicalDeviceSampleLocationsPropertiesEXT(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            public Array2(int count, VkPointer o){
                super(count, o);
            }

            public Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            public Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
