package cz.mg.vulkan;

public class VkSamplerYcbcrConversionInfoKHR extends VkObject {
    public VkSamplerYcbcrConversionInfoKHR() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO_KHR));
    }

    public VkSamplerYcbcrConversionInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSamplerYcbcrConversionInfoKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSamplerYcbcrConversionInfoKHR(VkPointer pointer) {
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

    public VkSamplerYcbcrConversionKHR getConversion() {
        return new VkSamplerYcbcrConversionKHR(getVkMemory(), getConversion(getVkAddress()));
    }

    
    public void setConversion(VkSamplerYcbcrConversionKHR conversion) {
        setConversion(getVkAddress(), conversion != null ? conversion.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getConversion(long address);
    protected static native void setConversion(long address, long conversion);


    public static native long sizeof();

    public static class Array extends VkSamplerYcbcrConversionInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkSamplerYcbcrConversionInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSamplerYcbcrConversionInfoKHR.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO_KHR));;
        }

        public Array(int count, VkSamplerYcbcrConversionInfoKHR o){
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
        public VkSamplerYcbcrConversionInfoKHR get(int i){
            return new VkSamplerYcbcrConversionInfoKHR(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
