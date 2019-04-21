package cz.mg.vulkan;

public class VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR extends VkObject {
    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR() {
        super(sizeof());
    }

    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkBool32 getSamplerYcbcrConversion() {
        return new VkBool32(getVkMemory(), getSamplerYcbcrConversion(getVkAddress()));
    }

    
    public void setSamplerYcbcrConversion(VkBool32 samplerYcbcrConversion) {
        setSamplerYcbcrConversion(getVkAddress(), samplerYcbcrConversion != null ? samplerYcbcrConversion.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSamplerYcbcrConversionQ() {
        return getSamplerYcbcrConversion().getValue();
    }

    public void setSamplerYcbcrConversion(int samplerYcbcrConversion) {
        getSamplerYcbcrConversion().setValue(samplerYcbcrConversion);
    }

    private static native long getSamplerYcbcrConversion(long address);
    private static native void setSamplerYcbcrConversion(long address, long samplerYcbcrConversion);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR o){
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
        public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR get(int i){
            return new VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.Pointer> {
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

            public Array(VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.Pointer get(int i){
                return new VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
