package cz.mg.vulkan;

public class VkCommandBufferAllocateInfo extends VkObject {
    public VkCommandBufferAllocateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO));
    }

    public VkCommandBufferAllocateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCommandBufferAllocateInfo(VkMemory vkmemory, long vkaddress) {
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

    public VkCommandPool getCommandPool() {
        return new VkCommandPool(getVkMemory(), getCommandPool(getVkAddress()));
    }

    
    public void setCommandPool(VkCommandPool commandPool) {
        setCommandPool(getVkAddress(), commandPool != null ? commandPool.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getCommandPool(long address);
    protected static native void setCommandPool(long address, long commandPool);

    public VkCommandBufferLevel getLevel() {
        return new VkCommandBufferLevel(getVkMemory(), getLevel(getVkAddress()));
    }

    
    public void setLevel(VkCommandBufferLevel level) {
        setLevel(getVkAddress(), level != null ? level.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getLevelQ() {
        return getLevel().getValue();
    }

    public void setLevel(int level) {
        getLevel().setValue(level);
    }

    protected static native long getLevel(long address);
    protected static native void setLevel(long address, long level);

    public VkUInt32 getCommandBufferCount() {
        return new VkUInt32(getVkMemory(), getCommandBufferCount(getVkAddress()));
    }

    
    public void setCommandBufferCount(VkUInt32 commandBufferCount) {
        setCommandBufferCount(getVkAddress(), commandBufferCount != null ? commandBufferCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCommandBufferCountQ() {
        return getCommandBufferCount().getValue();
    }

    public void setCommandBufferCount(int commandBufferCount) {
        getCommandBufferCount().setValue(commandBufferCount);
    }

    protected static native long getCommandBufferCount(long address);
    protected static native void setCommandBufferCount(long address, long commandBufferCount);


    public static native long sizeof();

    public static class Array extends VkCommandBufferAllocateInfo implements cz.mg.collections.array.ReadonlyArray<VkCommandBufferAllocateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkCommandBufferAllocateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO));;
        }

        public Array(int count, VkCommandBufferAllocateInfo o){
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
        public VkCommandBufferAllocateInfo get(int i){
            return new VkCommandBufferAllocateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
