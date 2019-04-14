package cz.mg.vulkan;

public class VkObjectTablePipelineEntryNVX extends VkObject {
    public VkObjectTablePipelineEntryNVX() {
        super(sizeof());
    }

    public VkObjectTablePipelineEntryNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkObjectTablePipelineEntryNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkObjectEntryTypeNVX getType() {
        return new VkObjectEntryTypeNVX(getVkMemory(), getType(getVkAddress()));
    }

    
    public void setType(VkObjectEntryTypeNVX type) {
        setType(getVkAddress(), type != null ? type.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setType(int type) {
        getType().setValue(type);
    }

    private static native long getType(long address);
    private static native void setType(long address, long type);

    public VkObjectEntryUsageFlagsNVX getFlags() {
        return new VkObjectEntryUsageFlagsNVX(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkObjectEntryUsageFlagsNVX flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setFlags(int flags) {
        getFlags().setValue(flags);
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkPipeline getPipeline() {
        return new VkPipeline(getVkMemory(), getPipeline(getVkAddress()));
    }

    
    public void setPipeline(VkPipeline pipeline) {
        setPipeline(getVkAddress(), pipeline != null ? pipeline.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getPipeline(long address);
    private static native void setPipeline(long address, long pipeline);


    public static native long sizeof();

    public static class Array extends VkObjectTablePipelineEntryNVX implements cz.mg.collections.array.ReadonlyArray<VkObjectTablePipelineEntryNVX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkObjectTablePipelineEntryNVX.sizeof()));
            this.count = count;
        }

        public Array(int count, VkObjectTablePipelineEntryNVX o){
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
        public VkObjectTablePipelineEntryNVX get(int i){
            return new VkObjectTablePipelineEntryNVX(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkObjectTablePipelineEntryNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VkObjectTablePipelineEntryNVX.Pointer> {
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

            public Array(VkObjectTablePipelineEntryNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkObjectTablePipelineEntryNVX.Pointer get(int i){
                return new VkObjectTablePipelineEntryNVX.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
