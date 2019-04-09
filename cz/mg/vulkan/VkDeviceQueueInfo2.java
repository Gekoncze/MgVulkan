package cz.mg.vulkan;

public class VkDeviceQueueInfo2 extends VkObject {
    public VkDeviceQueueInfo2() {
        super(sizeof());
    }

    public VkDeviceQueueInfo2(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceQueueInfo2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDeviceQueueInfo2(VkObject pNext, VkDeviceQueueCreateFlags flags, VkUInt32 queueFamilyIndex, VkUInt32 queueIndex) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2));
        setPNext(pNext);
        setFlags(flags);
        setQueueFamilyIndex(queueFamilyIndex);
        setQueueIndex(queueIndex);
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

    public VkDeviceQueueCreateFlags getFlags() {
        return new VkDeviceQueueCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkDeviceQueueCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkUInt32 getQueueFamilyIndex() {
        return new VkUInt32(getVkMemory(), getQueueFamilyIndex(getVkAddress()));
    }

    
    public void setQueueFamilyIndex(VkUInt32 queueFamilyIndex) {
        setQueueFamilyIndex(getVkAddress(), queueFamilyIndex != null ? queueFamilyIndex.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getQueueFamilyIndex(long address);
    private static native void setQueueFamilyIndex(long address, long queueFamilyIndex);

    public VkUInt32 getQueueIndex() {
        return new VkUInt32(getVkMemory(), getQueueIndex(getVkAddress()));
    }

    
    public void setQueueIndex(VkUInt32 queueIndex) {
        setQueueIndex(getVkAddress(), queueIndex != null ? queueIndex.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getQueueIndex(long address);
    private static native void setQueueIndex(long address, long queueIndex);


    public static native long sizeof();

    public static class Array extends VkDeviceQueueInfo2 implements cz.mg.collections.array.ReadonlyArray<VkDeviceQueueInfo2> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceQueueInfo2.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDeviceQueueInfo2 o){
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
        public VkDeviceQueueInfo2 get(int i){
            return new VkDeviceQueueInfo2(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDeviceQueueInfo2.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDeviceQueueInfo2.Pointer> {
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

            public Array(VkDeviceQueueInfo2[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDeviceQueueInfo2.Pointer get(int i){
                return new VkDeviceQueueInfo2.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
