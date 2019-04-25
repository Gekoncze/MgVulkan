package cz.mg.vulkan;

public class VkPipelineSampleLocationsStateCreateInfoEXT extends VkObject {
    public VkPipelineSampleLocationsStateCreateInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT));
    }

    public VkPipelineSampleLocationsStateCreateInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineSampleLocationsStateCreateInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineSampleLocationsStateCreateInfoEXT(VkPointer pointer) {
        super(pointer);
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

    public VkBool32 getSampleLocationsEnable() {
        return new VkBool32(getVkMemory(), getSampleLocationsEnable(getVkAddress()));
    }

    
    public void setSampleLocationsEnable(VkBool32 sampleLocationsEnable) {
        setSampleLocationsEnable(getVkAddress(), sampleLocationsEnable != null ? sampleLocationsEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSampleLocationsEnableQ() {
        return getSampleLocationsEnable().getValue();
    }

    public void setSampleLocationsEnable(int sampleLocationsEnable) {
        getSampleLocationsEnable().setValue(sampleLocationsEnable);
    }

    protected static native long getSampleLocationsEnable(long address);
    protected static native void setSampleLocationsEnable(long address, long sampleLocationsEnable);

    public VkSampleLocationsInfoEXT getSampleLocationsInfo() {
        return new VkSampleLocationsInfoEXT(getVkMemory(), getSampleLocationsInfo(getVkAddress()));
    }

    
    public void setSampleLocationsInfo(VkSampleLocationsInfoEXT sampleLocationsInfo) {
        setSampleLocationsInfo(getVkAddress(), sampleLocationsInfo != null ? sampleLocationsInfo.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSampleLocationsInfo(long address);
    protected static native void setSampleLocationsInfo(long address, long sampleLocationsInfo);


    public static native long sizeof();

    public static class Array extends VkPipelineSampleLocationsStateCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkPipelineSampleLocationsStateCreateInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineSampleLocationsStateCreateInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT));;
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

}
