package cz.mg.vulkan;

public class VkPhysicalDeviceProtectedMemoryProperties extends VkObject {
    public VkPhysicalDeviceProtectedMemoryProperties() {
        super(sizeof());
    }

    protected VkPhysicalDeviceProtectedMemoryProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceProtectedMemoryProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceProtectedMemoryProperties(VkPointer pointer) {
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

    public VkBool32 getProtectedNoFault() {
        return new VkBool32(getVkMemory(), getProtectedNoFault(getVkAddress()));
    }

    
    public void setProtectedNoFault(VkBool32 protectedNoFault) {
        setProtectedNoFault(getVkAddress(), protectedNoFault != null ? protectedNoFault.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getProtectedNoFaultQ() {
        return getProtectedNoFault().getValue();
    }

    public void setProtectedNoFault(int protectedNoFault) {
        getProtectedNoFault().setValue(protectedNoFault);
    }

    protected static native long getProtectedNoFault(long address);
    protected static native void setProtectedNoFault(long address, long protectedNoFault);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceProtectedMemoryProperties implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceProtectedMemoryProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceProtectedMemoryProperties.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceProtectedMemoryProperties o, int count){
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
        public VkPhysicalDeviceProtectedMemoryProperties get(int i){
            return new VkPhysicalDeviceProtectedMemoryProperties(getVkMemory(), addressAt(i));
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
