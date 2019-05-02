package cz.mg.vulkan;

public class VkSamplerYcbcrConversionImageFormatProperties extends VkObject {
    public VkSamplerYcbcrConversionImageFormatProperties() {
        super(sizeof());
    }

    protected VkSamplerYcbcrConversionImageFormatProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSamplerYcbcrConversionImageFormatProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSamplerYcbcrConversionImageFormatProperties(VkPointer pointer) {
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

    public VkUInt32 getCombinedImageSamplerDescriptorCount() {
        return new VkUInt32(getVkMemory(), getCombinedImageSamplerDescriptorCountNative(getVkAddress()));
    }

    
    public void setCombinedImageSamplerDescriptorCount(VkUInt32 combinedImageSamplerDescriptorCount) {
        setCombinedImageSamplerDescriptorCountNative(getVkAddress(), combinedImageSamplerDescriptorCount != null ? combinedImageSamplerDescriptorCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCombinedImageSamplerDescriptorCountQ() {
        return getCombinedImageSamplerDescriptorCount().getValue();
    }

    public void setCombinedImageSamplerDescriptorCount(int combinedImageSamplerDescriptorCount) {
        getCombinedImageSamplerDescriptorCount().setValue(combinedImageSamplerDescriptorCount);
    }

    protected static native long getCombinedImageSamplerDescriptorCountNative(long address);
    protected static native void setCombinedImageSamplerDescriptorCountNative(long address, long combinedImageSamplerDescriptorCount);


    public void set(VkSamplerYcbcrConversionImageFormatProperties o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkSamplerYcbcrConversionImageFormatProperties implements cz.mg.collections.array.ReadonlyArray<VkSamplerYcbcrConversionImageFormatProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSamplerYcbcrConversionImageFormatProperties.sizeof()));
            this.count = count;
        }

        public Array(VkSamplerYcbcrConversionImageFormatProperties o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkSamplerYcbcrConversionImageFormatProperties get(int i){
            return new VkSamplerYcbcrConversionImageFormatProperties(getVkMemory(), address(i));
        }

        protected long address(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
