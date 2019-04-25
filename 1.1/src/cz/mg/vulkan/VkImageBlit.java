package cz.mg.vulkan;

public class VkImageBlit extends VkObject {
    public VkImageBlit() {
        super(sizeof());
    }

    protected VkImageBlit(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkImageBlit(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkImageBlit(VkPointer pointer) {
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

    public VkOffset3D getSrcOffsets() {
        return new VkOffset3D(getVkMemory(), getSrcOffsetsNative(getVkAddress()));
    }

    
    public void setSrcOffsets(VkOffset3D srcOffsets) {
        setSrcOffsetsNative(getVkAddress(), srcOffsets != null ? srcOffsets.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getSrcOffsetsNative(long address);
    protected static native void setSrcOffsetsNative(long address, long srcOffsets);

    public VkImageSubresourceLayers getDstSubresource() {
        return new VkImageSubresourceLayers(getVkMemory(), getDstSubresourceNative(getVkAddress()));
    }

    
    public void setDstSubresource(VkImageSubresourceLayers dstSubresource) {
        setDstSubresourceNative(getVkAddress(), dstSubresource != null ? dstSubresource.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getDstSubresourceNative(long address);
    protected static native void setDstSubresourceNative(long address, long dstSubresource);

    public VkOffset3D getDstOffsets() {
        return new VkOffset3D(getVkMemory(), getDstOffsetsNative(getVkAddress()));
    }

    
    public void setDstOffsets(VkOffset3D dstOffsets) {
        setDstOffsetsNative(getVkAddress(), dstOffsets != null ? dstOffsets.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getDstOffsetsNative(long address);
    protected static native void setDstOffsetsNative(long address, long dstOffsets);


    public static native long sizeof();

    public static class Array extends VkImageBlit implements cz.mg.collections.array.ReadonlyArray<VkImageBlit> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageBlit.sizeof()));
            this.count = count;
        }

        public Array(VkImageBlit o, int count){
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
        public VkImageBlit get(int i){
            return new VkImageBlit(getVkMemory(), address(i));
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
