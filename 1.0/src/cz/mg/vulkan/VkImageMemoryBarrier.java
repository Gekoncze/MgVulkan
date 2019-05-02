package cz.mg.vulkan;

public class VkImageMemoryBarrier extends VkObject {
    public VkImageMemoryBarrier() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER));
    }

    public VkImageMemoryBarrier(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageMemoryBarrier(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkImageMemoryBarrier(VkPointer pointer) {
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

    public VkImageLayout getOldLayout() {
        return new VkImageLayout(getVkMemory(), getOldLayoutNative(getVkAddress()));
    }

    
    public void setOldLayout(VkImageLayout oldLayout) {
        setOldLayoutNative(getVkAddress(), oldLayout != null ? oldLayout.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getOldLayoutQ() {
        return getOldLayout().getValue();
    }

    public void setOldLayout(int oldLayout) {
        getOldLayout().setValue(oldLayout);
    }

    protected static native long getOldLayoutNative(long address);
    protected static native void setOldLayoutNative(long address, long oldLayout);

    public VkImageLayout getNewLayout() {
        return new VkImageLayout(getVkMemory(), getNewLayoutNative(getVkAddress()));
    }

    
    public void setNewLayout(VkImageLayout newLayout) {
        setNewLayoutNative(getVkAddress(), newLayout != null ? newLayout.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getNewLayoutQ() {
        return getNewLayout().getValue();
    }

    public void setNewLayout(int newLayout) {
        getNewLayout().setValue(newLayout);
    }

    protected static native long getNewLayoutNative(long address);
    protected static native void setNewLayoutNative(long address, long newLayout);

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

    public VkImage getImage() {
        return new VkImage(getVkMemory(), getImageNative(getVkAddress()));
    }

    
    public void setImage(VkImage image) {
        setImageNative(getVkAddress(), image != null ? image.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getImageNative(long address);
    protected static native void setImageNative(long address, long image);

    public VkImageSubresourceRange getSubresourceRange() {
        return new VkImageSubresourceRange(getVkMemory(), getSubresourceRangeNative(getVkAddress()));
    }

    
    public void setSubresourceRange(VkImageSubresourceRange subresourceRange) {
        setSubresourceRangeNative(getVkAddress(), subresourceRange != null ? subresourceRange.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSubresourceRangeNative(long address);
    protected static native void setSubresourceRangeNative(long address, long subresourceRange);


    public void set(VkImageMemoryBarrier o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkImageMemoryBarrier implements cz.mg.collections.array.ReadonlyArray<VkImageMemoryBarrier> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageMemoryBarrier.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER));;
        }

        public Array(int count, VkImageMemoryBarrier o){
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
        public VkImageMemoryBarrier get(int i){
            return new VkImageMemoryBarrier(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
