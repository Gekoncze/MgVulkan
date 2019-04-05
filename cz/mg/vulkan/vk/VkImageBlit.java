package cz.mg.vulkan.vk;

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


    public VkImageBlit(VkImageSubresourceLayers srcSubresource, VkOffset3D srcOffsets, VkImageSubresourceLayers dstSubresource, VkOffset3D dstOffsets) {
        super(sizeof());
        setSrcSubresource(srcSubresource);
        setSrcOffsets(srcOffsets);
        setDstSubresource(dstSubresource);
        setDstOffsets(dstOffsets);
    }

    public VkImageSubresourceLayers getSrcSubresource() {
        return new VkImageSubresourceLayers(getVkMemory(), getSrcSubresource(getVkAddress()));
    }

    
    public void setSrcSubresource(VkImageSubresourceLayers srcSubresource) {
        setSrcSubresource(getVkAddress(), srcSubresource != null ? srcSubresource.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSrcSubresource(long address);
    private static native void setSrcSubresource(long address, long srcSubresource);

    public VkOffset3D getSrcOffsets() {
        return new VkOffset3D(getVkMemory(), getSrcOffsets(getVkAddress()));
    }

    
    public void setSrcOffsets(VkOffset3D srcOffsets) {
        setSrcOffsets(getVkAddress(), srcOffsets != null ? srcOffsets.getVkAddress() : VkPointer.NULL);
        
    }

    private static native long getSrcOffsets(long address);
    private static native void setSrcOffsets(long address, long srcOffsets);

    public VkImageSubresourceLayers getDstSubresource() {
        return new VkImageSubresourceLayers(getVkMemory(), getDstSubresource(getVkAddress()));
    }

    
    public void setDstSubresource(VkImageSubresourceLayers dstSubresource) {
        setDstSubresource(getVkAddress(), dstSubresource != null ? dstSubresource.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDstSubresource(long address);
    private static native void setDstSubresource(long address, long dstSubresource);

    public VkOffset3D getDstOffsets() {
        return new VkOffset3D(getVkMemory(), getDstOffsets(getVkAddress()));
    }

    
    public void setDstOffsets(VkOffset3D dstOffsets) {
        setDstOffsets(getVkAddress(), dstOffsets != null ? dstOffsets.getVkAddress() : VkPointer.NULL);
        
    }

    private static native long getDstOffsets(long address);
    private static native void setDstOffsets(long address, long dstOffsets);


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
            return new VkImageBlit(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkImageBlit.Pointer implements cz.mg.collections.array.ReadonlyArray<VkImageBlit.Pointer> {
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

            public Array(VkImageBlit[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkImageBlit.Pointer get(int i){
                return new VkImageBlit.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
