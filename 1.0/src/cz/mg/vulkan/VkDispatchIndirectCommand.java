package cz.mg.vulkan;

public class VkDispatchIndirectCommand extends VkObject {
    public VkDispatchIndirectCommand() {
        super(sizeof());
    }

    public VkDispatchIndirectCommand(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDispatchIndirectCommand(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkUInt32 getX() {
        return new VkUInt32(getVkMemory(), getX(getVkAddress()));
    }

    
    public void setX(VkUInt32 x) {
        setX(getVkAddress(), x != null ? x.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getXQ() {
        return getX().getValue();
    }

    public void setX(int x) {
        getX().setValue(x);
    }

    protected static native long getX(long address);
    protected static native void setX(long address, long x);

    public VkUInt32 getY() {
        return new VkUInt32(getVkMemory(), getY(getVkAddress()));
    }

    
    public void setY(VkUInt32 y) {
        setY(getVkAddress(), y != null ? y.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getYQ() {
        return getY().getValue();
    }

    public void setY(int y) {
        getY().setValue(y);
    }

    protected static native long getY(long address);
    protected static native void setY(long address, long y);

    public VkUInt32 getZ() {
        return new VkUInt32(getVkMemory(), getZ(getVkAddress()));
    }

    
    public void setZ(VkUInt32 z) {
        setZ(getVkAddress(), z != null ? z.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getZQ() {
        return getZ().getValue();
    }

    public void setZ(int z) {
        getZ().setValue(z);
    }

    protected static native long getZ(long address);
    protected static native void setZ(long address, long z);


    public static native long sizeof();

    public static class Array extends VkDispatchIndirectCommand implements cz.mg.collections.array.ReadonlyArray<VkDispatchIndirectCommand> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDispatchIndirectCommand.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDispatchIndirectCommand o){
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
        public VkDispatchIndirectCommand get(int i){
            return new VkDispatchIndirectCommand(getVkMemory(), addressAt(i));
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
