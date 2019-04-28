package cz.mg.vulkan;

public class VkBindBufferMemoryInfo extends VkObject {
    public VkBindBufferMemoryInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO));
    }

    public VkBindBufferMemoryInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBindBufferMemoryInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkBindBufferMemoryInfo(VkPointer pointer) {
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

    public VkBuffer getBuffer() {
        return new VkBuffer(getVkMemory(), getBufferNative(getVkAddress()));
    }

    
    public void setBuffer(VkBuffer buffer) {
        setBufferNative(getVkAddress(), buffer != null ? buffer.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getBufferNative(long address);
    protected static native void setBufferNative(long address, long buffer);

    public VkDeviceMemory getMemory() {
        return new VkDeviceMemory(getVkMemory(), getMemoryNative(getVkAddress()));
    }

    
    public void setMemory(VkDeviceMemory memory) {
        setMemoryNative(getVkAddress(), memory != null ? memory.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getMemoryNative(long address);
    protected static native void setMemoryNative(long address, long memory);

    public VkDeviceSize getMemoryOffset() {
        return new VkDeviceSize(getVkMemory(), getMemoryOffsetNative(getVkAddress()));
    }

    
    public void setMemoryOffset(VkDeviceSize memoryOffset) {
        setMemoryOffsetNative(getVkAddress(), memoryOffset != null ? memoryOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getMemoryOffsetQ() {
        return getMemoryOffset().getValue();
    }

    public void setMemoryOffset(long memoryOffset) {
        getMemoryOffset().setValue(memoryOffset);
    }

    protected static native long getMemoryOffsetNative(long address);
    protected static native void setMemoryOffsetNative(long address, long memoryOffset);


    public static native long sizeof();

    public static class Array extends VkBindBufferMemoryInfo implements cz.mg.collections.array.ReadonlyArray<VkBindBufferMemoryInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBindBufferMemoryInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO));;
        }

        public Array(int count, VkBindBufferMemoryInfo o){
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
        public VkBindBufferMemoryInfo get(int i){
            return new VkBindBufferMemoryInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
