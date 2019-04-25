package cz.mg.vulkan;

public class VkDeviceQueueCreateInfo extends VkObject {
    public VkDeviceQueueCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO));
    }

    public VkDeviceQueueCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceQueueCreateInfo(VkMemory vkmemory, long vkaddress) {
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

    public VkDeviceQueueCreateFlags getFlags() {
        return new VkDeviceQueueCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkDeviceQueueCreateFlags flags) {
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

    public VkUInt32 getQueueFamilyIndex() {
        return new VkUInt32(getVkMemory(), getQueueFamilyIndex(getVkAddress()));
    }

    
    public void setQueueFamilyIndex(VkUInt32 queueFamilyIndex) {
        setQueueFamilyIndex(getVkAddress(), queueFamilyIndex != null ? queueFamilyIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getQueueFamilyIndexQ() {
        return getQueueFamilyIndex().getValue();
    }

    public void setQueueFamilyIndex(int queueFamilyIndex) {
        getQueueFamilyIndex().setValue(queueFamilyIndex);
    }

    protected static native long getQueueFamilyIndex(long address);
    protected static native void setQueueFamilyIndex(long address, long queueFamilyIndex);

    public VkUInt32 getQueueCount() {
        return new VkUInt32(getVkMemory(), getQueueCount(getVkAddress()));
    }

    
    public void setQueueCount(VkUInt32 queueCount) {
        setQueueCount(getVkAddress(), queueCount != null ? queueCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getQueueCountQ() {
        return getQueueCount().getValue();
    }

    public void setQueueCount(int queueCount) {
        getQueueCount().setValue(queueCount);
    }

    protected static native long getQueueCount(long address);
    protected static native void setQueueCount(long address, long queueCount);

    public VkFloat getPQueuePriorities() {
        return new VkFloat(getVkMemory(), getPQueuePriorities(getVkAddress()));
    }

    private VkObject pQueuePriorities = null;
    public void setPQueuePriorities(VkFloat pQueuePriorities) {
        setPQueuePriorities(getVkAddress(), pQueuePriorities != null ? pQueuePriorities.getVkAddress() : VkPointer.NULL);
        this.pQueuePriorities = pQueuePriorities;
    }

    protected static native long getPQueuePriorities(long address);
    protected static native void setPQueuePriorities(long address, long pQueuePriorities);


    public static native long sizeof();

    public static class Array extends VkDeviceQueueCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkDeviceQueueCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceQueueCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO));;
        }

        public Array(int count, VkDeviceQueueCreateInfo o){
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
        public VkDeviceQueueCreateInfo get(int i){
            return new VkDeviceQueueCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
