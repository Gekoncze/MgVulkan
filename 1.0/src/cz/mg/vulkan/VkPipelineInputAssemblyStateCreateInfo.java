package cz.mg.vulkan;

public class VkPipelineInputAssemblyStateCreateInfo extends VkObject {
    public VkPipelineInputAssemblyStateCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO));
    }

    public VkPipelineInputAssemblyStateCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineInputAssemblyStateCreateInfo(VkMemory vkmemory, long vkaddress) {
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

    public VkPipelineInputAssemblyStateCreateFlags getFlags() {
        return new VkPipelineInputAssemblyStateCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkPipelineInputAssemblyStateCreateFlags flags) {
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

    public VkPrimitiveTopology getTopology() {
        return new VkPrimitiveTopology(getVkMemory(), getTopology(getVkAddress()));
    }

    
    public void setTopology(VkPrimitiveTopology topology) {
        setTopology(getVkAddress(), topology != null ? topology.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getTopologyQ() {
        return getTopology().getValue();
    }

    public void setTopology(int topology) {
        getTopology().setValue(topology);
    }

    protected static native long getTopology(long address);
    protected static native void setTopology(long address, long topology);

    public VkBool32 getPrimitiveRestartEnable() {
        return new VkBool32(getVkMemory(), getPrimitiveRestartEnable(getVkAddress()));
    }

    
    public void setPrimitiveRestartEnable(VkBool32 primitiveRestartEnable) {
        setPrimitiveRestartEnable(getVkAddress(), primitiveRestartEnable != null ? primitiveRestartEnable.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getPrimitiveRestartEnableQ() {
        return getPrimitiveRestartEnable().getValue();
    }

    public void setPrimitiveRestartEnable(int primitiveRestartEnable) {
        getPrimitiveRestartEnable().setValue(primitiveRestartEnable);
    }

    protected static native long getPrimitiveRestartEnable(long address);
    protected static native void setPrimitiveRestartEnable(long address, long primitiveRestartEnable);


    public static native long sizeof();

    public static class Array extends VkPipelineInputAssemblyStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineInputAssemblyStateCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineInputAssemblyStateCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO));;
        }

        public Array(int count, VkPipelineInputAssemblyStateCreateInfo o){
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
        public VkPipelineInputAssemblyStateCreateInfo get(int i){
            return new VkPipelineInputAssemblyStateCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPipelineInputAssemblyStateCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPipelineInputAssemblyStateCreateInfo.Pointer> {
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

            public Array(VkPipelineInputAssemblyStateCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPipelineInputAssemblyStateCreateInfo.Pointer get(int i){
                return new VkPipelineInputAssemblyStateCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
