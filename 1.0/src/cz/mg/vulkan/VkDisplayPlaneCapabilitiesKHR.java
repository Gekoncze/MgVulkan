package cz.mg.vulkan;

public class VkDisplayPlaneCapabilitiesKHR extends VkObject {
    public VkDisplayPlaneCapabilitiesKHR() {
        super(sizeof());
    }

    protected VkDisplayPlaneCapabilitiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDisplayPlaneCapabilitiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDisplayPlaneCapabilitiesKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkDisplayPlaneAlphaFlagsKHR getSupportedAlpha() {
        return new VkDisplayPlaneAlphaFlagsKHR(getVkMemory(), getSupportedAlphaNative(getVkAddress()));
    }

    
    public void setSupportedAlpha(VkDisplayPlaneAlphaFlagsKHR supportedAlpha) {
        setSupportedAlphaNative(getVkAddress(), supportedAlpha != null ? supportedAlpha.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSupportedAlphaQ() {
        return getSupportedAlpha().getValue();
    }

    public void setSupportedAlpha(int supportedAlpha) {
        getSupportedAlpha().setValue(supportedAlpha);
    }

    protected static native long getSupportedAlphaNative(long address);
    protected static native void setSupportedAlphaNative(long address, long supportedAlpha);

    public VkOffset2D getMinSrcPosition() {
        return new VkOffset2D(getVkMemory(), getMinSrcPositionNative(getVkAddress()));
    }

    
    public void setMinSrcPosition(VkOffset2D minSrcPosition) {
        setMinSrcPositionNative(getVkAddress(), minSrcPosition != null ? minSrcPosition.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getMinSrcPositionNative(long address);
    protected static native void setMinSrcPositionNative(long address, long minSrcPosition);

    public VkOffset2D getMaxSrcPosition() {
        return new VkOffset2D(getVkMemory(), getMaxSrcPositionNative(getVkAddress()));
    }

    
    public void setMaxSrcPosition(VkOffset2D maxSrcPosition) {
        setMaxSrcPositionNative(getVkAddress(), maxSrcPosition != null ? maxSrcPosition.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getMaxSrcPositionNative(long address);
    protected static native void setMaxSrcPositionNative(long address, long maxSrcPosition);

    public VkExtent2D getMinSrcExtent() {
        return new VkExtent2D(getVkMemory(), getMinSrcExtentNative(getVkAddress()));
    }

    
    public void setMinSrcExtent(VkExtent2D minSrcExtent) {
        setMinSrcExtentNative(getVkAddress(), minSrcExtent != null ? minSrcExtent.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getMinSrcExtentNative(long address);
    protected static native void setMinSrcExtentNative(long address, long minSrcExtent);

    public VkExtent2D getMaxSrcExtent() {
        return new VkExtent2D(getVkMemory(), getMaxSrcExtentNative(getVkAddress()));
    }

    
    public void setMaxSrcExtent(VkExtent2D maxSrcExtent) {
        setMaxSrcExtentNative(getVkAddress(), maxSrcExtent != null ? maxSrcExtent.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getMaxSrcExtentNative(long address);
    protected static native void setMaxSrcExtentNative(long address, long maxSrcExtent);

    public VkOffset2D getMinDstPosition() {
        return new VkOffset2D(getVkMemory(), getMinDstPositionNative(getVkAddress()));
    }

    
    public void setMinDstPosition(VkOffset2D minDstPosition) {
        setMinDstPositionNative(getVkAddress(), minDstPosition != null ? minDstPosition.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getMinDstPositionNative(long address);
    protected static native void setMinDstPositionNative(long address, long minDstPosition);

    public VkOffset2D getMaxDstPosition() {
        return new VkOffset2D(getVkMemory(), getMaxDstPositionNative(getVkAddress()));
    }

    
    public void setMaxDstPosition(VkOffset2D maxDstPosition) {
        setMaxDstPositionNative(getVkAddress(), maxDstPosition != null ? maxDstPosition.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getMaxDstPositionNative(long address);
    protected static native void setMaxDstPositionNative(long address, long maxDstPosition);

    public VkExtent2D getMinDstExtent() {
        return new VkExtent2D(getVkMemory(), getMinDstExtentNative(getVkAddress()));
    }

    
    public void setMinDstExtent(VkExtent2D minDstExtent) {
        setMinDstExtentNative(getVkAddress(), minDstExtent != null ? minDstExtent.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getMinDstExtentNative(long address);
    protected static native void setMinDstExtentNative(long address, long minDstExtent);

    public VkExtent2D getMaxDstExtent() {
        return new VkExtent2D(getVkMemory(), getMaxDstExtentNative(getVkAddress()));
    }

    
    public void setMaxDstExtent(VkExtent2D maxDstExtent) {
        setMaxDstExtentNative(getVkAddress(), maxDstExtent != null ? maxDstExtent.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getMaxDstExtentNative(long address);
    protected static native void setMaxDstExtentNative(long address, long maxDstExtent);


    public static native long sizeof();

    public static class Array extends VkDisplayPlaneCapabilitiesKHR implements cz.mg.collections.array.ReadonlyArray<VkDisplayPlaneCapabilitiesKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDisplayPlaneCapabilitiesKHR.sizeof()));
            this.count = count;
        }

        public Array(VkDisplayPlaneCapabilitiesKHR o, int count){
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
        public VkDisplayPlaneCapabilitiesKHR get(int i){
            return new VkDisplayPlaneCapabilitiesKHR(getVkMemory(), address(i));
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
