package cz.mg.vulkan;

public class VkFramebufferCreateInfo extends VkObject {
    public VkFramebufferCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO));
    }

    public VkFramebufferCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkFramebufferCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkFramebufferCreateInfo(VkPointer pointer) {
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

    public VkFramebufferCreateFlags getFlags() {
        return new VkFramebufferCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkFramebufferCreateFlags flags) {
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

    public VkRenderPass getRenderPass() {
        return new VkRenderPass(getVkMemory(), getRenderPass(getVkAddress()));
    }

    
    public void setRenderPass(VkRenderPass renderPass) {
        setRenderPass(getVkAddress(), renderPass != null ? renderPass.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getRenderPass(long address);
    protected static native void setRenderPass(long address, long renderPass);

    public VkUInt32 getAttachmentCount() {
        return new VkUInt32(getVkMemory(), getAttachmentCount(getVkAddress()));
    }

    
    public void setAttachmentCount(VkUInt32 attachmentCount) {
        setAttachmentCount(getVkAddress(), attachmentCount != null ? attachmentCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAttachmentCountQ() {
        return getAttachmentCount().getValue();
    }

    public void setAttachmentCount(int attachmentCount) {
        getAttachmentCount().setValue(attachmentCount);
    }

    protected static native long getAttachmentCount(long address);
    protected static native void setAttachmentCount(long address, long attachmentCount);

    public VkImageView getPAttachments() {
        return new VkImageView(getVkMemory(), getPAttachments(getVkAddress()));
    }

    private VkObject pAttachments = null;
    public void setPAttachments(VkImageView pAttachments) {
        setPAttachments(getVkAddress(), pAttachments != null ? pAttachments.getVkAddress() : VkPointer.NULL);
        this.pAttachments = pAttachments;
    }

    protected static native long getPAttachments(long address);
    protected static native void setPAttachments(long address, long pAttachments);

    public VkUInt32 getWidth() {
        return new VkUInt32(getVkMemory(), getWidth(getVkAddress()));
    }

    
    public void setWidth(VkUInt32 width) {
        setWidth(getVkAddress(), width != null ? width.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getWidthQ() {
        return getWidth().getValue();
    }

    public void setWidth(int width) {
        getWidth().setValue(width);
    }

    protected static native long getWidth(long address);
    protected static native void setWidth(long address, long width);

    public VkUInt32 getHeight() {
        return new VkUInt32(getVkMemory(), getHeight(getVkAddress()));
    }

    
    public void setHeight(VkUInt32 height) {
        setHeight(getVkAddress(), height != null ? height.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getHeightQ() {
        return getHeight().getValue();
    }

    public void setHeight(int height) {
        getHeight().setValue(height);
    }

    protected static native long getHeight(long address);
    protected static native void setHeight(long address, long height);

    public VkUInt32 getLayers() {
        return new VkUInt32(getVkMemory(), getLayers(getVkAddress()));
    }

    
    public void setLayers(VkUInt32 layers) {
        setLayers(getVkAddress(), layers != null ? layers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getLayersQ() {
        return getLayers().getValue();
    }

    public void setLayers(int layers) {
        getLayers().setValue(layers);
    }

    protected static native long getLayers(long address);
    protected static native void setLayers(long address, long layers);


    public static native long sizeof();

    public static class Array extends VkFramebufferCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkFramebufferCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkFramebufferCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO));;
        }

        public Array(int count, VkFramebufferCreateInfo o){
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
        public VkFramebufferCreateInfo get(int i){
            return new VkFramebufferCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
