package cz.mg.vulkan;

public class VkCmdReserveSpaceForCommandsInfoNVX extends VkObject {
    public VkCmdReserveSpaceForCommandsInfoNVX() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_CMD_RESERVE_SPACE_FOR_COMMANDS_INFO_NVX));
    }

    public VkCmdReserveSpaceForCommandsInfoNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCmdReserveSpaceForCommandsInfoNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkCmdReserveSpaceForCommandsInfoNVX(VkPointer pointer) {
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


    public static native long sizeof();

    public static class Array extends VkCmdReserveSpaceForCommandsInfoNVX implements cz.mg.collections.array.ReadonlyArray<VkCmdReserveSpaceForCommandsInfoNVX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkCmdReserveSpaceForCommandsInfoNVX.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_CMD_RESERVE_SPACE_FOR_COMMANDS_INFO_NVX));;
        }

        public Array(int count, VkCmdReserveSpaceForCommandsInfoNVX o){
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
        public VkCmdReserveSpaceForCommandsInfoNVX get(int i){
            return new VkCmdReserveSpaceForCommandsInfoNVX(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
