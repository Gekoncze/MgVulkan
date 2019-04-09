package cz.mg.vulkan;

public class VkPhysicalDeviceImageFormatInfo2 extends VkObject {
    public VkPhysicalDeviceImageFormatInfo2() {
        super(sizeof());
    }

    public VkPhysicalDeviceImageFormatInfo2(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceImageFormatInfo2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPhysicalDeviceImageFormatInfo2(VkObject pNext, VkFormat format, VkImageType type, VkImageTiling tiling, VkImageUsageFlags usage, VkImageCreateFlags flags) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2));
        setPNext(pNext);
        setFormat(format);
        setType(type);
        setTiling(tiling);
        setUsage(usage);
        setFlags(flags);
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

    public VkFormat getFormat() {
        return new VkFormat(getVkMemory(), getFormat(getVkAddress()));
    }

    
    public void setFormat(VkFormat format) {
        setFormat(getVkAddress(), format != null ? format.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getFormat(long address);
    private static native void setFormat(long address, long format);

    public VkImageType getType() {
        return new VkImageType(getVkMemory(), getType(getVkAddress()));
    }

    
    public void setType(VkImageType type) {
        setType(getVkAddress(), type != null ? type.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getType(long address);
    private static native void setType(long address, long type);

    public VkImageTiling getTiling() {
        return new VkImageTiling(getVkMemory(), getTiling(getVkAddress()));
    }

    
    public void setTiling(VkImageTiling tiling) {
        setTiling(getVkAddress(), tiling != null ? tiling.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getTiling(long address);
    private static native void setTiling(long address, long tiling);

    public VkImageUsageFlags getUsage() {
        return new VkImageUsageFlags(getVkMemory(), getUsage(getVkAddress()));
    }

    
    public void setUsage(VkImageUsageFlags usage) {
        setUsage(getVkAddress(), usage != null ? usage.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getUsage(long address);
    private static native void setUsage(long address, long usage);

    public VkImageCreateFlags getFlags() {
        return new VkImageCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkImageCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceImageFormatInfo2 implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceImageFormatInfo2> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceImageFormatInfo2.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceImageFormatInfo2 o){
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
        public VkPhysicalDeviceImageFormatInfo2 get(int i){
            return new VkPhysicalDeviceImageFormatInfo2(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPhysicalDeviceImageFormatInfo2.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceImageFormatInfo2.Pointer> {
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

            public Array(VkPhysicalDeviceImageFormatInfo2[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceImageFormatInfo2.Pointer get(int i){
                return new VkPhysicalDeviceImageFormatInfo2.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
