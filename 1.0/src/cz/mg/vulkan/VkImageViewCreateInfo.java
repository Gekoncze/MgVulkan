package cz.mg.vulkan;

public class VkImageViewCreateInfo extends VkObject {
    public VkImageViewCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO));
    }

    public VkImageViewCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageViewCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkImageViewCreateInfo(VkPointer pointer) {
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

    public VkImageViewCreateFlags getFlags() {
        return new VkImageViewCreateFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkImageViewCreateFlags flags) {
        setFlagsNative(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlagsNative(long address);
    protected static native void setFlagsNative(long address, long flags);

    public VkImage getImage() {
        return new VkImage(getVkMemory(), getImageNative(getVkAddress()));
    }

    
    public void setImage(VkImage image) {
        setImageNative(getVkAddress(), image != null ? image.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getImageNative(long address);
    protected static native void setImageNative(long address, long image);

    public VkImageViewType getViewType() {
        return new VkImageViewType(getVkMemory(), getViewTypeNative(getVkAddress()));
    }

    
    public void setViewType(VkImageViewType viewType) {
        setViewTypeNative(getVkAddress(), viewType != null ? viewType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getViewTypeQ() {
        return getViewType().getValue();
    }

    public void setViewType(int viewType) {
        getViewType().setValue(viewType);
    }

    protected static native long getViewTypeNative(long address);
    protected static native void setViewTypeNative(long address, long viewType);

    public VkFormat getFormat() {
        return new VkFormat(getVkMemory(), getFormatNative(getVkAddress()));
    }

    
    public void setFormat(VkFormat format) {
        setFormatNative(getVkAddress(), format != null ? format.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFormatQ() {
        return getFormat().getValue();
    }

    public void setFormat(int format) {
        getFormat().setValue(format);
    }

    protected static native long getFormatNative(long address);
    protected static native void setFormatNative(long address, long format);

    public VkComponentMapping getComponents() {
        return new VkComponentMapping(getVkMemory(), getComponentsNative(getVkAddress()));
    }

    
    public void setComponents(VkComponentMapping components) {
        setComponentsNative(getVkAddress(), components != null ? components.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getComponentsNative(long address);
    protected static native void setComponentsNative(long address, long components);

    public VkImageSubresourceRange getSubresourceRange() {
        return new VkImageSubresourceRange(getVkMemory(), getSubresourceRangeNative(getVkAddress()));
    }

    
    public void setSubresourceRange(VkImageSubresourceRange subresourceRange) {
        setSubresourceRangeNative(getVkAddress(), subresourceRange != null ? subresourceRange.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSubresourceRangeNative(long address);
    protected static native void setSubresourceRangeNative(long address, long subresourceRange);


    public void set(VkImageViewCreateInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkImageViewCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkImageViewCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageViewCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO));;
        }

        public Array(int count, VkImageViewCreateInfo o){
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
        public VkImageViewCreateInfo get(int i){
            return new VkImageViewCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
