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

    public VkDeviceCreateFlags getFlags() {
        return new VkDeviceCreateFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkDeviceCreateFlags flags) {
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

    public VkUInt32 getQueueCreateInfoCount() {
        return new VkUInt32(getVkMemory(), getQueueCreateInfoCountNative(getVkAddress()));
    }

    
    public void setQueueCreateInfoCount(VkUInt32 queueCreateInfoCount) {
        setQueueCreateInfoCountNative(getVkAddress(), queueCreateInfoCount != null ? queueCreateInfoCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getQueueCreateInfoCountQ() {
        return getQueueCreateInfoCount().getValue();
    }

    public void setQueueCreateInfoCount(int queueCreateInfoCount) {
        getQueueCreateInfoCount().setValue(queueCreateInfoCount);
    }

    protected static native long getQueueCreateInfoCountNative(long address);
    protected static native void setQueueCreateInfoCountNative(long address, long queueCreateInfoCount);

    public VkDeviceQueueCreateInfo getPQueueCreateInfos() {
        return new VkDeviceQueueCreateInfo(getVkMemory(), getPQueueCreateInfosNative(getVkAddress()));
    }

    private VkObject pQueueCreateInfos = null;
    public void setPQueueCreateInfos(VkDeviceQueueCreateInfo pQueueCreateInfos) {
        setPQueueCreateInfosNative(getVkAddress(), pQueueCreateInfos != null ? pQueueCreateInfos.getVkAddress() : VkPointer.NULL);
        this.pQueueCreateInfos = pQueueCreateInfos;
    }

    protected static native long getPQueueCreateInfosNative(long address);
    protected static native void setPQueueCreateInfosNative(long address, long pQueueCreateInfos);

    public VkUInt32 getEnabledLayerCount() {
        return new VkUInt32(getVkMemory(), getEnabledLayerCountNative(getVkAddress()));
    }

    
    public void setEnabledLayerCount(VkUInt32 enabledLayerCount) {
        setEnabledLayerCountNative(getVkAddress(), enabledLayerCount != null ? enabledLayerCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getEnabledLayerCountQ() {
        return getEnabledLayerCount().getValue();
    }

    public void setEnabledLayerCount(int enabledLayerCount) {
        getEnabledLayerCount().setValue(enabledLayerCount);
    }

    protected static native long getEnabledLayerCountNative(long address);
    protected static native void setEnabledLayerCountNative(long address, long enabledLayerCount);

    public VkObject getPpEnabledLayerNames() {
        return new VkObject(getVkMemory(), getPpEnabledLayerNamesNative(getVkAddress()));
    }

    private VkObject ppEnabledLayerNames = null;
    public void setPpEnabledLayerNames(VkObject ppEnabledLayerNames) {
        setPpEnabledLayerNamesNative(getVkAddress(), ppEnabledLayerNames != null ? ppEnabledLayerNames.getVkAddress() : VkPointer.NULL);
        this.ppEnabledLayerNames = ppEnabledLayerNames;
    }

    protected static native long getPpEnabledLayerNamesNative(long address);
    protected static native void setPpEnabledLayerNamesNative(long address, long ppEnabledLayerNames);

    public VkUInt32 getEnabledExtensionCount() {
        return new VkUInt32(getVkMemory(), getEnabledExtensionCountNative(getVkAddress()));
    }

    
    public void setEnabledExtensionCount(VkUInt32 enabledExtensionCount) {
        setEnabledExtensionCountNative(getVkAddress(), enabledExtensionCount != null ? enabledExtensionCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getEnabledExtensionCountQ() {
        return getEnabledExtensionCount().getValue();
    }

    public void setEnabledExtensionCount(int enabledExtensionCount) {
        getEnabledExtensionCount().setValue(enabledExtensionCount);
    }

    protected static native long getEnabledExtensionCountNative(long address);
    protected static native void setEnabledExtensionCountNative(long address, long enabledExtensionCount);

    public VkObject getPpEnabledExtensionNames() {
        return new VkObject(getVkMemory(), getPpEnabledExtensionNamesNative(getVkAddress()));
    }

    private VkObject ppEnabledExtensionNames = null;
    public void setPpEnabledExtensionNames(VkObject ppEnabledExtensionNames) {
        setPpEnabledExtensionNamesNative(getVkAddress(), ppEnabledExtensionNames != null ? ppEnabledExtensionNames.getVkAddress() : VkPointer.NULL);
        this.ppEnabledExtensionNames = ppEnabledExtensionNames;
    }

    protected static native long getPpEnabledExtensionNamesNative(long address);
    protected static native void setPpEnabledExtensionNamesNative(long address, long ppEnabledExtensionNames);

    public VkPhysicalDeviceFeatures getPEnabledFeatures() {
        return new VkPhysicalDeviceFeatures(getVkMemory(), getPEnabledFeaturesNative(getVkAddress()));
    }

    private VkObject pEnabledFeatures = null;
    public void setPEnabledFeatures(VkPhysicalDeviceFeatures pEnabledFeatures) {
        setPEnabledFeaturesNative(getVkAddress(), pEnabledFeatures != null ? pEnabledFeatures.getVkAddress() : VkPointer.NULL);
        this.pEnabledFeatures = pEnabledFeatures;
    }

    protected static native long getPEnabledFeaturesNative(long address);
    protected static native void setPEnabledFeaturesNative(long address, long pEnabledFeatures);


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
