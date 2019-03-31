package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceSparseImageFormatInfo2.html">khronos documentation</a>
 **/
public class VkPhysicalDeviceSparseImageFormatInfo2 extends VkObject {
    public VkPhysicalDeviceSparseImageFormatInfo2() {
        super(sizeof());
    }

    public VkPhysicalDeviceSparseImageFormatInfo2(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkPhysicalDeviceSparseImageFormatInfo2(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkPhysicalDeviceSparseImageFormatInfo2(VkObject pNext, VkFormat format, VkImageType type, VkSampleCountFlagBits samples, VkImageUsageFlags usage, VkImageTiling tiling) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2));
        setPNext(pNext);
        setFormat(format);
        setType(type);
        setSamples(samples);
        setUsage(usage);
        setTiling(tiling);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType.getVkAddress());
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext.getVkAddress());
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkFormat getFormat() {
        return new VkFormat(getVkMemory(), getFormat(getVkAddress()));
    }

    public void setFormat(VkFormat format) {
        setFormat(getVkAddress(), format.getVkAddress());
    }

    private static native long getFormat(long address);
    private static native void setFormat(long address, long format);

    public VkImageType getType() {
        return new VkImageType(getVkMemory(), getType(getVkAddress()));
    }

    public void setType(VkImageType type) {
        setType(getVkAddress(), type.getVkAddress());
    }

    private static native long getType(long address);
    private static native void setType(long address, long type);

    public VkSampleCountFlagBits getSamples() {
        return new VkSampleCountFlagBits(getVkMemory(), getSamples(getVkAddress()));
    }

    public void setSamples(VkSampleCountFlagBits samples) {
        setSamples(getVkAddress(), samples.getVkAddress());
    }

    private static native long getSamples(long address);
    private static native void setSamples(long address, long samples);

    public VkImageUsageFlags getUsage() {
        return new VkImageUsageFlags(getVkMemory(), getUsage(getVkAddress()));
    }

    public void setUsage(VkImageUsageFlags usage) {
        setUsage(getVkAddress(), usage.getVkAddress());
    }

    private static native long getUsage(long address);
    private static native void setUsage(long address, long usage);

    public VkImageTiling getTiling() {
        return new VkImageTiling(getVkMemory(), getTiling(getVkAddress()));
    }

    public void setTiling(VkImageTiling tiling) {
        setTiling(getVkAddress(), tiling.getVkAddress());
    }

    private static native long getTiling(long address);
    private static native void setTiling(long address, long tiling);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceSparseImageFormatInfo2 implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceSparseImageFormatInfo2> {
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
        public VkPhysicalDeviceSparseImageFormatInfo2 get(int i){
            return new VkPhysicalDeviceSparseImageFormatInfo2(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkPhysicalDeviceSparseImageFormatInfo2[] a) {
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
