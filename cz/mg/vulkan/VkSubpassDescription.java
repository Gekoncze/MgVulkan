package cz.mg.vulkan;

public class VkSubpassDescription extends VkObject {
    public VkSubpassDescription() {
        super(sizeof());
    }

    public VkSubpassDescription(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSubpassDescription(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkSubpassDescriptionFlags getFlags() {
        return new VkSubpassDescriptionFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkSubpassDescriptionFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkPipelineBindPoint getPipelineBindPoint() {
        return new VkPipelineBindPoint(getVkMemory(), getPipelineBindPoint(getVkAddress()));
    }

    
    public void setPipelineBindPoint(VkPipelineBindPoint pipelineBindPoint) {
        setPipelineBindPoint(getVkAddress(), pipelineBindPoint != null ? pipelineBindPoint.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setPipelineBindPoint(int pipelineBindPoint) {
        getPipelineBindPoint().setValue(pipelineBindPoint);
    }

    private static native long getPipelineBindPoint(long address);
    private static native void setPipelineBindPoint(long address, long pipelineBindPoint);

    public VkUInt32 getInputAttachmentCount() {
        return new VkUInt32(getVkMemory(), getInputAttachmentCount(getVkAddress()));
    }

    
    public void setInputAttachmentCount(VkUInt32 inputAttachmentCount) {
        setInputAttachmentCount(getVkAddress(), inputAttachmentCount != null ? inputAttachmentCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setInputAttachmentCount(int inputAttachmentCount) {
        getInputAttachmentCount().setValue(inputAttachmentCount);
    }

    private static native long getInputAttachmentCount(long address);
    private static native void setInputAttachmentCount(long address, long inputAttachmentCount);

    public VkAttachmentReference getPInputAttachments() {
        return new VkAttachmentReference(getVkMemory(), getPInputAttachments(getVkAddress()));
    }

    private VkObject pInputAttachments = null;
    public void setPInputAttachments(VkAttachmentReference pInputAttachments) {
        setPInputAttachments(getVkAddress(), pInputAttachments != null ? pInputAttachments.getVkAddress() : VkPointer.NULL);
        this.pInputAttachments = pInputAttachments;
    }

    private static native long getPInputAttachments(long address);
    private static native void setPInputAttachments(long address, long pInputAttachments);

    public VkUInt32 getColorAttachmentCount() {
        return new VkUInt32(getVkMemory(), getColorAttachmentCount(getVkAddress()));
    }

    
    public void setColorAttachmentCount(VkUInt32 colorAttachmentCount) {
        setColorAttachmentCount(getVkAddress(), colorAttachmentCount != null ? colorAttachmentCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setColorAttachmentCount(int colorAttachmentCount) {
        getColorAttachmentCount().setValue(colorAttachmentCount);
    }

    private static native long getColorAttachmentCount(long address);
    private static native void setColorAttachmentCount(long address, long colorAttachmentCount);

    public VkAttachmentReference getPColorAttachments() {
        return new VkAttachmentReference(getVkMemory(), getPColorAttachments(getVkAddress()));
    }

    private VkObject pColorAttachments = null;
    public void setPColorAttachments(VkAttachmentReference pColorAttachments) {
        setPColorAttachments(getVkAddress(), pColorAttachments != null ? pColorAttachments.getVkAddress() : VkPointer.NULL);
        this.pColorAttachments = pColorAttachments;
    }

    private static native long getPColorAttachments(long address);
    private static native void setPColorAttachments(long address, long pColorAttachments);

    public VkAttachmentReference getPResolveAttachments() {
        return new VkAttachmentReference(getVkMemory(), getPResolveAttachments(getVkAddress()));
    }

    private VkObject pResolveAttachments = null;
    public void setPResolveAttachments(VkAttachmentReference pResolveAttachments) {
        setPResolveAttachments(getVkAddress(), pResolveAttachments != null ? pResolveAttachments.getVkAddress() : VkPointer.NULL);
        this.pResolveAttachments = pResolveAttachments;
    }

    private static native long getPResolveAttachments(long address);
    private static native void setPResolveAttachments(long address, long pResolveAttachments);

    public VkAttachmentReference getPDepthStencilAttachment() {
        return new VkAttachmentReference(getVkMemory(), getPDepthStencilAttachment(getVkAddress()));
    }

    private VkObject pDepthStencilAttachment = null;
    public void setPDepthStencilAttachment(VkAttachmentReference pDepthStencilAttachment) {
        setPDepthStencilAttachment(getVkAddress(), pDepthStencilAttachment != null ? pDepthStencilAttachment.getVkAddress() : VkPointer.NULL);
        this.pDepthStencilAttachment = pDepthStencilAttachment;
    }

    private static native long getPDepthStencilAttachment(long address);
    private static native void setPDepthStencilAttachment(long address, long pDepthStencilAttachment);

    public VkUInt32 getPreserveAttachmentCount() {
        return new VkUInt32(getVkMemory(), getPreserveAttachmentCount(getVkAddress()));
    }

    
    public void setPreserveAttachmentCount(VkUInt32 preserveAttachmentCount) {
        setPreserveAttachmentCount(getVkAddress(), preserveAttachmentCount != null ? preserveAttachmentCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setPreserveAttachmentCount(int preserveAttachmentCount) {
        getPreserveAttachmentCount().setValue(preserveAttachmentCount);
    }

    private static native long getPreserveAttachmentCount(long address);
    private static native void setPreserveAttachmentCount(long address, long preserveAttachmentCount);

    public VkUInt32 getPPreserveAttachments() {
        return new VkUInt32(getVkMemory(), getPPreserveAttachments(getVkAddress()));
    }

    private VkObject pPreserveAttachments = null;
    public void setPPreserveAttachments(VkUInt32 pPreserveAttachments) {
        setPPreserveAttachments(getVkAddress(), pPreserveAttachments != null ? pPreserveAttachments.getVkAddress() : VkPointer.NULL);
        this.pPreserveAttachments = pPreserveAttachments;
    }

    private static native long getPPreserveAttachments(long address);
    private static native void setPPreserveAttachments(long address, long pPreserveAttachments);


    public static native long sizeof();

    public static class Array extends VkSubpassDescription implements cz.mg.collections.array.ReadonlyArray<VkSubpassDescription> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSubpassDescription.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSubpassDescription o){
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
        public VkSubpassDescription get(int i){
            return new VkSubpassDescription(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSubpassDescription.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSubpassDescription.Pointer> {
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

            public Array(VkSubpassDescription[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSubpassDescription.Pointer get(int i){
                return new VkSubpassDescription.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
