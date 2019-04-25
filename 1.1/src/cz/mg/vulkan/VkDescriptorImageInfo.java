package cz.mg.vulkan;

public class VkDescriptorImageInfo extends VkObject {
    public VkDescriptorImageInfo() {
        super(sizeof());
    }

    protected VkDescriptorImageInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDescriptorImageInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDescriptorImageInfo(VkPointer pointer) {
        super(pointer);
    }



    public VkSampler getSampler() {
        return new VkSampler(getVkMemory(), getSampler(getVkAddress()));
    }

    
    public void setSampler(VkSampler sampler) {
        setSampler(getVkAddress(), sampler != null ? sampler.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getSampler(long address);
    protected static native void setSampler(long address, long sampler);

    public VkImageView getImageView() {
        return new VkImageView(getVkMemory(), getImageView(getVkAddress()));
    }

    
    public void setImageView(VkImageView imageView) {
        setImageView(getVkAddress(), imageView != null ? imageView.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getImageView(long address);
    protected static native void setImageView(long address, long imageView);

    public VkImageLayout getImageLayout() {
        return new VkImageLayout(getVkMemory(), getImageLayout(getVkAddress()));
    }

    
    public void setImageLayout(VkImageLayout imageLayout) {
        setImageLayout(getVkAddress(), imageLayout != null ? imageLayout.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getImageLayoutQ() {
        return getImageLayout().getValue();
    }

    public void setImageLayout(int imageLayout) {
        getImageLayout().setValue(imageLayout);
    }

    protected static native long getImageLayout(long address);
    protected static native void setImageLayout(long address, long imageLayout);


    public static native long sizeof();

    public static class Array extends VkDescriptorImageInfo implements cz.mg.collections.array.ReadonlyArray<VkDescriptorImageInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDescriptorImageInfo.sizeof()));
            this.count = count;
        }

        public Array(VkDescriptorImageInfo o, int count){
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
        public VkDescriptorImageInfo get(int i){
            return new VkDescriptorImageInfo(getVkMemory(), addressAt(i));
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
