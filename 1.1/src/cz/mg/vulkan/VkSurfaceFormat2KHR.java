package cz.mg.vulkan;

public class VkSurfaceFormat2KHR extends VkObject {
    public VkSurfaceFormat2KHR() {
        super(sizeof());
    }

    protected VkSurfaceFormat2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSurfaceFormat2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSurfaceFormat2KHR(VkPointer pointer) {
        super(pointer);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSTypeNative(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSTypeNative(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSTypeNative(long address);
    protected static native void setSTypeNative(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNextNative(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNextNative(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNextNative(long address);
    protected static native void setPNextNative(long address, long pNext);

    public VkSurfaceFormatKHR getSurfaceFormat() {
        return new VkSurfaceFormatKHR(getVkMemory(), getSurfaceFormatNative(getVkAddress()));
    }

    
    public void setSurfaceFormat(VkSurfaceFormatKHR surfaceFormat) {
        setSurfaceFormatNative(getVkAddress(), surfaceFormat != null ? surfaceFormat.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSurfaceFormatNative(long address);
    protected static native void setSurfaceFormatNative(long address, long surfaceFormat);


    public void set(VkSurfaceFormat2KHR o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkSurfaceFormat2KHR implements cz.mg.collections.array.ReadonlyArray<VkSurfaceFormat2KHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSurfaceFormat2KHR.sizeof()));
            this.count = count;
        }

        public Array(VkSurfaceFormat2KHR o, int count){
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
        public VkSurfaceFormat2KHR get(int i){
            return new VkSurfaceFormat2KHR(getVkMemory(), address(i));
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
