package cz.mg.vulkan;

public class VkSamplerYcbcrConversionInfo extends VkObject {
    public VkSamplerYcbcrConversionInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO));
    }

    public VkSamplerYcbcrConversionInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSamplerYcbcrConversionInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
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

    public VkSamplerYcbcrConversion getConversion() {
        return new VkSamplerYcbcrConversion(getVkMemory(), getConversion(getVkAddress()));
    }

    
    public void setConversion(VkSamplerYcbcrConversion conversion) {
        setConversion(getVkAddress(), conversion != null ? conversion.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getConversion(long address);
    private static native void setConversion(long address, long conversion);


    public static native long sizeof();

    public static class Array extends VkSamplerYcbcrConversionInfo implements cz.mg.collections.array.ReadonlyArray<VkSamplerYcbcrConversionInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSamplerYcbcrConversionInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSamplerYcbcrConversionInfo o){
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
        public VkSamplerYcbcrConversionInfo get(int i){
            return new VkSamplerYcbcrConversionInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSamplerYcbcrConversionInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSamplerYcbcrConversionInfo.Pointer> {
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

            public Array(VkSamplerYcbcrConversionInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSamplerYcbcrConversionInfo.Pointer get(int i){
                return new VkSamplerYcbcrConversionInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
