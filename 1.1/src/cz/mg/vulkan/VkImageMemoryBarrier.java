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



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSType(long address);
    protected static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNext(long address);
    protected static native void setPNext(long address, long pNext);

    public VkAccessFlags getSrcAccessMask() {
        return new VkAccessFlags(getVkMemory(), getSrcAccessMask(getVkAddress()));
    }

    
    public void setSrcAccessMask(VkAccessFlags srcAccessMask) {
        setSrcAccessMask(getVkAddress(), srcAccessMask != null ? srcAccessMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSrcAccessMaskQ() {
        return getSrcAccessMask().getValue();
    }

    public void setSrcAccessMask(int srcAccessMask) {
        getSrcAccessMask().setValue(srcAccessMask);
    }

    protected static native long getSrcAccessMask(long address);
    protected static native void setSrcAccessMask(long address, long srcAccessMask);

    public VkAccessFlags getDstAccessMask() {
        return new VkAccessFlags(getVkMemory(), getDstAccessMask(getVkAddress()));
    }

    
    public void setDstAccessMask(VkAccessFlags dstAccessMask) {
        setDstAccessMask(getVkAddress(), dstAccessMask != null ? dstAccessMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDstAccessMaskQ() {
        return getDstAccessMask().getValue();
    }

    public void setDstAccessMask(int dstAccessMask) {
        getDstAccessMask().setValue(dstAccessMask);
    }

    protected static native long getDstAccessMask(long address);
    protected static native void setDstAccessMask(long address, long dstAccessMask);

    public VkImageLayout getOldLayout() {
        return new VkImageLayout(getVkMemory(), getOldLayout(getVkAddress()));
    }

    
    public void setOldLayout(VkImageLayout oldLayout) {
        setOldLayout(getVkAddress(), oldLayout != null ? oldLayout.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getOldLayoutQ() {
        return getOldLayout().getValue();
    }

    public void setOldLayout(int oldLayout) {
        getOldLayout().setValue(oldLayout);
    }

    protected static native long getOldLayout(long address);
    protected static native void setOldLayout(long address, long oldLayout);

    public VkImageLayout getNewLayout() {
        return new VkImageLayout(getVkMemory(), getNewLayout(getVkAddress()));
    }

    
    public void setNewLayout(VkImageLayout newLayout) {
        setNewLayout(getVkAddress(), newLayout != null ? newLayout.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getNewLayoutQ() {
        return getNewLayout().getValue();
    }

    public void setNewLayout(int newLayout) {
        getNewLayout().setValue(newLayout);
    }

    protected static native long getNewLayout(long address);
    protected static native void setNewLayout(long address, long newLayout);

    public VkUInt32 getSrcQueueFamilyIndex() {
        return new VkUInt32(getVkMemory(), getSrcQueueFamilyIndex(getVkAddress()));
    }

    
    public void setSrcQueueFamilyIndex(VkUInt32 srcQueueFamilyIndex) {
        setSrcQueueFamilyIndex(getVkAddress(), srcQueueFamilyIndex != null ? srcQueueFamilyIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSrcQueueFamilyIndexQ() {
        return getSrcQueueFamilyIndex().getValue();
    }

    public void setSrcQueueFamilyIndex(int srcQueueFamilyIndex) {
        getSrcQueueFamilyIndex().setValue(srcQueueFamilyIndex);
    }

    protected static native long getSrcQueueFamilyIndex(long address);
    protected static native void setSrcQueueFamilyIndex(long address, long srcQueueFamilyIndex);

    public VkUInt32 getDstQueueFamilyIndex() {
        return new VkUInt32(getVkMemory(), getDstQueueFamilyIndex(getVkAddress()));
    }

    
    public void setDstQueueFamilyIndex(VkUInt32 dstQueueFamilyIndex) {
        setDstQueueFamilyIndex(getVkAddress(), dstQueueFamilyIndex != null ? dstQueueFamilyIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDstQueueFamilyIndexQ() {
        return getDstQueueFamilyIndex().getValue();
    }

    public void setDstQueueFamilyIndex(int dstQueueFamilyIndex) {
        getDstQueueFamilyIndex().setValue(dstQueueFamilyIndex);
    }

    protected static native long getDstQueueFamilyIndex(long address);
    protected static native void setDstQueueFamilyIndex(long address, long dstQueueFamilyIndex);

    public VkImage getImage() {
        return new VkImage(getVkMemory(), getImage(getVkAddress()));
    }

    
    public void setImage(VkImage image) {
        setImage(getVkAddress(), image != null ? image.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getImage(long address);
    protected static native void setImage(long address, long image);

    public VkImageSubresourceRange getSubresourceRange() {
        return new VkImageSubresourceRange(getVkMemory(), getSubresourceRange(getVkAddress()));
    }

    
    public void setSubresourceRange(VkImageSubresourceRange subresourceRange) {
        setSubresourceRange(getVkAddress(), subresourceRange != null ? subresourceRange.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSubresourceRange(long address);
    protected static native void setSubresourceRange(long address, long subresourceRange);


    public static native long sizeof();

    public static class Array extends VkImageMemoryBarrier implements cz.mg.collections.array.ReadonlyArray<VkImageMemoryBarrier> {
        private final int count;

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
            return new VkImageMemoryBarrier(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
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

            public Array(long... values){
                this(values.length);
                for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
            }

            public long getValueAt(int i){
                return getValueNative(addressAt(i));
            }

            public void setValueAt(int i, long value){
                setValueNative(addressAt(i), value);
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkImageMemoryBarrier.Pointer get(int i){
                return new VkImageMemoryBarrier.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
