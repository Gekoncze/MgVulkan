package cz.mg.vulkan;

public class VkImageMemoryBarrier extends VkObject {
    public VkImageMemoryBarrier() {
        super(sizeof());
    }

    public VkImageMemoryBarrier(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageMemoryBarrier(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkImageMemoryBarrier(VkStructureType sType, VkObject pNext, VkAccessFlags srcAccessMask, VkAccessFlags dstAccessMask, VkImageLayout oldLayout, VkImageLayout newLayout, VkUInt32 srcQueueFamilyIndex, VkUInt32 dstQueueFamilyIndex, VkImage image, VkImageSubresourceRange subresourceRange) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setSrcAccessMask(srcAccessMask);
        setDstAccessMask(dstAccessMask);
        setOldLayout(oldLayout);
        setNewLayout(newLayout);
        setSrcQueueFamilyIndex(srcQueueFamilyIndex);
        setDstQueueFamilyIndex(dstQueueFamilyIndex);
        setImage(image);
        setSubresourceRange(subresourceRange);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkAccessFlags getSrcAccessMask() {
        return new VkAccessFlags(getVkMemory(), getSrcAccessMask(getVkAddress()));
    }

    
    public void setSrcAccessMask(VkAccessFlags srcAccessMask) {
        setSrcAccessMask(getVkAddress(), srcAccessMask != null ? srcAccessMask.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSrcAccessMask(long address);
    private static native void setSrcAccessMask(long address, long srcAccessMask);

    public VkAccessFlags getDstAccessMask() {
        return new VkAccessFlags(getVkMemory(), getDstAccessMask(getVkAddress()));
    }

    
    public void setDstAccessMask(VkAccessFlags dstAccessMask) {
        setDstAccessMask(getVkAddress(), dstAccessMask != null ? dstAccessMask.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDstAccessMask(long address);
    private static native void setDstAccessMask(long address, long dstAccessMask);

    public VkImageLayout getOldLayout() {
        return new VkImageLayout(getVkMemory(), getOldLayout(getVkAddress()));
    }

    
    public void setOldLayout(VkImageLayout oldLayout) {
        setOldLayout(getVkAddress(), oldLayout != null ? oldLayout.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getOldLayout(long address);
    private static native void setOldLayout(long address, long oldLayout);

    public VkImageLayout getNewLayout() {
        return new VkImageLayout(getVkMemory(), getNewLayout(getVkAddress()));
    }

    
    public void setNewLayout(VkImageLayout newLayout) {
        setNewLayout(getVkAddress(), newLayout != null ? newLayout.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getNewLayout(long address);
    private static native void setNewLayout(long address, long newLayout);

    public VkUInt32 getSrcQueueFamilyIndex() {
        return new VkUInt32(getVkMemory(), getSrcQueueFamilyIndex(getVkAddress()));
    }

    
    public void setSrcQueueFamilyIndex(VkUInt32 srcQueueFamilyIndex) {
        setSrcQueueFamilyIndex(getVkAddress(), srcQueueFamilyIndex != null ? srcQueueFamilyIndex.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSrcQueueFamilyIndex(long address);
    private static native void setSrcQueueFamilyIndex(long address, long srcQueueFamilyIndex);

    public VkUInt32 getDstQueueFamilyIndex() {
        return new VkUInt32(getVkMemory(), getDstQueueFamilyIndex(getVkAddress()));
    }

    
    public void setDstQueueFamilyIndex(VkUInt32 dstQueueFamilyIndex) {
        setDstQueueFamilyIndex(getVkAddress(), dstQueueFamilyIndex != null ? dstQueueFamilyIndex.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDstQueueFamilyIndex(long address);
    private static native void setDstQueueFamilyIndex(long address, long dstQueueFamilyIndex);

    public VkImage getImage() {
        return new VkImage(getVkMemory(), getImage(getVkAddress()));
    }

    
    public void setImage(VkImage image) {
        setImage(getVkAddress(), image != null ? image.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getImage(long address);
    private static native void setImage(long address, long image);

    public VkImageSubresourceRange getSubresourceRange() {
        return new VkImageSubresourceRange(getVkMemory(), getSubresourceRange(getVkAddress()));
    }

    
    public void setSubresourceRange(VkImageSubresourceRange subresourceRange) {
        setSubresourceRange(getVkAddress(), subresourceRange != null ? subresourceRange.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSubresourceRange(long address);
    private static native void setSubresourceRange(long address, long subresourceRange);


    public static native long sizeof();

    public static class Array extends VkImageMemoryBarrier implements cz.mg.collections.array.ReadonlyArray<VkImageMemoryBarrier> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageMemoryBarrier.sizeof()));
            this.count = count;
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


    public static class Pointer extends VkObject.Pointer {        public Pointer() {
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

        public static class Array extends VkImageMemoryBarrier.Pointer implements cz.mg.collections.array.ReadonlyArray<VkImageMemoryBarrier.Pointer> {
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

            public Array(VkImageMemoryBarrier[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkImageMemoryBarrier.Pointer get(int i){
                return new VkImageMemoryBarrier.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
