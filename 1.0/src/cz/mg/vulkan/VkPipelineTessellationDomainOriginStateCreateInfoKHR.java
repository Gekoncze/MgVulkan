package cz.mg.vulkan;

public class VkPipelineTessellationDomainOriginStateCreateInfoKHR extends VkObject {
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO_KHR));
    }

    public VkPipelineTessellationDomainOriginStateCreateInfoKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineTessellationDomainOriginStateCreateInfoKHR(VkMemory vkmemory, long vkaddress) {
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

    public VkTessellationDomainOriginKHR getDomainOrigin() {
        return new VkTessellationDomainOriginKHR(getVkMemory(), getDomainOrigin(getVkAddress()));
    }

    
    public void setDomainOrigin(VkTessellationDomainOriginKHR domainOrigin) {
        setDomainOrigin(getVkAddress(), domainOrigin != null ? domainOrigin.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDomainOriginQ() {
        return getDomainOrigin().getValue();
    }

    public void setDomainOrigin(int domainOrigin) {
        getDomainOrigin().setValue(domainOrigin);
    }

    protected static native long getDomainOrigin(long address);
    protected static native void setDomainOrigin(long address, long domainOrigin);


    public static native long sizeof();

    public static class Array extends VkPipelineTessellationDomainOriginStateCreateInfoKHR implements cz.mg.collections.array.ReadonlyArray<VkPipelineTessellationDomainOriginStateCreateInfoKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineTessellationDomainOriginStateCreateInfoKHR.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO_KHR));;
        }

        public Array(int count, VkPipelineTessellationDomainOriginStateCreateInfoKHR o){
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
        public VkPipelineTessellationDomainOriginStateCreateInfoKHR get(int i){
            return new VkPipelineTessellationDomainOriginStateCreateInfoKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPipelineTessellationDomainOriginStateCreateInfoKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPipelineTessellationDomainOriginStateCreateInfoKHR.Pointer> {
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

            public Array(VkPipelineTessellationDomainOriginStateCreateInfoKHR[] a) {
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
            public VkPipelineTessellationDomainOriginStateCreateInfoKHR.Pointer get(int i){
                return new VkPipelineTessellationDomainOriginStateCreateInfoKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
