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

    public VkBool32 getProtectedNoFault() {
        return new VkBool32(getVkMemory(), getProtectedNoFaultNative(getVkAddress()));
    }

    
    public void setProtectedNoFault(VkBool32 protectedNoFault) {
        setProtectedNoFaultNative(getVkAddress(), protectedNoFault != null ? protectedNoFault.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getProtectedNoFaultQ() {
        return getProtectedNoFault().getValue();
    }

    public void setProtectedNoFault(int protectedNoFault) {
        getProtectedNoFault().setValue(protectedNoFault);
    }

    protected static native long getProtectedNoFaultNative(long address);
    protected static native void setProtectedNoFaultNative(long address, long protectedNoFault);


    public void set(VkPhysicalDeviceProtectedMemoryProperties o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

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
            return new VkPhysicalDeviceProtectedMemoryProperties(getVkMemory(), address(i));
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
