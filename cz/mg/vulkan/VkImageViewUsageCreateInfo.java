package cz.mg.vulkan;

public class VkImageViewUsageCreateInfo extends VkObject {
    public VkImageViewUsageCreateInfo() {
        super(sizeof());
    }

    public VkImageViewUsageCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkImageViewUsageCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkImageViewUsageCreateInfo(VkObject pNext, VkImageUsageFlags usage) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_VIEW_USAGE_CREATE_INFO));
        setPNext(pNext);
        setUsage(usage);
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

    public VkImageUsageFlags getUsage() {
        return new VkImageUsageFlags(getVkMemory(), getUsage(getVkAddress()));
    }

    
    public void setUsage(VkImageUsageFlags usage) {
        setUsage(getVkAddress(), usage != null ? usage.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getUsage(long address);
    private static native void setUsage(long address, long usage);


    public static native long sizeof();

    public static class Array extends VkImageViewUsageCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkImageViewUsageCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkImageViewUsageCreateInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkImageViewUsageCreateInfo o){
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
        public VkImageViewUsageCreateInfo get(int i){
            return new VkImageViewUsageCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkImageViewUsageCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkImageViewUsageCreateInfo.Pointer> {
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

            public Array(VkImageViewUsageCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkImageViewUsageCreateInfo.Pointer get(int i){
                return new VkImageViewUsageCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
