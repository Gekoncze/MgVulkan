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
        return new VkObjectEntryTypeNVX(getVkMemory(), getTypeNative(getVkAddress()));
    }

    
    public void setType(VkObjectEntryTypeNVX type) {
        setTypeNative(getVkAddress(), type != null ? type.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getTypeQ() {
        return getType().getValue();
    }

    public void setType(int type) {
        getType().setValue(type);
    }

    protected static native long getTypeNative(long address);
    protected static native void setTypeNative(long address, long type);

    public VkObjectEntryUsageFlagsNVX getFlags() {
        return new VkObjectEntryUsageFlagsNVX(getVkMemory(), getFlagsNative(getVkAddress()));
    }

    
    public void setFlags(VkObjectEntryUsageFlagsNVX flags) {
        setFlagsNative(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getFlagsQ() {
        return getFlags().getValue();
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    protected static native long getFlagsNative(long address);
    protected static native void setFlagsNative(long address, long flags);

    public VkPipeline getPipeline() {
        return new VkPipeline(getVkMemory(), getPipelineNative(getVkAddress()));
    }

    
    public void setPipeline(VkPipeline pipeline) {
        setPipelineNative(getVkAddress(), pipeline != null ? pipeline.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getPipelineNative(long address);
    protected static native void setPipelineNative(long address, long pipeline);


    public void set(VkObjectTablePipelineEntryNVX o){
        setNative(getVkAddress(), o.getVkAddress());
    }

    public static native long sizeof();
    protected static native void setNative(long o1, long o2);

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
            return new VkObjectTablePipelineEntryNVX(getVkMemory(), address(i));
        }

        protected long address(int i){
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
