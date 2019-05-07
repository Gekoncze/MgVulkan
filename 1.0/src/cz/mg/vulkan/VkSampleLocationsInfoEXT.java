package cz.mg.vulkan;

public class VkSampleLocationsInfoEXT extends VkObject {
    public VkSampleLocationsInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SAMPLE_LOCATIONS_INFO_EXT));
    }

    public VkSampleLocationsInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSampleLocationsInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSampleLocationsInfoEXT(VkPointer pointer) {
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

    public VkSampleCountFlagBits getSampleLocationsPerPixel() {
        return new VkSampleCountFlagBits(getVkMemory(), getSampleLocationsPerPixelNative(getVkAddress()));
    }

    
    public void setSampleLocationsPerPixel(VkSampleCountFlagBits sampleLocationsPerPixel) {
        setSampleLocationsPerPixelNative(getVkAddress(), sampleLocationsPerPixel != null ? sampleLocationsPerPixel.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSampleLocationsPerPixelQ() {
        return getSampleLocationsPerPixel().getValue();
    }

    public void setSampleLocationsPerPixel(int sampleLocationsPerPixel) {
        getSampleLocationsPerPixel().setValue(sampleLocationsPerPixel);
    }

    protected static native long getSampleLocationsPerPixelNative(long address);
    protected static native void setSampleLocationsPerPixelNative(long address, long sampleLocationsPerPixel);

    public VkExtent2D getSampleLocationGridSize() {
        return new VkExtent2D(getVkMemory(), getSampleLocationGridSizeNative(getVkAddress()));
    }

    
    public void setSampleLocationGridSize(VkExtent2D sampleLocationGridSize) {
        setSampleLocationGridSizeNative(getVkAddress(), sampleLocationGridSize != null ? sampleLocationGridSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSampleLocationGridSizeNative(long address);
    protected static native void setSampleLocationGridSizeNative(long address, long sampleLocationGridSize);

    public VkUInt32 getSampleLocationsCount() {
        return new VkUInt32(getVkMemory(), getSampleLocationsCountNative(getVkAddress()));
    }

    
    public void setSampleLocationsCount(VkUInt32 sampleLocationsCount) {
        setSampleLocationsCountNative(getVkAddress(), sampleLocationsCount != null ? sampleLocationsCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSampleLocationsCountQ() {
        return getSampleLocationsCount().getValue();
    }

    public void setSampleLocationsCount(int sampleLocationsCount) {
        getSampleLocationsCount().setValue(sampleLocationsCount);
    }

    protected static native long getSampleLocationsCountNative(long address);
    protected static native void setSampleLocationsCountNative(long address, long sampleLocationsCount);

    public VkSampleLocationEXT getPSampleLocations() {
        return new VkSampleLocationEXT(getVkMemory(), getPSampleLocationsNative(getVkAddress()));
    }

    private VkObject pSampleLocations = null;
    public void setPSampleLocations(VkSampleLocationEXT pSampleLocations) {
        setPSampleLocationsNative(getVkAddress(), pSampleLocations != null ? pSampleLocations.getVkAddress() : VkPointer.NULL);
        this.pSampleLocations = pSampleLocations;
    }

    public VkSampleLocationEXT.Array getPSampleLocationsQ() {
        return new VkSampleLocationEXT.Array(getPSampleLocations(), getSampleLocationsCountQ());
    }

    protected static native long getPSampleLocationsNative(long address);
    protected static native void setPSampleLocationsNative(long address, long pSampleLocations);


    public void set(VkSampleLocationsInfoEXT o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkSampleLocationsInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkSampleLocationsInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSampleLocationsInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SAMPLE_LOCATIONS_INFO_EXT));;
        }

        public Array(VkSampleLocationsInfoEXT o, int count){
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
        public VkSampleLocationsInfoEXT get(int i){
            return new VkSampleLocationsInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
