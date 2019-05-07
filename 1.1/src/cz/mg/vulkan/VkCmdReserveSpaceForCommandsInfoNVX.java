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


    public void set(VkCmdReserveSpaceForCommandsInfoNVX o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkCmdReserveSpaceForCommandsInfoNVX implements cz.mg.collections.array.ReadonlyArray<VkCmdReserveSpaceForCommandsInfoNVX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkCmdReserveSpaceForCommandsInfoNVX.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_CMD_RESERVE_SPACE_FOR_COMMANDS_INFO_NVX));;
        }

        public Array(VkCmdReserveSpaceForCommandsInfoNVX o, int count){
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
