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
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
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

    public VkSampleCountFlags getSampleLocationSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getSampleLocationSampleCounts(getVkAddress()));
    }

    
    public void setSampleLocationSampleCounts(VkSampleCountFlags sampleLocationSampleCounts) {
        setSampleLocationSampleCounts(getVkAddress(), sampleLocationSampleCounts != null ? sampleLocationSampleCounts.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setSampleLocationSampleCounts(int sampleLocationSampleCounts) {
        getSampleLocationSampleCounts().setValue(sampleLocationSampleCounts);
    }

    private static native long getSampleLocationSampleCounts(long address);
    private static native void setSampleLocationSampleCounts(long address, long sampleLocationSampleCounts);

    public VkExtent2D getMaxSampleLocationGridSize() {
        return new VkExtent2D(getVkMemory(), getMaxSampleLocationGridSize(getVkAddress()));
    }

    
    public void setMaxSampleLocationGridSize(VkExtent2D maxSampleLocationGridSize) {
        setMaxSampleLocationGridSize(getVkAddress(), maxSampleLocationGridSize != null ? maxSampleLocationGridSize.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getMaxSampleLocationGridSize(long address);
    private static native void setMaxSampleLocationGridSize(long address, long maxSampleLocationGridSize);

    public VkFloat getSampleLocationCoordinateRange() {
        return new VkFloat(getVkMemory(), getSampleLocationCoordinateRange(getVkAddress()));
    }

    
    public void setSampleLocationCoordinateRange(VkFloat sampleLocationCoordinateRange) {
        setSampleLocationCoordinateRange(getVkAddress(), sampleLocationCoordinateRange != null ? sampleLocationCoordinateRange.getVkAddress() : VkPointer.NULL);
        
    }

    private static native long getSampleLocationCoordinateRange(long address);
    private static native void setSampleLocationCoordinateRange(long address, long sampleLocationCoordinateRange);

    public VkUInt32 getSampleLocationSubPixelBits() {
        return new VkUInt32(getVkMemory(), getSampleLocationSubPixelBits(getVkAddress()));
    }

    
    public void setSampleLocationSubPixelBits(VkUInt32 sampleLocationSubPixelBits) {
        setSampleLocationSubPixelBits(getVkAddress(), sampleLocationSubPixelBits != null ? sampleLocationSubPixelBits.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setSampleLocationSubPixelBits(int sampleLocationSubPixelBits) {
        getSampleLocationSubPixelBits().setValue(sampleLocationSubPixelBits);
    }

    private static native long getSampleLocationSubPixelBits(long address);
    private static native void setSampleLocationSubPixelBits(long address, long sampleLocationSubPixelBits);

    public VkBool32 getVariableSampleLocations() {
        return new VkBool32(getVkMemory(), getVariableSampleLocations(getVkAddress()));
    }

    
    public void setVariableSampleLocations(VkBool32 variableSampleLocations) {
        setVariableSampleLocations(getVkAddress(), variableSampleLocations != null ? variableSampleLocations.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setVariableSampleLocations(int variableSampleLocations) {
        getVariableSampleLocations().setValue(variableSampleLocations);
    }

    private static native long getVariableSampleLocations(long address);
    private static native void setVariableSampleLocations(long address, long variableSampleLocations);


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
            return new VkPhysicalDeviceSampleLocationsPropertiesEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPhysicalDeviceSampleLocationsPropertiesEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceSampleLocationsPropertiesEXT.Pointer> {
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

            public Array(VkPhysicalDeviceSampleLocationsPropertiesEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceSampleLocationsPropertiesEXT.Pointer get(int i){
                return new VkPhysicalDeviceSampleLocationsPropertiesEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
