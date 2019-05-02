package cz.mg.vulkan;

public class VkAttachmentDescription extends VkObject {
    public VkAttachmentDescription() {
        super(sizeof());
    }

    protected VkAttachmentDescription(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkAttachmentDescription(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkAttachmentDescription(VkPointer pointer) {
        super(pointer);
    }



    public VkAttachmentDescriptionFlags getFlags() {
        return new VkAttachmentDescriptionFlags(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkAttachmentDescriptionFlags flags) {
        setFlagsNative(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlagsNative(long address);
    protected static native void setFlagsNative(long address, long flags);

    public VkFormat getFormat() {
        return new VkFormat(getVkMemory(), getFormatNative(getVkAddress()));
    }

    
    public void setFormat(VkFormat format) {
        setFormatNative(getVkAddress(), format != null ? format.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFormatQ() {
        return getFormat().getValue();
    }

    public void setFormat(int format) {
        getFormat().setValue(format);
    }

    protected static native long getFormatNative(long address);
    protected static native void setFormatNative(long address, long format);

    public VkSampleCountFlagBits getSamples() {
        return new VkSampleCountFlagBits(getVkMemory(), getSamplesNative(getVkAddress()));
    }

    
    public void setSamples(VkSampleCountFlagBits samples) {
        setSamplesNative(getVkAddress(), samples != null ? samples.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSamplesQ() {
        return getSamples().getValue();
    }

    public void setSamples(int samples) {
        getSamples().setValue(samples);
    }

    protected static native long getSamplesNative(long address);
    protected static native void setSamplesNative(long address, long samples);

    public VkAttachmentLoadOp getLoadOp() {
        return new VkAttachmentLoadOp(getVkMemory(), getLoadOpNative(getVkAddress()));
    }

    
    public void setLoadOp(VkAttachmentLoadOp loadOp) {
        setLoadOpNative(getVkAddress(), loadOp != null ? loadOp.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getLoadOpQ() {
        return getLoadOp().getValue();
    }

    public void setLoadOp(int loadOp) {
        getLoadOp().setValue(loadOp);
    }

    protected static native long getLoadOpNative(long address);
    protected static native void setLoadOpNative(long address, long loadOp);

    public VkAttachmentStoreOp getStoreOp() {
        return new VkAttachmentStoreOp(getVkMemory(), getStoreOpNative(getVkAddress()));
    }

    
    public void setStoreOp(VkAttachmentStoreOp storeOp) {
        setStoreOpNative(getVkAddress(), storeOp != null ? storeOp.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getStoreOpQ() {
        return getStoreOp().getValue();
    }

    public void setStoreOp(int storeOp) {
        getStoreOp().setValue(storeOp);
    }

    protected static native long getStoreOpNative(long address);
    protected static native void setStoreOpNative(long address, long storeOp);

    public VkAttachmentLoadOp getStencilLoadOp() {
        return new VkAttachmentLoadOp(getVkMemory(), getStencilLoadOpNative(getVkAddress()));
    }

    
    public void setStencilLoadOp(VkAttachmentLoadOp stencilLoadOp) {
        setStencilLoadOpNative(getVkAddress(), stencilLoadOp != null ? stencilLoadOp.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getStencilLoadOpQ() {
        return getStencilLoadOp().getValue();
    }

    public void setStencilLoadOp(int stencilLoadOp) {
        getStencilLoadOp().setValue(stencilLoadOp);
    }

    protected static native long getStencilLoadOpNative(long address);
    protected static native void setStencilLoadOpNative(long address, long stencilLoadOp);

    public VkAttachmentStoreOp getStencilStoreOp() {
        return new VkAttachmentStoreOp(getVkMemory(), getStencilStoreOpNative(getVkAddress()));
    }

    
    public void setStencilStoreOp(VkAttachmentStoreOp stencilStoreOp) {
        setStencilStoreOpNative(getVkAddress(), stencilStoreOp != null ? stencilStoreOp.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getStencilStoreOpQ() {
        return getStencilStoreOp().getValue();
    }

    public void setStencilStoreOp(int stencilStoreOp) {
        getStencilStoreOp().setValue(stencilStoreOp);
    }

    protected static native long getStencilStoreOpNative(long address);
    protected static native void setStencilStoreOpNative(long address, long stencilStoreOp);

    public VkImageLayout getInitialLayout() {
        return new VkImageLayout(getVkMemory(), getInitialLayoutNative(getVkAddress()));
    }

    
    public void setInitialLayout(VkImageLayout initialLayout) {
        setInitialLayoutNative(getVkAddress(), initialLayout != null ? initialLayout.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getInitialLayoutQ() {
        return getInitialLayout().getValue();
    }

    public void setInitialLayout(int initialLayout) {
        getInitialLayout().setValue(initialLayout);
    }

    protected static native long getInitialLayoutNative(long address);
    protected static native void setInitialLayoutNative(long address, long initialLayout);

    public VkImageLayout getFinalLayout() {
        return new VkImageLayout(getVkMemory(), getFinalLayoutNative(getVkAddress()));
    }

    
    public void setFinalLayout(VkImageLayout finalLayout) {
        setFinalLayoutNative(getVkAddress(), finalLayout != null ? finalLayout.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFinalLayoutQ() {
        return getFinalLayout().getValue();
    }

    public void setFinalLayout(int finalLayout) {
        getFinalLayout().setValue(finalLayout);
    }

    protected static native long getFinalLayoutNative(long address);
    protected static native void setFinalLayoutNative(long address, long finalLayout);


    public void set(VkAttachmentDescription o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

    public static class Array extends VkAttachmentDescription implements cz.mg.collections.array.ReadonlyArray<VkAttachmentDescription> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkAttachmentDescription.sizeof()));
            this.count = count;
        }

        public Array(VkAttachmentDescription o, int count){
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
        public VkAttachmentDescription get(int i){
            return new VkAttachmentDescription(getVkMemory(), address(i));
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
