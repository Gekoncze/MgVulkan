package cz.mg.vulkan;

public class VkImageSubresourceRange extends VkObject {
    public VkImageSubresourceRange() {
        super(sizeof());
    }

    public VkImageSubresourceRange(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageSubresourceRange(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkImageSubresourceRange(VkImageAspectFlags aspectMask, VkUInt32 baseMipLevel, VkUInt32 levelCount, VkUInt32 baseArrayLayer, VkUInt32 layerCount) {
        super(sizeof());
        setAspectMask(aspectMask);
        setBaseMipLevel(baseMipLevel);
        setLevelCount(levelCount);
        setBaseArrayLayer(baseArrayLayer);
        setLayerCount(layerCount);
    }

    public VkImageAspectFlags getAspectMask() {
        return new VkImageAspectFlags(getVkMemory(), getAspectMask(getVkAddress()));
    }

    
    public void setAspectMask(VkImageAspectFlags aspectMask) {
        setAspectMask(getVkAddress(), aspectMask != null ? aspectMask.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getAspectMask(long address);
    private static native void setAspectMask(long address, long aspectMask);

    public VkUInt32 getBaseMipLevel() {
        return new VkUInt32(getVkMemory(), getBaseMipLevel(getVkAddress()));
    }

    
    public void setBaseMipLevel(VkUInt32 baseMipLevel) {
        setBaseMipLevel(getVkAddress(), baseMipLevel != null ? baseMipLevel.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getBaseMipLevel(long address);
    private static native void setBaseMipLevel(long address, long baseMipLevel);

    public VkUInt32 getLevelCount() {
        return new VkUInt32(getVkMemory(), getLevelCount(getVkAddress()));
    }

    
    public void setLevelCount(VkUInt32 levelCount) {
        setLevelCount(getVkAddress(), levelCount != null ? levelCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getLevelCount(long address);
    private static native void setLevelCount(long address, long levelCount);

    public VkUInt32 getBaseArrayLayer() {
        return new VkUInt32(getVkMemory(), getBaseArrayLayer(getVkAddress()));
    }

    
    public void setBaseArrayLayer(VkUInt32 baseArrayLayer) {
        setBaseArrayLayer(getVkAddress(), baseArrayLayer != null ? baseArrayLayer.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getBaseArrayLayer(long address);
    private static native void setBaseArrayLayer(long address, long baseArrayLayer);

    public VkUInt32 getLayerCount() {
        return new VkUInt32(getVkMemory(), getLayerCount(getVkAddress()));
    }

    
    public void setLayerCount(VkUInt32 layerCount) {
        setLayerCount(getVkAddress(), layerCount != null ? layerCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getLayerCount(long address);
    private static native void setLayerCount(long address, long layerCount);


    public static native long sizeof();

    public static class Array extends VkImageSubresourceRange implements cz.mg.collections.array.ReadonlyArray<VkImageSubresourceRange> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageSubresourceRange.sizeof()));
            this.count = count;
        }

        public Array(int count, VkImageSubresourceRange o){
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
        public VkImageSubresourceRange get(int i){
            return new VkImageSubresourceRange(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }


    public static class Pointer extends VkObject.Pointer {        public Pointer() {
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

        public static class Array extends VkImageSubresourceRange.Pointer implements cz.mg.collections.array.ReadonlyArray<VkImageSubresourceRange.Pointer> {
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

            public Array(VkImageSubresourceRange[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkImageSubresourceRange.Pointer get(int i){
                return new VkImageSubresourceRange.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
