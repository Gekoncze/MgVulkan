package cz.mg.vulkan;

public class VkImageBlit extends VkObject {
    public VkImageBlit() {
        super(sizeof());
    }

    public VkImageBlit(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageBlit(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkImageSubresourceLayers getSrcSubresource() {
        return new VkImageSubresourceLayers(getVkMemory(), getSrcSubresource(getVkAddress()));
    }

    
    public void setSrcSubresource(VkImageSubresourceLayers srcSubresource) {
        setSrcSubresource(getVkAddress(), srcSubresource != null ? srcSubresource.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSrcSubresource(long address);
    protected static native void setSrcSubresource(long address, long srcSubresource);

    public VkOffset3D getSrcOffsets() {
        return new VkOffset3D(getVkMemory(), getSrcOffsets(getVkAddress()));
    }

    
    public void setSrcOffsets(VkOffset3D srcOffsets) {
        setSrcOffsets(getVkAddress(), srcOffsets != null ? srcOffsets.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getSrcOffsets(long address);
    protected static native void setSrcOffsets(long address, long srcOffsets);

    public VkImageSubresourceLayers getDstSubresource() {
        return new VkImageSubresourceLayers(getVkMemory(), getDstSubresource(getVkAddress()));
    }

    
    public void setDstSubresource(VkImageSubresourceLayers dstSubresource) {
        setDstSubresource(getVkAddress(), dstSubresource != null ? dstSubresource.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getDstSubresource(long address);
    protected static native void setDstSubresource(long address, long dstSubresource);

    public VkOffset3D getDstOffsets() {
        return new VkOffset3D(getVkMemory(), getDstOffsets(getVkAddress()));
    }

    
    public void setDstOffsets(VkOffset3D dstOffsets) {
        setDstOffsets(getVkAddress(), dstOffsets != null ? dstOffsets.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getDstOffsets(long address);
    protected static native void setDstOffsets(long address, long dstOffsets);


    public static native long sizeof();

    public static class Array extends VkImageBlit implements cz.mg.collections.array.ReadonlyArray<VkImageBlit> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageBlit.sizeof()));
            this.count = count;
        }

        public Array(int count, VkImageBlit o){
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
        public VkImageBlit get(int i){
            return new VkImageBlit(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            public Array2(int count, VkPointer o){
                super(count, o);
            }

            public Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            public Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
