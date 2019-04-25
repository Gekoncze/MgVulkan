package cz.mg.vulkan;

public class VkFormatProperties extends VkObject {
    public VkFormatProperties() {
        super(sizeof());
    }

    protected VkFormatProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkFormatProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkFormatProperties(VkPointer pointer) {
        super(pointer);
    }



    public VkFormatFeatureFlags getLinearTilingFeatures() {
        return new VkFormatFeatureFlags(getVkMemory(), getLinearTilingFeaturesNative(getVkAddress()));
    }

    
    public void setLinearTilingFeatures(VkFormatFeatureFlags linearTilingFeatures) {
        setLinearTilingFeaturesNative(getVkAddress(), linearTilingFeatures != null ? linearTilingFeatures.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getLinearTilingFeaturesQ() {
        return getLinearTilingFeatures().getValue();
    }

    public void setLinearTilingFeatures(int linearTilingFeatures) {
        getLinearTilingFeatures().setValue(linearTilingFeatures);
    }

    protected static native long getLinearTilingFeaturesNative(long address);
    protected static native void setLinearTilingFeaturesNative(long address, long linearTilingFeatures);

    public VkFormatFeatureFlags getOptimalTilingFeatures() {
        return new VkFormatFeatureFlags(getVkMemory(), getOptimalTilingFeaturesNative(getVkAddress()));
    }

    
    public void setOptimalTilingFeatures(VkFormatFeatureFlags optimalTilingFeatures) {
        setOptimalTilingFeaturesNative(getVkAddress(), optimalTilingFeatures != null ? optimalTilingFeatures.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getOptimalTilingFeaturesQ() {
        return getOptimalTilingFeatures().getValue();
    }

    public void setOptimalTilingFeatures(int optimalTilingFeatures) {
        getOptimalTilingFeatures().setValue(optimalTilingFeatures);
    }

    protected static native long getOptimalTilingFeaturesNative(long address);
    protected static native void setOptimalTilingFeaturesNative(long address, long optimalTilingFeatures);

    public VkFormatFeatureFlags getBufferFeatures() {
        return new VkFormatFeatureFlags(getVkMemory(), getBufferFeaturesNative(getVkAddress()));
    }

    
    public void setBufferFeatures(VkFormatFeatureFlags bufferFeatures) {
        setBufferFeaturesNative(getVkAddress(), bufferFeatures != null ? bufferFeatures.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getBufferFeaturesQ() {
        return getBufferFeatures().getValue();
    }

    public void setBufferFeatures(int bufferFeatures) {
        getBufferFeatures().setValue(bufferFeatures);
    }

    protected static native long getBufferFeaturesNative(long address);
    protected static native void setBufferFeaturesNative(long address, long bufferFeatures);


    public static native long sizeof();

    public static class Array extends VkFormatProperties implements cz.mg.collections.array.ReadonlyArray<VkFormatProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkFormatProperties.sizeof()));
            this.count = count;
        }

        public Array(VkFormatProperties o, int count){
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
        public VkFormatProperties get(int i){
            return new VkFormatProperties(getVkMemory(), address(i));
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
