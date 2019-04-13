package cz.mg.vulkan;

public class VkDisplayPlaneCapabilitiesKHR extends VkObject {
    public VkDisplayPlaneCapabilitiesKHR() {
        super(sizeof());
    }

    public VkDisplayPlaneCapabilitiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDisplayPlaneCapabilitiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDisplayPlaneCapabilitiesKHR(VkDisplayPlaneAlphaFlagsKHR supportedAlpha, VkOffset2D minSrcPosition, VkOffset2D maxSrcPosition, VkExtent2D minSrcExtent, VkExtent2D maxSrcExtent, VkOffset2D minDstPosition, VkOffset2D maxDstPosition, VkExtent2D minDstExtent, VkExtent2D maxDstExtent) {
        super(sizeof());
        setSupportedAlpha(supportedAlpha);
        setMinSrcPosition(minSrcPosition);
        setMaxSrcPosition(maxSrcPosition);
        setMinSrcExtent(minSrcExtent);
        setMaxSrcExtent(maxSrcExtent);
        setMinDstPosition(minDstPosition);
        setMaxDstPosition(maxDstPosition);
        setMinDstExtent(minDstExtent);
        setMaxDstExtent(maxDstExtent);
    }

    public VkDisplayPlaneAlphaFlagsKHR getSupportedAlpha() {
        return new VkDisplayPlaneAlphaFlagsKHR(getVkMemory(), getSupportedAlpha(getVkAddress()));
    }

    
    public void setSupportedAlpha(VkDisplayPlaneAlphaFlagsKHR supportedAlpha) {
        setSupportedAlpha(getVkAddress(), supportedAlpha != null ? supportedAlpha.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSupportedAlpha(long address);
    private static native void setSupportedAlpha(long address, long supportedAlpha);

    public VkOffset2D getMinSrcPosition() {
        return new VkOffset2D(getVkMemory(), getMinSrcPosition(getVkAddress()));
    }

    
    public void setMinSrcPosition(VkOffset2D minSrcPosition) {
        setMinSrcPosition(getVkAddress(), minSrcPosition != null ? minSrcPosition.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMinSrcPosition(long address);
    private static native void setMinSrcPosition(long address, long minSrcPosition);

    public VkOffset2D getMaxSrcPosition() {
        return new VkOffset2D(getVkMemory(), getMaxSrcPosition(getVkAddress()));
    }

    
    public void setMaxSrcPosition(VkOffset2D maxSrcPosition) {
        setMaxSrcPosition(getVkAddress(), maxSrcPosition != null ? maxSrcPosition.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMaxSrcPosition(long address);
    private static native void setMaxSrcPosition(long address, long maxSrcPosition);

    public VkExtent2D getMinSrcExtent() {
        return new VkExtent2D(getVkMemory(), getMinSrcExtent(getVkAddress()));
    }

    
    public void setMinSrcExtent(VkExtent2D minSrcExtent) {
        setMinSrcExtent(getVkAddress(), minSrcExtent != null ? minSrcExtent.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMinSrcExtent(long address);
    private static native void setMinSrcExtent(long address, long minSrcExtent);

    public VkExtent2D getMaxSrcExtent() {
        return new VkExtent2D(getVkMemory(), getMaxSrcExtent(getVkAddress()));
    }

    
    public void setMaxSrcExtent(VkExtent2D maxSrcExtent) {
        setMaxSrcExtent(getVkAddress(), maxSrcExtent != null ? maxSrcExtent.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMaxSrcExtent(long address);
    private static native void setMaxSrcExtent(long address, long maxSrcExtent);

    public VkOffset2D getMinDstPosition() {
        return new VkOffset2D(getVkMemory(), getMinDstPosition(getVkAddress()));
    }

    
    public void setMinDstPosition(VkOffset2D minDstPosition) {
        setMinDstPosition(getVkAddress(), minDstPosition != null ? minDstPosition.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMinDstPosition(long address);
    private static native void setMinDstPosition(long address, long minDstPosition);

    public VkOffset2D getMaxDstPosition() {
        return new VkOffset2D(getVkMemory(), getMaxDstPosition(getVkAddress()));
    }

    
    public void setMaxDstPosition(VkOffset2D maxDstPosition) {
        setMaxDstPosition(getVkAddress(), maxDstPosition != null ? maxDstPosition.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMaxDstPosition(long address);
    private static native void setMaxDstPosition(long address, long maxDstPosition);

    public VkExtent2D getMinDstExtent() {
        return new VkExtent2D(getVkMemory(), getMinDstExtent(getVkAddress()));
    }

    
    public void setMinDstExtent(VkExtent2D minDstExtent) {
        setMinDstExtent(getVkAddress(), minDstExtent != null ? minDstExtent.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMinDstExtent(long address);
    private static native void setMinDstExtent(long address, long minDstExtent);

    public VkExtent2D getMaxDstExtent() {
        return new VkExtent2D(getVkMemory(), getMaxDstExtent(getVkAddress()));
    }

    
    public void setMaxDstExtent(VkExtent2D maxDstExtent) {
        setMaxDstExtent(getVkAddress(), maxDstExtent != null ? maxDstExtent.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getMaxDstExtent(long address);
    private static native void setMaxDstExtent(long address, long maxDstExtent);


    public static native long sizeof();

    public static class Array extends VkDisplayPlaneCapabilitiesKHR implements cz.mg.collections.array.ReadonlyArray<VkDisplayPlaneCapabilitiesKHR> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDisplayPlaneCapabilitiesKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDisplayPlaneCapabilitiesKHR o){
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
        public VkDisplayPlaneCapabilitiesKHR get(int i){
            return new VkDisplayPlaneCapabilitiesKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDisplayPlaneCapabilitiesKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDisplayPlaneCapabilitiesKHR.Pointer> {
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

            public Array(VkDisplayPlaneCapabilitiesKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDisplayPlaneCapabilitiesKHR.Pointer get(int i){
                return new VkDisplayPlaneCapabilitiesKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
