package cz.mg.vulkan;

public class VkPipelineColorBlendStateCreateInfo extends VkObject {
    public VkPipelineColorBlendStateCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO));
    }

    public VkPipelineColorBlendStateCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineColorBlendStateCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPipelineColorBlendStateCreateInfo(VkPointer pointer) {
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

    public VkPipelineColorBlendStateCreateFlags getFlags() {
        return new VkPipelineColorBlendStateCreateFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkPipelineColorBlendStateCreateFlags flags) {
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

    public VkBool32 getLogicOpEnable() {
        return new VkBool32(getVkMemory(), getLogicOpEnableNative(getVkAddress()));
    }

    
    public void setLogicOpEnable(VkBool32 logicOpEnable) {
        setLogicOpEnableNative(getVkAddress(), logicOpEnable != null ? logicOpEnable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getLogicOpEnableQ() {
        return getLogicOpEnable().getValue();
    }

    public void setLogicOpEnable(int logicOpEnable) {
        getLogicOpEnable().setValue(logicOpEnable);
    }

    protected static native long getLogicOpEnableNative(long address);
    protected static native void setLogicOpEnableNative(long address, long logicOpEnable);

    public VkLogicOp getLogicOp() {
        return new VkLogicOp(getVkMemory(), getLogicOpNative(getVkAddress()));
    }

    
    public void setLogicOp(VkLogicOp logicOp) {
        setLogicOpNative(getVkAddress(), logicOp != null ? logicOp.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getLogicOpQ() {
        return getLogicOp().getValue();
    }

    public void setLogicOp(int logicOp) {
        getLogicOp().setValue(logicOp);
    }

    protected static native long getLogicOpNative(long address);
    protected static native void setLogicOpNative(long address, long logicOp);

    public VkUInt32 getAttachmentCount() {
        return new VkUInt32(getVkMemory(), getAttachmentCountNative(getVkAddress()));
    }

    
    public void setAttachmentCount(VkUInt32 attachmentCount) {
        setAttachmentCountNative(getVkAddress(), attachmentCount != null ? attachmentCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAttachmentCountQ() {
        return getAttachmentCount().getValue();
    }

    public void setAttachmentCount(int attachmentCount) {
        getAttachmentCount().setValue(attachmentCount);
    }

    protected static native long getAttachmentCountNative(long address);
    protected static native void setAttachmentCountNative(long address, long attachmentCount);

    public VkPipelineColorBlendAttachmentState getPAttachments() {
        return new VkPipelineColorBlendAttachmentState(getVkMemory(), getPAttachmentsNative(getVkAddress()));
    }

    private VkObject pAttachments = null;
    public void setPAttachments(VkPipelineColorBlendAttachmentState pAttachments) {
        setPAttachmentsNative(getVkAddress(), pAttachments != null ? pAttachments.getVkAddress() : VkPointer.NULL);
        this.pAttachments = pAttachments;
    }

    protected static native long getPAttachmentsNative(long address);
    protected static native void setPAttachmentsNative(long address, long pAttachments);

    public VkFloat getBlendConstants() {
        return new VkFloat(getVkMemory(), getBlendConstantsNative(getVkAddress()));
    }

    
    public void setBlendConstants(VkFloat blendConstants) {
        setBlendConstantsNative(getVkAddress(), blendConstants != null ? blendConstants.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getBlendConstantsNative(long address);
    protected static native void setBlendConstantsNative(long address, long blendConstants);


    public void set(VkPipelineColorBlendStateCreateInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPipelineColorBlendStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineColorBlendStateCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineColorBlendStateCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO));;
        }

        public Array(int count, VkPipelineColorBlendStateCreateInfo o){
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
        public VkPipelineColorBlendStateCreateInfo get(int i){
            return new VkPipelineColorBlendStateCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
