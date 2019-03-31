package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineMultisampleStateCreateInfo.html">khronos documentation</a>
 **/
public class VkPipelineMultisampleStateCreateInfo extends VkObject {
    public VkPipelineMultisampleStateCreateInfo() {
        super(sizeof());
    }

    public VkPipelineMultisampleStateCreateInfo(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkPipelineMultisampleStateCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkPipelineMultisampleStateCreateInfo(VkObject pNext, VkPipelineMultisampleStateCreateFlags flags, VkSampleCountFlagBits rasterizationSamples, VkBool32 sampleShadingEnable, VkFloat minSampleShading, VkSampleMask pSampleMask, VkBool32 alphaToCoverageEnable, VkBool32 alphaToOneEnable) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO));
        setPNext(pNext);
        setFlags(flags);
        setRasterizationSamples(rasterizationSamples);
        setSampleShadingEnable(sampleShadingEnable);
        setMinSampleShading(minSampleShading);
        setPSampleMask(pSampleMask);
        setAlphaToCoverageEnable(alphaToCoverageEnable);
        setAlphaToOneEnable(alphaToOneEnable);
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

    public VkPipelineMultisampleStateCreateFlags getFlags() {
        return new VkPipelineMultisampleStateCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    public void setFlags(VkPipelineMultisampleStateCreateFlags flags) {
        setFlags(getVkAddress(), flags.getVkAddress());
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkSampleCountFlagBits getRasterizationSamples() {
        return new VkSampleCountFlagBits(getVkMemory(), getRasterizationSamples(getVkAddress()));
    }

    public void setRasterizationSamples(VkSampleCountFlagBits rasterizationSamples) {
        setRasterizationSamples(getVkAddress(), rasterizationSamples.getVkAddress());
    }

    private static native long getRasterizationSamples(long address);
    private static native void setRasterizationSamples(long address, long rasterizationSamples);

    public VkBool32 getSampleShadingEnable() {
        return new VkBool32(getVkMemory(), getSampleShadingEnable(getVkAddress()));
    }

    public void setSampleShadingEnable(VkBool32 sampleShadingEnable) {
        setSampleShadingEnable(getVkAddress(), sampleShadingEnable.getVkAddress());
    }

    private static native long getSampleShadingEnable(long address);
    private static native void setSampleShadingEnable(long address, long sampleShadingEnable);

    public VkFloat getMinSampleShading() {
        return new VkFloat(getVkMemory(), getMinSampleShading(getVkAddress()));
    }

    public void setMinSampleShading(VkFloat minSampleShading) {
        setMinSampleShading(getVkAddress(), minSampleShading.getVkAddress());
    }

    private static native long getMinSampleShading(long address);
    private static native void setMinSampleShading(long address, long minSampleShading);

    public VkSampleMask getPSampleMask() {
        return new VkSampleMask(getVkMemory(), getPSampleMask(getVkAddress()));
    }

    public void setPSampleMask(VkSampleMask pSampleMask) {
        setPSampleMask(getVkAddress(), pSampleMask.getVkAddress());
    }

    private static native long getPSampleMask(long address);
    private static native void setPSampleMask(long address, long pSampleMask);

    public VkBool32 getAlphaToCoverageEnable() {
        return new VkBool32(getVkMemory(), getAlphaToCoverageEnable(getVkAddress()));
    }

    public void setAlphaToCoverageEnable(VkBool32 alphaToCoverageEnable) {
        setAlphaToCoverageEnable(getVkAddress(), alphaToCoverageEnable.getVkAddress());
    }

    private static native long getAlphaToCoverageEnable(long address);
    private static native void setAlphaToCoverageEnable(long address, long alphaToCoverageEnable);

    public VkBool32 getAlphaToOneEnable() {
        return new VkBool32(getVkMemory(), getAlphaToOneEnable(getVkAddress()));
    }

    public void setAlphaToOneEnable(VkBool32 alphaToOneEnable) {
        setAlphaToOneEnable(getVkAddress(), alphaToOneEnable.getVkAddress());
    }

    private static native long getAlphaToOneEnable(long address);
    private static native void setAlphaToOneEnable(long address, long alphaToOneEnable);


    public static native long sizeof();

    public static class Array extends VkPipelineMultisampleStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkPipelineMultisampleStateCreateInfo> {
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
        public VkPipelineMultisampleStateCreateInfo get(int i){
            return new VkPipelineMultisampleStateCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkPipelineMultisampleStateCreateInfo[] a) {
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
