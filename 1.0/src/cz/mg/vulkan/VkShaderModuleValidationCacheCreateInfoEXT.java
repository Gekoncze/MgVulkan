package cz.mg.vulkan;

public class VkShaderModuleValidationCacheCreateInfoEXT extends VkObject {
    public VkShaderModuleValidationCacheCreateInfoEXT() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SHADER_MODULE_VALIDATION_CACHE_CREATE_INFO_EXT));
    }

    public VkShaderModuleValidationCacheCreateInfoEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkShaderModuleValidationCacheCreateInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkShaderModuleValidationCacheCreateInfoEXT(VkPointer pointer) {
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

    public VkValidationCacheEXT getValidationCache() {
        return new VkValidationCacheEXT(getVkMemory(), getValidationCacheNative(getVkAddress()));
    }

    
    public void setValidationCache(VkValidationCacheEXT validationCache) {
        setValidationCacheNative(getVkAddress(), validationCache != null ? validationCache.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getValidationCacheNative(long address);
    protected static native void setValidationCacheNative(long address, long validationCache);


    public void set(VkShaderModuleValidationCacheCreateInfoEXT o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkShaderModuleValidationCacheCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkShaderModuleValidationCacheCreateInfoEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkShaderModuleValidationCacheCreateInfoEXT.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SHADER_MODULE_VALIDATION_CACHE_CREATE_INFO_EXT));;
        }

        public Array(int count, VkShaderModuleValidationCacheCreateInfoEXT o){
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
        public VkShaderModuleValidationCacheCreateInfoEXT get(int i){
            return new VkShaderModuleValidationCacheCreateInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

}
