package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSparseImageFormatProperties.html">khronos documentation</a>
 **/
public class VkSparseImageFormatProperties extends VkObject {
    public VkSparseImageFormatProperties() {
        super(sizeof());
    }

    public VkSparseImageFormatProperties(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkSparseImageFormatProperties(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkSparseImageFormatProperties(VkImageAspectFlags aspectMask, VkExtent3D imageGranularity, VkSparseImageFormatFlags flags) {
        super(sizeof());
        setAspectMask(aspectMask);
        setImageGranularity(imageGranularity);
        setFlags(flags);
    }

    public VkImageAspectFlags getAspectMask() {
        return new VkImageAspectFlags(getVkMemory(), getAspectMask(getVkAddress()));
    }

    public void setAspectMask(VkImageAspectFlags aspectMask) {
        setAspectMask(getVkAddress(), aspectMask.getVkAddress());
    }

    private static native long getAspectMask(long address);
    private static native void setAspectMask(long address, long aspectMask);

    public VkExtent3D getImageGranularity() {
        return new VkExtent3D(getVkMemory(), getImageGranularity(getVkAddress()));
    }

    public void setImageGranularity(VkExtent3D imageGranularity) {
        setImageGranularity(getVkAddress(), imageGranularity.getVkAddress());
    }

    private static native long getImageGranularity(long address);
    private static native void setImageGranularity(long address, long imageGranularity);

    public VkSparseImageFormatFlags getFlags() {
        return new VkSparseImageFormatFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    public void setFlags(VkSparseImageFormatFlags flags) {
        setFlags(getVkAddress(), flags.getVkAddress());
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);


    public static native long sizeof();

    public static class Array extends VkSparseImageFormatProperties implements cz.mg.collections.array.ReadonlyArray<VkSparseImageFormatProperties> {
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
        public VkSparseImageFormatProperties get(int i){
            return new VkSparseImageFormatProperties(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkSparseImageFormatProperties[] a) {
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
