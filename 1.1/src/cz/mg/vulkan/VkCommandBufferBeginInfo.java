package cz.mg.vulkan;

public class VkCommandBufferBeginInfo extends VkObject {
    public VkCommandBufferBeginInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO));
    }

    public VkCommandBufferBeginInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCommandBufferBeginInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkCommandBufferBeginInfo(VkPointer pointer) {
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

    public VkCommandBufferUsageFlags getFlags() {
        return new VkCommandBufferUsageFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkCommandBufferUsageFlags flags) {
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

    public VkCommandBufferInheritanceInfo getPInheritanceInfo() {
        return new VkCommandBufferInheritanceInfo(getVkMemory(), getPInheritanceInfoNative(getVkAddress()));
    }

    private VkObject pInheritanceInfo = null;
    public void setPInheritanceInfo(VkCommandBufferInheritanceInfo pInheritanceInfo) {
        setPInheritanceInfoNative(getVkAddress(), pInheritanceInfo != null ? pInheritanceInfo.getVkAddress() : VkPointer.NULL);
        this.pInheritanceInfo = pInheritanceInfo;
    }

    protected static native long getPInheritanceInfoNative(long address);
    protected static native void setPInheritanceInfoNative(long address, long pInheritanceInfo);


    public void set(VkCommandBufferBeginInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkCommandBufferBeginInfo implements cz.mg.collections.array.ReadonlyArray<VkCommandBufferBeginInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkCommandBufferBeginInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO));;
        }

        public Array(int count, VkCommandBufferBeginInfo o){
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
        public VkCommandBufferBeginInfo get(int i){
            return new VkCommandBufferBeginInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
