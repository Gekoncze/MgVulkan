package cz.mg.vulkan;

public class VkDeviceGroupCommandBufferBeginInfo extends VkObject {
    public VkDeviceGroupCommandBufferBeginInfo() {
        super(sizeof());
    }

    public VkDeviceGroupCommandBufferBeginInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceGroupCommandBufferBeginInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDeviceGroupCommandBufferBeginInfo(VkObject pNext, VkUInt32 deviceMask) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO));
        setPNext(pNext);
        setDeviceMask(deviceMask);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
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

    public VkUInt32 getDeviceMask() {
        return new VkUInt32(getVkMemory(), getDeviceMask(getVkAddress()));
    }

    
    public void setDeviceMask(VkUInt32 deviceMask) {
        setDeviceMask(getVkAddress(), deviceMask != null ? deviceMask.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getDeviceMask(long address);
    private static native void setDeviceMask(long address, long deviceMask);


    public static native long sizeof();

    public static class Array extends VkDeviceGroupCommandBufferBeginInfo implements cz.mg.collections.array.ReadonlyArray<VkDeviceGroupCommandBufferBeginInfo> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceGroupCommandBufferBeginInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDeviceGroupCommandBufferBeginInfo o){
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
        public VkDeviceGroupCommandBufferBeginInfo get(int i){
            return new VkDeviceGroupCommandBufferBeginInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDeviceGroupCommandBufferBeginInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDeviceGroupCommandBufferBeginInfo.Pointer> {
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

            public Array(VkDeviceGroupCommandBufferBeginInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDeviceGroupCommandBufferBeginInfo.Pointer get(int i){
                return new VkDeviceGroupCommandBufferBeginInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
