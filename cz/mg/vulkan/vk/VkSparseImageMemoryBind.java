package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSparseImageMemoryBind.html">khronos documentation</a>
 **/
public class VkSparseImageMemoryBind extends VkObject {
    public VkSparseImageMemoryBind() {
        super(sizeof());
    }

    public VkSparseImageMemoryBind(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSparseImageMemoryBind(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSparseImageMemoryBind(VkImageSubresource subresource, VkOffset3D offset, VkExtent3D extent, VkDeviceMemory memory, VkDeviceSize memoryOffset, VkSparseMemoryBindFlags flags) {
        super(sizeof());
        setSubresource(subresource);
        setOffset(offset);
        setExtent(extent);
        setMemory(memory);
        setMemoryOffset(memoryOffset);
        setFlags(flags);
    }

    public VkImageSubresource getSubresource() {
        return new VkImageSubresource(getVkMemory(), getSubresource(getVkAddress()));
    }

    
    public void setSubresource(VkImageSubresource subresource) {
        setSubresource(getVkAddress(), subresource != null ? subresource.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSubresource(long address);
    private static native void setSubresource(long address, long subresource);

    public VkOffset3D getOffset() {
        return new VkOffset3D(getVkMemory(), getOffset(getVkAddress()));
    }

    
    public void setOffset(VkOffset3D offset) {
        setOffset(getVkAddress(), offset != null ? offset.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getOffset(long address);
    private static native void setOffset(long address, long offset);

    public VkExtent3D getExtent() {
        return new VkExtent3D(getVkMemory(), getExtent(getVkAddress()));
    }

    
    public void setExtent(VkExtent3D extent) {
        setExtent(getVkAddress(), extent != null ? extent.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getExtent(long address);
    private static native void setExtent(long address, long extent);

    public VkDeviceMemory getMemory() {
        return new VkDeviceMemory(getVkMemory(), getMemory(getVkAddress()));
    }

    
    public void setMemory(VkDeviceMemory memory) {
        setMemory(getVkAddress(), memory != null ? memory.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMemory(long address);
    private static native void setMemory(long address, long memory);

    public VkDeviceSize getMemoryOffset() {
        return new VkDeviceSize(getVkMemory(), getMemoryOffset(getVkAddress()));
    }

    
    public void setMemoryOffset(VkDeviceSize memoryOffset) {
        setMemoryOffset(getVkAddress(), memoryOffset != null ? memoryOffset.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMemoryOffset(long address);
    private static native void setMemoryOffset(long address, long memoryOffset);

    public VkSparseMemoryBindFlags getFlags() {
        return new VkSparseMemoryBindFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkSparseMemoryBindFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);


    public static native long sizeof();

    public static class Array extends VkSparseImageMemoryBind implements cz.mg.collections.array.ReadonlyArray<VkSparseImageMemoryBind> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSparseImageMemoryBind.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSparseImageMemoryBind o){
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
        public VkSparseImageMemoryBind get(int i){
            return new VkSparseImageMemoryBind(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSparseImageMemoryBind.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkSparseImageMemoryBind[] a) {
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
