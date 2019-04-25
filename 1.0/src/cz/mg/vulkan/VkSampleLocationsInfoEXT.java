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

    public VkSampleCountFlagBits getSampleLocationsPerPixel() {
        return new VkSampleCountFlagBits(getVkMemory(), getSampleLocationsPerPixel(getVkAddress()));
    }

    
    public void setSampleLocationsPerPixel(VkSampleCountFlagBits sampleLocationsPerPixel) {
        setSampleLocationsPerPixel(getVkAddress(), sampleLocationsPerPixel != null ? sampleLocationsPerPixel.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSampleLocationsPerPixelQ() {
        return getSampleLocationsPerPixel().getValue();
    }

    public void setSampleLocationsPerPixel(int sampleLocationsPerPixel) {
        getSampleLocationsPerPixel().setValue(sampleLocationsPerPixel);
    }

    protected static native long getSampleLocationsPerPixel(long address);
    protected static native void setSampleLocationsPerPixel(long address, long sampleLocationsPerPixel);

    public VkExtent2D getSampleLocationGridSize() {
        return new VkExtent2D(getVkMemory(), getSampleLocationGridSize(getVkAddress()));
    }

    
    public void setSampleLocationGridSize(VkExtent2D sampleLocationGridSize) {
        setSampleLocationGridSize(getVkAddress(), sampleLocationGridSize != null ? sampleLocationGridSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSampleLocationGridSize(long address);
    protected static native void setSampleLocationGridSize(long address, long sampleLocationGridSize);

    public VkUInt32 getSampleLocationsCount() {
        return new VkUInt32(getVkMemory(), getSampleLocationsCount(getVkAddress()));
    }

    
    public void setSampleLocationsCount(VkUInt32 sampleLocationsCount) {
        setSampleLocationsCount(getVkAddress(), sampleLocationsCount != null ? sampleLocationsCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSampleLocationsCountQ() {
        return getSampleLocationsCount().getValue();
    }

    public void setSampleLocationsCount(int sampleLocationsCount) {
        getSampleLocationsCount().setValue(sampleLocationsCount);
    }

    protected static native long getSampleLocationsCount(long address);
    protected static native void setSampleLocationsCount(long address, long sampleLocationsCount);

    public VkSampleLocationEXT getPSampleLocations() {
        return new VkSampleLocationEXT(getVkMemory(), getPSampleLocations(getVkAddress()));
    }

    private VkObject pSampleLocations = null;
    public void setPSampleLocations(VkSampleLocationEXT pSampleLocations) {
        setPSampleLocations(getVkAddress(), pSampleLocations != null ? pSampleLocations.getVkAddress() : VkPointer.NULL);
        this.pSampleLocations = pSampleLocations;
    }

    protected static native long getPSampleLocations(long address);
    protected static native void setPSampleLocations(long address, long pSampleLocations);


    public static native long sizeof();

    public static class Array extends VkSampleLocationsInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkSampleLocationsInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSampleLocationsInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SAMPLE_LOCATIONS_INFO_EXT));;
        }

        public Array(int count, VkSampleLocationsInfoEXT o){
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

        public static class Array extends VkSampleLocationsInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSampleLocationsInfoEXT.Pointer> {
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

            public Array(VkSampleLocationsInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            public Array(long... values){
                this(values.length);
                for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
            }

            public long getValueAt(int i){
                return getValueNative(addressAt(i));
            }

            public void setValueAt(int i, long value){
                setValueNative(addressAt(i), value);
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSampleLocationsInfoEXT.Pointer get(int i){
                return new VkSampleLocationsInfoEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
