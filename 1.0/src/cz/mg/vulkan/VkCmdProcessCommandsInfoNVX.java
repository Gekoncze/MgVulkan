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

    public VkObjectTableNVX getObjectTable() {
        return new VkObjectTableNVX(getVkMemory(), getObjectTable(getVkAddress()));
    }

    
    public void setObjectTable(VkObjectTableNVX objectTable) {
        setObjectTable(getVkAddress(), objectTable != null ? objectTable.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getObjectTable(long address);
    protected static native void setObjectTable(long address, long objectTable);

    public VkIndirectCommandsLayoutNVX getIndirectCommandsLayout() {
        return new VkIndirectCommandsLayoutNVX(getVkMemory(), getIndirectCommandsLayout(getVkAddress()));
    }

    
    public void setIndirectCommandsLayout(VkIndirectCommandsLayoutNVX indirectCommandsLayout) {
        setIndirectCommandsLayout(getVkAddress(), indirectCommandsLayout != null ? indirectCommandsLayout.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getIndirectCommandsLayout(long address);
    protected static native void setIndirectCommandsLayout(long address, long indirectCommandsLayout);

    public VkUInt32 getIndirectCommandsTokenCount() {
        return new VkUInt32(getVkMemory(), getIndirectCommandsTokenCount(getVkAddress()));
    }

    
    public void setIndirectCommandsTokenCount(VkUInt32 indirectCommandsTokenCount) {
        setIndirectCommandsTokenCount(getVkAddress(), indirectCommandsTokenCount != null ? indirectCommandsTokenCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getIndirectCommandsTokenCountQ() {
        return getIndirectCommandsTokenCount().getValue();
    }

    public void setIndirectCommandsTokenCount(int indirectCommandsTokenCount) {
        getIndirectCommandsTokenCount().setValue(indirectCommandsTokenCount);
    }

    protected static native long getIndirectCommandsTokenCount(long address);
    protected static native void setIndirectCommandsTokenCount(long address, long indirectCommandsTokenCount);

    public VkIndirectCommandsTokenNVX getPIndirectCommandsTokens() {
        return new VkIndirectCommandsTokenNVX(getVkMemory(), getPIndirectCommandsTokens(getVkAddress()));
    }

    private VkObject pIndirectCommandsTokens = null;
    public void setPIndirectCommandsTokens(VkIndirectCommandsTokenNVX pIndirectCommandsTokens) {
        setPIndirectCommandsTokens(getVkAddress(), pIndirectCommandsTokens != null ? pIndirectCommandsTokens.getVkAddress() : VkPointer.NULL);
        this.pIndirectCommandsTokens = pIndirectCommandsTokens;
    }

    protected static native long getPIndirectCommandsTokens(long address);
    protected static native void setPIndirectCommandsTokens(long address, long pIndirectCommandsTokens);

    public VkUInt32 getMaxSequencesCount() {
        return new VkUInt32(getVkMemory(), getMaxSequencesCount(getVkAddress()));
    }

    
    public void setMaxSequencesCount(VkUInt32 maxSequencesCount) {
        setMaxSequencesCount(getVkAddress(), maxSequencesCount != null ? maxSequencesCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getMaxSequencesCountQ() {
        return getMaxSequencesCount().getValue();
    }

    public void setMaxSequencesCount(int maxSequencesCount) {
        getMaxSequencesCount().setValue(maxSequencesCount);
    }

    protected static native long getMaxSequencesCount(long address);
    protected static native void setMaxSequencesCount(long address, long maxSequencesCount);

    public VkCommandBuffer getTargetCommandBuffer() {
        return new VkCommandBuffer(getVkMemory(), getTargetCommandBuffer(getVkAddress()));
    }

    
    public void setTargetCommandBuffer(VkCommandBuffer targetCommandBuffer) {
        setTargetCommandBuffer(getVkAddress(), targetCommandBuffer != null ? targetCommandBuffer.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getTargetCommandBuffer(long address);
    protected static native void setTargetCommandBuffer(long address, long targetCommandBuffer);

    public VkBuffer getSequencesCountBuffer() {
        return new VkBuffer(getVkMemory(), getSequencesCountBuffer(getVkAddress()));
    }

    
    public void setSequencesCountBuffer(VkBuffer sequencesCountBuffer) {
        setSequencesCountBuffer(getVkAddress(), sequencesCountBuffer != null ? sequencesCountBuffer.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSequencesCountBuffer(long address);
    protected static native void setSequencesCountBuffer(long address, long sequencesCountBuffer);

    public VkDeviceSize getSequencesCountOffset() {
        return new VkDeviceSize(getVkMemory(), getSequencesCountOffset(getVkAddress()));
    }

    
    public void setSequencesCountOffset(VkDeviceSize sequencesCountOffset) {
        setSequencesCountOffset(getVkAddress(), sequencesCountOffset != null ? sequencesCountOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getSequencesCountOffsetQ() {
        return getSequencesCountOffset().getValue();
    }

    public void setSequencesCountOffset(long sequencesCountOffset) {
        getSequencesCountOffset().setValue(sequencesCountOffset);
    }

    protected static native long getSequencesCountOffset(long address);
    protected static native void setSequencesCountOffset(long address, long sequencesCountOffset);

    public VkBuffer getSequencesIndexBuffer() {
        return new VkBuffer(getVkMemory(), getSequencesIndexBuffer(getVkAddress()));
    }

    
    public void setSequencesIndexBuffer(VkBuffer sequencesIndexBuffer) {
        setSequencesIndexBuffer(getVkAddress(), sequencesIndexBuffer != null ? sequencesIndexBuffer.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSequencesIndexBuffer(long address);
    protected static native void setSequencesIndexBuffer(long address, long sequencesIndexBuffer);

    public VkDeviceSize getSequencesIndexOffset() {
        return new VkDeviceSize(getVkMemory(), getSequencesIndexOffset(getVkAddress()));
    }

    
    public void setSequencesIndexOffset(VkDeviceSize sequencesIndexOffset) {
        setSequencesIndexOffset(getVkAddress(), sequencesIndexOffset != null ? sequencesIndexOffset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getSequencesIndexOffsetQ() {
        return getSequencesIndexOffset().getValue();
    }

    public void setSequencesIndexOffset(long sequencesIndexOffset) {
        getSequencesIndexOffset().setValue(sequencesIndexOffset);
    }

    protected static native long getSequencesIndexOffset(long address);
    protected static native void setSequencesIndexOffset(long address, long sequencesIndexOffset);


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
