package cz.mg.vulkan;

public class VkPhysicalDeviceSubgroupProperties extends VkObject {
    public VkPhysicalDeviceSubgroupProperties() {
        super(sizeof());
    }

    public VkPhysicalDeviceSubgroupProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceSubgroupProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkUInt32 getSubgroupSize() {
        return new VkUInt32(getVkMemory(), getSubgroupSize(getVkAddress()));
    }

    
    public void setSubgroupSize(VkUInt32 subgroupSize) {
        setSubgroupSize(getVkAddress(), subgroupSize != null ? subgroupSize.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSubgroupSizeQ() {
        return getSubgroupSize().getValue();
    }

    public void setSubgroupSize(int subgroupSize) {
        getSubgroupSize().setValue(subgroupSize);
    }

    private static native long getSubgroupSize(long address);
    private static native void setSubgroupSize(long address, long subgroupSize);

    public VkShaderStageFlags getSupportedStages() {
        return new VkShaderStageFlags(getVkMemory(), getSupportedStages(getVkAddress()));
    }

    
    public void setSupportedStages(VkShaderStageFlags supportedStages) {
        setSupportedStages(getVkAddress(), supportedStages != null ? supportedStages.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSupportedStagesQ() {
        return getSupportedStages().getValue();
    }

    public void setSupportedStages(int supportedStages) {
        getSupportedStages().setValue(supportedStages);
    }

    private static native long getSupportedStages(long address);
    private static native void setSupportedStages(long address, long supportedStages);

    public VkSubgroupFeatureFlags getSupportedOperations() {
        return new VkSubgroupFeatureFlags(getVkMemory(), getSupportedOperations(getVkAddress()));
    }

    
    public void setSupportedOperations(VkSubgroupFeatureFlags supportedOperations) {
        setSupportedOperations(getVkAddress(), supportedOperations != null ? supportedOperations.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSupportedOperationsQ() {
        return getSupportedOperations().getValue();
    }

    public void setSupportedOperations(int supportedOperations) {
        getSupportedOperations().setValue(supportedOperations);
    }

    private static native long getSupportedOperations(long address);
    private static native void setSupportedOperations(long address, long supportedOperations);

    public VkBool32 getQuadOperationsInAllStages() {
        return new VkBool32(getVkMemory(), getQuadOperationsInAllStages(getVkAddress()));
    }

    
    public void setQuadOperationsInAllStages(VkBool32 quadOperationsInAllStages) {
        setQuadOperationsInAllStages(getVkAddress(), quadOperationsInAllStages != null ? quadOperationsInAllStages.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getQuadOperationsInAllStagesQ() {
        return getQuadOperationsInAllStages().getValue();
    }

    public void setQuadOperationsInAllStages(int quadOperationsInAllStages) {
        getQuadOperationsInAllStages().setValue(quadOperationsInAllStages);
    }

    private static native long getQuadOperationsInAllStages(long address);
    private static native void setQuadOperationsInAllStages(long address, long quadOperationsInAllStages);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceSubgroupProperties implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceSubgroupProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceSubgroupProperties.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceSubgroupProperties o){
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
        public VkPhysicalDeviceSubgroupProperties get(int i){
            return new VkPhysicalDeviceSubgroupProperties(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

    public static class Pointer extends VkObject.Pointer {
        public Pointer() {
        }

        public Pointer(long value) {
            setValue(value);
        }

        public Pointer(VkMemory vkmemory) {
            super(vkmemory);
        }

        public Pointer(VkMemory vkmemory, long vkaddress) {
            super(vkmemory, vkaddress);
        }

        public static class Array extends VkPhysicalDeviceSubgroupProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceSubgroupProperties.Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*VkPointer.sizeof()));
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

            public Array(VkPhysicalDeviceSubgroupProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceSubgroupProperties.Pointer get(int i){
                return new VkPhysicalDeviceSubgroupProperties.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
