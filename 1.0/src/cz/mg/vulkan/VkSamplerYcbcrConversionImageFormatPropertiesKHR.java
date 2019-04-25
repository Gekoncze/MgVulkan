package cz.mg.vulkan;

public class VkSamplerYcbcrConversionImageFormatPropertiesKHR extends VkObject {
    public VkSamplerYcbcrConversionImageFormatPropertiesKHR() {
        super(sizeof());
    }

    public VkSamplerYcbcrConversionImageFormatPropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSamplerYcbcrConversionImageFormatPropertiesKHR(VkMemory vkmemory, long vkaddress) {
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

    public VkUInt32 getCombinedImageSamplerDescriptorCount() {
        return new VkUInt32(getVkMemory(), getCombinedImageSamplerDescriptorCount(getVkAddress()));
    }

    
    public void setCombinedImageSamplerDescriptorCount(VkUInt32 combinedImageSamplerDescriptorCount) {
        setCombinedImageSamplerDescriptorCount(getVkAddress(), combinedImageSamplerDescriptorCount != null ? combinedImageSamplerDescriptorCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getCombinedImageSamplerDescriptorCountQ() {
        return getCombinedImageSamplerDescriptorCount().getValue();
    }

    public void setCombinedImageSamplerDescriptorCount(int combinedImageSamplerDescriptorCount) {
        getCombinedImageSamplerDescriptorCount().setValue(combinedImageSamplerDescriptorCount);
    }

    protected static native long getCombinedImageSamplerDescriptorCount(long address);
    protected static native void setCombinedImageSamplerDescriptorCount(long address, long combinedImageSamplerDescriptorCount);


    public static native long sizeof();

    public static class Array extends VkSamplerYcbcrConversionImageFormatPropertiesKHR implements cz.mg.collections.array.ReadonlyArray<VkSamplerYcbcrConversionImageFormatPropertiesKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSamplerYcbcrConversionImageFormatPropertiesKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSamplerYcbcrConversionImageFormatPropertiesKHR o){
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
        public VkSamplerYcbcrConversionImageFormatPropertiesKHR get(int i){
            return new VkSamplerYcbcrConversionImageFormatPropertiesKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSamplerYcbcrConversionImageFormatPropertiesKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSamplerYcbcrConversionImageFormatPropertiesKHR.Pointer> {
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

            public Array(VkSamplerYcbcrConversionImageFormatPropertiesKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSamplerYcbcrConversionImageFormatPropertiesKHR.Pointer get(int i){
                return new VkSamplerYcbcrConversionImageFormatPropertiesKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
