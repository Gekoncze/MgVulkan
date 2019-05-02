package cz.mg.vulkan;

public class VkImageCopy extends VkObject {
    public VkImageCopy() {
        super(sizeof());
    }

    protected VkImageCopy(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkImageCopy(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkImageCopy(VkPointer pointer) {
        super(pointer);
    }



    public VkImageSubresourceLayers getSrcSubresource() {
        return new VkImageSubresourceLayers(getVkMemory(), getSrcSubresourceNative(getVkAddress()));
    }

    
    public void setSrcSubresource(VkImageSubresourceLayers srcSubresource) {
        setSrcSubresourceNative(getVkAddress(), srcSubresource != null ? srcSubresource.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSrcSubresourceNative(long address);
    protected static native void setSrcSubresourceNative(long address, long srcSubresource);

    public VkOffset3D getSrcOffset() {
        return new VkOffset3D(getVkMemory(), getSrcOffsetNative(getVkAddress()));
    }

    
    public void setSrcOffset(VkOffset3D srcOffset) {
        setSrcOffsetNative(getVkAddress(), srcOffset != null ? srcOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSrcOffsetNative(long address);
    protected static native void setSrcOffsetNative(long address, long srcOffset);

    public VkImageSubresourceLayers getDstSubresource() {
        return new VkImageSubresourceLayers(getVkMemory(), getDstSubresourceNative(getVkAddress()));
    }

    
    public void setDstSubresource(VkImageSubresourceLayers dstSubresource) {
        setDstSubresourceNative(getVkAddress(), dstSubresource != null ? dstSubresource.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getDstSubresourceNative(long address);
    protected static native void setDstSubresourceNative(long address, long dstSubresource);

    public VkOffset3D getDstOffset() {
        return new VkOffset3D(getVkMemory(), getDstOffsetNative(getVkAddress()));
    }

    
    public void setDstOffset(VkOffset3D dstOffset) {
        setDstOffsetNative(getVkAddress(), dstOffset != null ? dstOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getDstOffsetNative(long address);
    protected static native void setDstOffsetNative(long address, long dstOffset);

    public VkExtent3D getExtent() {
        return new VkExtent3D(getVkMemory(), getExtentNative(getVkAddress()));
    }

    
    public void setExtent(VkExtent3D extent) {
        setExtentNative(getVkAddress(), extent != null ? extent.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getExtentNative(long address);
    protected static native void setExtentNative(long address, long extent);


    public void set(VkImageCopy o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkImageCopy implements cz.mg.collections.array.ReadonlyArray<VkImageCopy> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageCopy.sizeof()));
            this.count = count;
        }

        public Array(VkImageCopy o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkImageCopy get(int i){
            return new VkImageCopy(getVkMemory(), address(i));
        }

        protected long address(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
