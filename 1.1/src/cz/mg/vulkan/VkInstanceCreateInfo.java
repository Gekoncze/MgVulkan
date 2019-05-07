package cz.mg.vulkan;

public class VkInstanceCreateInfo extends VkObject {
    public VkInstanceCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO));
    }

    public VkInstanceCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkInstanceCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkInstanceCreateInfo(VkPointer pointer) {
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

    public VkInstanceCreateFlags getFlags() {
        return new VkInstanceCreateFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkInstanceCreateFlags flags) {
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

    public VkApplicationInfo getPApplicationInfo() {
        return new VkApplicationInfo(getVkMemory(), getPApplicationInfoNative(getVkAddress()));
    }

    private VkObject pApplicationInfo = null;
    public void setPApplicationInfo(VkApplicationInfo pApplicationInfo) {
        setPApplicationInfoNative(getVkAddress(), pApplicationInfo != null ? pApplicationInfo.getVkAddress() : VkPointer.NULL);
        this.pApplicationInfo = pApplicationInfo;
    }

    protected static native long getPApplicationInfoNative(long address);
    protected static native void setPApplicationInfoNative(long address, long pApplicationInfo);

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


    public void set(VkInstanceCreateInfo o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkInstanceCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkInstanceCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkInstanceCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO));;
        }

        public Array(VkInstanceCreateInfo o, int count){
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
        public VkInstanceCreateInfo get(int i){
            return new VkInstanceCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
