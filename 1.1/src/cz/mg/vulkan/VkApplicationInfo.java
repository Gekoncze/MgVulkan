package cz.mg.vulkan;

public class VkApplicationInfo extends VkObject {
    public VkApplicationInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_APPLICATION_INFO));
    }

    public VkApplicationInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkApplicationInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkApplicationInfo(VkPointer pointer) {
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

    public VkChar getPApplicationName() {
        return new VkChar(getVkMemory(), getPApplicationNameNative(getVkAddress()));
    }

    private VkObject pApplicationName = null;
    public void setPApplicationName(VkChar pApplicationName) {
        setPApplicationNameNative(getVkAddress(), pApplicationName != null ? pApplicationName.getVkAddress() : VkPointer.NULL);
        this.pApplicationName = pApplicationName;
    }

    public String getPApplicationNameQ() {
        return new VkString(getPApplicationName()).toString();
    }

    public void setPApplicationName(String pApplicationName) {
        setPApplicationName(new VkString(pApplicationName));
    }

    protected static native long getPApplicationNameNative(long address);
    protected static native void setPApplicationNameNative(long address, long pApplicationName);

    public VkUInt32 getApplicationVersion() {
        return new VkUInt32(getVkMemory(), getApplicationVersionNative(getVkAddress()));
    }

    
    public void setApplicationVersion(VkUInt32 applicationVersion) {
        setApplicationVersionNative(getVkAddress(), applicationVersion != null ? applicationVersion.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getApplicationVersionQ() {
        return getApplicationVersion().getValue();
    }

    public void setApplicationVersion(int applicationVersion) {
        getApplicationVersion().setValue(applicationVersion);
    }

    protected static native long getApplicationVersionNative(long address);
    protected static native void setApplicationVersionNative(long address, long applicationVersion);

    public VkChar getPEngineName() {
        return new VkChar(getVkMemory(), getPEngineNameNative(getVkAddress()));
    }

    private VkObject pEngineName = null;
    public void setPEngineName(VkChar pEngineName) {
        setPEngineNameNative(getVkAddress(), pEngineName != null ? pEngineName.getVkAddress() : VkPointer.NULL);
        this.pEngineName = pEngineName;
    }

    public String getPEngineNameQ() {
        return new VkString(getPEngineName()).toString();
    }

    public void setPEngineName(String pEngineName) {
        setPEngineName(new VkString(pEngineName));
    }

    protected static native long getPEngineNameNative(long address);
    protected static native void setPEngineNameNative(long address, long pEngineName);

    public VkUInt32 getEngineVersion() {
        return new VkUInt32(getVkMemory(), getEngineVersionNative(getVkAddress()));
    }

    
    public void setEngineVersion(VkUInt32 engineVersion) {
        setEngineVersionNative(getVkAddress(), engineVersion != null ? engineVersion.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getEngineVersionQ() {
        return getEngineVersion().getValue();
    }

    public void setEngineVersion(int engineVersion) {
        getEngineVersion().setValue(engineVersion);
    }

    protected static native long getEngineVersionNative(long address);
    protected static native void setEngineVersionNative(long address, long engineVersion);

    public VkUInt32 getApiVersion() {
        return new VkUInt32(getVkMemory(), getApiVersionNative(getVkAddress()));
    }

    
    public void setApiVersion(VkUInt32 apiVersion) {
        setApiVersionNative(getVkAddress(), apiVersion != null ? apiVersion.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getApiVersionQ() {
        return getApiVersion().getValue();
    }

    public void setApiVersion(int apiVersion) {
        getApiVersion().setValue(apiVersion);
    }

    protected static native long getApiVersionNative(long address);
    protected static native void setApiVersionNative(long address, long apiVersion);


    public static native long sizeof();

    public static class Array extends VkApplicationInfo implements cz.mg.collections.array.ReadonlyArray<VkApplicationInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkApplicationInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_APPLICATION_INFO));;
        }

        public Array(int count, VkApplicationInfo o){
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
        public VkApplicationInfo get(int i){
            return new VkApplicationInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
