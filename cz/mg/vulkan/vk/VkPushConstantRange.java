package cz.mg.vulkan.vk;

public class VkPushConstantRange extends VkObject {
    public VkPushConstantRange() {
        super(sizeof());
    }

    public VkPushConstantRange(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPushConstantRange(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPushConstantRange(VkShaderStageFlags stageFlags, VkUInt32 offset, VkUInt32 size) {
        super(sizeof());
        setStageFlags(stageFlags);
        setOffset(offset);
        setSize(size);
    }

    public VkShaderStageFlags getStageFlags() {
        return new VkShaderStageFlags(getVkMemory(), getStageFlags(getVkAddress()));
    }

    
    public void setStageFlags(VkShaderStageFlags stageFlags) {
        setStageFlags(getVkAddress(), stageFlags != null ? stageFlags.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getStageFlags(long address);
    private static native void setStageFlags(long address, long stageFlags);

    public VkUInt32 getOffset() {
        return new VkUInt32(getVkMemory(), getOffset(getVkAddress()));
    }

    
    public void setOffset(VkUInt32 offset) {
        setOffset(getVkAddress(), offset != null ? offset.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getOffset(long address);
    private static native void setOffset(long address, long offset);

    public VkUInt32 getSize() {
        return new VkUInt32(getVkMemory(), getSize(getVkAddress()));
    }

    
    public void setSize(VkUInt32 size) {
        setSize(getVkAddress(), size != null ? size.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSize(long address);
    private static native void setSize(long address, long size);


    public static native long sizeof();

    public static class Array extends VkPushConstantRange implements cz.mg.collections.array.ReadonlyArray<VkPushConstantRange> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPushConstantRange.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPushConstantRange o){
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
        public VkPushConstantRange get(int i){
            return new VkPushConstantRange(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPushConstantRange.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPushConstantRange.Pointer> {
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

            public Array(VkPushConstantRange[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPushConstantRange.Pointer get(int i){
                return new VkPushConstantRange.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
