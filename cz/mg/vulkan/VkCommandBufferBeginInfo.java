package cz.mg.vulkan;

public class VkCommandBufferBeginInfo extends VkObject {
    public VkCommandBufferBeginInfo() {
        super(sizeof());
    }

    public VkCommandBufferBeginInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCommandBufferBeginInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkCommandBufferBeginInfo(VkObject pNext, VkCommandBufferUsageFlags flags, VkCommandBufferInheritanceInfo pInheritanceInfo) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO));
        setPNext(pNext);
        setFlags(flags);
        setPInheritanceInfo(pInheritanceInfo);
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

    public VkCommandBufferUsageFlags getFlags() {
        return new VkCommandBufferUsageFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkCommandBufferUsageFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkCommandBufferInheritanceInfo getPInheritanceInfo() {
        return new VkCommandBufferInheritanceInfo(getVkMemory(), getPInheritanceInfo(getVkAddress()));
    }

    private VkObject pInheritanceInfo = null;
    public void setPInheritanceInfo(VkCommandBufferInheritanceInfo pInheritanceInfo) {
        setPInheritanceInfo(getVkAddress(), pInheritanceInfo != null ? pInheritanceInfo.getVkAddress() : VkPointer.NULL);
        this.pInheritanceInfo = pInheritanceInfo;
    }

    private static native long getPInheritanceInfo(long address);
    private static native void setPInheritanceInfo(long address, long pInheritanceInfo);


    public static native long sizeof();

    public static class Array extends VkCommandBufferBeginInfo implements cz.mg.collections.array.ReadonlyArray<VkCommandBufferBeginInfo> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkCommandBufferBeginInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkCommandBufferBeginInfo o){
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
        public VkCommandBufferBeginInfo get(int i){
            return new VkCommandBufferBeginInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkCommandBufferBeginInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkCommandBufferBeginInfo.Pointer> {
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

            public Array(VkCommandBufferBeginInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkCommandBufferBeginInfo.Pointer get(int i){
                return new VkCommandBufferBeginInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
