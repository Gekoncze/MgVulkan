package cz.mg.vulkan;

public class VkSubpassDescription extends VkObject {
    public VkSubpassDescription() {
        super(sizeof());
    }

    protected VkSubpassDescription(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSubpassDescription(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSubpassDescription(VkPointer pointer) {
        super(pointer);
    }



    public VkSubpassDescriptionFlags getFlags() {
        return new VkSubpassDescriptionFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkSubpassDescriptionFlags flags) {
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

    public VkPipelineBindPoint getPipelineBindPoint() {
        return new VkPipelineBindPoint(getVkMemory(), getPipelineBindPointNative(getVkAddress()));
    }

    
    public void setPipelineBindPoint(VkPipelineBindPoint pipelineBindPoint) {
        setPipelineBindPointNative(getVkAddress(), pipelineBindPoint != null ? pipelineBindPoint.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPipelineBindPointQ() {
        return getPipelineBindPoint().getValue();
    }

    public void setPipelineBindPoint(int pipelineBindPoint) {
        getPipelineBindPoint().setValue(pipelineBindPoint);
    }

    protected static native long getPipelineBindPointNative(long address);
    protected static native void setPipelineBindPointNative(long address, long pipelineBindPoint);

    public VkUInt32 getInputAttachmentCount() {
        return new VkUInt32(getVkMemory(), getInputAttachmentCountNative(getVkAddress()));
    }

    
    public void setInputAttachmentCount(VkUInt32 inputAttachmentCount) {
        setInputAttachmentCountNative(getVkAddress(), inputAttachmentCount != null ? inputAttachmentCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getInputAttachmentCountQ() {
        return getInputAttachmentCount().getValue();
    }

    public void setInputAttachmentCount(int inputAttachmentCount) {
        getInputAttachmentCount().setValue(inputAttachmentCount);
    }

    protected static native long getInputAttachmentCountNative(long address);
    protected static native void setInputAttachmentCountNative(long address, long inputAttachmentCount);

    public VkAttachmentReference getPInputAttachments() {
        return new VkAttachmentReference(getVkMemory(), getPInputAttachmentsNative(getVkAddress()));
    }

    private VkObject pInputAttachments = null;
    public void setPInputAttachments(VkAttachmentReference pInputAttachments) {
        setPInputAttachmentsNative(getVkAddress(), pInputAttachments != null ? pInputAttachments.getVkAddress() : VkPointer.NULL);
        this.pInputAttachments = pInputAttachments;
    }

    protected static native long getPInputAttachmentsNative(long address);
    protected static native void setPInputAttachmentsNative(long address, long pInputAttachments);

    public VkUInt32 getColorAttachmentCount() {
        return new VkUInt32(getVkMemory(), getColorAttachmentCountNative(getVkAddress()));
    }

    
    public void setColorAttachmentCount(VkUInt32 colorAttachmentCount) {
        setColorAttachmentCountNative(getVkAddress(), colorAttachmentCount != null ? colorAttachmentCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getColorAttachmentCountQ() {
        return getColorAttachmentCount().getValue();
    }

    public void setColorAttachmentCount(int colorAttachmentCount) {
        getColorAttachmentCount().setValue(colorAttachmentCount);
    }

    protected static native long getColorAttachmentCountNative(long address);
    protected static native void setColorAttachmentCountNative(long address, long colorAttachmentCount);

    public VkAttachmentReference getPColorAttachments() {
        return new VkAttachmentReference(getVkMemory(), getPColorAttachmentsNative(getVkAddress()));
    }

    private VkObject pColorAttachments = null;
    public void setPColorAttachments(VkAttachmentReference pColorAttachments) {
        setPColorAttachmentsNative(getVkAddress(), pColorAttachments != null ? pColorAttachments.getVkAddress() : VkPointer.NULL);
        this.pColorAttachments = pColorAttachments;
    }

    protected static native long getPColorAttachmentsNative(long address);
    protected static native void setPColorAttachmentsNative(long address, long pColorAttachments);

    public VkAttachmentReference getPResolveAttachments() {
        return new VkAttachmentReference(getVkMemory(), getPResolveAttachmentsNative(getVkAddress()));
    }

    private VkObject pResolveAttachments = null;
    public void setPResolveAttachments(VkAttachmentReference pResolveAttachments) {
        setPResolveAttachmentsNative(getVkAddress(), pResolveAttachments != null ? pResolveAttachments.getVkAddress() : VkPointer.NULL);
        this.pResolveAttachments = pResolveAttachments;
    }

    protected static native long getPResolveAttachmentsNative(long address);
    protected static native void setPResolveAttachmentsNative(long address, long pResolveAttachments);

    public VkAttachmentReference getPDepthStencilAttachment() {
        return new VkAttachmentReference(getVkMemory(), getPDepthStencilAttachmentNative(getVkAddress()));
    }

    private VkObject pDepthStencilAttachment = null;
    public void setPDepthStencilAttachment(VkAttachmentReference pDepthStencilAttachment) {
        setPDepthStencilAttachmentNative(getVkAddress(), pDepthStencilAttachment != null ? pDepthStencilAttachment.getVkAddress() : VkPointer.NULL);
        this.pDepthStencilAttachment = pDepthStencilAttachment;
    }

    protected static native long getPDepthStencilAttachmentNative(long address);
    protected static native void setPDepthStencilAttachmentNative(long address, long pDepthStencilAttachment);

    public VkUInt32 getPreserveAttachmentCount() {
        return new VkUInt32(getVkMemory(), getPreserveAttachmentCountNative(getVkAddress()));
    }

    
    public void setPreserveAttachmentCount(VkUInt32 preserveAttachmentCount) {
        setPreserveAttachmentCountNative(getVkAddress(), preserveAttachmentCount != null ? preserveAttachmentCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPreserveAttachmentCountQ() {
        return getPreserveAttachmentCount().getValue();
    }

    public void setPreserveAttachmentCount(int preserveAttachmentCount) {
        getPreserveAttachmentCount().setValue(preserveAttachmentCount);
    }

    protected static native long getPreserveAttachmentCountNative(long address);
    protected static native void setPreserveAttachmentCountNative(long address, long preserveAttachmentCount);

    public VkUInt32 getPPreserveAttachments() {
        return new VkUInt32(getVkMemory(), getPPreserveAttachmentsNative(getVkAddress()));
    }

    private VkObject pPreserveAttachments = null;
    public void setPPreserveAttachments(VkUInt32 pPreserveAttachments) {
        setPPreserveAttachmentsNative(getVkAddress(), pPreserveAttachments != null ? pPreserveAttachments.getVkAddress() : VkPointer.NULL);
        this.pPreserveAttachments = pPreserveAttachments;
    }

    protected static native long getPPreserveAttachmentsNative(long address);
    protected static native void setPPreserveAttachmentsNative(long address, long pPreserveAttachments);


    public void set(VkSubpassDescription o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkSubpassDescription implements cz.mg.collections.array.ReadonlyArray<VkSubpassDescription> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSubpassDescription.sizeof()));
            this.count = count;
        }

        public Array(VkSubpassDescription o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkSubpassDescription get(int i){
            return new VkSubpassDescription(getVkMemory(), address(i));
        }

        protected long address(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
