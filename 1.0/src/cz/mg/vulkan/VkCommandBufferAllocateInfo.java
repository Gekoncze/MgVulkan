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

    public VkCommandBufferAllocateInfo(VkPointer pointer) {
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

    public VkCommandPool getCommandPool() {
        return new VkCommandPool(getVkMemory(), getCommandPoolNative(getVkAddress()));
    }

    
    public void setCommandPool(VkCommandPool commandPool) {
        setCommandPoolNative(getVkAddress(), commandPool != null ? commandPool.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getCommandPoolNative(long address);
    protected static native void setCommandPoolNative(long address, long commandPool);

    public VkCommandBufferLevel getLevel() {
        return new VkCommandBufferLevel(getVkMemory(), getLevelNative(getVkAddress()));
    }

    
    public void setLevel(VkCommandBufferLevel level) {
        setLevelNative(getVkAddress(), level != null ? level.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getLevelQ() {
        return getLevel().getValue();
    }

    public void setLevel(int level) {
        getLevel().setValue(level);
    }

    protected static native long getLevelNative(long address);
    protected static native void setLevelNative(long address, long level);

    public VkUInt32 getCommandBufferCount() {
        return new VkUInt32(getVkMemory(), getCommandBufferCountNative(getVkAddress()));
    }

    
    public void setCommandBufferCount(VkUInt32 commandBufferCount) {
        setCommandBufferCountNative(getVkAddress(), commandBufferCount != null ? commandBufferCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCommandBufferCountQ() {
        return getCommandBufferCount().getValue();
    }

    public void setCommandBufferCount(int commandBufferCount) {
        getCommandBufferCount().setValue(commandBufferCount);
    }

    protected static native long getCommandBufferCountNative(long address);
    protected static native void setCommandBufferCountNative(long address, long commandBufferCount);


    public void set(VkCommandBufferAllocateInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

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
