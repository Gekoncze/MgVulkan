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
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
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

    public VkRenderPassCreateFlags getFlags() {
        return new VkRenderPassCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkRenderPassCreateFlags flags) {
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

    public VkUInt32 getAttachmentCount() {
        return new VkUInt32(getVkMemory(), getAttachmentCount(getVkAddress()));
    }

    
    public void setAttachmentCount(VkUInt32 attachmentCount) {
        setAttachmentCount(getVkAddress(), attachmentCount != null ? attachmentCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getAttachmentCountQ() {
        return getAttachmentCount().getValue();
    }

    public void setAttachmentCount(int attachmentCount) {
        getAttachmentCount().setValue(attachmentCount);
    }

    protected static native long getAttachmentCount(long address);
    protected static native void setAttachmentCount(long address, long attachmentCount);

    public VkAttachmentDescription getPAttachments() {
        return new VkAttachmentDescription(getVkMemory(), getPAttachments(getVkAddress()));
    }

    private VkObject pAttachments = null;
    public void setPAttachments(VkAttachmentDescription pAttachments) {
        setPAttachments(getVkAddress(), pAttachments != null ? pAttachments.getVkAddress() : VkPointer.NULL);
        this.pAttachments = pAttachments;
    }

    protected static native long getPAttachments(long address);
    protected static native void setPAttachments(long address, long pAttachments);

    public VkUInt32 getSubpassCount() {
        return new VkUInt32(getVkMemory(), getSubpassCount(getVkAddress()));
    }

    
    public void setSubpassCount(VkUInt32 subpassCount) {
        setSubpassCount(getVkAddress(), subpassCount != null ? subpassCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getSubpassCountQ() {
        return getSubpassCount().getValue();
    }

    public void setSubpassCount(int subpassCount) {
        getSubpassCount().setValue(subpassCount);
    }

    protected static native long getSubpassCount(long address);
    protected static native void setSubpassCount(long address, long subpassCount);

    public VkSubpassDescription getPSubpasses() {
        return new VkSubpassDescription(getVkMemory(), getPSubpasses(getVkAddress()));
    }

    private VkObject pSubpasses = null;
    public void setPSubpasses(VkSubpassDescription pSubpasses) {
        setPSubpasses(getVkAddress(), pSubpasses != null ? pSubpasses.getVkAddress() : VkPointer.NULL);
        this.pSubpasses = pSubpasses;
    }

    protected static native long getPSubpasses(long address);
    protected static native void setPSubpasses(long address, long pSubpasses);

    public VkUInt32 getDependencyCount() {
        return new VkUInt32(getVkMemory(), getDependencyCount(getVkAddress()));
    }

    
    public void setDependencyCount(VkUInt32 dependencyCount) {
        setDependencyCount(getVkAddress(), dependencyCount != null ? dependencyCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDependencyCountQ() {
        return getDependencyCount().getValue();
    }

    public void setDependencyCount(int dependencyCount) {
        getDependencyCount().setValue(dependencyCount);
    }

    protected static native long getDependencyCount(long address);
    protected static native void setDependencyCount(long address, long dependencyCount);

    public VkSubpassDependency getPDependencies() {
        return new VkSubpassDependency(getVkMemory(), getPDependencies(getVkAddress()));
    }

    private VkObject pDependencies = null;
    public void setPDependencies(VkSubpassDependency pDependencies) {
        setPDependencies(getVkAddress(), pDependencies != null ? pDependencies.getVkAddress() : VkPointer.NULL);
        this.pDependencies = pDependencies;
    }

    protected static native long getPDependencies(long address);
    protected static native void setPDependencies(long address, long pDependencies);


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

            public Array(long... values){
                this(values.length);
                for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
            }

            public long getValueAt(int i){
                return getValueNative(addressAt(i));
            }

            public void setValueAt(int i, long value){
                setValueNative(addressAt(i), value);
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkRenderPassCreateInfo.Pointer get(int i){
                return new VkRenderPassCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
