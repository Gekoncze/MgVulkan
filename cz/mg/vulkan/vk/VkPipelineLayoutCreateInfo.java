package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineLayoutCreateInfo.html">khronos documentation</a>
 **/
public class VkPipelineLayoutCreateInfo extends VkObject {
    public VkPipelineLayoutCreateInfo() {
        super(sizeof());
    }

    public VkPipelineLayoutCreateInfo(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkPipelineLayoutCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkPipelineLayoutCreateInfo(VkObject pNext, VkPipelineLayoutCreateFlags flags, VkUInt32 setLayoutCount, VkDescriptorSetLayout pSetLayouts, VkUInt32 pushConstantRangeCount, VkPushConstantRange pPushConstantRanges) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO));
        setPNext(pNext);
        setFlags(flags);
        setSetLayoutCount(setLayoutCount);
        setPSetLayouts(pSetLayouts);
        setPushConstantRangeCount(pushConstantRangeCount);
        setPPushConstantRanges(pPushConstantRanges);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType.getVkAddress());
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext.getVkAddress());
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkPipelineLayoutCreateFlags getFlags() {
        return new VkPipelineLayoutCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    public void setFlags(VkPipelineLayoutCreateFlags flags) {
        setFlags(getVkAddress(), flags.getVkAddress());
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkUInt32 getSetLayoutCount() {
        return new VkUInt32(getVkMemory(), getSetLayoutCount(getVkAddress()));
    }

    public void setSetLayoutCount(VkUInt32 setLayoutCount) {
        setSetLayoutCount(getVkAddress(), setLayoutCount.getVkAddress());
    }

    private static native long getSetLayoutCount(long address);
    private static native void setSetLayoutCount(long address, long setLayoutCount);

    public VkDescriptorSetLayout.Array getPSetLayouts() {
        return new VkDescriptorSetLayout.Array(getVkMemory(), getPSetLayouts(getVkAddress()), getSetLayoutCount().getValue());
    }

    public void setPSetLayouts(VkDescriptorSetLayout pSetLayouts) {
        setPSetLayouts(getVkAddress(), pSetLayouts.getVkAddress());
    }

    private static native long getPSetLayouts(long address);
    private static native void setPSetLayouts(long address, long pSetLayouts);

    public VkUInt32 getPushConstantRangeCount() {
        return new VkUInt32(getVkMemory(), getPushConstantRangeCount(getVkAddress()));
    }

    public void setPushConstantRangeCount(VkUInt32 pushConstantRangeCount) {
        setPushConstantRangeCount(getVkAddress(), pushConstantRangeCount.getVkAddress());
    }

    private static native long getPushConstantRangeCount(long address);
    private static native void setPushConstantRangeCount(long address, long pushConstantRangeCount);

    public VkPushConstantRange.Array getPPushConstantRanges() {
        return new VkPushConstantRange.Array(getVkMemory(), getPPushConstantRanges(getVkAddress()), getPushConstantRangeCount().getValue());
    }

    public void setPPushConstantRanges(VkPushConstantRange pPushConstantRanges) {
        setPPushConstantRanges(getVkAddress(), pPushConstantRanges.getVkAddress());
    }

    private static native long getPPushConstantRanges(long address);
    private static native void setPPushConstantRanges(long address, long pPushConstantRanges);


    public static native long sizeof();

    public static class Array extends VkPipelineLayoutCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineLayoutCreateInfo> {
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
        public VkPipelineLayoutCreateInfo get(int i){
            return new VkPipelineLayoutCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkPipelineLayoutCreateInfo[] a) {
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
