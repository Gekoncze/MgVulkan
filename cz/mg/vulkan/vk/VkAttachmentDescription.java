package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkAttachmentDescription.html">khronos documentation</a>
 **/
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


    public VkAttachmentDescription(VkAttachmentDescriptionFlags flags, VkFormat format, VkSampleCountFlagBits samples, VkAttachmentLoadOp loadOp, VkAttachmentStoreOp storeOp, VkAttachmentLoadOp stencilLoadOp, VkAttachmentStoreOp stencilStoreOp, VkImageLayout initialLayout, VkImageLayout finalLayout) {
        super(sizeof());
        setFlags(flags);
        setFormat(format);
        setSamples(samples);
        setLoadOp(loadOp);
        setStoreOp(storeOp);
        setStencilLoadOp(stencilLoadOp);
        setStencilStoreOp(stencilStoreOp);
        setInitialLayout(initialLayout);
        setFinalLayout(finalLayout);
    }

    public VkAttachmentDescriptionFlags getFlags() {
        return new VkAttachmentDescriptionFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkAttachmentDescriptionFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkFormat getFormat() {
        return new VkFormat(getVkMemory(), getFormat(getVkAddress()));
    }

    
    public void setFormat(VkFormat format) {
        setFormat(getVkAddress(), format != null ? format.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getFormat(long address);
    private static native void setFormat(long address, long format);

    public VkSampleCountFlagBits getSamples() {
        return new VkSampleCountFlagBits(getVkMemory(), getSamples(getVkAddress()));
    }

    
    public void setSamples(VkSampleCountFlagBits samples) {
        setSamples(getVkAddress(), samples != null ? samples.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSamples(long address);
    private static native void setSamples(long address, long samples);

    public VkAttachmentLoadOp getLoadOp() {
        return new VkAttachmentLoadOp(getVkMemory(), getLoadOp(getVkAddress()));
    }

    
    public void setLoadOp(VkAttachmentLoadOp loadOp) {
        setLoadOp(getVkAddress(), loadOp != null ? loadOp.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getLoadOp(long address);
    private static native void setLoadOp(long address, long loadOp);

    public VkAttachmentStoreOp getStoreOp() {
        return new VkAttachmentStoreOp(getVkMemory(), getStoreOp(getVkAddress()));
    }

    
    public void setStoreOp(VkAttachmentStoreOp storeOp) {
        setStoreOp(getVkAddress(), storeOp != null ? storeOp.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getStoreOp(long address);
    private static native void setStoreOp(long address, long storeOp);

    public VkAttachmentLoadOp getStencilLoadOp() {
        return new VkAttachmentLoadOp(getVkMemory(), getStencilLoadOp(getVkAddress()));
    }

    
    public void setStencilLoadOp(VkAttachmentLoadOp stencilLoadOp) {
        setStencilLoadOp(getVkAddress(), stencilLoadOp != null ? stencilLoadOp.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getStencilLoadOp(long address);
    private static native void setStencilLoadOp(long address, long stencilLoadOp);

    public VkAttachmentStoreOp getStencilStoreOp() {
        return new VkAttachmentStoreOp(getVkMemory(), getStencilStoreOp(getVkAddress()));
    }

    
    public void setStencilStoreOp(VkAttachmentStoreOp stencilStoreOp) {
        setStencilStoreOp(getVkAddress(), stencilStoreOp != null ? stencilStoreOp.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getStencilStoreOp(long address);
    private static native void setStencilStoreOp(long address, long stencilStoreOp);

    public VkImageLayout getInitialLayout() {
        return new VkImageLayout(getVkMemory(), getInitialLayout(getVkAddress()));
    }

    
    public void setInitialLayout(VkImageLayout initialLayout) {
        setInitialLayout(getVkAddress(), initialLayout != null ? initialLayout.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getInitialLayout(long address);
    private static native void setInitialLayout(long address, long initialLayout);

    public VkImageLayout getFinalLayout() {
        return new VkImageLayout(getVkMemory(), getFinalLayout(getVkAddress()));
    }

    
    public void setFinalLayout(VkImageLayout finalLayout) {
        setFinalLayout(getVkAddress(), finalLayout != null ? finalLayout.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getFinalLayout(long address);
    private static native void setFinalLayout(long address, long finalLayout);


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

        public static class Array extends VkAttachmentDescription.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
