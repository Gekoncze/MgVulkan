package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkObjectTablePushConstantEntryNVX.html">khronos documentation</a>
 **/
public class VkObjectTablePushConstantEntryNVX extends VkObject {
    public VkObjectTablePushConstantEntryNVX() {
        super(sizeof());
    }

    public VkObjectTablePushConstantEntryNVX(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkObjectTablePushConstantEntryNVX(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkObjectTablePushConstantEntryNVX(VkObjectEntryTypeNVX type, VkObjectEntryUsageFlagsNVX flags, VkPipelineLayout pipelineLayout, VkShaderStageFlags stageFlags) {
        super(sizeof());
        setType(type);
        setFlags(flags);
        setPipelineLayout(pipelineLayout);
        setStageFlags(stageFlags);
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

    public VkPipelineLayout getPipelineLayout() {
        return new VkPipelineLayout(getVkMemory(), getPipelineLayout(getVkAddress()));
    }

    public void setPipelineLayout(VkPipelineLayout pipelineLayout) {
        setPipelineLayout(getVkAddress(), pipelineLayout.getVkAddress());
    }

    private static native long getPipelineLayout(long address);
    private static native void setPipelineLayout(long address, long pipelineLayout);

    public VkShaderStageFlags getStageFlags() {
        return new VkShaderStageFlags(getVkMemory(), getStageFlags(getVkAddress()));
    }

    public void setStageFlags(VkShaderStageFlags stageFlags) {
        setStageFlags(getVkAddress(), stageFlags.getVkAddress());
    }

    private static native long getStageFlags(long address);
    private static native void setStageFlags(long address, long stageFlags);


    public static native long sizeof();

    public static class Array extends VkObjectTablePushConstantEntryNVX implements cz.mg.collections.array.ReadonlyArray<VkObjectTablePushConstantEntryNVX> {
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
        public VkObjectTablePushConstantEntryNVX get(int i){
            return new VkObjectTablePushConstantEntryNVX(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkObjectTablePushConstantEntryNVX[] a) {
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
