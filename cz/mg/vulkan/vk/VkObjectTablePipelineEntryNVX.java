package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkObjectTablePipelineEntryNVX.html">khronos documentation</a>
 **/
public class VkObjectTablePipelineEntryNVX extends VkObject {
    public VkObjectTablePipelineEntryNVX() {
        super(sizeof());
    }

    public VkObjectTablePipelineEntryNVX(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkObjectTablePipelineEntryNVX(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkObjectTablePipelineEntryNVX(VkObjectEntryTypeNVX type, VkObjectEntryUsageFlagsNVX flags, VkPipeline pipeline) {
        super(sizeof());
        setType(type);
        setFlags(flags);
        setPipeline(pipeline);
    }

    public VkObjectEntryTypeNVX getType() {
        return new VkObjectEntryTypeNVX(getVkMemory(), getType(getVkAddress()));
    }

    public void setType(VkObjectEntryTypeNVX type) {
        setType(getVkAddress(), type.getVkAddress());
    }

    private static native long getType(long address);
    private static native void setType(long address, long type);

    public VkObjectEntryUsageFlagsNVX getFlags() {
        return new VkObjectEntryUsageFlagsNVX(getVkMemory(), getFlags(getVkAddress()));
    }

    public void setFlags(VkObjectEntryUsageFlagsNVX flags) {
        setFlags(getVkAddress(), flags.getVkAddress());
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkPipeline getPipeline() {
        return new VkPipeline(getVkMemory(), getPipeline(getVkAddress()));
    }

    public void setPipeline(VkPipeline pipeline) {
        setPipeline(getVkAddress(), pipeline.getVkAddress());
    }

    private static native long getPipeline(long address);
    private static native void setPipeline(long address, long pipeline);


    public static native long sizeof();

    public static class Array extends VkObjectTablePipelineEntryNVX implements cz.mg.collections.array.ReadonlyArray<VkObjectTablePipelineEntryNVX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*sizeof()));
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

        public static class Array extends Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*sizeof()));
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
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
