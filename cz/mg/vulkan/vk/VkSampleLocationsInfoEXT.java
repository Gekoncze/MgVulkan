package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSampleLocationsInfoEXT.html">khronos documentation</a>
 **/
public class VkSampleLocationsInfoEXT extends VkObject {
    public VkSampleLocationsInfoEXT() {
        super(sizeof());
    }

    public VkSampleLocationsInfoEXT(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkSampleLocationsInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkSampleLocationsInfoEXT(VkObject pNext, VkSampleCountFlagBits sampleLocationsPerPixel, VkExtent2D sampleLocationGridSize, VkUInt32 sampleLocationsCount, VkSampleLocationEXT pSampleLocations) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SAMPLE_LOCATIONS_INFO_EXT));
        setPNext(pNext);
        setSampleLocationsPerPixel(sampleLocationsPerPixel);
        setSampleLocationGridSize(sampleLocationGridSize);
        setSampleLocationsCount(sampleLocationsCount);
        setPSampleLocations(pSampleLocations);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType.getVkAddress());
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext.getVkAddress());
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkSampleCountFlagBits getSampleLocationsPerPixel() {
        return new VkSampleCountFlagBits(getVkMemory(), getSampleLocationsPerPixel(getVkAddress()));
    }

    public void setSampleLocationsPerPixel(VkSampleCountFlagBits sampleLocationsPerPixel) {
        setSampleLocationsPerPixel(getVkAddress(), sampleLocationsPerPixel.getVkAddress());
    }

    private static native long getSampleLocationsPerPixel(long address);
    private static native void setSampleLocationsPerPixel(long address, long sampleLocationsPerPixel);

    public VkExtent2D getSampleLocationGridSize() {
        return new VkExtent2D(getVkMemory(), getSampleLocationGridSize(getVkAddress()));
    }

    public void setSampleLocationGridSize(VkExtent2D sampleLocationGridSize) {
        setSampleLocationGridSize(getVkAddress(), sampleLocationGridSize.getVkAddress());
    }

    private static native long getSampleLocationGridSize(long address);
    private static native void setSampleLocationGridSize(long address, long sampleLocationGridSize);

    public VkUInt32 getSampleLocationsCount() {
        return new VkUInt32(getVkMemory(), getSampleLocationsCount(getVkAddress()));
    }

    public void setSampleLocationsCount(VkUInt32 sampleLocationsCount) {
        setSampleLocationsCount(getVkAddress(), sampleLocationsCount.getVkAddress());
    }

    private static native long getSampleLocationsCount(long address);
    private static native void setSampleLocationsCount(long address, long sampleLocationsCount);

    public VkSampleLocationEXT.Array getPSampleLocations() {
        return new VkSampleLocationEXT.Array(getVkMemory(), getPSampleLocations(getVkAddress()), getSampleLocationsCount().getValue());
    }

    public void setPSampleLocations(VkSampleLocationEXT pSampleLocations) {
        setPSampleLocations(getVkAddress(), pSampleLocations.getVkAddress());
    }

    private static native long getPSampleLocations(long address);
    private static native void setPSampleLocations(long address, long pSampleLocations);


    public static native long sizeof();

    public static class Array extends VkSampleLocationsInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkSampleLocationsInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*sizeof()));
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

        public static class Array extends Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*sizeof()));
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

            @Override
            public int count(){
                return count;
            }

            @Override
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
