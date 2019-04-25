package cz.mg.vulkan;

public class VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT extends VkObject {
    public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT() {
        super(sizeof());
    }

    protected VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT(VkPointer pointer) {
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

    public VkBool32 getAdvancedBlendCoherentOperations() {
        return new VkBool32(getVkMemory(), getAdvancedBlendCoherentOperations(getVkAddress()));
    }

    
    public void setAdvancedBlendCoherentOperations(VkBool32 advancedBlendCoherentOperations) {
        setAdvancedBlendCoherentOperations(getVkAddress(), advancedBlendCoherentOperations != null ? advancedBlendCoherentOperations.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAdvancedBlendCoherentOperationsQ() {
        return getAdvancedBlendCoherentOperations().getValue();
    }

    public void setAdvancedBlendCoherentOperations(int advancedBlendCoherentOperations) {
        getAdvancedBlendCoherentOperations().setValue(advancedBlendCoherentOperations);
    }

    protected static native long getAdvancedBlendCoherentOperations(long address);
    protected static native void setAdvancedBlendCoherentOperations(long address, long advancedBlendCoherentOperations);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT o, int count){
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
        public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT get(int i){
            return new VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
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
