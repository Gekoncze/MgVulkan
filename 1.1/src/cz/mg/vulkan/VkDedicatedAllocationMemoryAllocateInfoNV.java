package cz.mg.vulkan;

public class VkDedicatedAllocationMemoryAllocateInfoNV extends VkObject {
    public VkDedicatedAllocationMemoryAllocateInfoNV() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV));
    }

    public VkDedicatedAllocationMemoryAllocateInfoNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDedicatedAllocationMemoryAllocateInfoNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDedicatedAllocationMemoryAllocateInfoNV(VkPointer pointer) {
        super(pointer);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSTypeNative(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSTypeNative(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSTypeNative(long address);
    protected static native void setSTypeNative(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNextNative(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNextNative(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNextNative(long address);
    protected static native void setPNextNative(long address, long pNext);

    public VkImage getImage() {
        return new VkImage(getVkMemory(), getImageNative(getVkAddress()));
    }

    
    public void setImage(VkImage image) {
        setImageNative(getVkAddress(), image != null ? image.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getImageNative(long address);
    protected static native void setImageNative(long address, long image);

    public VkBuffer getBuffer() {
        return new VkBuffer(getVkMemory(), getBufferNative(getVkAddress()));
    }

    
    public void setBuffer(VkBuffer buffer) {
        setBufferNative(getVkAddress(), buffer != null ? buffer.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getBufferNative(long address);
    protected static native void setBufferNative(long address, long buffer);


    public void set(VkDedicatedAllocationMemoryAllocateInfoNV o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkDedicatedAllocationMemoryAllocateInfoNV implements cz.mg.collections.array.ReadonlyArray<VkDedicatedAllocationMemoryAllocateInfoNV> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDedicatedAllocationMemoryAllocateInfoNV.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV));;
        }

        public Array(int count, VkDedicatedAllocationMemoryAllocateInfoNV o){
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
        public VkDedicatedAllocationMemoryAllocateInfoNV get(int i){
            return new VkDedicatedAllocationMemoryAllocateInfoNV(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
