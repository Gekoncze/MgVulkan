package cz.mg.vulkan;

public class VkPhysicalDeviceSamplerYcbcrConversionFeatures extends VkObject {
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures() {
        super(sizeof());
    }

    public VkPhysicalDeviceSamplerYcbcrConversionFeatures(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceSamplerYcbcrConversionFeatures(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPhysicalDeviceSamplerYcbcrConversionFeatures(VkStructureType sType, VkObject pNext, VkBool32 samplerYcbcrConversion) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setSamplerYcbcrConversion(samplerYcbcrConversion);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getSinkAddress());
        
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
        setSamplerYcbcrConversion(getVkAddress(), samplerYcbcrConversion != null ? samplerYcbcrConversion.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSamplerYcbcrConversion(long address);
    private static native void setSamplerYcbcrConversion(long address, long samplerYcbcrConversion);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceSamplerYcbcrConversionFeatures implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceSamplerYcbcrConversionFeatures> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceSamplerYcbcrConversionFeatures.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceSamplerYcbcrConversionFeatures o){
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
        public VkPhysicalDeviceSamplerYcbcrConversionFeatures get(int i){
            return new VkPhysicalDeviceSamplerYcbcrConversionFeatures(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPhysicalDeviceSamplerYcbcrConversionFeatures.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceSamplerYcbcrConversionFeatures.Pointer> {
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

            public Array(VkPhysicalDeviceSamplerYcbcrConversionFeatures[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceSamplerYcbcrConversionFeatures.Pointer get(int i){
                return new VkPhysicalDeviceSamplerYcbcrConversionFeatures.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
