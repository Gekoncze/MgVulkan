package cz.mg.vulkan;

public class VkFormatProperties extends VkObject {
    public VkFormatProperties() {
        super(sizeof());
    }

    public VkFormatProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkFormatProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkFormatFeatureFlags getLinearTilingFeatures() {
        return new VkFormatFeatureFlags(getVkMemory(), getLinearTilingFeatures(getVkAddress()));
    }

    
    public void setLinearTilingFeatures(VkFormatFeatureFlags linearTilingFeatures) {
        setLinearTilingFeatures(getVkAddress(), linearTilingFeatures != null ? linearTilingFeatures.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getLinearTilingFeaturesQ() {
        return getLinearTilingFeatures().getValue();
    }

    public void setLinearTilingFeatures(int linearTilingFeatures) {
        getLinearTilingFeatures().setValue(linearTilingFeatures);
    }

    protected static native long getLinearTilingFeatures(long address);
    protected static native void setLinearTilingFeatures(long address, long linearTilingFeatures);

    public VkFormatFeatureFlags getOptimalTilingFeatures() {
        return new VkFormatFeatureFlags(getVkMemory(), getOptimalTilingFeatures(getVkAddress()));
    }

    
    public void setOptimalTilingFeatures(VkFormatFeatureFlags optimalTilingFeatures) {
        setOptimalTilingFeatures(getVkAddress(), optimalTilingFeatures != null ? optimalTilingFeatures.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getOptimalTilingFeaturesQ() {
        return getOptimalTilingFeatures().getValue();
    }

    public void setOptimalTilingFeatures(int optimalTilingFeatures) {
        getOptimalTilingFeatures().setValue(optimalTilingFeatures);
    }

    protected static native long getOptimalTilingFeatures(long address);
    protected static native void setOptimalTilingFeatures(long address, long optimalTilingFeatures);

    public VkFormatFeatureFlags getBufferFeatures() {
        return new VkFormatFeatureFlags(getVkMemory(), getBufferFeatures(getVkAddress()));
    }

    
    public void setBufferFeatures(VkFormatFeatureFlags bufferFeatures) {
        setBufferFeatures(getVkAddress(), bufferFeatures != null ? bufferFeatures.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getBufferFeaturesQ() {
        return getBufferFeatures().getValue();
    }

    public void setBufferFeatures(int bufferFeatures) {
        getBufferFeatures().setValue(bufferFeatures);
    }

    protected static native long getBufferFeatures(long address);
    protected static native void setBufferFeatures(long address, long bufferFeatures);


    public static native long sizeof();

    public static class Array extends VkFormatProperties implements cz.mg.collections.array.ReadonlyArray<VkFormatProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkFormatProperties.sizeof()));
            this.count = count;
        }

        public Array(int count, VkFormatProperties o){
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
        public VkFormatProperties get(int i){
            return new VkFormatProperties(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

    public static class Pointer extends VkObject.Pointer {
        public Pointer() {
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

        public static class Array extends VkFormatProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VkFormatProperties.Pointer> {
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

            public Array(VkFormatProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkFormatProperties.Pointer get(int i){
                return new VkFormatProperties.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
