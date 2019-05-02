package cz.mg.vulkan;

public class VkSparseImageMemoryRequirements extends VkObject {
    public VkSparseImageMemoryRequirements() {
        super(sizeof());
    }

    protected VkSparseImageMemoryRequirements(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSparseImageMemoryRequirements(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSparseImageMemoryRequirements(VkPointer pointer) {
        super(pointer);
    }



    public VkSparseImageFormatProperties getFormatProperties() {
        return new VkSparseImageFormatProperties(getVkMemory(), getFormatPropertiesNative(getVkAddress()));
    }

    
    public void setFormatProperties(VkSparseImageFormatProperties formatProperties) {
        setFormatPropertiesNative(getVkAddress(), formatProperties != null ? formatProperties.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getFormatPropertiesNative(long address);
    protected static native void setFormatPropertiesNative(long address, long formatProperties);

    public VkUInt32 getImageMipTailFirstLod() {
        return new VkUInt32(getVkMemory(), getImageMipTailFirstLodNative(getVkAddress()));
    }

    
    public void setImageMipTailFirstLod(VkUInt32 imageMipTailFirstLod) {
        setImageMipTailFirstLodNative(getVkAddress(), imageMipTailFirstLod != null ? imageMipTailFirstLod.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getImageMipTailFirstLodQ() {
        return getImageMipTailFirstLod().getValue();
    }

    public void setImageMipTailFirstLod(int imageMipTailFirstLod) {
        getImageMipTailFirstLod().setValue(imageMipTailFirstLod);
    }

    protected static native long getImageMipTailFirstLodNative(long address);
    protected static native void setImageMipTailFirstLodNative(long address, long imageMipTailFirstLod);

    public VkDeviceSize getImageMipTailSize() {
        return new VkDeviceSize(getVkMemory(), getImageMipTailSizeNative(getVkAddress()));
    }

    
    public void setImageMipTailSize(VkDeviceSize imageMipTailSize) {
        setImageMipTailSizeNative(getVkAddress(), imageMipTailSize != null ? imageMipTailSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getImageMipTailSizeQ() {
        return getImageMipTailSize().getValue();
    }

    public void setImageMipTailSize(long imageMipTailSize) {
        getImageMipTailSize().setValue(imageMipTailSize);
    }

    protected static native long getImageMipTailSizeNative(long address);
    protected static native void setImageMipTailSizeNative(long address, long imageMipTailSize);

    public VkDeviceSize getImageMipTailOffset() {
        return new VkDeviceSize(getVkMemory(), getImageMipTailOffsetNative(getVkAddress()));
    }

    
    public void setImageMipTailOffset(VkDeviceSize imageMipTailOffset) {
        setImageMipTailOffsetNative(getVkAddress(), imageMipTailOffset != null ? imageMipTailOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getImageMipTailOffsetQ() {
        return getImageMipTailOffset().getValue();
    }

    public void setImageMipTailOffset(long imageMipTailOffset) {
        getImageMipTailOffset().setValue(imageMipTailOffset);
    }

    protected static native long getImageMipTailOffsetNative(long address);
    protected static native void setImageMipTailOffsetNative(long address, long imageMipTailOffset);

    public VkDeviceSize getImageMipTailStride() {
        return new VkDeviceSize(getVkMemory(), getImageMipTailStrideNative(getVkAddress()));
    }

    
    public void setImageMipTailStride(VkDeviceSize imageMipTailStride) {
        setImageMipTailStrideNative(getVkAddress(), imageMipTailStride != null ? imageMipTailStride.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getImageMipTailStrideQ() {
        return getImageMipTailStride().getValue();
    }

    public void setImageMipTailStride(long imageMipTailStride) {
        getImageMipTailStride().setValue(imageMipTailStride);
    }

    protected static native long getImageMipTailStrideNative(long address);
    protected static native void setImageMipTailStrideNative(long address, long imageMipTailStride);


    public void set(VkSparseImageMemoryRequirements o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkSparseImageMemoryRequirements implements cz.mg.collections.array.ReadonlyArray<VkSparseImageMemoryRequirements> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSparseImageMemoryRequirements.sizeof()));
            this.count = count;
        }

        public Array(VkSparseImageMemoryRequirements o, int count){
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
        public VkSparseImageMemoryRequirements get(int i){
            return new VkSparseImageMemoryRequirements(getVkMemory(), address(i));
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
