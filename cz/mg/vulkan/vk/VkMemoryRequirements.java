package cz.mg.vulkan.vk;

public class VkMemoryRequirements extends VkObject {
    public VkMemoryRequirements() {
        super(sizeof());
    }

    public VkMemoryRequirements(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkMemoryRequirements(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkMemoryRequirements(VkDeviceSize size, VkDeviceSize alignment, VkUInt32 memoryTypeBits) {
        super(sizeof());
        setSize(size);
        setAlignment(alignment);
        setMemoryTypeBits(memoryTypeBits);
    }

    public VkDeviceSize getSize() {
        return new VkDeviceSize(getVkMemory(), getSize(getVkAddress()));
    }

    
    public void setSize(VkDeviceSize size) {
        setSize(getVkAddress(), size != null ? size.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSize(long address);
    private static native void setSize(long address, long size);

    public VkDeviceSize getAlignment() {
        return new VkDeviceSize(getVkMemory(), getAlignment(getVkAddress()));
    }

    
    public void setAlignment(VkDeviceSize alignment) {
        setAlignment(getVkAddress(), alignment != null ? alignment.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getAlignment(long address);
    private static native void setAlignment(long address, long alignment);

    public VkUInt32 getMemoryTypeBits() {
        return new VkUInt32(getVkMemory(), getMemoryTypeBits(getVkAddress()));
    }

    
    public void setMemoryTypeBits(VkUInt32 memoryTypeBits) {
        setMemoryTypeBits(getVkAddress(), memoryTypeBits != null ? memoryTypeBits.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMemoryTypeBits(long address);
    private static native void setMemoryTypeBits(long address, long memoryTypeBits);


    public static native long sizeof();

    public static class Array extends VkMemoryRequirements implements cz.mg.collections.array.ReadonlyArray<VkMemoryRequirements> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkMemoryRequirements.sizeof()));
            this.count = count;
        }

        public Array(int count, VkMemoryRequirements o){
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
        public VkMemoryRequirements get(int i){
            return new VkMemoryRequirements(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkMemoryRequirements.Pointer implements cz.mg.collections.array.ReadonlyArray<VkMemoryRequirements.Pointer> {
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

            public Array(VkMemoryRequirements[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkMemoryRequirements.Pointer get(int i){
                return new VkMemoryRequirements.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
