package cz.mg.vulkan;

public class VkPhysicalDeviceVariablePointerFeatures extends VkObject {
    public VkPhysicalDeviceVariablePointerFeatures() {
        super(sizeof());
    }

    public VkPhysicalDeviceVariablePointerFeatures(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceVariablePointerFeatures(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPhysicalDeviceVariablePointerFeatures(VkStructureType sType, VkObject pNext, VkBool32 variablePointersStorageBuffer, VkBool32 variablePointers) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setVariablePointersStorageBuffer(variablePointersStorageBuffer);
        setVariablePointers(variablePointers);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
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

    public VkBool32 getVariablePointersStorageBuffer() {
        return new VkBool32(getVkMemory(), getVariablePointersStorageBuffer(getVkAddress()));
    }

    
    public void setVariablePointersStorageBuffer(VkBool32 variablePointersStorageBuffer) {
        setVariablePointersStorageBuffer(getVkAddress(), variablePointersStorageBuffer != null ? variablePointersStorageBuffer.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getVariablePointersStorageBuffer(long address);
    private static native void setVariablePointersStorageBuffer(long address, long variablePointersStorageBuffer);

    public VkBool32 getVariablePointers() {
        return new VkBool32(getVkMemory(), getVariablePointers(getVkAddress()));
    }

    
    public void setVariablePointers(VkBool32 variablePointers) {
        setVariablePointers(getVkAddress(), variablePointers != null ? variablePointers.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getVariablePointers(long address);
    private static native void setVariablePointers(long address, long variablePointers);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceVariablePointerFeatures implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceVariablePointerFeatures> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceVariablePointerFeatures.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceVariablePointerFeatures o){
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
        public VkPhysicalDeviceVariablePointerFeatures get(int i){
            return new VkPhysicalDeviceVariablePointerFeatures(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }


    public static class Pointer extends VkObject.Pointer {        public Pointer() {
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

        public static class Array extends VkPhysicalDeviceVariablePointerFeatures.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceVariablePointerFeatures.Pointer> {
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

            public Array(VkPhysicalDeviceVariablePointerFeatures[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceVariablePointerFeatures.Pointer get(int i){
                return new VkPhysicalDeviceVariablePointerFeatures.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
