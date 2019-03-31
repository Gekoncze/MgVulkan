package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageViewCreateInfo.html">khronos documentation</a>
 **/
public class VkImageViewCreateInfo extends VkObject {
    public VkImageViewCreateInfo() {
        super(sizeof());
    }

    public VkImageViewCreateInfo(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkImageViewCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkImageViewCreateInfo(VkObject pNext, VkImageViewCreateFlags flags, VkImage image, VkImageViewType viewType, VkFormat format, VkComponentMapping components, VkImageSubresourceRange subresourceRange) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO));
        setPNext(pNext);
        setFlags(flags);
        setImage(image);
        setViewType(viewType);
        setFormat(format);
        setComponents(components);
        setSubresourceRange(subresourceRange);
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

    public VkImageViewCreateFlags getFlags() {
        return new VkImageViewCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    public void setFlags(VkImageViewCreateFlags flags) {
        setFlags(getVkAddress(), flags.getVkAddress());
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkImage getImage() {
        return new VkImage(getVkMemory(), getImage(getVkAddress()));
    }

    public void setImage(VkImage image) {
        setImage(getVkAddress(), image.getVkAddress());
    }

    private static native long getImage(long address);
    private static native void setImage(long address, long image);

    public VkImageViewType getViewType() {
        return new VkImageViewType(getVkMemory(), getViewType(getVkAddress()));
    }

    public void setViewType(VkImageViewType viewType) {
        setViewType(getVkAddress(), viewType.getVkAddress());
    }

    private static native long getViewType(long address);
    private static native void setViewType(long address, long viewType);

    public VkFormat getFormat() {
        return new VkFormat(getVkMemory(), getFormat(getVkAddress()));
    }

    public void setFormat(VkFormat format) {
        setFormat(getVkAddress(), format.getVkAddress());
    }

    private static native long getFormat(long address);
    private static native void setFormat(long address, long format);

    public VkComponentMapping getComponents() {
        return new VkComponentMapping(getVkMemory(), getComponents(getVkAddress()));
    }

    public void setComponents(VkComponentMapping components) {
        setComponents(getVkAddress(), components.getVkAddress());
    }

    private static native long getComponents(long address);
    private static native void setComponents(long address, long components);

    public VkImageSubresourceRange getSubresourceRange() {
        return new VkImageSubresourceRange(getVkMemory(), getSubresourceRange(getVkAddress()));
    }

    public void setSubresourceRange(VkImageSubresourceRange subresourceRange) {
        setSubresourceRange(getVkAddress(), subresourceRange.getVkAddress());
    }

    private static native long getSubresourceRange(long address);
    private static native void setSubresourceRange(long address, long subresourceRange);


    public static native long sizeof();

    public static class Array extends VkImageViewCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkImageViewCreateInfo> {
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
        public VkImageViewCreateInfo get(int i){
            return new VkImageViewCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkImageViewCreateInfo[] a) {
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
