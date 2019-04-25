package cz.mg.vulkan;

public class VkQueueFamilyProperties2KHR extends VkObject {
    public VkQueueFamilyProperties2KHR() {
        super(sizeof());
    }

    protected VkQueueFamilyProperties2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkQueueFamilyProperties2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkQueueFamilyProperties2KHR(VkPointer pointer) {
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

    public VkQueueFamilyProperties getQueueFamilyProperties() {
        return new VkQueueFamilyProperties(getVkMemory(), getQueueFamilyProperties(getVkAddress()));
    }

    
    public void setQueueFamilyProperties(VkQueueFamilyProperties queueFamilyProperties) {
        setQueueFamilyProperties(getVkAddress(), queueFamilyProperties != null ? queueFamilyProperties.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getQueueFamilyProperties(long address);
    protected static native void setQueueFamilyProperties(long address, long queueFamilyProperties);


    public static native long sizeof();

    public static class Array extends VkQueueFamilyProperties2KHR implements cz.mg.collections.array.ReadonlyArray<VkQueueFamilyProperties2KHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkQueueFamilyProperties2KHR.sizeof()));
            this.count = count;
        }

        public Array(VkQueueFamilyProperties2KHR o, int count){
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
        public VkQueueFamilyProperties2KHR get(int i){
            return new VkQueueFamilyProperties2KHR(getVkMemory(), addressAt(i));
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
