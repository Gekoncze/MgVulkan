package cz.mg.vulkan;

public class VkPhysicalDevicePointClippingProperties extends VkObject {
    public VkPhysicalDevicePointClippingProperties() {
        super(sizeof());
    }

    public VkPhysicalDevicePointClippingProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDevicePointClippingProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDevicePointClippingProperties(VkStructureType sType, VkObject pNext, VkPointClippingBehavior pointClippingBehavior) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setPointClippingBehavior(pointClippingBehavior);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getSinkAddress());
        
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

    public VkPointClippingBehavior getPointClippingBehavior() {
        return new VkPointClippingBehavior(getVkMemory(), getPointClippingBehavior(getVkAddress()));
    }

    
    public void setPointClippingBehavior(VkPointClippingBehavior pointClippingBehavior) {
        setPointClippingBehavior(getVkAddress(), pointClippingBehavior != null ? pointClippingBehavior.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getPointClippingBehavior(long address);
    private static native void setPointClippingBehavior(long address, long pointClippingBehavior);


    public static native long sizeof();

    public static class Array extends VkPhysicalDevicePointClippingProperties implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDevicePointClippingProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDevicePointClippingProperties.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDevicePointClippingProperties o){
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
        public VkPhysicalDevicePointClippingProperties get(int i){
            return new VkPhysicalDevicePointClippingProperties(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPhysicalDevicePointClippingProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDevicePointClippingProperties.Pointer> {
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

            public Array(VkPhysicalDevicePointClippingProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDevicePointClippingProperties.Pointer get(int i){
                return new VkPhysicalDevicePointClippingProperties.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
