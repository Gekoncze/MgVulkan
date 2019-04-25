package cz.mg.vulkan;

public class VkSparseImageFormatProperties extends VkObject {
    public VkSparseImageFormatProperties() {
        super(sizeof());
    }

    protected VkSparseImageFormatProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSparseImageFormatProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSparseImageFormatProperties(VkPointer pointer) {
        super(pointer);
    }



    public VkImageAspectFlags getAspectMask() {
        return new VkImageAspectFlags(getVkMemory(), getAspectMask(getVkAddress()));
    }

    
    public void setAspectMask(VkImageAspectFlags aspectMask) {
        setAspectMask(getVkAddress(), aspectMask != null ? aspectMask.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAspectMaskQ() {
        return getAspectMask().getValue();
    }

    public void setAspectMask(int aspectMask) {
        getAspectMask().setValue(aspectMask);
    }

    protected static native long getAspectMask(long address);
    protected static native void setAspectMask(long address, long aspectMask);

    public VkExtent3D getImageGranularity() {
        return new VkExtent3D(getVkMemory(), getImageGranularity(getVkAddress()));
    }

    
    public void setImageGranularity(VkExtent3D imageGranularity) {
        setImageGranularity(getVkAddress(), imageGranularity != null ? imageGranularity.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getImageGranularity(long address);
    protected static native void setImageGranularity(long address, long imageGranularity);

    public VkSparseImageFormatFlags getFlags() {
        return new VkSparseImageFormatFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkSparseImageFormatFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlags(long address);
    protected static native void setFlags(long address, long flags);


    public static native long sizeof();

    public static class Array extends VkSparseImageFormatProperties implements cz.mg.collections.array.ReadonlyArray<VkSparseImageFormatProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSparseImageFormatProperties.sizeof()));
            this.count = count;
        }

        public Array(VkSparseImageFormatProperties o, int count){
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
        public VkSparseImageFormatProperties get(int i){
            return new VkSparseImageFormatProperties(getVkMemory(), addressAt(i));
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
