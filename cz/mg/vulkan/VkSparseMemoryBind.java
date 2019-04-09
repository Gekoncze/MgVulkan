package cz.mg.vulkan;

public class VkSparseMemoryBind extends VkObject {
    public VkSparseMemoryBind() {
        super(sizeof());
    }

    public VkSparseMemoryBind(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSparseMemoryBind(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSparseMemoryBind(VkDeviceSize resourceOffset, VkDeviceSize size, VkDeviceMemory memory, VkDeviceSize memoryOffset, VkSparseMemoryBindFlags flags) {
        super(sizeof());
        setResourceOffset(resourceOffset);
        setSize(size);
        setMemory(memory);
        setMemoryOffset(memoryOffset);
        setFlags(flags);
    }

    public VkDeviceSize getResourceOffset() {
        return new VkDeviceSize(getVkMemory(), getResourceOffset(getVkAddress()));
    }

    
    public void setResourceOffset(VkDeviceSize resourceOffset) {
        setResourceOffset(getVkAddress(), resourceOffset != null ? resourceOffset.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getResourceOffset(long address);
    private static native void setResourceOffset(long address, long resourceOffset);

    public VkDeviceSize getSize() {
        return new VkDeviceSize(getVkMemory(), getSize(getVkAddress()));
    }

    
    public void setSize(VkDeviceSize size) {
        setSize(getVkAddress(), size != null ? size.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSize(long address);
    private static native void setSize(long address, long size);

    public VkDeviceMemory getMemory() {
        return new VkDeviceMemory(getVkMemory(), getMemory(getVkAddress()));
    }

    
    public void setMemory(VkDeviceMemory memory) {
        setMemory(getVkAddress(), memory != null ? memory.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMemory(long address);
    private static native void setMemory(long address, long memory);

    public VkDeviceSize getMemoryOffset() {
        return new VkDeviceSize(getVkMemory(), getMemoryOffset(getVkAddress()));
    }

    
    public void setMemoryOffset(VkDeviceSize memoryOffset) {
        setMemoryOffset(getVkAddress(), memoryOffset != null ? memoryOffset.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMemoryOffset(long address);
    private static native void setMemoryOffset(long address, long memoryOffset);

    public VkSparseMemoryBindFlags getFlags() {
        return new VkSparseMemoryBindFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkSparseMemoryBindFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);


    public static native long sizeof();

    public static class Array extends VkSparseMemoryBind implements cz.mg.collections.array.ReadonlyArray<VkSparseMemoryBind> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSparseMemoryBind.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSparseMemoryBind o){
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
        public VkSparseMemoryBind get(int i){
            return new VkSparseMemoryBind(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSparseMemoryBind.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSparseMemoryBind.Pointer> {
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

            public Array(VkSparseMemoryBind[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSparseMemoryBind.Pointer get(int i){
                return new VkSparseMemoryBind.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
