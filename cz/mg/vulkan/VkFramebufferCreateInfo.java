package cz.mg.vulkan;

public class VkFramebufferCreateInfo extends VkObject {
    public VkFramebufferCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO));
    }

    public VkFramebufferCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkFramebufferCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
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

    public VkFramebufferCreateFlags getFlags() {
        return new VkFramebufferCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkFramebufferCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkRenderPass getRenderPass() {
        return new VkRenderPass(getVkMemory(), getRenderPass(getVkAddress()));
    }

    
    public void setRenderPass(VkRenderPass renderPass) {
        setRenderPass(getVkAddress(), renderPass != null ? renderPass.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getRenderPass(long address);
    private static native void setRenderPass(long address, long renderPass);

    public VkUInt32 getAttachmentCount() {
        return new VkUInt32(getVkMemory(), getAttachmentCount(getVkAddress()));
    }

    
    public void setAttachmentCount(VkUInt32 attachmentCount) {
        setAttachmentCount(getVkAddress(), attachmentCount != null ? attachmentCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getAttachmentCount(long address);
    private static native void setAttachmentCount(long address, long attachmentCount);

    public VkImageView getPAttachments() {
        return new VkImageView(getVkMemory(), getPAttachments(getVkAddress()));
    }

    private VkObject pAttachments = null;
    public void setPAttachments(VkImageView pAttachments) {
        setPAttachments(getVkAddress(), pAttachments != null ? pAttachments.getVkAddress() : VkPointer.NULL);
        this.pAttachments = pAttachments;
    }

    private static native long getPAttachments(long address);
    private static native void setPAttachments(long address, long pAttachments);

    public VkUInt32 getWidth() {
        return new VkUInt32(getVkMemory(), getWidth(getVkAddress()));
    }

    
    public void setWidth(VkUInt32 width) {
        setWidth(getVkAddress(), width != null ? width.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getWidth(long address);
    private static native void setWidth(long address, long width);

    public VkUInt32 getHeight() {
        return new VkUInt32(getVkMemory(), getHeight(getVkAddress()));
    }

    
    public void setHeight(VkUInt32 height) {
        setHeight(getVkAddress(), height != null ? height.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getHeight(long address);
    private static native void setHeight(long address, long height);

    public VkUInt32 getLayers() {
        return new VkUInt32(getVkMemory(), getLayers(getVkAddress()));
    }

    
    public void setLayers(VkUInt32 layers) {
        setLayers(getVkAddress(), layers != null ? layers.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getLayers(long address);
    private static native void setLayers(long address, long layers);


    public static native long sizeof();

    public static class Array extends VkFramebufferCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkFramebufferCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkFramebufferCreateInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkFramebufferCreateInfo o){
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
        public VkFramebufferCreateInfo get(int i){
            return new VkFramebufferCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkFramebufferCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkFramebufferCreateInfo.Pointer> {
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

            public Array(VkFramebufferCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkFramebufferCreateInfo.Pointer get(int i){
                return new VkFramebufferCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
