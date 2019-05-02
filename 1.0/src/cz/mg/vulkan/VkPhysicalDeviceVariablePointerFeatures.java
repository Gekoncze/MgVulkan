package cz.mg.vulkan;

public class VkPhysicalDeviceVariablePointerFeatures extends VkObject {
    public VkPhysicalDeviceVariablePointerFeatures() {
        super(sizeof());
    }

    protected VkPhysicalDeviceVariablePointerFeatures(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceVariablePointerFeatures(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceVariablePointerFeatures(VkPointer pointer) {
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

    public VkBool32 getVariablePointersStorageBuffer() {
        return new VkBool32(getVkMemory(), getVariablePointersStorageBufferNative(getVkAddress()));
    }

    
    public void setVariablePointersStorageBuffer(VkBool32 variablePointersStorageBuffer) {
        setVariablePointersStorageBufferNative(getVkAddress(), variablePointersStorageBuffer != null ? variablePointersStorageBuffer.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getVariablePointersStorageBufferQ() {
        return getVariablePointersStorageBuffer().getValue();
    }

    public void setVariablePointersStorageBuffer(int variablePointersStorageBuffer) {
        getVariablePointersStorageBuffer().setValue(variablePointersStorageBuffer);
    }

    protected static native long getVariablePointersStorageBufferNative(long address);
    protected static native void setVariablePointersStorageBufferNative(long address, long variablePointersStorageBuffer);

    public VkBool32 getVariablePointers() {
        return new VkBool32(getVkMemory(), getVariablePointersNative(getVkAddress()));
    }

    
    public void setVariablePointers(VkBool32 variablePointers) {
        setVariablePointersNative(getVkAddress(), variablePointers != null ? variablePointers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getVariablePointersQ() {
        return getVariablePointers().getValue();
    }

    public void setVariablePointers(int variablePointers) {
        getVariablePointers().setValue(variablePointers);
    }

    protected static native long getVariablePointersNative(long address);
    protected static native void setVariablePointersNative(long address, long variablePointers);


    public void set(VkPhysicalDeviceVariablePointerFeatures o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPhysicalDeviceVariablePointerFeatures implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceVariablePointerFeatures> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceVariablePointerFeatures.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceVariablePointerFeatures o, int count){
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
        public VkPhysicalDeviceVariablePointerFeatures get(int i){
            return new VkPhysicalDeviceVariablePointerFeatures(getVkMemory(), address(i));
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
