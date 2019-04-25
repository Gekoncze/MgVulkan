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
        return new VkImageSubresourceLayers(getVkMemory(), getSrcSubresource(getVkAddress()));
    }

    
    public void setSrcSubresource(VkImageSubresourceLayers srcSubresource) {
        setSrcSubresource(getVkAddress(), srcSubresource != null ? srcSubresource.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSrcSubresource(long address);
    protected static native void setSrcSubresource(long address, long srcSubresource);

    public VkOffset3D getSrcOffset() {
        return new VkOffset3D(getVkMemory(), getSrcOffset(getVkAddress()));
    }

    
    public void setSrcOffset(VkOffset3D srcOffset) {
        setSrcOffset(getVkAddress(), srcOffset != null ? srcOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSrcOffset(long address);
    protected static native void setSrcOffset(long address, long srcOffset);

    public VkImageSubresourceLayers getDstSubresource() {
        return new VkImageSubresourceLayers(getVkMemory(), getDstSubresource(getVkAddress()));
    }

    
    public void setDstSubresource(VkImageSubresourceLayers dstSubresource) {
        setDstSubresource(getVkAddress(), dstSubresource != null ? dstSubresource.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getDstSubresource(long address);
    protected static native void setDstSubresource(long address, long dstSubresource);

    public VkOffset3D getDstOffset() {
        return new VkOffset3D(getVkMemory(), getDstOffset(getVkAddress()));
    }

    
    public void setDstOffset(VkOffset3D dstOffset) {
        setDstOffset(getVkAddress(), dstOffset != null ? dstOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getDstOffset(long address);
    protected static native void setDstOffset(long address, long dstOffset);

    public VkExtent3D getExtent() {
        return new VkExtent3D(getVkMemory(), getExtent(getVkAddress()));
    }

    
    public void setExtent(VkExtent3D extent) {
        setExtent(getVkAddress(), extent != null ? extent.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getExtent(long address);
    protected static native void setExtent(long address, long extent);


    public static native long sizeof();

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
            return new VkImageCopy(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
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
