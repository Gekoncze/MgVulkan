package cz.mg.vulkan;

public class VkClearColorValue extends VkObject {
    public VkClearColorValue() {
        super(sizeof());
    }

    protected VkClearColorValue(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkClearColorValue(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkClearColorValue(VkPointer pointer) {
        super(pointer);
    }



    public VkFloat getFloat32() {
        return new VkFloat(getVkMemory(), getFloat32Native(getVkAddress()));
    }

    
    public void setFloat32(VkFloat float32) {
        setFloat32Native(getVkAddress(), float32 != null ? float32.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getFloat32Native(long address);
    protected static native void setFloat32Native(long address, long float32);

    public VkInt32 getInt32() {
        return new VkInt32(getVkMemory(), getInt32Native(getVkAddress()));
    }

    
    public void setInt32(VkInt32 int32) {
        setInt32Native(getVkAddress(), int32 != null ? int32.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getInt32Native(long address);
    protected static native void setInt32Native(long address, long int32);

    public VkUInt32 getUint32() {
        return new VkUInt32(getVkMemory(), getUint32Native(getVkAddress()));
    }

    
    public void setUint32(VkUInt32 uint32) {
        setUint32Native(getVkAddress(), uint32 != null ? uint32.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getUint32Native(long address);
    protected static native void setUint32Native(long address, long uint32);


    public static native long sizeof();

    public static class Array extends VkClearColorValue implements cz.mg.collections.array.ReadonlyArray<VkClearColorValue> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkClearColorValue.sizeof()));
            this.count = count;
        }

        public Array(VkClearColorValue o, int count){
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
        public VkClearColorValue get(int i){
            return new VkClearColorValue(getVkMemory(), address(i));
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
