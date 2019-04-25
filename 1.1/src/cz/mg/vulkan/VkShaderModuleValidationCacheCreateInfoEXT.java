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

    public VkValidationCacheEXT getValidationCache() {
        return new VkValidationCacheEXT(getVkMemory(), getValidationCache(getVkAddress()));
    }

    
    public void setValidationCache(VkValidationCacheEXT validationCache) {
        setValidationCache(getVkAddress(), validationCache != null ? validationCache.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getValidationCache(long address);
    protected static native void setValidationCache(long address, long validationCache);


    public static native long sizeof();

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
