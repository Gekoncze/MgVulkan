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

    public VkInstanceCreateFlags getFlags() {
        return new VkInstanceCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkInstanceCreateFlags flags) {
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

    public VkApplicationInfo getPApplicationInfo() {
        return new VkApplicationInfo(getVkMemory(), getPApplicationInfo(getVkAddress()));
    }

    private VkObject pApplicationInfo = null;
    public void setPApplicationInfo(VkApplicationInfo pApplicationInfo) {
        setPApplicationInfo(getVkAddress(), pApplicationInfo != null ? pApplicationInfo.getVkAddress() : VkPointer.NULL);
        this.pApplicationInfo = pApplicationInfo;
    }

    protected static native long getPApplicationInfo(long address);
    protected static native void setPApplicationInfo(long address, long pApplicationInfo);

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


    public static native long sizeof();

    public static class Array extends VkInstanceCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkInstanceCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkInstanceCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO));;
        }

        public Array(int count, VkInstanceCreateInfo o){
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
