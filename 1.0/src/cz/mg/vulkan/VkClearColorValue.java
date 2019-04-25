package cz.mg.vulkan;

public class VkClearColorValue extends VkObject {
    public VkClearColorValue() {
        super(sizeof());
    }

    public VkClearColorValue(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkClearColorValue(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkFloat getFloat32() {
        return new VkFloat(getVkMemory(), getFloat32(getVkAddress()));
    }

    
    public void setFloat32(VkFloat float32) {
        setFloat32(getVkAddress(), float32 != null ? float32.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getFloat32(long address);
    protected static native void setFloat32(long address, long float32);

    public VkInt32 getInt32() {
        return new VkInt32(getVkMemory(), getInt32(getVkAddress()));
    }

    
    public void setInt32(VkInt32 int32) {
        setInt32(getVkAddress(), int32 != null ? int32.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getInt32(long address);
    protected static native void setInt32(long address, long int32);

    public VkUInt32 getUint32() {
        return new VkUInt32(getVkMemory(), getUint32(getVkAddress()));
    }

    
    public void setUint32(VkUInt32 uint32) {
        setUint32(getVkAddress(), uint32 != null ? uint32.getVkAddress() : VkPointer.NULL);
        
    }

    protected static native long getUint32(long address);
    protected static native void setUint32(long address, long uint32);


    public static native long sizeof();

    public static class Array extends VkClearColorValue implements cz.mg.collections.array.ReadonlyArray<VkClearColorValue> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkClearColorValue.sizeof()));
            this.count = count;
        }

        public Array(int count, VkClearColorValue o){
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
        public VkClearColorValue get(int i){
            return new VkClearColorValue(getVkMemory(), addressAt(i));
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
