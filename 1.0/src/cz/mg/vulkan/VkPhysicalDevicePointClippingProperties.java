package cz.mg.vulkan;

public class VkPhysicalDevicePointClippingProperties extends VkObject {
    public VkPhysicalDevicePointClippingProperties() {
        super(sizeof());
    }

    protected VkPhysicalDevicePointClippingProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDevicePointClippingProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDevicePointClippingProperties(VkPointer pointer) {
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

    public VkPointClippingBehavior getPointClippingBehavior() {
        return new VkPointClippingBehavior(getVkMemory(), getPointClippingBehaviorNative(getVkAddress()));
    }

    
    public void setPointClippingBehavior(VkPointClippingBehavior pointClippingBehavior) {
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


    public void set(VkPhysicalDevicePointClippingProperties o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPhysicalDevicePointClippingProperties implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDevicePointClippingProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDevicePointClippingProperties.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDevicePointClippingProperties o, int count){
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
        public VkPhysicalDevicePointClippingProperties get(int i){
            return new VkPhysicalDevicePointClippingProperties(getVkMemory(), address(i));
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
