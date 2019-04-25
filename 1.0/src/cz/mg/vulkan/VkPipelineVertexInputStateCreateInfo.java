package cz.mg.vulkan;

public class VkPipelineVertexInputStateCreateInfo extends VkObject {
    public VkPipelineVertexInputStateCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO));
    }

    public VkPipelineVertexInputStateCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineVertexInputStateCreateInfo(VkMemory vkmemory, long vkaddress) {
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

    public VkPipelineVertexInputStateCreateFlags getFlags() {
        return new VkPipelineVertexInputStateCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkPipelineVertexInputStateCreateFlags flags) {
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

    public VkUInt32 getVertexBindingDescriptionCount() {
        return new VkUInt32(getVkMemory(), getVertexBindingDescriptionCount(getVkAddress()));
    }

    
    public void setVertexBindingDescriptionCount(VkUInt32 vertexBindingDescriptionCount) {
        setVertexBindingDescriptionCount(getVkAddress(), vertexBindingDescriptionCount != null ? vertexBindingDescriptionCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getVertexBindingDescriptionCountQ() {
        return getVertexBindingDescriptionCount().getValue();
    }

    public void setVertexBindingDescriptionCount(int vertexBindingDescriptionCount) {
        getVertexBindingDescriptionCount().setValue(vertexBindingDescriptionCount);
    }

    protected static native long getVertexBindingDescriptionCount(long address);
    protected static native void setVertexBindingDescriptionCount(long address, long vertexBindingDescriptionCount);

    public VkVertexInputBindingDescription getPVertexBindingDescriptions() {
        return new VkVertexInputBindingDescription(getVkMemory(), getPVertexBindingDescriptions(getVkAddress()));
    }

    private VkObject pVertexBindingDescriptions = null;
    public void setPVertexBindingDescriptions(VkVertexInputBindingDescription pVertexBindingDescriptions) {
        setPVertexBindingDescriptions(getVkAddress(), pVertexBindingDescriptions != null ? pVertexBindingDescriptions.getVkAddress() : VkPointer.NULL);
        this.pVertexBindingDescriptions = pVertexBindingDescriptions;
    }

    protected static native long getPVertexBindingDescriptions(long address);
    protected static native void setPVertexBindingDescriptions(long address, long pVertexBindingDescriptions);

    public VkUInt32 getVertexAttributeDescriptionCount() {
        return new VkUInt32(getVkMemory(), getVertexAttributeDescriptionCount(getVkAddress()));
    }

    
    public void setVertexAttributeDescriptionCount(VkUInt32 vertexAttributeDescriptionCount) {
        setVertexAttributeDescriptionCount(getVkAddress(), vertexAttributeDescriptionCount != null ? vertexAttributeDescriptionCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getVertexAttributeDescriptionCountQ() {
        return getVertexAttributeDescriptionCount().getValue();
    }

    public void setVertexAttributeDescriptionCount(int vertexAttributeDescriptionCount) {
        getVertexAttributeDescriptionCount().setValue(vertexAttributeDescriptionCount);
    }

    protected static native long getVertexAttributeDescriptionCount(long address);
    protected static native void setVertexAttributeDescriptionCount(long address, long vertexAttributeDescriptionCount);

    public VkVertexInputAttributeDescription getPVertexAttributeDescriptions() {
        return new VkVertexInputAttributeDescription(getVkMemory(), getPVertexAttributeDescriptions(getVkAddress()));
    }

    private VkObject pVertexAttributeDescriptions = null;
    public void setPVertexAttributeDescriptions(VkVertexInputAttributeDescription pVertexAttributeDescriptions) {
        setPVertexAttributeDescriptions(getVkAddress(), pVertexAttributeDescriptions != null ? pVertexAttributeDescriptions.getVkAddress() : VkPointer.NULL);
        this.pVertexAttributeDescriptions = pVertexAttributeDescriptions;
    }

    protected static native long getPVertexAttributeDescriptions(long address);
    protected static native void setPVertexAttributeDescriptions(long address, long pVertexAttributeDescriptions);


    public static native long sizeof();

    public static class Array extends VkPipelineVertexInputStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineVertexInputStateCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineVertexInputStateCreateInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO));;
        }

        public Array(int count, VkPipelineVertexInputStateCreateInfo o){
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
        public VkPipelineVertexInputStateCreateInfo get(int i){
            return new VkPipelineVertexInputStateCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPipelineVertexInputStateCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPipelineVertexInputStateCreateInfo.Pointer> {
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

            public Array(VkPipelineVertexInputStateCreateInfo[] a) {
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
            public VkPipelineVertexInputStateCreateInfo.Pointer get(int i){
                return new VkPipelineVertexInputStateCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
