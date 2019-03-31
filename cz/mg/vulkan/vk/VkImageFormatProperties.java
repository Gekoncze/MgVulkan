package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageFormatProperties.html">khronos documentation</a>
 **/
public class VkImageFormatProperties extends VkObject {
    public VkImageFormatProperties() {
        super(sizeof());
    }

    public VkImageFormatProperties(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkImageFormatProperties(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkImageFormatProperties(VkExtent3D maxExtent, VkUInt32 maxMipLevels, VkUInt32 maxArrayLayers, VkSampleCountFlags sampleCounts, VkDeviceSize maxResourceSize) {
        super(sizeof());
        setMaxExtent(maxExtent);
        setMaxMipLevels(maxMipLevels);
        setMaxArrayLayers(maxArrayLayers);
        setSampleCounts(sampleCounts);
        setMaxResourceSize(maxResourceSize);
    }

    public VkExtent3D getMaxExtent() {
        return new VkExtent3D(getVkMemory(), getMaxExtent(getVkAddress()));
    }

    public void setMaxExtent(VkExtent3D maxExtent) {
        setMaxExtent(getVkAddress(), maxExtent.getVkAddress());
    }

    private static native long getMaxExtent(long address);
    private static native void setMaxExtent(long address, long maxExtent);

    public VkUInt32 getMaxMipLevels() {
        return new VkUInt32(getVkMemory(), getMaxMipLevels(getVkAddress()));
    }

    public void setMaxMipLevels(VkUInt32 maxMipLevels) {
        setMaxMipLevels(getVkAddress(), maxMipLevels.getVkAddress());
    }

    private static native long getMaxMipLevels(long address);
    private static native void setMaxMipLevels(long address, long maxMipLevels);

    public VkUInt32 getMaxArrayLayers() {
        return new VkUInt32(getVkMemory(), getMaxArrayLayers(getVkAddress()));
    }

    public void setMaxArrayLayers(VkUInt32 maxArrayLayers) {
        setMaxArrayLayers(getVkAddress(), maxArrayLayers.getVkAddress());
    }

    private static native long getMaxArrayLayers(long address);
    private static native void setMaxArrayLayers(long address, long maxArrayLayers);

    public VkSampleCountFlags getSampleCounts() {
        return new VkSampleCountFlags(getVkMemory(), getSampleCounts(getVkAddress()));
    }

    public void setSampleCounts(VkSampleCountFlags sampleCounts) {
        setSampleCounts(getVkAddress(), sampleCounts.getVkAddress());
    }

    private static native long getSampleCounts(long address);
    private static native void setSampleCounts(long address, long sampleCounts);

    public VkDeviceSize getMaxResourceSize() {
        return new VkDeviceSize(getVkMemory(), getMaxResourceSize(getVkAddress()));
    }

    public void setMaxResourceSize(VkDeviceSize maxResourceSize) {
        setMaxResourceSize(getVkAddress(), maxResourceSize.getVkAddress());
    }

    private static native long getMaxResourceSize(long address);
    private static native void setMaxResourceSize(long address, long maxResourceSize);


    public static native long sizeof();

    public static class Array extends VkImageFormatProperties implements cz.mg.collections.array.ReadonlyArray<VkImageFormatProperties> {
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
        public VkImageFormatProperties get(int i){
            return new VkImageFormatProperties(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkImageFormatProperties[] a) {
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
