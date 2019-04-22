package cz.mg.vulkan;

public class VkRenderPassCreateInfo extends VkObject {
    public VkRenderPassCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO));
    }

    public VkRenderPassCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkRenderPassCreateInfo(VkMemory vkmemory, long vkaddress) {
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

    public VkRenderPassCreateFlags getFlags() {
        return new VkRenderPassCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkRenderPassCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkUInt32 getAttachmentCount() {
        return new VkUInt32(getVkMemory(), getAttachmentCount(getVkAddress()));
    }

    
    public void setAttachmentCount(VkUInt32 attachmentCount) {
        setAttachmentCount(getVkAddress(), attachmentCount != null ? attachmentCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getAttachmentCountQ() {
        return getAttachmentCount().getValue();
    }

    public void setAttachmentCount(int attachmentCount) {
        getAttachmentCount().setValue(attachmentCount);
    }

    private static native long getAttachmentCount(long address);
    private static native void setAttachmentCount(long address, long attachmentCount);

    public VkAttachmentDescription getPAttachments() {
        return new VkAttachmentDescription(getVkMemory(), getPAttachments(getVkAddress()));
    }

    private VkObject pAttachments = null;
    public void setPAttachments(VkAttachmentDescription pAttachments) {
        setPAttachments(getVkAddress(), pAttachments != null ? pAttachments.getVkAddress() : VkPointer.NULL);
        this.pAttachments = pAttachments;
    }

    private static native long getPAttachments(long address);
    private static native void setPAttachments(long address, long pAttachments);

    public VkUInt32 getSubpassCount() {
        return new VkUInt32(getVkMemory(), getSubpassCount(getVkAddress()));
    }

    
    public void setSubpassCount(VkUInt32 subpassCount) {
        setSubpassCount(getVkAddress(), subpassCount != null ? subpassCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSubpassCountQ() {
        return getSubpassCount().getValue();
    }

    public void setSubpassCount(int subpassCount) {
        getSubpassCount().setValue(subpassCount);
    }

    private static native long getSubpassCount(long address);
    private static native void setSubpassCount(long address, long subpassCount);

    public VkSubpassDescription getPSubpasses() {
        return new VkSubpassDescription(getVkMemory(), getPSubpasses(getVkAddress()));
    }

    private VkObject pSubpasses = null;
    public void setPSubpasses(VkSubpassDescription pSubpasses) {
        setPSubpasses(getVkAddress(), pSubpasses != null ? pSubpasses.getVkAddress() : VkPointer.NULL);
        this.pSubpasses = pSubpasses;
    }

    private static native long getPSubpasses(long address);
    private static native void setPSubpasses(long address, long pSubpasses);

    public VkUInt32 getDependencyCount() {
        return new VkUInt32(getVkMemory(), getDependencyCount(getVkAddress()));
    }

    
    public void setDependencyCount(VkUInt32 dependencyCount) {
        setDependencyCount(getVkAddress(), dependencyCount != null ? dependencyCount.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getDependencyCountQ() {
        return getDependencyCount().getValue();
    }

    public void setDependencyCount(int dependencyCount) {
        getDependencyCount().setValue(dependencyCount);
    }

    private static native long getDependencyCount(long address);
    private static native void setDependencyCount(long address, long dependencyCount);

    public VkSubpassDependency getPDependencies() {
        return new VkSubpassDependency(getVkMemory(), getPDependencies(getVkAddress()));
    }

    private VkObject pDependencies = null;
    public void setPDependencies(VkSubpassDependency pDependencies) {
        setPDependencies(getVkAddress(), pDependencies != null ? pDependencies.getVkAddress() : VkPointer.NULL);
        this.pDependencies = pDependencies;
    }

    private static native long getPDependencies(long address);
    private static native void setPDependencies(long address, long pDependencies);


    public static native long sizeof();

    public static class Array extends VkRenderPassCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkRenderPassCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkRenderPassCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO));;
        }

        public Array(int count, VkRenderPassCreateInfo o){
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
        public VkRenderPassCreateInfo get(int i){
            return new VkRenderPassCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkRenderPassCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkRenderPassCreateInfo.Pointer> {
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

            public Array(VkRenderPassCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkRenderPassCreateInfo.Pointer get(int i){
                return new VkRenderPassCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
