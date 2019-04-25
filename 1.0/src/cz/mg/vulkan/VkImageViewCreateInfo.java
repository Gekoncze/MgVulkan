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

    public VkImageViewCreateFlags getFlags() {
        return new VkImageViewCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkImageViewCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlags(long address);
    protected static native void setFlags(long address, long flags);

    public VkImage getImage() {
        return new VkImage(getVkMemory(), getImage(getVkAddress()));
    }

    
    public void setImage(VkImage image) {
        setImage(getVkAddress(), image != null ? image.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getImage(long address);
    protected static native void setImage(long address, long image);

    public VkImageViewType getViewType() {
        return new VkImageViewType(getVkMemory(), getViewType(getVkAddress()));
    }

    
    public void setViewType(VkImageViewType viewType) {
        setViewType(getVkAddress(), viewType != null ? viewType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getViewTypeQ() {
        return getViewType().getValue();
    }

    public void setViewType(int viewType) {
        getViewType().setValue(viewType);
    }

    protected static native long getViewType(long address);
    protected static native void setViewType(long address, long viewType);

    public VkFormat getFormat() {
        return new VkFormat(getVkMemory(), getFormat(getVkAddress()));
    }

    
    public void setFormat(VkFormat format) {
        setFormat(getVkAddress(), format != null ? format.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFormatQ() {
        return getFormat().getValue();
    }

    public void setFormat(int format) {
        getFormat().setValue(format);
    }

    protected static native long getFormat(long address);
    protected static native void setFormat(long address, long format);

    public VkComponentMapping getComponents() {
        return new VkComponentMapping(getVkMemory(), getComponents(getVkAddress()));
    }

    
    public void setComponents(VkComponentMapping components) {
        setComponents(getVkAddress(), components != null ? components.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getComponents(long address);
    protected static native void setComponents(long address, long components);

    public VkImageSubresourceRange getSubresourceRange() {
        return new VkImageSubresourceRange(getVkMemory(), getSubresourceRange(getVkAddress()));
    }

    
    public void setSubresourceRange(VkImageSubresourceRange subresourceRange) {
        setSubresourceRange(getVkAddress(), subresourceRange != null ? subresourceRange.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSubresourceRange(long address);
    protected static native void setSubresourceRange(long address, long subresourceRange);


    public static native long sizeof();

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
