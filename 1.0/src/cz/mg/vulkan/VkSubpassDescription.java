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
        return new VkSubpassDescriptionFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkSubpassDescriptionFlags flags) {
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

    public VkPipelineBindPoint getPipelineBindPoint() {
        return new VkPipelineBindPoint(getVkMemory(), getPipelineBindPoint(getVkAddress()));
    }

    
    public void setPipelineBindPoint(VkPipelineBindPoint pipelineBindPoint) {
        setPipelineBindPoint(getVkAddress(), pipelineBindPoint != null ? pipelineBindPoint.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPipelineBindPointQ() {
        return getPipelineBindPoint().getValue();
    }

    public void setPipelineBindPoint(int pipelineBindPoint) {
        getPipelineBindPoint().setValue(pipelineBindPoint);
    }

    protected static native long getPipelineBindPoint(long address);
    protected static native void setPipelineBindPoint(long address, long pipelineBindPoint);

    public VkUInt32 getInputAttachmentCount() {
        return new VkUInt32(getVkMemory(), getInputAttachmentCount(getVkAddress()));
    }

    
    public void setInputAttachmentCount(VkUInt32 inputAttachmentCount) {
        setInputAttachmentCount(getVkAddress(), inputAttachmentCount != null ? inputAttachmentCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getInputAttachmentCountQ() {
        return getInputAttachmentCount().getValue();
    }

    public void setInputAttachmentCount(int inputAttachmentCount) {
        getInputAttachmentCount().setValue(inputAttachmentCount);
    }

    protected static native long getInputAttachmentCount(long address);
    protected static native void setInputAttachmentCount(long address, long inputAttachmentCount);

    public VkAttachmentReference getPInputAttachments() {
        return new VkAttachmentReference(getVkMemory(), getPInputAttachments(getVkAddress()));
    }

    private VkObject pInputAttachments = null;
    public void setPInputAttachments(VkAttachmentReference pInputAttachments) {
        setPInputAttachments(getVkAddress(), pInputAttachments != null ? pInputAttachments.getVkAddress() : VkPointer.NULL);
        this.pInputAttachments = pInputAttachments;
    }

    protected static native long getPInputAttachments(long address);
    protected static native void setPInputAttachments(long address, long pInputAttachments);

    public VkUInt32 getColorAttachmentCount() {
        return new VkUInt32(getVkMemory(), getColorAttachmentCount(getVkAddress()));
    }

    
    public void setColorAttachmentCount(VkUInt32 colorAttachmentCount) {
        setColorAttachmentCount(getVkAddress(), colorAttachmentCount != null ? colorAttachmentCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getColorAttachmentCountQ() {
        return getColorAttachmentCount().getValue();
    }

    public void setColorAttachmentCount(int colorAttachmentCount) {
        getColorAttachmentCount().setValue(colorAttachmentCount);
    }

    protected static native long getColorAttachmentCount(long address);
    protected static native void setColorAttachmentCount(long address, long colorAttachmentCount);

    public VkAttachmentReference getPColorAttachments() {
        return new VkAttachmentReference(getVkMemory(), getPColorAttachments(getVkAddress()));
    }

    private VkObject pColorAttachments = null;
    public void setPColorAttachments(VkAttachmentReference pColorAttachments) {
        setPColorAttachments(getVkAddress(), pColorAttachments != null ? pColorAttachments.getVkAddress() : VkPointer.NULL);
        this.pColorAttachments = pColorAttachments;
    }

    protected static native long getPColorAttachments(long address);
    protected static native void setPColorAttachments(long address, long pColorAttachments);

    public VkAttachmentReference getPResolveAttachments() {
        return new VkAttachmentReference(getVkMemory(), getPResolveAttachments(getVkAddress()));
    }

    private VkObject pResolveAttachments = null;
    public void setPResolveAttachments(VkAttachmentReference pResolveAttachments) {
        setPResolveAttachments(getVkAddress(), pResolveAttachments != null ? pResolveAttachments.getVkAddress() : VkPointer.NULL);
        this.pResolveAttachments = pResolveAttachments;
    }

    protected static native long getPResolveAttachments(long address);
    protected static native void setPResolveAttachments(long address, long pResolveAttachments);

    public VkAttachmentReference getPDepthStencilAttachment() {
        return new VkAttachmentReference(getVkMemory(), getPDepthStencilAttachment(getVkAddress()));
    }

    private VkObject pDepthStencilAttachment = null;
    public void setPDepthStencilAttachment(VkAttachmentReference pDepthStencilAttachment) {
        setPDepthStencilAttachment(getVkAddress(), pDepthStencilAttachment != null ? pDepthStencilAttachment.getVkAddress() : VkPointer.NULL);
        this.pDepthStencilAttachment = pDepthStencilAttachment;
    }

    protected static native long getPDepthStencilAttachment(long address);
    protected static native void setPDepthStencilAttachment(long address, long pDepthStencilAttachment);

    public VkUInt32 getPreserveAttachmentCount() {
        return new VkUInt32(getVkMemory(), getPreserveAttachmentCount(getVkAddress()));
    }

    
    public void setPreserveAttachmentCount(VkUInt32 preserveAttachmentCount) {
        setPreserveAttachmentCount(getVkAddress(), preserveAttachmentCount != null ? preserveAttachmentCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPreserveAttachmentCountQ() {
        return getPreserveAttachmentCount().getValue();
    }

    public void setPreserveAttachmentCount(int preserveAttachmentCount) {
        getPreserveAttachmentCount().setValue(preserveAttachmentCount);
    }

    protected static native long getPreserveAttachmentCount(long address);
    protected static native void setPreserveAttachmentCount(long address, long preserveAttachmentCount);

    public VkUInt32 getPPreserveAttachments() {
        return new VkUInt32(getVkMemory(), getPPreserveAttachments(getVkAddress()));
    }

    private VkObject pPreserveAttachments = null;
    public void setPPreserveAttachments(VkUInt32 pPreserveAttachments) {
        setPPreserveAttachments(getVkAddress(), pPreserveAttachments != null ? pPreserveAttachments.getVkAddress() : VkPointer.NULL);
        this.pPreserveAttachments = pPreserveAttachments;
    }

    protected static native long getPPreserveAttachments(long address);
    protected static native void setPPreserveAttachments(long address, long pPreserveAttachments);


    public static native long sizeof();

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
            return new VkSubpassDescription(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
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
