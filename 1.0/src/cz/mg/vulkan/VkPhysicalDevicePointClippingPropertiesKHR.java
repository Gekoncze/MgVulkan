package cz.mg.vulkan;

public class VkPhysicalDevicePointClippingPropertiesKHR extends VkObject {
    public VkPhysicalDevicePointClippingPropertiesKHR() {
        super(sizeof());
    }

    protected VkPhysicalDevicePointClippingPropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDevicePointClippingPropertiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDevicePointClippingPropertiesKHR(VkPointer pointer) {
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

    public VkPointClippingBehaviorKHR getPointClippingBehavior() {
        return new VkPointClippingBehaviorKHR(getVkMemory(), getPointClippingBehaviorNative(getVkAddress()));
    }

    
    public void setPointClippingBehavior(VkPointClippingBehaviorKHR pointClippingBehavior) {
        setPointClippingBehaviorNative(getVkAddress(), pointClippingBehavior != null ? pointClippingBehavior.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPointClippingBehaviorQ() {
        return getPointClippingBehavior().getValue();
    }

    public void setPointClippingBehavior(int pointClippingBehavior) {
        getPointClippingBehavior().setValue(pointClippingBehavior);
    }

    protected static native long getPointClippingBehaviorNative(long address);
    protected static native void setPointClippingBehaviorNative(long address, long pointClippingBehavior);


    public static native long sizeof();

    public static class Array extends VkPhysicalDevicePointClippingPropertiesKHR implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDevicePointClippingPropertiesKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDevicePointClippingPropertiesKHR.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDevicePointClippingPropertiesKHR o, int count){
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
        public VkPhysicalDevicePointClippingPropertiesKHR get(int i){
            return new VkPhysicalDevicePointClippingPropertiesKHR(getVkMemory(), address(i));
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
