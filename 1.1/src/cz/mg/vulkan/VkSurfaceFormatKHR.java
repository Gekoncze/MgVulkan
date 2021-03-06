package cz.mg.vulkan;

public class VkSurfaceFormatKHR extends VkObject {
    public VkSurfaceFormatKHR() {
        super(sizeof());
    }

    protected VkSurfaceFormatKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSurfaceFormatKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSurfaceFormatKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkFormat getFormat() {
        return new VkFormat(getVkMemory(), getFormatNative(getVkAddress()));
    }

    
    public void setFormat(VkFormat format) {
        setFormatNative(getVkAddress(), format != null ? format.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFormatQ() {
        return getFormat().getValue();
    }

    public void setFormat(int format) {
        getFormat().setValue(format);
    }

    protected static native long getFormatNative(long address);
    protected static native void setFormatNative(long address, long format);

    public VkColorSpaceKHR getColorSpace() {
        return new VkColorSpaceKHR(getVkMemory(), getColorSpaceNative(getVkAddress()));
    }

    
    public void setColorSpace(VkColorSpaceKHR colorSpace) {
        setColorSpaceNative(getVkAddress(), colorSpace != null ? colorSpace.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getColorSpaceQ() {
        return getColorSpace().getValue();
    }

    public void setColorSpace(int colorSpace) {
        getColorSpace().setValue(colorSpace);
    }

    protected static native long getColorSpaceNative(long address);
    protected static native void setColorSpaceNative(long address, long colorSpace);


    public void set(VkSurfaceFormatKHR o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkSurfaceFormatKHR implements cz.mg.collections.array.ReadonlyArray<VkSurfaceFormatKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSurfaceFormatKHR.sizeof()));
            this.count = count;
        }

        public Array(VkSurfaceFormatKHR o, int count){
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
        public VkSurfaceFormatKHR get(int i){
            return new VkSurfaceFormatKHR(getVkMemory(), address(i));
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
