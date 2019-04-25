package cz.mg.vulkan;

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



    public VkShaderStageFlags getStageFlags() {
        return new VkShaderStageFlags(getVkMemory(), getStageFlags(getVkAddress()));
    }

    
    public void setStageFlags(VkShaderStageFlags stageFlags) {
        setStageFlags(getVkAddress(), stageFlags != null ? stageFlags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getStageFlagsQ() {
        return getStageFlags().getValue();
    }

    public void setStageFlags(int stageFlags) {
        getStageFlags().setValue(stageFlags);
    }

    protected static native long getStageFlags(long address);
    protected static native void setStageFlags(long address, long stageFlags);

    public VkUInt32 getOffset() {
        return new VkUInt32(getVkMemory(), getOffset(getVkAddress()));
    }

    
    public void setOffset(VkUInt32 offset) {
        setOffset(getVkAddress(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getOffsetQ() {
        return getOffset().getValue();
    }

    public void setOffset(int offset) {
        getOffset().setValue(offset);
    }

    protected static native long getOffset(long address);
    protected static native void setOffset(long address, long offset);

    public VkUInt32 getSize() {
        return new VkUInt32(getVkMemory(), getSize(getVkAddress()));
    }

    
    public void setSize(VkUInt32 size) {
        setSize(getVkAddress(), size != null ? size.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSizeQ() {
        return getSize().getValue();
    }

    public void setSize(int size) {
        getSize().setValue(size);
    }

    protected static native long getSize(long address);
    protected static native void setSize(long address, long size);


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
            return new VkPushConstantRange(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            public Array2(int count, VkPointer o){
                super(count, o);
            }

            public Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            public Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
