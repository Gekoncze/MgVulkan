package cz.mg.vulkan;

public class VkIndirectCommandsTokenNVX extends VkObject {
    public VkIndirectCommandsTokenNVX() {
        super(sizeof());
    }

    public VkIndirectCommandsTokenNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkIndirectCommandsTokenNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkIndirectCommandsTokenNVX(VkIndirectCommandsTokenTypeNVX tokenType, VkBuffer buffer, VkDeviceSize offset) {
        super(sizeof());
        setTokenType(tokenType);
        setBuffer(buffer);
        setOffset(offset);
    }

    public VkIndirectCommandsTokenTypeNVX getTokenType() {
        return new VkIndirectCommandsTokenTypeNVX(getVkMemory(), getTokenType(getVkAddress()));
    }

    
    public void setTokenType(VkIndirectCommandsTokenTypeNVX tokenType) {
        setTokenType(getVkAddress(), tokenType != null ? tokenType.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getTokenType(long address);
    private static native void setTokenType(long address, long tokenType);

    public VkBuffer getBuffer() {
        return new VkBuffer(getVkMemory(), getBuffer(getVkAddress()));
    }

    
    public void setBuffer(VkBuffer buffer) {
        setBuffer(getVkAddress(), buffer != null ? buffer.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getBuffer(long address);
    private static native void setBuffer(long address, long buffer);

    public VkDeviceSize getOffset() {
        return new VkDeviceSize(getVkMemory(), getOffset(getVkAddress()));
    }

    
    public void setOffset(VkDeviceSize offset) {
        setOffset(getVkAddress(), offset != null ? offset.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getOffset(long address);
    private static native void setOffset(long address, long offset);


    public static native long sizeof();

    public static class Array extends VkIndirectCommandsTokenNVX implements cz.mg.collections.array.ReadonlyArray<VkIndirectCommandsTokenNVX> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkIndirectCommandsTokenNVX.sizeof()));
            this.count = count;
        }

        public Array(int count, VkIndirectCommandsTokenNVX o){
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
        public VkIndirectCommandsTokenNVX get(int i){
            return new VkIndirectCommandsTokenNVX(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkIndirectCommandsTokenNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VkIndirectCommandsTokenNVX.Pointer> {
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

            public Array(VkIndirectCommandsTokenNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkIndirectCommandsTokenNVX.Pointer get(int i){
                return new VkIndirectCommandsTokenNVX.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
