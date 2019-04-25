package cz.mg.vulkan;

public class VkPhysicalDeviceProtectedMemoryFeatures extends VkObject {
    public VkPhysicalDeviceProtectedMemoryFeatures() {
        super(sizeof());
    }

    protected VkPhysicalDeviceProtectedMemoryFeatures(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceProtectedMemoryFeatures(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceProtectedMemoryFeatures(VkPointer pointer) {
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

    public VkBool32 getProtectedMemory() {
        return new VkBool32(getVkMemory(), getProtectedMemory(getVkAddress()));
    }

    
    public void setProtectedMemory(VkBool32 protectedMemory) {
        setProtectedMemory(getVkAddress(), protectedMemory != null ? protectedMemory.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getProtectedMemoryQ() {
        return getProtectedMemory().getValue();
    }

    public void setProtectedMemory(int protectedMemory) {
        getProtectedMemory().setValue(protectedMemory);
    }

    protected static native long getProtectedMemory(long address);
    protected static native void setProtectedMemory(long address, long protectedMemory);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceProtectedMemoryFeatures implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceProtectedMemoryFeatures> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceProtectedMemoryFeatures.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceProtectedMemoryFeatures o, int count){
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
        public VkPhysicalDeviceProtectedMemoryFeatures get(int i){
            return new VkPhysicalDeviceProtectedMemoryFeatures(getVkMemory(), addressAt(i));
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
