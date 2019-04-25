package cz.mg.vulkan;

public class VkSparseImageMemoryRequirements extends VkObject {
    public VkSparseImageMemoryRequirements() {
        super(sizeof());
    }

    public VkSparseImageMemoryRequirements(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSparseImageMemoryRequirements(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkSparseImageFormatProperties getFormatProperties() {
        return new VkSparseImageFormatProperties(getVkMemory(), getFormatProperties(getVkAddress()));
    }

    
    public void setFormatProperties(VkSparseImageFormatProperties formatProperties) {
        setFormatProperties(getVkAddress(), formatProperties != null ? formatProperties.getVkAddress() : VkPointer.getNullAddress());
        
    }

    protected static native long getFormatProperties(long address);
    protected static native void setFormatProperties(long address, long formatProperties);

    public VkUInt32 getImageMipTailFirstLod() {
        return new VkUInt32(getVkMemory(), getImageMipTailFirstLod(getVkAddress()));
    }

    
    public void setImageMipTailFirstLod(VkUInt32 imageMipTailFirstLod) {
        setImageMipTailFirstLod(getVkAddress(), imageMipTailFirstLod != null ? imageMipTailFirstLod.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getImageMipTailFirstLodQ() {
        return getImageMipTailFirstLod().getValue();
    }

    public void setImageMipTailFirstLod(int imageMipTailFirstLod) {
        getImageMipTailFirstLod().setValue(imageMipTailFirstLod);
    }

    protected static native long getImageMipTailFirstLod(long address);
    protected static native void setImageMipTailFirstLod(long address, long imageMipTailFirstLod);

    public VkDeviceSize getImageMipTailSize() {
        return new VkDeviceSize(getVkMemory(), getImageMipTailSize(getVkAddress()));
    }

    
    public void setImageMipTailSize(VkDeviceSize imageMipTailSize) {
        setImageMipTailSize(getVkAddress(), imageMipTailSize != null ? imageMipTailSize.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public long getImageMipTailSizeQ() {
        return getImageMipTailSize().getValue();
    }

    public void setImageMipTailSize(long imageMipTailSize) {
        getImageMipTailSize().setValue(imageMipTailSize);
    }

    protected static native long getImageMipTailSize(long address);
    protected static native void setImageMipTailSize(long address, long imageMipTailSize);

    public VkDeviceSize getImageMipTailOffset() {
        return new VkDeviceSize(getVkMemory(), getImageMipTailOffset(getVkAddress()));
    }

    
    public void setImageMipTailOffset(VkDeviceSize imageMipTailOffset) {
        setImageMipTailOffset(getVkAddress(), imageMipTailOffset != null ? imageMipTailOffset.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public long getImageMipTailOffsetQ() {
        return getImageMipTailOffset().getValue();
    }

    public void setImageMipTailOffset(long imageMipTailOffset) {
        getImageMipTailOffset().setValue(imageMipTailOffset);
    }

    protected static native long getImageMipTailOffset(long address);
    protected static native void setImageMipTailOffset(long address, long imageMipTailOffset);

    public VkDeviceSize getImageMipTailStride() {
        return new VkDeviceSize(getVkMemory(), getImageMipTailStride(getVkAddress()));
    }

    
    public void setImageMipTailStride(VkDeviceSize imageMipTailStride) {
        setImageMipTailStride(getVkAddress(), imageMipTailStride != null ? imageMipTailStride.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public long getImageMipTailStrideQ() {
        return getImageMipTailStride().getValue();
    }

    public void setImageMipTailStride(long imageMipTailStride) {
        getImageMipTailStride().setValue(imageMipTailStride);
    }

    protected static native long getImageMipTailStride(long address);
    protected static native void setImageMipTailStride(long address, long imageMipTailStride);


    public static native long sizeof();

    public static class Array extends VkSparseImageMemoryRequirements implements cz.mg.collections.array.ReadonlyArray<VkSparseImageMemoryRequirements> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSparseImageMemoryRequirements.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSparseImageMemoryRequirements o){
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
        public VkSparseImageMemoryRequirements get(int i){
            return new VkSparseImageMemoryRequirements(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSparseImageMemoryRequirements.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSparseImageMemoryRequirements.Pointer> {
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

            public Array(VkSparseImageMemoryRequirements[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSparseImageMemoryRequirements.Pointer get(int i){
                return new VkSparseImageMemoryRequirements.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
