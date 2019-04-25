package cz.mg.vulkan;

public class VkPhysicalDeviceVariablePointerFeaturesKHR extends VkObject {
    public VkPhysicalDeviceVariablePointerFeaturesKHR() {
        super(sizeof());
    }

    public VkPhysicalDeviceVariablePointerFeaturesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceVariablePointerFeaturesKHR(VkMemory vkmemory, long vkaddress) {
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

    public VkBool32 getVariablePointersStorageBuffer() {
        return new VkBool32(getVkMemory(), getVariablePointersStorageBuffer(getVkAddress()));
    }

    
    public void setVariablePointersStorageBuffer(VkBool32 variablePointersStorageBuffer) {
        setVariablePointersStorageBuffer(getVkAddress(), variablePointersStorageBuffer != null ? variablePointersStorageBuffer.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getVariablePointersStorageBufferQ() {
        return getVariablePointersStorageBuffer().getValue();
    }

    public void setVariablePointersStorageBuffer(int variablePointersStorageBuffer) {
        getVariablePointersStorageBuffer().setValue(variablePointersStorageBuffer);
    }

    protected static native long getVariablePointersStorageBuffer(long address);
    protected static native void setVariablePointersStorageBuffer(long address, long variablePointersStorageBuffer);

    public VkBool32 getVariablePointers() {
        return new VkBool32(getVkMemory(), getVariablePointers(getVkAddress()));
    }

    
    public void setVariablePointers(VkBool32 variablePointers) {
        setVariablePointers(getVkAddress(), variablePointers != null ? variablePointers.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getVariablePointersQ() {
        return getVariablePointers().getValue();
    }

    public void setVariablePointers(int variablePointers) {
        getVariablePointers().setValue(variablePointers);
    }

    protected static native long getVariablePointers(long address);
    protected static native void setVariablePointers(long address, long variablePointers);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceVariablePointerFeaturesKHR implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceVariablePointerFeaturesKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceVariablePointerFeaturesKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceVariablePointerFeaturesKHR o){
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
        public VkPhysicalDeviceVariablePointerFeaturesKHR get(int i){
            return new VkPhysicalDeviceVariablePointerFeaturesKHR(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
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

        public static class Array extends VkPhysicalDeviceVariablePointerFeaturesKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceVariablePointerFeaturesKHR.Pointer> {
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

            public Array(VkPhysicalDeviceVariablePointerFeaturesKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            public Array(long... values){
                this(values.length);
                for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
            }

            public long getValueAt(int i){
                return getValueNative(addressAt(i));
            }

            public void setValueAt(int i, long value){
                setValueNative(addressAt(i), value);
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceVariablePointerFeaturesKHR.Pointer get(int i){
                return new VkPhysicalDeviceVariablePointerFeaturesKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
