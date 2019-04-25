package cz.mg.vulkan;

public class VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR extends VkObject {
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR() {
        super(sizeof());
    }

    protected VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSType(long address);
    protected static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNext(long address);
    protected static native void setPNext(long address, long pNext);

    public VkBool32 getSamplerYcbcrConversion() {
        return new VkBool32(getVkMemory(), getSamplerYcbcrConversion(getVkAddress()));
    }

    
    public void setSamplerYcbcrConversion(VkBool32 samplerYcbcrConversion) {
        setSamplerYcbcrConversion(getVkAddress(), samplerYcbcrConversion != null ? samplerYcbcrConversion.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSamplerYcbcrConversionQ() {
        return getSamplerYcbcrConversion().getValue();
    }

    public void setSamplerYcbcrConversion(int samplerYcbcrConversion) {
        getSamplerYcbcrConversion().setValue(samplerYcbcrConversion);
    }

    protected static native long getSamplerYcbcrConversion(long address);
    protected static native void setSamplerYcbcrConversion(long address, long samplerYcbcrConversion);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR o, int count){
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
        public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR get(int i){
            return new VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
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
