package cz.mg.vulkan;

public class VkImageSubresourceRange extends VkObject {
    public VkImageSubresourceRange() {
        super(sizeof());
    }

    protected VkImageSubresourceRange(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkImageSubresourceRange(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkImageSubresourceRange(VkPointer pointer) {
        super(pointer);
    }



    public VkImageAspectFlags getAspectMask() {
        return new VkImageAspectFlags(getVkMemory(), getAspectMaskNative(getVkAddress()));
    }

    
    public void setAspectMask(VkImageAspectFlags aspectMask) {
        setAspectMaskNative(getVkAddress(), aspectMask != null ? aspectMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAspectMaskQ() {
        return getAspectMask().getValue();
    }

    public void setAspectMask(int aspectMask) {
        getAspectMask().setValue(aspectMask);
    }

    protected static native long getAspectMaskNative(long address);
    protected static native void setAspectMaskNative(long address, long aspectMask);

    public VkUInt32 getBaseMipLevel() {
        return new VkUInt32(getVkMemory(), getBaseMipLevelNative(getVkAddress()));
    }

    
    public void setBaseMipLevel(VkUInt32 baseMipLevel) {
        setBaseMipLevelNative(getVkAddress(), baseMipLevel != null ? baseMipLevel.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getBaseMipLevelQ() {
        return getBaseMipLevel().getValue();
    }

    public void setBaseMipLevel(int baseMipLevel) {
        getBaseMipLevel().setValue(baseMipLevel);
    }

    protected static native long getBaseMipLevelNative(long address);
    protected static native void setBaseMipLevelNative(long address, long baseMipLevel);

    public VkUInt32 getLevelCount() {
        return new VkUInt32(getVkMemory(), getLevelCountNative(getVkAddress()));
    }

    
    public void setLevelCount(VkUInt32 levelCount) {
        setLevelCountNative(getVkAddress(), levelCount != null ? levelCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getLevelCountQ() {
        return getLevelCount().getValue();
    }

    public void setLevelCount(int levelCount) {
        getLevelCount().setValue(levelCount);
    }

    protected static native long getLevelCountNative(long address);
    protected static native void setLevelCountNative(long address, long levelCount);

    public VkUInt32 getBaseArrayLayer() {
        return new VkUInt32(getVkMemory(), getBaseArrayLayerNative(getVkAddress()));
    }

    
    public void setBaseArrayLayer(VkUInt32 baseArrayLayer) {
        setBaseArrayLayerNative(getVkAddress(), baseArrayLayer != null ? baseArrayLayer.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getBaseArrayLayerQ() {
        return getBaseArrayLayer().getValue();
    }

    public void setBaseArrayLayer(int baseArrayLayer) {
        getBaseArrayLayer().setValue(baseArrayLayer);
    }

    protected static native long getBaseArrayLayerNative(long address);
    protected static native void setBaseArrayLayerNative(long address, long baseArrayLayer);

    public VkUInt32 getLayerCount() {
        return new VkUInt32(getVkMemory(), getLayerCountNative(getVkAddress()));
    }

    
    public void setLayerCount(VkUInt32 layerCount) {
        setLayerCountNative(getVkAddress(), layerCount != null ? layerCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getLayerCountQ() {
        return getLayerCount().getValue();
    }

    public void setLayerCount(int layerCount) {
        getLayerCount().setValue(layerCount);
    }

    protected static native long getLayerCountNative(long address);
    protected static native void setLayerCountNative(long address, long layerCount);


    public static native long sizeof();

    public static class Array extends VkImageSubresourceRange implements cz.mg.collections.array.ReadonlyArray<VkImageSubresourceRange> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageSubresourceRange.sizeof()));
            this.count = count;
        }

        public Array(VkImageSubresourceRange o, int count){
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
        public VkImageSubresourceRange get(int i){
            return new VkImageSubresourceRange(getVkMemory(), address(i));
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
