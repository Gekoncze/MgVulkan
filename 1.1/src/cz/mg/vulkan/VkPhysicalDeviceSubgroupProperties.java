package cz.mg.vulkan;

public class VkPhysicalDeviceSubgroupProperties extends VkObject {
    public VkPhysicalDeviceSubgroupProperties() {
        super(sizeof());
    }

    protected VkPhysicalDeviceSubgroupProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceSubgroupProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceSubgroupProperties(VkPointer pointer) {
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

    public VkUInt32 getSubgroupSize() {
        return new VkUInt32(getVkMemory(), getSubgroupSizeNative(getVkAddress()));
    }

    
    public void setSubgroupSize(VkUInt32 subgroupSize) {
        setSubgroupSizeNative(getVkAddress(), subgroupSize != null ? subgroupSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSubgroupSizeQ() {
        return getSubgroupSize().getValue();
    }

    public void setSubgroupSize(int subgroupSize) {
        getSubgroupSize().setValue(subgroupSize);
    }

    protected static native long getSubgroupSizeNative(long address);
    protected static native void setSubgroupSizeNative(long address, long subgroupSize);

    public VkShaderStageFlags getSupportedStages() {
        return new VkShaderStageFlags(getVkMemory(), getSupportedStagesNative(getVkAddress()));
    }

    
    public void setSupportedStages(VkShaderStageFlags supportedStages) {
        setSupportedStagesNative(getVkAddress(), supportedStages != null ? supportedStages.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSupportedStagesQ() {
        return getSupportedStages().getValue();
    }

    public void setSupportedStages(int supportedStages) {
        getSupportedStages().setValue(supportedStages);
    }

    protected static native long getSupportedStagesNative(long address);
    protected static native void setSupportedStagesNative(long address, long supportedStages);

    public VkSubgroupFeatureFlags getSupportedOperations() {
        return new VkSubgroupFeatureFlags(getVkMemory(), getSupportedOperationsNative(getVkAddress()));
    }

    
    public void setSupportedOperations(VkSubgroupFeatureFlags supportedOperations) {
        setSupportedOperationsNative(getVkAddress(), supportedOperations != null ? supportedOperations.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSupportedOperationsQ() {
        return getSupportedOperations().getValue();
    }

    public void setSupportedOperations(int supportedOperations) {
        getSupportedOperations().setValue(supportedOperations);
    }

    protected static native long getSupportedOperationsNative(long address);
    protected static native void setSupportedOperationsNative(long address, long supportedOperations);

    public VkBool32 getQuadOperationsInAllStages() {
        return new VkBool32(getVkMemory(), getQuadOperationsInAllStagesNative(getVkAddress()));
    }

    
    public void setQuadOperationsInAllStages(VkBool32 quadOperationsInAllStages) {
        setQuadOperationsInAllStagesNative(getVkAddress(), quadOperationsInAllStages != null ? quadOperationsInAllStages.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getQuadOperationsInAllStagesQ() {
        return getQuadOperationsInAllStages().getValue();
    }

    public void setQuadOperationsInAllStages(int quadOperationsInAllStages) {
        getQuadOperationsInAllStages().setValue(quadOperationsInAllStages);
    }

    protected static native long getQuadOperationsInAllStagesNative(long address);
    protected static native void setQuadOperationsInAllStagesNative(long address, long quadOperationsInAllStages);


    public void set(VkPhysicalDeviceSubgroupProperties o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPhysicalDeviceSubgroupProperties implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceSubgroupProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceSubgroupProperties.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceSubgroupProperties o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkPhysicalDeviceSubgroupProperties get(int i){
            return new VkPhysicalDeviceSubgroupProperties(getVkMemory(), address(i));
        }

        protected long address(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
