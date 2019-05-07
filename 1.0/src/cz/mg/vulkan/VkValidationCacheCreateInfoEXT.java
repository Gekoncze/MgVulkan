package cz.mg.vulkan;

public class VkValidationCacheCreateInfoEXT extends VkObject {
    public VkValidationCacheCreateInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT));
    }

    public VkValidationCacheCreateInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkValidationCacheCreateInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkValidationCacheCreateInfoEXT(VkPointer pointer) {
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

    public VkValidationCacheCreateFlagsEXT getFlags() {
        return new VkValidationCacheCreateFlagsEXT(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkValidationCacheCreateFlagsEXT flags) {
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

    public VkSize getInitialDataSize() {
        return new VkSize(getVkMemory(), getInitialDataSizeNative(getVkAddress()));
    }

    
    public void setInitialDataSize(VkSize initialDataSize) {
        setInitialDataSizeNative(getVkAddress(), initialDataSize != null ? initialDataSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getInitialDataSizeQ() {
        return getInitialDataSize().getValue();
    }

    public void setInitialDataSize(long initialDataSize) {
        getInitialDataSize().setValue(initialDataSize);
    }

    protected static native long getInitialDataSizeNative(long address);
    protected static native void setInitialDataSizeNative(long address, long initialDataSize);

    public VkObject getPInitialData() {
        return new VkObject(getVkMemory(), getPInitialDataNative(getVkAddress()));
    }

    private VkObject pInitialData = null;
    public void setPInitialData(VkObject pInitialData) {
        setPInitialDataNative(getVkAddress(), pInitialData != null ? pInitialData.getVkAddress() : VkPointer.NULL);
        this.pInitialData = pInitialData;
    }

    protected static native long getPInitialDataNative(long address);
    protected static native void setPInitialDataNative(long address, long pInitialData);


    public void set(VkValidationCacheCreateInfoEXT o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkValidationCacheCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkValidationCacheCreateInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkValidationCacheCreateInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT));;
        }

        public Array(VkValidationCacheCreateInfoEXT o, int count){
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
        public VkValidationCacheCreateInfoEXT get(int i){
            return new VkValidationCacheCreateInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
