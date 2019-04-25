package cz.mg.vulkan;

public class VkSamplerYcbcrConversionInfo extends VkObject {
    public VkSamplerYcbcrConversionInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO));
    }

    public VkSamplerYcbcrConversionInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSamplerYcbcrConversionInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSamplerYcbcrConversionInfo(VkPointer pointer) {
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

    public VkSamplerYcbcrConversion getConversion() {
        return new VkSamplerYcbcrConversion(getVkMemory(), getConversionNative(getVkAddress()));
    }

    
    public void setConversion(VkSamplerYcbcrConversion conversion) {
        setConversionNative(getVkAddress(), conversion != null ? conversion.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getConversionNative(long address);
    protected static native void setConversionNative(long address, long conversion);


    public static native long sizeof();

    public static class Array extends VkSamplerYcbcrConversionInfo implements cz.mg.collections.array.ReadonlyArray<VkSamplerYcbcrConversionInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSamplerYcbcrConversionInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO));;
        }

        public Array(int count, VkSamplerYcbcrConversionInfo o){
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
        public VkSamplerYcbcrConversionInfo get(int i){
            return new VkSamplerYcbcrConversionInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
