package cz.mg.vulkan;

public class VkSamplerReductionModeCreateInfoEXT extends VkObject {
    public VkSamplerReductionModeCreateInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO_EXT));
    }

    public VkSamplerReductionModeCreateInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSamplerReductionModeCreateInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSamplerReductionModeCreateInfoEXT(VkPointer pointer) {
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

    public VkSamplerReductionModeEXT getReductionMode() {
        return new VkSamplerReductionModeEXT(getVkMemory(), getReductionMode(getVkAddress()));
    }

    
    public void setReductionMode(VkSamplerReductionModeEXT reductionMode) {
        setReductionMode(getVkAddress(), reductionMode != null ? reductionMode.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getReductionModeQ() {
        return getReductionMode().getValue();
    }

    public void setReductionMode(int reductionMode) {
        getReductionMode().setValue(reductionMode);
    }

    protected static native long getReductionMode(long address);
    protected static native void setReductionMode(long address, long reductionMode);


    public static native long sizeof();

    public static class Array extends VkSamplerReductionModeCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkSamplerReductionModeCreateInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSamplerReductionModeCreateInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO_EXT));;
        }

        public Array(int count, VkSamplerReductionModeCreateInfoEXT o){
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
        public VkSamplerReductionModeCreateInfoEXT get(int i){
            return new VkSamplerReductionModeCreateInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
