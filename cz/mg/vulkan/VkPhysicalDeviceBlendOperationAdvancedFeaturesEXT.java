package cz.mg.vulkan;

public class VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT extends VkObject {
    public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT() {
        super(sizeof());
    }

    public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT(VkStructureType sType, VkObject pNext, VkBool32 advancedBlendCoherentOperations) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setAdvancedBlendCoherentOperations(advancedBlendCoherentOperations);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getSinkAddress());
        
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

    public VkBool32 getAdvancedBlendCoherentOperations() {
        return new VkBool32(getVkMemory(), getAdvancedBlendCoherentOperations(getVkAddress()));
    }

    
    public void setAdvancedBlendCoherentOperations(VkBool32 advancedBlendCoherentOperations) {
        setAdvancedBlendCoherentOperations(getVkAddress(), advancedBlendCoherentOperations != null ? advancedBlendCoherentOperations.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getAdvancedBlendCoherentOperations(long address);
    private static native void setAdvancedBlendCoherentOperations(long address, long advancedBlendCoherentOperations);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT o){
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
        public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT get(int i){
            return new VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Pointer> {
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

            public Array(VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Pointer get(int i){
                return new VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
