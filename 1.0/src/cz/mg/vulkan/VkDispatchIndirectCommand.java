package cz.mg.vulkan;

public class VkDispatchIndirectCommand extends VkObject {
    public VkDispatchIndirectCommand() {
        super(sizeof());
    }

    protected VkDispatchIndirectCommand(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDispatchIndirectCommand(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDispatchIndirectCommand(VkPointer pointer) {
        super(pointer);
    }



    public VkUInt32 getX() {
        return new VkUInt32(getVkMemory(), getXNative(getVkAddress()));
    }

    
    public void setX(VkUInt32 x) {
        setXNative(getVkAddress(), x != null ? x.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getXQ() {
        return getX().getValue();
    }

    public void setX(int x) {
        getX().setValue(x);
    }

    protected static native long getXNative(long address);
    protected static native void setXNative(long address, long x);

    public VkUInt32 getY() {
        return new VkUInt32(getVkMemory(), getYNative(getVkAddress()));
    }

    
    public void setY(VkUInt32 y) {
        setYNative(getVkAddress(), y != null ? y.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getYQ() {
        return getY().getValue();
    }

    public void setY(int y) {
        getY().setValue(y);
    }

    protected static native long getYNative(long address);
    protected static native void setYNative(long address, long y);

    public VkUInt32 getZ() {
        return new VkUInt32(getVkMemory(), getZNative(getVkAddress()));
    }

    
    public void setZ(VkUInt32 z) {
        setZNative(getVkAddress(), z != null ? z.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getZQ() {
        return getZ().getValue();
    }

    public void setZ(int z) {
        getZ().setValue(z);
    }

    protected static native long getZNative(long address);
    protected static native void setZNative(long address, long z);


    public static native long sizeof();

    public static class Array extends VkDispatchIndirectCommand implements cz.mg.collections.array.ReadonlyArray<VkDispatchIndirectCommand> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDispatchIndirectCommand.sizeof()));
            this.count = count;
        }

        public Array(VkDispatchIndirectCommand o, int count){
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
        public VkDispatchIndirectCommand get(int i){
            return new VkDispatchIndirectCommand(getVkMemory(), address(i));
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
