package cz.mg.vulkan;

public class VkImageSubresourceLayers extends VkObject {
    public VkImageSubresourceLayers() {
        super(sizeof());
    }

    protected VkImageSubresourceLayers(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkImageSubresourceLayers(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkImageSubresourceLayers(VkPointer pointer) {
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

    public VkUInt32 getMipLevel() {
        return new VkUInt32(getVkMemory(), getMipLevelNative(getVkAddress()));
    }

    
    public void setMipLevel(VkUInt32 mipLevel) {
        setMipLevelNative(getVkAddress(), mipLevel != null ? mipLevel.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMipLevelQ() {
        return getMipLevel().getValue();
    }

    public void setMipLevel(int mipLevel) {
        getMipLevel().setValue(mipLevel);
    }

    protected static native long getMipLevelNative(long address);
    protected static native void setMipLevelNative(long address, long mipLevel);

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


    public void set(VkImageSubresourceLayers o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkImageSubresourceLayers implements cz.mg.collections.array.ReadonlyArray<VkImageSubresourceLayers> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageSubresourceLayers.sizeof()));
            this.count = count;
        }

        public Array(VkImageSubresourceLayers o, int count){
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
        public VkImageSubresourceLayers get(int i){
            return new VkImageSubresourceLayers(getVkMemory(), address(i));
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
