package cz.mg.vulkan;

public class VkSamplerYcbcrConversionImageFormatProperties extends VkObject {
    public VkSamplerYcbcrConversionImageFormatProperties() {
        super(sizeof());
    }

    public VkSamplerYcbcrConversionImageFormatProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSamplerYcbcrConversionImageFormatProperties(VkMemory vkmemory, long vkaddress) {
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

    public VkUInt32 getCombinedImageSamplerDescriptorCount() {
        return new VkUInt32(getVkMemory(), getCombinedImageSamplerDescriptorCount(getVkAddress()));
    }

    
    public void setCombinedImageSamplerDescriptorCount(VkUInt32 combinedImageSamplerDescriptorCount) {
        setCombinedImageSamplerDescriptorCount(getVkAddress(), combinedImageSamplerDescriptorCount != null ? combinedImageSamplerDescriptorCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setCombinedImageSamplerDescriptorCount(int combinedImageSamplerDescriptorCount) {
        getCombinedImageSamplerDescriptorCount().setValue(combinedImageSamplerDescriptorCount);
    }

    private static native long getCombinedImageSamplerDescriptorCount(long address);
    private static native void setCombinedImageSamplerDescriptorCount(long address, long combinedImageSamplerDescriptorCount);


    public static native long sizeof();

    public static class Array extends VkSamplerYcbcrConversionImageFormatProperties implements cz.mg.collections.array.ReadonlyArray<VkSamplerYcbcrConversionImageFormatProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSamplerYcbcrConversionImageFormatProperties.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSamplerYcbcrConversionImageFormatProperties o){
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
        public VkSamplerYcbcrConversionImageFormatProperties get(int i){
            return new VkSamplerYcbcrConversionImageFormatProperties(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSamplerYcbcrConversionImageFormatProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSamplerYcbcrConversionImageFormatProperties.Pointer> {
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

            public Array(VkSamplerYcbcrConversionImageFormatProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSamplerYcbcrConversionImageFormatProperties.Pointer get(int i){
                return new VkSamplerYcbcrConversionImageFormatProperties.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
