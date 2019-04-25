package cz.mg.vulkan;

public class VkDeviceCreateInfo extends VkObject {
    public VkDeviceCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO));
    }

    public VkDeviceCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDeviceCreateInfo(VkPointer pointer) {
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

    public VkDeviceCreateFlags getFlags() {
        return new VkDeviceCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkDeviceCreateFlags flags) {
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

    public VkUInt32 getQueueCreateInfoCount() {
        return new VkUInt32(getVkMemory(), getQueueCreateInfoCount(getVkAddress()));
    }

    
    public void setQueueCreateInfoCount(VkUInt32 queueCreateInfoCount) {
        setQueueCreateInfoCount(getVkAddress(), queueCreateInfoCount != null ? queueCreateInfoCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getQueueCreateInfoCountQ() {
        return getQueueCreateInfoCount().getValue();
    }

    public void setQueueCreateInfoCount(int queueCreateInfoCount) {
        getQueueCreateInfoCount().setValue(queueCreateInfoCount);
    }

    protected static native long getQueueCreateInfoCount(long address);
    protected static native void setQueueCreateInfoCount(long address, long queueCreateInfoCount);

    public VkDeviceQueueCreateInfo getPQueueCreateInfos() {
        return new VkDeviceQueueCreateInfo(getVkMemory(), getPQueueCreateInfos(getVkAddress()));
    }

    private VkObject pQueueCreateInfos = null;
    public void setPQueueCreateInfos(VkDeviceQueueCreateInfo pQueueCreateInfos) {
        setPQueueCreateInfos(getVkAddress(), pQueueCreateInfos != null ? pQueueCreateInfos.getVkAddress() : VkPointer.NULL);
        this.pQueueCreateInfos = pQueueCreateInfos;
    }

    protected static native long getPQueueCreateInfos(long address);
    protected static native void setPQueueCreateInfos(long address, long pQueueCreateInfos);

    public VkUInt32 getEnabledLayerCount() {
        return new VkUInt32(getVkMemory(), getEnabledLayerCount(getVkAddress()));
    }

    
    public void setEnabledLayerCount(VkUInt32 enabledLayerCount) {
        setEnabledLayerCount(getVkAddress(), enabledLayerCount != null ? enabledLayerCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getEnabledLayerCountQ() {
        return getEnabledLayerCount().getValue();
    }

    public void setEnabledLayerCount(int enabledLayerCount) {
        getEnabledLayerCount().setValue(enabledLayerCount);
    }

    protected static native long getEnabledLayerCount(long address);
    protected static native void setEnabledLayerCount(long address, long enabledLayerCount);

    public VkObject getPpEnabledLayerNames() {
        return new VkObject(getVkMemory(), getPpEnabledLayerNames(getVkAddress()));
    }

    private VkObject ppEnabledLayerNames = null;
    public void setPpEnabledLayerNames(VkObject ppEnabledLayerNames) {
        setPpEnabledLayerNames(getVkAddress(), ppEnabledLayerNames != null ? ppEnabledLayerNames.getVkAddress() : VkPointer.NULL);
        this.ppEnabledLayerNames = ppEnabledLayerNames;
    }

    protected static native long getPpEnabledLayerNames(long address);
    protected static native void setPpEnabledLayerNames(long address, long ppEnabledLayerNames);

    public VkUInt32 getEnabledExtensionCount() {
        return new VkUInt32(getVkMemory(), getEnabledExtensionCount(getVkAddress()));
    }

    
    public void setEnabledExtensionCount(VkUInt32 enabledExtensionCount) {
        setEnabledExtensionCount(getVkAddress(), enabledExtensionCount != null ? enabledExtensionCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getEnabledExtensionCountQ() {
        return getEnabledExtensionCount().getValue();
    }

    public void setEnabledExtensionCount(int enabledExtensionCount) {
        getEnabledExtensionCount().setValue(enabledExtensionCount);
    }

    protected static native long getEnabledExtensionCount(long address);
    protected static native void setEnabledExtensionCount(long address, long enabledExtensionCount);

    public VkObject getPpEnabledExtensionNames() {
        return new VkObject(getVkMemory(), getPpEnabledExtensionNames(getVkAddress()));
    }

    private VkObject ppEnabledExtensionNames = null;
    public void setPpEnabledExtensionNames(VkObject ppEnabledExtensionNames) {
        setPpEnabledExtensionNames(getVkAddress(), ppEnabledExtensionNames != null ? ppEnabledExtensionNames.getVkAddress() : VkPointer.NULL);
        this.ppEnabledExtensionNames = ppEnabledExtensionNames;
    }

    protected static native long getPpEnabledExtensionNames(long address);
    protected static native void setPpEnabledExtensionNames(long address, long ppEnabledExtensionNames);

    public VkPhysicalDeviceFeatures getPEnabledFeatures() {
        return new VkPhysicalDeviceFeatures(getVkMemory(), getPEnabledFeatures(getVkAddress()));
    }

    private VkObject pEnabledFeatures = null;
    public void setPEnabledFeatures(VkPhysicalDeviceFeatures pEnabledFeatures) {
        setPEnabledFeatures(getVkAddress(), pEnabledFeatures != null ? pEnabledFeatures.getVkAddress() : VkPointer.NULL);
        this.pEnabledFeatures = pEnabledFeatures;
    }

    protected static native long getPEnabledFeatures(long address);
    protected static native void setPEnabledFeatures(long address, long pEnabledFeatures);


    public static native long sizeof();

    public static class Array extends VkDeviceCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkDeviceCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO));;
        }

        public Array(int count, VkDeviceCreateInfo o){
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
        public VkDeviceCreateInfo get(int i){
            return new VkDeviceCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
