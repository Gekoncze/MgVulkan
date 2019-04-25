package cz.mg.vulkan;

public class VkCommandPoolCreateInfo extends VkObject {
    public VkCommandPoolCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO));
    }

    public VkCommandPoolCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCommandPoolCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkCommandPoolCreateInfo(VkPointer pointer) {
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

    public VkCommandPoolCreateFlags getFlags() {
        return new VkCommandPoolCreateFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkCommandPoolCreateFlags flags) {
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

    public VkUInt32 getQueueFamilyIndex() {
        return new VkUInt32(getVkMemory(), getQueueFamilyIndexNative(getVkAddress()));
    }

    
    public void setQueueFamilyIndex(VkUInt32 queueFamilyIndex) {
        setQueueFamilyIndexNative(getVkAddress(), queueFamilyIndex != null ? queueFamilyIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getQueueFamilyIndexQ() {
        return getQueueFamilyIndex().getValue();
    }

    public void setQueueFamilyIndex(int queueFamilyIndex) {
        getQueueFamilyIndex().setValue(queueFamilyIndex);
    }

    protected static native long getQueueFamilyIndexNative(long address);
    protected static native void setQueueFamilyIndexNative(long address, long queueFamilyIndex);


    public static native long sizeof();

    public static class Array extends VkCommandPoolCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkCommandPoolCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkCommandPoolCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO));;
        }

        public Array(int count, VkCommandPoolCreateInfo o){
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
        public VkCommandPoolCreateInfo get(int i){
            return new VkCommandPoolCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
