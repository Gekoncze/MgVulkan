package cz.mg.vulkan;

public class VkBufferMemoryBarrier extends VkObject {
    public VkBufferMemoryBarrier() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER));
    }

    public VkBufferMemoryBarrier(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBufferMemoryBarrier(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkBufferMemoryBarrier(VkPointer pointer) {
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

    public VkAccessFlags getSrcAccessMask() {
        return new VkAccessFlags(getVkMemory(), getSrcAccessMaskNative(getVkAddress()));
    }

    
    public void setSrcAccessMask(VkAccessFlags srcAccessMask) {
        setSrcAccessMaskNative(getVkAddress(), srcAccessMask != null ? srcAccessMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSrcAccessMaskQ() {
        return getSrcAccessMask().getValue();
    }

    public void setSrcAccessMask(int srcAccessMask) {
        getSrcAccessMask().setValue(srcAccessMask);
    }

    protected static native long getSrcAccessMaskNative(long address);
    protected static native void setSrcAccessMaskNative(long address, long srcAccessMask);

    public VkAccessFlags getDstAccessMask() {
        return new VkAccessFlags(getVkMemory(), getDstAccessMaskNative(getVkAddress()));
    }

    
    public void setDstAccessMask(VkAccessFlags dstAccessMask) {
        setDstAccessMaskNative(getVkAddress(), dstAccessMask != null ? dstAccessMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDstAccessMaskQ() {
        return getDstAccessMask().getValue();
    }

    public void setDstAccessMask(int dstAccessMask) {
        getDstAccessMask().setValue(dstAccessMask);
    }

    protected static native long getDstAccessMaskNative(long address);
    protected static native void setDstAccessMaskNative(long address, long dstAccessMask);

    public VkUInt32 getSrcQueueFamilyIndex() {
        return new VkUInt32(getVkMemory(), getSrcQueueFamilyIndexNative(getVkAddress()));
    }

    
    public void setSrcQueueFamilyIndex(VkUInt32 srcQueueFamilyIndex) {
        setSrcQueueFamilyIndexNative(getVkAddress(), srcQueueFamilyIndex != null ? srcQueueFamilyIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSrcQueueFamilyIndexQ() {
        return getSrcQueueFamilyIndex().getValue();
    }

    public void setSrcQueueFamilyIndex(int srcQueueFamilyIndex) {
        getSrcQueueFamilyIndex().setValue(srcQueueFamilyIndex);
    }

    protected static native long getSrcQueueFamilyIndexNative(long address);
    protected static native void setSrcQueueFamilyIndexNative(long address, long srcQueueFamilyIndex);

    public VkUInt32 getDstQueueFamilyIndex() {
        return new VkUInt32(getVkMemory(), getDstQueueFamilyIndexNative(getVkAddress()));
    }

    
    public void setDstQueueFamilyIndex(VkUInt32 dstQueueFamilyIndex) {
        setDstQueueFamilyIndexNative(getVkAddress(), dstQueueFamilyIndex != null ? dstQueueFamilyIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDstQueueFamilyIndexQ() {
        return getDstQueueFamilyIndex().getValue();
    }

    public void setDstQueueFamilyIndex(int dstQueueFamilyIndex) {
        getDstQueueFamilyIndex().setValue(dstQueueFamilyIndex);
    }

    protected static native long getDstQueueFamilyIndexNative(long address);
    protected static native void setDstQueueFamilyIndexNative(long address, long dstQueueFamilyIndex);

    public VkBuffer getBuffer() {
        return new VkBuffer(getVkMemory(), getBufferNative(getVkAddress()));
    }

    
    public void setBuffer(VkBuffer buffer) {
        setBufferNative(getVkAddress(), buffer != null ? buffer.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getBufferNative(long address);
    protected static native void setBufferNative(long address, long buffer);

    public VkDeviceSize getOffset() {
        return new VkDeviceSize(getVkMemory(), getOffsetNative(getVkAddress()));
    }

    
    public void setOffset(VkDeviceSize offset) {
        setOffsetNative(getVkAddress(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getOffsetQ() {
        return getOffset().getValue();
    }

    public void setOffset(long offset) {
        getOffset().setValue(offset);
    }

    protected static native long getOffsetNative(long address);
    protected static native void setOffsetNative(long address, long offset);

    public VkDeviceSize getSize() {
        return new VkDeviceSize(getVkMemory(), getSizeNative(getVkAddress()));
    }

    
    public void setSize(VkDeviceSize size) {
        setSizeNative(getVkAddress(), size != null ? size.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getSizeQ() {
        return getSize().getValue();
    }

    public void setSize(long size) {
        getSize().setValue(size);
    }

    protected static native long getSizeNative(long address);
    protected static native void setSizeNative(long address, long size);


    public void set(VkBufferMemoryBarrier o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkBufferMemoryBarrier implements cz.mg.collections.array.ReadonlyArray<VkBufferMemoryBarrier> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBufferMemoryBarrier.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER));;
        }

        public Array(VkBufferMemoryBarrier o, int count){
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
        public VkBufferMemoryBarrier get(int i){
            return new VkBufferMemoryBarrier(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
