package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineSampleLocationsStateCreateInfoEXT.html">khronos documentation</a>
 **/
public class VkPipelineSampleLocationsStateCreateInfoEXT extends VkObject {
    public VkPipelineSampleLocationsStateCreateInfoEXT() {
        super(sizeof());
    }

    public VkPipelineSampleLocationsStateCreateInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineSampleLocationsStateCreateInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineSampleLocationsStateCreateInfoEXT(VkObject pNext, VkBool32 sampleLocationsEnable, VkSampleLocationsInfoEXT sampleLocationsInfo) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT));
        setPNext(pNext);
        setSampleLocationsEnable(sampleLocationsEnable);
        setSampleLocationsInfo(sampleLocationsInfo);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.NULL_ADDRESS);
        
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

    public VkBool32 getSampleLocationsEnable() {
        return new VkBool32(getVkMemory(), getSampleLocationsEnable(getVkAddress()));
    }

    
    public void setSampleLocationsEnable(VkBool32 sampleLocationsEnable) {
        setSampleLocationsEnable(getVkAddress(), sampleLocationsEnable != null ? sampleLocationsEnable.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSampleLocationsEnable(long address);
    private static native void setSampleLocationsEnable(long address, long sampleLocationsEnable);

    public VkSampleLocationsInfoEXT getSampleLocationsInfo() {
        return new VkSampleLocationsInfoEXT(getVkMemory(), getSampleLocationsInfo(getVkAddress()));
    }

    
    public void setSampleLocationsInfo(VkSampleLocationsInfoEXT sampleLocationsInfo) {
        setSampleLocationsInfo(getVkAddress(), sampleLocationsInfo != null ? sampleLocationsInfo.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSampleLocationsInfo(long address);
    private static native void setSampleLocationsInfo(long address, long sampleLocationsInfo);


    public static native long sizeof();

    public static class Array extends VkPipelineSampleLocationsStateCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkPipelineSampleLocationsStateCreateInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineSampleLocationsStateCreateInfoEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPipelineSampleLocationsStateCreateInfoEXT o){
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
        public VkPipelineSampleLocationsStateCreateInfoEXT get(int i){
            return new VkPipelineSampleLocationsStateCreateInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPipelineSampleLocationsStateCreateInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkPipelineSampleLocationsStateCreateInfoEXT[] a) {
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
