package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageCopy.html">khronos documentation</a>
 **/
public class VkImageCopy extends VkObject {
    public VkImageCopy() {
        super(sizeof());
    }

    public VkImageCopy(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkImageCopy(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkImageCopy(VkImageSubresourceLayers srcSubresource, VkOffset3D srcOffset, VkImageSubresourceLayers dstSubresource, VkOffset3D dstOffset, VkExtent3D extent) {
        super(sizeof());
        setSrcSubresource(srcSubresource);
        setSrcOffset(srcOffset);
        setDstSubresource(dstSubresource);
        setDstOffset(dstOffset);
        setExtent(extent);
    }

    public VkImageSubresourceLayers getSrcSubresource() {
        return new VkImageSubresourceLayers(getVkMemory(), getSrcSubresource(getVkAddress()));
    }

    public void setSrcSubresource(VkImageSubresourceLayers srcSubresource) {
        setSrcSubresource(getVkAddress(), srcSubresource.getVkAddress());
    }

    private static native long getSrcSubresource(long address);
    private static native void setSrcSubresource(long address, long srcSubresource);

    public VkOffset3D getSrcOffset() {
        return new VkOffset3D(getVkMemory(), getSrcOffset(getVkAddress()));
    }

    public void setSrcOffset(VkOffset3D srcOffset) {
        setSrcOffset(getVkAddress(), srcOffset.getVkAddress());
    }

    private static native long getSrcOffset(long address);
    private static native void setSrcOffset(long address, long srcOffset);

    public VkImageSubresourceLayers getDstSubresource() {
        return new VkImageSubresourceLayers(getVkMemory(), getDstSubresource(getVkAddress()));
    }

    public void setDstSubresource(VkImageSubresourceLayers dstSubresource) {
        setDstSubresource(getVkAddress(), dstSubresource.getVkAddress());
    }

    private static native long getDstSubresource(long address);
    private static native void setDstSubresource(long address, long dstSubresource);

    public VkOffset3D getDstOffset() {
        return new VkOffset3D(getVkMemory(), getDstOffset(getVkAddress()));
    }

    public void setDstOffset(VkOffset3D dstOffset) {
        setDstOffset(getVkAddress(), dstOffset.getVkAddress());
    }

    private static native long getDstOffset(long address);
    private static native void setDstOffset(long address, long dstOffset);

    public VkExtent3D getExtent() {
        return new VkExtent3D(getVkMemory(), getExtent(getVkAddress()));
    }

    public void setExtent(VkExtent3D extent) {
        setExtent(getVkAddress(), extent.getVkAddress());
    }

    private static native long getExtent(long address);
    private static native void setExtent(long address, long extent);


    public static native long sizeof();

    public static class Array extends VkImageCopy implements cz.mg.collections.array.ReadonlyArray<VkImageCopy> {
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
        public VkImageCopy get(int i){
            return new VkImageCopy(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkImageCopy[] a) {
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
