package cz.mg.vulkan;

public class VkPhysicalDevicePushDescriptorPropertiesKHR extends VkObject {
    public VkPhysicalDevicePushDescriptorPropertiesKHR() {
        super(sizeof());
    }

    public VkPhysicalDevicePushDescriptorPropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDevicePushDescriptorPropertiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDevicePushDescriptorPropertiesKHR(VkStructureType sType, VkObject pNext, VkUInt32 maxPushDescriptors) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setMaxPushDescriptors(maxPushDescriptors);
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

    public VkUInt32 getMaxPushDescriptors() {
        return new VkUInt32(getVkMemory(), getMaxPushDescriptors(getVkAddress()));
    }

    
    public void setMaxPushDescriptors(VkUInt32 maxPushDescriptors) {
        setMaxPushDescriptors(getVkAddress(), maxPushDescriptors != null ? maxPushDescriptors.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMaxPushDescriptors(long address);
    private static native void setMaxPushDescriptors(long address, long maxPushDescriptors);


    public static native long sizeof();

    public static class Array extends VkPhysicalDevicePushDescriptorPropertiesKHR implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDevicePushDescriptorPropertiesKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDevicePushDescriptorPropertiesKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDevicePushDescriptorPropertiesKHR o){
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
        public VkPhysicalDevicePushDescriptorPropertiesKHR get(int i){
            return new VkPhysicalDevicePushDescriptorPropertiesKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPhysicalDevicePushDescriptorPropertiesKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDevicePushDescriptorPropertiesKHR.Pointer> {
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

            public Array(VkPhysicalDevicePushDescriptorPropertiesKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDevicePushDescriptorPropertiesKHR.Pointer get(int i){
                return new VkPhysicalDevicePushDescriptorPropertiesKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
