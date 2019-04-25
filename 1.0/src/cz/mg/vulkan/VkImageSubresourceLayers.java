package cz.mg.vulkan;

public class VkImageSubresourceLayers extends VkObject {
    public VkImageSubresourceLayers() {
        super(sizeof());
    }

    public VkImageSubresourceLayers(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageSubresourceLayers(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
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

    public VkUInt32 getBaseArrayLayer() {
        return new VkUInt32(getVkMemory(), getBaseArrayLayer(getVkAddress()));
    }

    
    public void setBaseArrayLayer(VkUInt32 baseArrayLayer) {
        setBaseArrayLayer(getVkAddress(), baseArrayLayer != null ? baseArrayLayer.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getBaseArrayLayerQ() {
        return getBaseArrayLayer().getValue();
    }

    public void setBaseArrayLayer(int baseArrayLayer) {
        getBaseArrayLayer().setValue(baseArrayLayer);
    }

    protected static native long getBaseArrayLayer(long address);
    protected static native void setBaseArrayLayer(long address, long baseArrayLayer);

    public VkUInt32 getLayerCount() {
        return new VkUInt32(getVkMemory(), getLayerCount(getVkAddress()));
    }

    
    public void setLayerCount(VkUInt32 layerCount) {
        setLayerCount(getVkAddress(), layerCount != null ? layerCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getLayerCountQ() {
        return getLayerCount().getValue();
    }

    public void setLayerCount(int layerCount) {
        getLayerCount().setValue(layerCount);
    }

    protected static native long getLayerCount(long address);
    protected static native void setLayerCount(long address, long layerCount);


    public static native long sizeof();

    public static class Array extends VkImageSubresourceLayers implements cz.mg.collections.array.ReadonlyArray<VkImageSubresourceLayers> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageSubresourceLayers.sizeof()));
            this.count = count;
        }

        public Array(int count, VkImageSubresourceLayers o){
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
        public VkImageSubresourceLayers get(int i){
            return new VkImageSubresourceLayers(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
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

        public static class Array extends VkImageSubresourceLayers.Pointer implements cz.mg.collections.array.ReadonlyArray<VkImageSubresourceLayers.Pointer> {
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

            public Array(VkImageSubresourceLayers[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            public Array(long... values){
                this(values.length);
                for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
            }

            public long getValueAt(int i){
                return getValueNative(addressAt(i));
            }

            public void setValueAt(int i, long value){
                setValueNative(addressAt(i), value);
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkImageSubresourceLayers.Pointer get(int i){
                return new VkImageSubresourceLayers.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
