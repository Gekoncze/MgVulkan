package cz.mg.vulkan;

public class VkCommandBufferAllocateInfo extends VkObject {
    public VkCommandBufferAllocateInfo() {
        super(sizeof());
    }

    public VkCommandBufferAllocateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkCommandBufferAllocateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkCommandBufferAllocateInfo(VkObject pNext, VkCommandPool commandPool, VkCommandBufferLevel level, VkUInt32 commandBufferCount) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO));
        setPNext(pNext);
        setCommandPool(commandPool);
        setLevel(level);
        setCommandBufferCount(commandBufferCount);
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

    public VkCommandPool getCommandPool() {
        return new VkCommandPool(getVkMemory(), getCommandPool(getVkAddress()));
    }

    
    public void setCommandPool(VkCommandPool commandPool) {
        setCommandPool(getVkAddress(), commandPool != null ? commandPool.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getCommandPool(long address);
    private static native void setCommandPool(long address, long commandPool);

    public VkCommandBufferLevel getLevel() {
        return new VkCommandBufferLevel(getVkMemory(), getLevel(getVkAddress()));
    }

    
    public void setLevel(VkCommandBufferLevel level) {
        setLevel(getVkAddress(), level != null ? level.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getLevel(long address);
    private static native void setLevel(long address, long level);

    public VkUInt32 getCommandBufferCount() {
        return new VkUInt32(getVkMemory(), getCommandBufferCount(getVkAddress()));
    }

    
    public void setCommandBufferCount(VkUInt32 commandBufferCount) {
        setCommandBufferCount(getVkAddress(), commandBufferCount != null ? commandBufferCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getCommandBufferCount(long address);
    private static native void setCommandBufferCount(long address, long commandBufferCount);


    public static native long sizeof();

    public static class Array extends VkCommandBufferAllocateInfo implements cz.mg.collections.array.ReadonlyArray<VkCommandBufferAllocateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkCommandBufferAllocateInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkCommandBufferAllocateInfo o){
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
        public VkCommandBufferAllocateInfo get(int i){
            return new VkCommandBufferAllocateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkCommandBufferAllocateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkCommandBufferAllocateInfo.Pointer> {
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

            public Array(VkCommandBufferAllocateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkCommandBufferAllocateInfo.Pointer get(int i){
                return new VkCommandBufferAllocateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
