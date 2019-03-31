package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineShaderStageCreateInfo.html">khronos documentation</a>
 **/
public class VkPipelineShaderStageCreateInfo extends VkObject {
    public VkPipelineShaderStageCreateInfo() {
        super(sizeof());
    }

    public VkPipelineShaderStageCreateInfo(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkPipelineShaderStageCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkPipelineShaderStageCreateInfo(VkObject pNext, VkPipelineShaderStageCreateFlags flags, VkShaderStageFlagBits stage, VkShaderModule module, VkChar pName, VkSpecializationInfo pSpecializationInfo) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO));
        setPNext(pNext);
        setFlags(flags);
        setStage(stage);
        setModule(module);
        setPName(pName);
        setPSpecializationInfo(pSpecializationInfo);
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

    public VkPipelineShaderStageCreateFlags getFlags() {
        return new VkPipelineShaderStageCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    public void setFlags(VkPipelineShaderStageCreateFlags flags) {
        setFlags(getVkAddress(), flags.getVkAddress());
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkShaderStageFlagBits getStage() {
        return new VkShaderStageFlagBits(getVkMemory(), getStage(getVkAddress()));
    }

    public void setStage(VkShaderStageFlagBits stage) {
        setStage(getVkAddress(), stage.getVkAddress());
    }

    private static native long getStage(long address);
    private static native void setStage(long address, long stage);

    public VkShaderModule getModule() {
        return new VkShaderModule(getVkMemory(), getModule(getVkAddress()));
    }

    public void setModule(VkShaderModule module) {
        setModule(getVkAddress(), module.getVkAddress());
    }

    private static native long getModule(long address);
    private static native void setModule(long address, long module);

    public VkChar getPName() {
        return new VkChar(getVkMemory(), getPName(getVkAddress()));
    }

    public void setPName(VkChar pName) {
        setPName(getVkAddress(), pName.getVkAddress());
    }

    private static native long getPName(long address);
    private static native void setPName(long address, long pName);

    public VkSpecializationInfo getPSpecializationInfo() {
        return new VkSpecializationInfo(getVkMemory(), getPSpecializationInfo(getVkAddress()));
    }

    public void setPSpecializationInfo(VkSpecializationInfo pSpecializationInfo) {
        setPSpecializationInfo(getVkAddress(), pSpecializationInfo.getVkAddress());
    }

    private static native long getPSpecializationInfo(long address);
    private static native void setPSpecializationInfo(long address, long pSpecializationInfo);


    public static native long sizeof();

    public static class Array extends VkPipelineShaderStageCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineShaderStageCreateInfo> {
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
        public VkPipelineShaderStageCreateInfo get(int i){
            return new VkPipelineShaderStageCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkPipelineShaderStageCreateInfo[] a) {
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
