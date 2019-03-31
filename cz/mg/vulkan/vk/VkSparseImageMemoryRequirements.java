package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSparseImageMemoryRequirements.html">khronos documentation</a>
 **/
public class VkSparseImageMemoryRequirements extends VkObject {
    public VkSparseImageMemoryRequirements() {
        super(sizeof());
    }

    public VkSparseImageMemoryRequirements(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkSparseImageMemoryRequirements(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkSparseImageMemoryRequirements(VkSparseImageFormatProperties formatProperties, VkUInt32 imageMipTailFirstLod, VkDeviceSize imageMipTailSize, VkDeviceSize imageMipTailOffset, VkDeviceSize imageMipTailStride) {
        super(sizeof());
        setFormatProperties(formatProperties);
        setImageMipTailFirstLod(imageMipTailFirstLod);
        setImageMipTailSize(imageMipTailSize);
        setImageMipTailOffset(imageMipTailOffset);
        setImageMipTailStride(imageMipTailStride);
    }

    public VkSparseImageFormatProperties getFormatProperties() {
        return new VkSparseImageFormatProperties(getVkMemory(), getFormatProperties(getVkAddress()));
    }

    public void setFormatProperties(VkSparseImageFormatProperties formatProperties) {
        setFormatProperties(getVkAddress(), formatProperties.getVkAddress());
    }

    private static native long getFormatProperties(long address);
    private static native void setFormatProperties(long address, long formatProperties);

    public VkUInt32 getImageMipTailFirstLod() {
        return new VkUInt32(getVkMemory(), getImageMipTailFirstLod(getVkAddress()));
    }

    public void setImageMipTailFirstLod(VkUInt32 imageMipTailFirstLod) {
        setImageMipTailFirstLod(getVkAddress(), imageMipTailFirstLod.getVkAddress());
    }

    private static native long getImageMipTailFirstLod(long address);
    private static native void setImageMipTailFirstLod(long address, long imageMipTailFirstLod);

    public VkDeviceSize getImageMipTailSize() {
        return new VkDeviceSize(getVkMemory(), getImageMipTailSize(getVkAddress()));
    }

    public void setImageMipTailSize(VkDeviceSize imageMipTailSize) {
        setImageMipTailSize(getVkAddress(), imageMipTailSize.getVkAddress());
    }

    private static native long getImageMipTailSize(long address);
    private static native void setImageMipTailSize(long address, long imageMipTailSize);

    public VkDeviceSize getImageMipTailOffset() {
        return new VkDeviceSize(getVkMemory(), getImageMipTailOffset(getVkAddress()));
    }

    public void setImageMipTailOffset(VkDeviceSize imageMipTailOffset) {
        setImageMipTailOffset(getVkAddress(), imageMipTailOffset.getVkAddress());
    }

    private static native long getImageMipTailOffset(long address);
    private static native void setImageMipTailOffset(long address, long imageMipTailOffset);

    public VkDeviceSize getImageMipTailStride() {
        return new VkDeviceSize(getVkMemory(), getImageMipTailStride(getVkAddress()));
    }

    public void setImageMipTailStride(VkDeviceSize imageMipTailStride) {
        setImageMipTailStride(getVkAddress(), imageMipTailStride.getVkAddress());
    }

    private static native long getImageMipTailStride(long address);
    private static native void setImageMipTailStride(long address, long imageMipTailStride);


    public static native long sizeof();

    public static class Array extends VkSparseImageMemoryRequirements implements cz.mg.collections.array.ReadonlyArray<VkSparseImageMemoryRequirements> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*sizeof()));
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

        public static class Array extends Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*sizeof()));
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
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
