package cz.mg.vulkan;

public class VkImageSubresource extends VkObject {
    public VkImageSubresource() {
        super(sizeof());
    }

    protected VkImageSubresource(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkImageSubresource(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkImageSubresource(VkPointer pointer) {
        super(pointer);
    }



    public VkImageAspectFlags getAspectMask() {
        return new VkImageAspectFlags(getVkMemory(), getAspectMask(getVkAddress()));
    }

    
    public void setAspectMask(VkImageAspectFlags aspectMask) {
        setAspectMask(getVkAddress(), aspectMask != null ? aspectMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAspectMaskQ() {
        return getAspectMask().getValue();
    }

    public void setAspectMask(int aspectMask) {
        getAspectMask().setValue(aspectMask);
    }

    protected static native long getAspectMask(long address);
    protected static native void setAspectMask(long address, long aspectMask);

    public VkUInt32 getMipLevel() {
        return new VkUInt32(getVkMemory(), getMipLevel(getVkAddress()));
    }

    
    public void setMipLevel(VkUInt32 mipLevel) {
        setMipLevel(getVkAddress(), mipLevel != null ? mipLevel.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMipLevelQ() {
        return getMipLevel().getValue();
    }

    public void setMipLevel(int mipLevel) {
        getMipLevel().setValue(mipLevel);
    }

    protected static native long getMipLevel(long address);
    protected static native void setMipLevel(long address, long mipLevel);

    public VkUInt32 getArrayLayer() {
        return new VkUInt32(getVkMemory(), getArrayLayer(getVkAddress()));
    }

    
    public void setArrayLayer(VkUInt32 arrayLayer) {
        setArrayLayer(getVkAddress(), arrayLayer != null ? arrayLayer.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getArrayLayerQ() {
        return getArrayLayer().getValue();
    }

    public void setArrayLayer(int arrayLayer) {
        getArrayLayer().setValue(arrayLayer);
    }

    protected static native long getArrayLayer(long address);
    protected static native void setArrayLayer(long address, long arrayLayer);


    public static native long sizeof();

    public static class Array extends VkImageSubresource implements cz.mg.collections.array.ReadonlyArray<VkImageSubresource> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageSubresource.sizeof()));
            this.count = count;
        }

        public Array(VkImageSubresource o, int count){
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
        public VkImageSubresource get(int i){
            return new VkImageSubresource(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
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
