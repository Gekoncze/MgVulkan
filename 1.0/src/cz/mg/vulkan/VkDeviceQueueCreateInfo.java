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

    public VkDeviceQueueCreateInfo(VkPointer pointer) {
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

    public VkDeviceQueueCreateFlags getFlags() {
        return new VkDeviceQueueCreateFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkDeviceQueueCreateFlags flags) {
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

    public VkUInt32 getQueueCount() {
        return new VkUInt32(getVkMemory(), getQueueCountNative(getVkAddress()));
    }

    
    public void setQueueCount(VkUInt32 queueCount) {
        setQueueCountNative(getVkAddress(), queueCount != null ? queueCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getQueueCountQ() {
        return getQueueCount().getValue();
    }

    public void setQueueCount(int queueCount) {
        getQueueCount().setValue(queueCount);
    }

    protected static native long getQueueCountNative(long address);
    protected static native void setQueueCountNative(long address, long queueCount);

    public VkFloat getPQueuePriorities() {
        return new VkFloat(getVkMemory(), getPQueuePrioritiesNative(getVkAddress()));
    }

    private VkObject pQueuePriorities = null;
    public void setPQueuePriorities(VkFloat pQueuePriorities) {
        setPQueuePrioritiesNative(getVkAddress(), pQueuePriorities != null ? pQueuePriorities.getVkAddress() : VkPointer.NULL);
        this.pQueuePriorities = pQueuePriorities;
    }

    protected static native long getPQueuePrioritiesNative(long address);
    protected static native void setPQueuePrioritiesNative(long address, long pQueuePriorities);


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
