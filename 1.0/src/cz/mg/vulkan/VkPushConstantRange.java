package cz.mg.vulkan;

public class VkPushConstantRange extends VkObject {
    public VkPushConstantRange() {
        super(sizeof());
    }

    protected VkPushConstantRange(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPushConstantRange(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPushConstantRange(VkPointer pointer) {
        super(pointer);
    }



    public VkShaderStageFlags getStageFlags() {
        return new VkShaderStageFlags(getVkMemory(), getStageFlagsNative(getVkAddress()));
    }

    
    public void setStageFlags(VkShaderStageFlags stageFlags) {
        setStageFlagsNative(getVkAddress(), stageFlags != null ? stageFlags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getStageFlagsQ() {
        return getStageFlags().getValue();
    }

    public void setStageFlags(int stageFlags) {
        getStageFlags().setValue(stageFlags);
    }

    protected static native long getStageFlagsNative(long address);
    protected static native void setStageFlagsNative(long address, long stageFlags);

    public VkUInt32 getOffset() {
        return new VkUInt32(getVkMemory(), getOffsetNative(getVkAddress()));
    }

    
    public void setOffset(VkUInt32 offset) {
        setOffsetNative(getVkAddress(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getOffsetQ() {
        return getOffset().getValue();
    }

    public void setOffset(int offset) {
        getOffset().setValue(offset);
    }

    protected static native long getOffsetNative(long address);
    protected static native void setOffsetNative(long address, long offset);

    public VkUInt32 getSize() {
        return new VkUInt32(getVkMemory(), getSizeNative(getVkAddress()));
    }

    
    public void setSize(VkUInt32 size) {
        setSizeNative(getVkAddress(), size != null ? size.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSizeQ() {
        return getSize().getValue();
    }

    public void setSize(int size) {
        getSize().setValue(size);
    }

    protected static native long getSizeNative(long address);
    protected static native void setSizeNative(long address, long size);


    public void set(VkPushConstantRange o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkPushConstantRange implements cz.mg.collections.array.ReadonlyArray<VkPushConstantRange> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPushConstantRange.sizeof()));
            this.count = count;
        }

        public Array(VkPushConstantRange o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkPushConstantRange get(int i){
            return new VkPushConstantRange(getVkMemory(), address(i));
        }

        protected long address(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
