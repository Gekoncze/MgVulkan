package cz.mg.vulkan.vk;

public class VkImageCopy extends VkObject {
    public VkImageCopy() {
        super(sizeof());
    }

    public VkImageCopy(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageCopy(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
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
        setSrcSubresource(getVkAddress(), srcSubresource != null ? srcSubresource.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSrcSubresource(long address);
    private static native void setSrcSubresource(long address, long srcSubresource);

    public VkOffset3D getSrcOffset() {
        return new VkOffset3D(getVkMemory(), getSrcOffset(getVkAddress()));
    }

    
    public void setSrcOffset(VkOffset3D srcOffset) {
        setSrcOffset(getVkAddress(), srcOffset != null ? srcOffset.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSrcOffset(long address);
    private static native void setSrcOffset(long address, long srcOffset);

    public VkImageSubresourceLayers getDstSubresource() {
        return new VkImageSubresourceLayers(getVkMemory(), getDstSubresource(getVkAddress()));
    }

    
    public void setDstSubresource(VkImageSubresourceLayers dstSubresource) {
        setDstSubresource(getVkAddress(), dstSubresource != null ? dstSubresource.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDstSubresource(long address);
    private static native void setDstSubresource(long address, long dstSubresource);

    public VkOffset3D getDstOffset() {
        return new VkOffset3D(getVkMemory(), getDstOffset(getVkAddress()));
    }

    
    public void setDstOffset(VkOffset3D dstOffset) {
        setDstOffset(getVkAddress(), dstOffset != null ? dstOffset.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDstOffset(long address);
    private static native void setDstOffset(long address, long dstOffset);

    public VkExtent3D getExtent() {
        return new VkExtent3D(getVkMemory(), getExtent(getVkAddress()));
    }

    
    public void setExtent(VkExtent3D extent) {
        setExtent(getVkAddress(), extent != null ? extent.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getExtent(long address);
    private static native void setExtent(long address, long extent);


    public static native long sizeof();

    public static class Array extends VkImageCopy implements cz.mg.collections.array.ReadonlyArray<VkImageCopy> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageCopy.sizeof()));
            this.count = count;
        }

        public Array(int count, VkImageCopy o){
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

        public static class Array extends VkImageCopy.Pointer implements cz.mg.collections.array.ReadonlyArray<VkImageCopy.Pointer> {
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

            public Array(VkImageCopy[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkImageCopy.Pointer get(int i){
                return new VkImageCopy.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
