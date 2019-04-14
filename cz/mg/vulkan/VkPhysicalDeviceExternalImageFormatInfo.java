package cz.mg.vulkan;

public class VkPhysicalDeviceExternalImageFormatInfo extends VkObject {
    public VkPhysicalDeviceExternalImageFormatInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO));
    }

    public VkPhysicalDeviceExternalImageFormatInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceExternalImageFormatInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
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

    public VkExternalMemoryHandleTypeFlagBits getHandleType() {
        return new VkExternalMemoryHandleTypeFlagBits(getVkMemory(), getHandleType(getVkAddress()));
    }

    
    public void setHandleType(VkExternalMemoryHandleTypeFlagBits handleType) {
        setHandleType(getVkAddress(), handleType != null ? handleType.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getHandleType(long address);
    private static native void setHandleType(long address, long handleType);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceExternalImageFormatInfo implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceExternalImageFormatInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceExternalImageFormatInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceExternalImageFormatInfo o){
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
        public VkPhysicalDeviceExternalImageFormatInfo get(int i){
            return new VkPhysicalDeviceExternalImageFormatInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPhysicalDeviceExternalImageFormatInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceExternalImageFormatInfo.Pointer> {
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

            public Array(VkPhysicalDeviceExternalImageFormatInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceExternalImageFormatInfo.Pointer get(int i){
                return new VkPhysicalDeviceExternalImageFormatInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
