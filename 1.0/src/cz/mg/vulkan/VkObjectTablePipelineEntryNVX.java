package cz.mg.vulkan;

public class VkObjectTablePipelineEntryNVX extends VkObject {
    public VkObjectTablePipelineEntryNVX() {
        super(sizeof());
    }

    protected VkObjectTablePipelineEntryNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkObjectTablePipelineEntryNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkObjectTablePipelineEntryNVX(VkPointer pointer) {
        super(pointer);
    }



    public VkObjectEntryTypeNVX getType() {
        return new VkObjectEntryTypeNVX(getVkMemory(), getType(getVkAddress()));
    }

    
    public void setType(VkObjectEntryTypeNVX type) {
        setType(getVkAddress(), type != null ? type.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getTypeQ() {
        return getType().getValue();
    }

    public void setType(int type) {
        getType().setValue(type);
    }

    protected static native long getType(long address);
    protected static native void setType(long address, long type);

    public VkObjectEntryUsageFlagsNVX getFlags() {
        return new VkObjectEntryUsageFlagsNVX(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkObjectEntryUsageFlagsNVX flags) {
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

    public VkPipeline getPipeline() {
        return new VkPipeline(getVkMemory(), getPipeline(getVkAddress()));
    }

    
    public void setPipeline(VkPipeline pipeline) {
        setPipeline(getVkAddress(), pipeline != null ? pipeline.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getPipeline(long address);
    protected static native void setPipeline(long address, long pipeline);


    public static native long sizeof();

    public static class Array extends VkObjectTablePipelineEntryNVX implements cz.mg.collections.array.ReadonlyArray<VkObjectTablePipelineEntryNVX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkObjectTablePipelineEntryNVX.sizeof()));
            this.count = count;
        }

        public Array(VkObjectTablePipelineEntryNVX o, int count){
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
        public VkObjectTablePipelineEntryNVX get(int i){
            return new VkObjectTablePipelineEntryNVX(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
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
