package cz.mg.vulkan;

public class VkPhysicalDevicePointClippingPropertiesKHR extends VkObject {
    public VkPhysicalDevicePointClippingPropertiesKHR() {
        super(sizeof());
    }

    public VkPhysicalDevicePointClippingPropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDevicePointClippingPropertiesKHR(VkMemory vkmemory, long vkaddress) {
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

    public VkPointClippingBehaviorKHR getPointClippingBehavior() {
        return new VkPointClippingBehaviorKHR(getVkMemory(), getPointClippingBehavior(getVkAddress()));
    }

    
    public void setPointClippingBehavior(VkPointClippingBehaviorKHR pointClippingBehavior) {
        setPointClippingBehavior(getVkAddress(), pointClippingBehavior != null ? pointClippingBehavior.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getPointClippingBehaviorQ() {
        return getPointClippingBehavior().getValue();
    }

    public void setPointClippingBehavior(int pointClippingBehavior) {
        getPointClippingBehavior().setValue(pointClippingBehavior);
    }

    protected static native long getPointClippingBehavior(long address);
    protected static native void setPointClippingBehavior(long address, long pointClippingBehavior);


    public static native long sizeof();

    public static class Array extends VkPhysicalDevicePointClippingPropertiesKHR implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDevicePointClippingPropertiesKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDevicePointClippingPropertiesKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDevicePointClippingPropertiesKHR o){
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
        public VkPhysicalDevicePointClippingPropertiesKHR get(int i){
            return new VkPhysicalDevicePointClippingPropertiesKHR(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            public Array2(int count, VkPointer o){
                super(count, o);
            }

            public Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            public Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
