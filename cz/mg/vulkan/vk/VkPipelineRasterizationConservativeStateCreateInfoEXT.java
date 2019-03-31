package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineRasterizationConservativeStateCreateInfoEXT.html">khronos documentation</a>
 **/
public class VkPipelineRasterizationConservativeStateCreateInfoEXT extends VkObject {
    public VkPipelineRasterizationConservativeStateCreateInfoEXT() {
        super(sizeof());
    }

    public VkPipelineRasterizationConservativeStateCreateInfoEXT(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkPipelineRasterizationConservativeStateCreateInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkPipelineRasterizationConservativeStateCreateInfoEXT(VkObject pNext, VkPipelineRasterizationConservativeStateCreateFlagsEXT flags, VkConservativeRasterizationModeEXT conservativeRasterizationMode, VkFloat extraPrimitiveOverestimationSize) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT));
        setPNext(pNext);
        setFlags(flags);
        setConservativeRasterizationMode(conservativeRasterizationMode);
        setExtraPrimitiveOverestimationSize(extraPrimitiveOverestimationSize);
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

    public VkPipelineRasterizationConservativeStateCreateFlagsEXT getFlags() {
        return new VkPipelineRasterizationConservativeStateCreateFlagsEXT(getVkMemory(), getFlags(getVkAddress()));
    }

    public void setFlags(VkPipelineRasterizationConservativeStateCreateFlagsEXT flags) {
        setFlags(getVkAddress(), flags.getVkAddress());
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkConservativeRasterizationModeEXT getConservativeRasterizationMode() {
        return new VkConservativeRasterizationModeEXT(getVkMemory(), getConservativeRasterizationMode(getVkAddress()));
    }

    public void setConservativeRasterizationMode(VkConservativeRasterizationModeEXT conservativeRasterizationMode) {
        setConservativeRasterizationMode(getVkAddress(), conservativeRasterizationMode.getVkAddress());
    }

    private static native long getConservativeRasterizationMode(long address);
    private static native void setConservativeRasterizationMode(long address, long conservativeRasterizationMode);

    public VkFloat getExtraPrimitiveOverestimationSize() {
        return new VkFloat(getVkMemory(), getExtraPrimitiveOverestimationSize(getVkAddress()));
    }

    public void setExtraPrimitiveOverestimationSize(VkFloat extraPrimitiveOverestimationSize) {
        setExtraPrimitiveOverestimationSize(getVkAddress(), extraPrimitiveOverestimationSize.getVkAddress());
    }

    private static native long getExtraPrimitiveOverestimationSize(long address);
    private static native void setExtraPrimitiveOverestimationSize(long address, long extraPrimitiveOverestimationSize);


    public static native long sizeof();

    public static class Array extends VkPipelineRasterizationConservativeStateCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkPipelineRasterizationConservativeStateCreateInfoEXT> {
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
        public VkPipelineRasterizationConservativeStateCreateInfoEXT get(int i){
            return new VkPipelineRasterizationConservativeStateCreateInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkPipelineRasterizationConservativeStateCreateInfoEXT[] a) {
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
