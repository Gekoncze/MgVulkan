package cz.mg.vulkan;

public class VkPipelineTessellationDomainOriginStateCreateInfo extends VkObject {
    public VkPipelineTessellationDomainOriginStateCreateInfo() {
        super(sizeof());
    }

    public VkPipelineTessellationDomainOriginStateCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineTessellationDomainOriginStateCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineTessellationDomainOriginStateCreateInfo(VkObject pNext, VkTessellationDomainOrigin domainOrigin) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO));
        setPNext(pNext);
        setDomainOrigin(domainOrigin);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.NULL_ADDRESS);
        
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

    public VkTessellationDomainOrigin getDomainOrigin() {
        return new VkTessellationDomainOrigin(getVkMemory(), getDomainOrigin(getVkAddress()));
    }

    
    public void setDomainOrigin(VkTessellationDomainOrigin domainOrigin) {
        setDomainOrigin(getVkAddress(), domainOrigin != null ? domainOrigin.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDomainOrigin(long address);
    private static native void setDomainOrigin(long address, long domainOrigin);


    public static native long sizeof();

    public static class Array extends VkPipelineTessellationDomainOriginStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineTessellationDomainOriginStateCreateInfo> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineTessellationDomainOriginStateCreateInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPipelineTessellationDomainOriginStateCreateInfo o){
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
        public VkPipelineTessellationDomainOriginStateCreateInfo get(int i){
            return new VkPipelineTessellationDomainOriginStateCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }


    public static class Pointer extends VkObject.Pointer {        public Pointer() {
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

        public static class Array extends VkPipelineTessellationDomainOriginStateCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPipelineTessellationDomainOriginStateCreateInfo.Pointer> {
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

            public Array(VkPipelineTessellationDomainOriginStateCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPipelineTessellationDomainOriginStateCreateInfo.Pointer get(int i){
                return new VkPipelineTessellationDomainOriginStateCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
