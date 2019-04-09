package cz.mg.vulkan;

public class VkPhysicalDeviceMaintenance3Properties extends VkObject {
    public VkPhysicalDeviceMaintenance3Properties() {
        super(sizeof());
    }

    public VkPhysicalDeviceMaintenance3Properties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceMaintenance3Properties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPhysicalDeviceMaintenance3Properties(VkStructureType sType, VkObject pNext, VkUInt32 maxPerSetDescriptors, VkDeviceSize maxMemoryAllocationSize) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setMaxPerSetDescriptors(maxPerSetDescriptors);
        setMaxMemoryAllocationSize(maxMemoryAllocationSize);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.NULL_ADDRESS);
        
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

    public VkUInt32 getMaxPerSetDescriptors() {
        return new VkUInt32(getVkMemory(), getMaxPerSetDescriptors(getVkAddress()));
    }

    
    public void setMaxPerSetDescriptors(VkUInt32 maxPerSetDescriptors) {
        setMaxPerSetDescriptors(getVkAddress(), maxPerSetDescriptors != null ? maxPerSetDescriptors.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMaxPerSetDescriptors(long address);
    private static native void setMaxPerSetDescriptors(long address, long maxPerSetDescriptors);

    public VkDeviceSize getMaxMemoryAllocationSize() {
        return new VkDeviceSize(getVkMemory(), getMaxMemoryAllocationSize(getVkAddress()));
    }

    
    public void setMaxMemoryAllocationSize(VkDeviceSize maxMemoryAllocationSize) {
        setMaxMemoryAllocationSize(getVkAddress(), maxMemoryAllocationSize != null ? maxMemoryAllocationSize.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMaxMemoryAllocationSize(long address);
    private static native void setMaxMemoryAllocationSize(long address, long maxMemoryAllocationSize);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceMaintenance3Properties implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceMaintenance3Properties> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceMaintenance3Properties.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceMaintenance3Properties o){
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
        public VkPhysicalDeviceMaintenance3Properties get(int i){
            return new VkPhysicalDeviceMaintenance3Properties(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPhysicalDeviceMaintenance3Properties.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceMaintenance3Properties.Pointer> {
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

            public Array(VkPhysicalDeviceMaintenance3Properties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceMaintenance3Properties.Pointer get(int i){
                return new VkPhysicalDeviceMaintenance3Properties.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
