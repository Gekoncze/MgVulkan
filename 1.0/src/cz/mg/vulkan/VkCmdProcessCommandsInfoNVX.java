package cz.mg.vulkan;

public class VkCmdProcessCommandsInfoNVX extends VkObject {
    public VkCmdProcessCommandsInfoNVX() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_CMD_PROCESS_COMMANDS_INFO_NVX));
    }

    public VkCmdProcessCommandsInfoNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCmdProcessCommandsInfoNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkCmdProcessCommandsInfoNVX(VkPointer pointer) {
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

    public VkObjectTableNVX getObjectTable() {
        return new VkObjectTableNVX(getVkMemory(), getObjectTableNative(getVkAddress()));
    }

    
    public void setObjectTable(VkObjectTableNVX objectTable) {
        setObjectTableNative(getVkAddress(), objectTable != null ? objectTable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getObjectTableNative(long address);
    protected static native void setObjectTableNative(long address, long objectTable);

    public VkIndirectCommandsLayoutNVX getIndirectCommandsLayout() {
        return new VkIndirectCommandsLayoutNVX(getVkMemory(), getIndirectCommandsLayoutNative(getVkAddress()));
    }

    
    public void setIndirectCommandsLayout(VkIndirectCommandsLayoutNVX indirectCommandsLayout) {
        setIndirectCommandsLayoutNative(getVkAddress(), indirectCommandsLayout != null ? indirectCommandsLayout.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getIndirectCommandsLayoutNative(long address);
    protected static native void setIndirectCommandsLayoutNative(long address, long indirectCommandsLayout);

    public VkUInt32 getIndirectCommandsTokenCount() {
        return new VkUInt32(getVkMemory(), getIndirectCommandsTokenCountNative(getVkAddress()));
    }

    
    public void setIndirectCommandsTokenCount(VkUInt32 indirectCommandsTokenCount) {
        setIndirectCommandsTokenCountNative(getVkAddress(), indirectCommandsTokenCount != null ? indirectCommandsTokenCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getIndirectCommandsTokenCountQ() {
        return getIndirectCommandsTokenCount().getValue();
    }

    public void setIndirectCommandsTokenCount(int indirectCommandsTokenCount) {
        getIndirectCommandsTokenCount().setValue(indirectCommandsTokenCount);
    }

    protected static native long getIndirectCommandsTokenCountNative(long address);
    protected static native void setIndirectCommandsTokenCountNative(long address, long indirectCommandsTokenCount);

    public VkIndirectCommandsTokenNVX getPIndirectCommandsTokens() {
        return new VkIndirectCommandsTokenNVX(getVkMemory(), getPIndirectCommandsTokensNative(getVkAddress()));
    }

    private VkObject pIndirectCommandsTokens = null;
    public void setPIndirectCommandsTokens(VkIndirectCommandsTokenNVX pIndirectCommandsTokens) {
        setPIndirectCommandsTokensNative(getVkAddress(), pIndirectCommandsTokens != null ? pIndirectCommandsTokens.getVkAddress() : VkPointer.NULL);
        this.pIndirectCommandsTokens = pIndirectCommandsTokens;
    }

    protected static native long getPIndirectCommandsTokensNative(long address);
    protected static native void setPIndirectCommandsTokensNative(long address, long pIndirectCommandsTokens);

    public VkUInt32 getMaxSequencesCount() {
        return new VkUInt32(getVkMemory(), getMaxSequencesCountNative(getVkAddress()));
    }

    
    public void setMaxSequencesCount(VkUInt32 maxSequencesCount) {
        setMaxSequencesCountNative(getVkAddress(), maxSequencesCount != null ? maxSequencesCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxSequencesCountQ() {
        return getMaxSequencesCount().getValue();
    }

    public void setMaxSequencesCount(int maxSequencesCount) {
        getMaxSequencesCount().setValue(maxSequencesCount);
    }

    protected static native long getMaxSequencesCountNative(long address);
    protected static native void setMaxSequencesCountNative(long address, long maxSequencesCount);

    public VkCommandBuffer getTargetCommandBuffer() {
        return new VkCommandBuffer(getVkMemory(), getTargetCommandBufferNative(getVkAddress()));
    }

    
    public void setTargetCommandBuffer(VkCommandBuffer targetCommandBuffer) {
        setTargetCommandBufferNative(getVkAddress(), targetCommandBuffer != null ? targetCommandBuffer.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getTargetCommandBufferNative(long address);
    protected static native void setTargetCommandBufferNative(long address, long targetCommandBuffer);

    public VkBuffer getSequencesCountBuffer() {
        return new VkBuffer(getVkMemory(), getSequencesCountBufferNative(getVkAddress()));
    }

    
    public void setSequencesCountBuffer(VkBuffer sequencesCountBuffer) {
        setSequencesCountBufferNative(getVkAddress(), sequencesCountBuffer != null ? sequencesCountBuffer.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSequencesCountBufferNative(long address);
    protected static native void setSequencesCountBufferNative(long address, long sequencesCountBuffer);

    public VkDeviceSize getSequencesCountOffset() {
        return new VkDeviceSize(getVkMemory(), getSequencesCountOffsetNative(getVkAddress()));
    }

    
    public void setSequencesCountOffset(VkDeviceSize sequencesCountOffset) {
        setSequencesCountOffsetNative(getVkAddress(), sequencesCountOffset != null ? sequencesCountOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getSequencesCountOffsetQ() {
        return getSequencesCountOffset().getValue();
    }

    public void setSequencesCountOffset(long sequencesCountOffset) {
        getSequencesCountOffset().setValue(sequencesCountOffset);
    }

    protected static native long getSequencesCountOffsetNative(long address);
    protected static native void setSequencesCountOffsetNative(long address, long sequencesCountOffset);

    public VkBuffer getSequencesIndexBuffer() {
        return new VkBuffer(getVkMemory(), getSequencesIndexBufferNative(getVkAddress()));
    }

    
    public void setSequencesIndexBuffer(VkBuffer sequencesIndexBuffer) {
        setSequencesIndexBufferNative(getVkAddress(), sequencesIndexBuffer != null ? sequencesIndexBuffer.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSequencesIndexBufferNative(long address);
    protected static native void setSequencesIndexBufferNative(long address, long sequencesIndexBuffer);

    public VkDeviceSize getSequencesIndexOffset() {
        return new VkDeviceSize(getVkMemory(), getSequencesIndexOffsetNative(getVkAddress()));
    }

    
    public void setSequencesIndexOffset(VkDeviceSize sequencesIndexOffset) {
        setSequencesIndexOffsetNative(getVkAddress(), sequencesIndexOffset != null ? sequencesIndexOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getSequencesIndexOffsetQ() {
        return getSequencesIndexOffset().getValue();
    }

    public void setSequencesIndexOffset(long sequencesIndexOffset) {
        getSequencesIndexOffset().setValue(sequencesIndexOffset);
    }

    protected static native long getSequencesIndexOffsetNative(long address);
    protected static native void setSequencesIndexOffsetNative(long address, long sequencesIndexOffset);


    public static native long sizeof();

    public static class Array extends VkCmdProcessCommandsInfoNVX implements cz.mg.collections.array.ReadonlyArray<VkCmdProcessCommandsInfoNVX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkCmdProcessCommandsInfoNVX.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_CMD_PROCESS_COMMANDS_INFO_NVX));;
        }

        public Array(int count, VkCmdProcessCommandsInfoNVX o){
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
        public VkCmdProcessCommandsInfoNVX get(int i){
            return new VkCmdProcessCommandsInfoNVX(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
