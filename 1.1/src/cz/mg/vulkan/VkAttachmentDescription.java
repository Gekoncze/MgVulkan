package cz.mg.vulkan;

public class VkAttachmentDescription extends VkObject {
    public VkAttachmentDescription() {
        super(sizeof());
    }

    public VkAttachmentDescription(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkAttachmentDescription(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkAttachmentDescriptionFlags getFlags() {
        return new VkAttachmentDescriptionFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkAttachmentDescriptionFlags flags) {
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

    public VkFormat getFormat() {
        return new VkFormat(getVkMemory(), getFormat(getVkAddress()));
    }

    
    public void setFormat(VkFormat format) {
        setFormat(getVkAddress(), format != null ? format.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getFormatQ() {
        return getFormat().getValue();
    }

    public void setFormat(int format) {
        getFormat().setValue(format);
    }

    protected static native long getFormat(long address);
    protected static native void setFormat(long address, long format);

    public VkSampleCountFlagBits getSamples() {
        return new VkSampleCountFlagBits(getVkMemory(), getSamples(getVkAddress()));
    }

    
    public void setSamples(VkSampleCountFlagBits samples) {
        setSamples(getVkAddress(), samples != null ? samples.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSamplesQ() {
        return getSamples().getValue();
    }

    public void setSamples(int samples) {
        getSamples().setValue(samples);
    }

    protected static native long getSamples(long address);
    protected static native void setSamples(long address, long samples);

    public VkAttachmentLoadOp getLoadOp() {
        return new VkAttachmentLoadOp(getVkMemory(), getLoadOp(getVkAddress()));
    }

    
    public void setLoadOp(VkAttachmentLoadOp loadOp) {
        setLoadOp(getVkAddress(), loadOp != null ? loadOp.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getLoadOpQ() {
        return getLoadOp().getValue();
    }

    public void setLoadOp(int loadOp) {
        getLoadOp().setValue(loadOp);
    }

    protected static native long getLoadOp(long address);
    protected static native void setLoadOp(long address, long loadOp);

    public VkAttachmentStoreOp getStoreOp() {
        return new VkAttachmentStoreOp(getVkMemory(), getStoreOp(getVkAddress()));
    }

    
    public void setStoreOp(VkAttachmentStoreOp storeOp) {
        setStoreOp(getVkAddress(), storeOp != null ? storeOp.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getStoreOpQ() {
        return getStoreOp().getValue();
    }

    public void setStoreOp(int storeOp) {
        getStoreOp().setValue(storeOp);
    }

    protected static native long getStoreOp(long address);
    protected static native void setStoreOp(long address, long storeOp);

    public VkAttachmentLoadOp getStencilLoadOp() {
        return new VkAttachmentLoadOp(getVkMemory(), getStencilLoadOp(getVkAddress()));
    }

    
    public void setStencilLoadOp(VkAttachmentLoadOp stencilLoadOp) {
        setStencilLoadOp(getVkAddress(), stencilLoadOp != null ? stencilLoadOp.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getStencilLoadOpQ() {
        return getStencilLoadOp().getValue();
    }

    public void setStencilLoadOp(int stencilLoadOp) {
        getStencilLoadOp().setValue(stencilLoadOp);
    }

    protected static native long getStencilLoadOp(long address);
    protected static native void setStencilLoadOp(long address, long stencilLoadOp);

    public VkAttachmentStoreOp getStencilStoreOp() {
        return new VkAttachmentStoreOp(getVkMemory(), getStencilStoreOp(getVkAddress()));
    }

    
    public void setStencilStoreOp(VkAttachmentStoreOp stencilStoreOp) {
        setStencilStoreOp(getVkAddress(), stencilStoreOp != null ? stencilStoreOp.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getStencilStoreOpQ() {
        return getStencilStoreOp().getValue();
    }

    public void setStencilStoreOp(int stencilStoreOp) {
        getStencilStoreOp().setValue(stencilStoreOp);
    }

    protected static native long getStencilStoreOp(long address);
    protected static native void setStencilStoreOp(long address, long stencilStoreOp);

    public VkImageLayout getInitialLayout() {
        return new VkImageLayout(getVkMemory(), getInitialLayout(getVkAddress()));
    }

    
    public void setInitialLayout(VkImageLayout initialLayout) {
        setInitialLayout(getVkAddress(), initialLayout != null ? initialLayout.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getInitialLayoutQ() {
        return getInitialLayout().getValue();
    }

    public void setInitialLayout(int initialLayout) {
        getInitialLayout().setValue(initialLayout);
    }

    protected static native long getInitialLayout(long address);
    protected static native void setInitialLayout(long address, long initialLayout);

    public VkImageLayout getFinalLayout() {
        return new VkImageLayout(getVkMemory(), getFinalLayout(getVkAddress()));
    }

    
    public void setFinalLayout(VkImageLayout finalLayout) {
        setFinalLayout(getVkAddress(), finalLayout != null ? finalLayout.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getFinalLayoutQ() {
        return getFinalLayout().getValue();
    }

    public void setFinalLayout(int finalLayout) {
        getFinalLayout().setValue(finalLayout);
    }

    protected static native long getFinalLayout(long address);
    protected static native void setFinalLayout(long address, long finalLayout);


    public static native long sizeof();

    public static class Array extends VkAttachmentDescription implements cz.mg.collections.array.ReadonlyArray<VkAttachmentDescription> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkAttachmentDescription.sizeof()));
            this.count = count;
        }

        public Array(int count, VkAttachmentDescription o){
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
        public VkAttachmentDescription get(int i){
            return new VkAttachmentDescription(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkAttachmentDescription.Pointer implements cz.mg.collections.array.ReadonlyArray<VkAttachmentDescription.Pointer> {
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

            public Array(VkAttachmentDescription[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkAttachmentDescription.Pointer get(int i){
                return new VkAttachmentDescription.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
