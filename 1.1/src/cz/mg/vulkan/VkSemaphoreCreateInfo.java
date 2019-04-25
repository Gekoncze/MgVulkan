package cz.mg.vulkan;

public class VkSemaphoreCreateInfo extends VkObject {
    public VkSemaphoreCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO));
    }

    public VkSemaphoreCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSemaphoreCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSemaphoreCreateInfo(VkPointer pointer) {
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

    public VkSemaphoreCreateFlags getFlags() {
        return new VkSemaphoreCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkSemaphoreCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlags(long address);
    protected static native void setFlags(long address, long flags);


    public static native long sizeof();

    public static class Array extends VkSemaphoreCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkSemaphoreCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSemaphoreCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO));;
        }

        public Array(int count, VkSemaphoreCreateInfo o){
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
        public VkSemaphoreCreateInfo get(int i){
            return new VkSemaphoreCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
