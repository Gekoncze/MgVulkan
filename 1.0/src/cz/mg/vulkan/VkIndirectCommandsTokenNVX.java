package cz.mg.vulkan;

public class VkIndirectCommandsTokenNVX extends VkObject {
    public VkIndirectCommandsTokenNVX() {
        super(sizeof());
    }

    protected VkIndirectCommandsTokenNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkIndirectCommandsTokenNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkIndirectCommandsTokenNVX(VkPointer pointer) {
        super(pointer);
    }



    public VkIndirectCommandsTokenTypeNVX getTokenType() {
        return new VkIndirectCommandsTokenTypeNVX(getVkMemory(), getTokenTypeNative(getVkAddress()));
    }

    
    public void setTokenType(VkIndirectCommandsTokenTypeNVX tokenType) {
        setTokenTypeNative(getVkAddress(), tokenType != null ? tokenType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getTokenTypeQ() {
        return getTokenType().getValue();
    }

    public void setTokenType(int tokenType) {
        getTokenType().setValue(tokenType);
    }

    protected static native long getTokenTypeNative(long address);
    protected static native void setTokenTypeNative(long address, long tokenType);

    public VkBuffer getBuffer() {
        return new VkBuffer(getVkMemory(), getBufferNative(getVkAddress()));
    }

    
    public void setBuffer(VkBuffer buffer) {
        setBufferNative(getVkAddress(), buffer != null ? buffer.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getBufferNative(long address);
    protected static native void setBufferNative(long address, long buffer);

    public VkDeviceSize getOffset() {
        return new VkDeviceSize(getVkMemory(), getOffsetNative(getVkAddress()));
    }

    
    public void setOffset(VkDeviceSize offset) {
        setOffsetNative(getVkAddress(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public long getOffsetQ() {
        return getOffset().getValue();
    }

    public void setOffset(long offset) {
        getOffset().setValue(offset);
    }

    protected static native long getOffsetNative(long address);
    protected static native void setOffsetNative(long address, long offset);


    public void set(VkIndirectCommandsTokenNVX o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkIndirectCommandsTokenNVX implements cz.mg.collections.array.ReadonlyArray<VkIndirectCommandsTokenNVX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkIndirectCommandsTokenNVX.sizeof()));
            this.count = count;
        }

        public Array(VkIndirectCommandsTokenNVX o, int count){
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
        public VkIndirectCommandsTokenNVX get(int i){
            return new VkIndirectCommandsTokenNVX(getVkMemory(), address(i));
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
