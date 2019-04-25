package cz.mg.vulkan;

public class VkSparseImageFormatProperties extends VkObject {
    public VkSparseImageFormatProperties() {
        super(sizeof());
    }

    public VkSparseImageFormatProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSparseImageFormatProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkImageAspectFlags getAspectMask() {
        return new VkImageAspectFlags(getVkMemory(), getAspectMask(getVkAddress()));
    }

    
    public void setAspectMask(VkImageAspectFlags aspectMask) {
        setAspectMask(getVkAddress(), aspectMask != null ? aspectMask.getVkAddress() : VkPointer.getNullAddress());
        
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
        setImageGranularity(getVkAddress(), imageGranularity != null ? imageGranularity.getVkAddress() : VkPointer.getNullAddress());
        
    }

    protected static native long getImageGranularity(long address);
    protected static native void setImageGranularity(long address, long imageGranularity);

    public VkSparseImageFormatFlags getFlags() {
        return new VkSparseImageFormatFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkSparseImageFormatFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddress());
        
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

        public Array(int count, VkSparseImageFormatProperties o){
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
        public VkSparseImageFormatProperties get(int i){
            return new VkSparseImageFormatProperties(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSparseImageFormatProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSparseImageFormatProperties.Pointer> {
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

            public Array(VkSparseImageFormatProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSparseImageFormatProperties.Pointer get(int i){
                return new VkSparseImageFormatProperties.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
