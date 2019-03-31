package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineCoverageModulationStateCreateInfoNV.html">khronos documentation</a>
 **/
public class VkPipelineCoverageModulationStateCreateInfoNV extends VkObject {
    public VkPipelineCoverageModulationStateCreateInfoNV() {
        super(sizeof());
    }

    public VkPipelineCoverageModulationStateCreateInfoNV(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkPipelineCoverageModulationStateCreateInfoNV(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkPipelineCoverageModulationStateCreateInfoNV(VkObject pNext, VkPipelineCoverageModulationStateCreateFlagsNV flags, VkCoverageModulationModeNV coverageModulationMode, VkBool32 coverageModulationTableEnable, VkUInt32 coverageModulationTableCount, VkFloat pCoverageModulationTable) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV));
        setPNext(pNext);
        setFlags(flags);
        setCoverageModulationMode(coverageModulationMode);
        setCoverageModulationTableEnable(coverageModulationTableEnable);
        setCoverageModulationTableCount(coverageModulationTableCount);
        setPCoverageModulationTable(pCoverageModulationTable);
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

    public VkPipelineCoverageModulationStateCreateFlagsNV getFlags() {
        return new VkPipelineCoverageModulationStateCreateFlagsNV(getVkMemory(), getFlags(getVkAddress()));
    }

    public void setFlags(VkPipelineCoverageModulationStateCreateFlagsNV flags) {
        setFlags(getVkAddress(), flags.getVkAddress());
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkCoverageModulationModeNV getCoverageModulationMode() {
        return new VkCoverageModulationModeNV(getVkMemory(), getCoverageModulationMode(getVkAddress()));
    }

    public void setCoverageModulationMode(VkCoverageModulationModeNV coverageModulationMode) {
        setCoverageModulationMode(getVkAddress(), coverageModulationMode.getVkAddress());
    }

    private static native long getCoverageModulationMode(long address);
    private static native void setCoverageModulationMode(long address, long coverageModulationMode);

    public VkBool32 getCoverageModulationTableEnable() {
        return new VkBool32(getVkMemory(), getCoverageModulationTableEnable(getVkAddress()));
    }

    public void setCoverageModulationTableEnable(VkBool32 coverageModulationTableEnable) {
        setCoverageModulationTableEnable(getVkAddress(), coverageModulationTableEnable.getVkAddress());
    }

    private static native long getCoverageModulationTableEnable(long address);
    private static native void setCoverageModulationTableEnable(long address, long coverageModulationTableEnable);

    public VkUInt32 getCoverageModulationTableCount() {
        return new VkUInt32(getVkMemory(), getCoverageModulationTableCount(getVkAddress()));
    }

    public void setCoverageModulationTableCount(VkUInt32 coverageModulationTableCount) {
        setCoverageModulationTableCount(getVkAddress(), coverageModulationTableCount.getVkAddress());
    }

    private static native long getCoverageModulationTableCount(long address);
    private static native void setCoverageModulationTableCount(long address, long coverageModulationTableCount);

    public VkFloat.Array getPCoverageModulationTable() {
        return new VkFloat.Array(getVkMemory(), getPCoverageModulationTable(getVkAddress()), getCoverageModulationTableCount().getValue());
    }

    public void setPCoverageModulationTable(VkFloat pCoverageModulationTable) {
        setPCoverageModulationTable(getVkAddress(), pCoverageModulationTable.getVkAddress());
    }

    private static native long getPCoverageModulationTable(long address);
    private static native void setPCoverageModulationTable(long address, long pCoverageModulationTable);


    public static native long sizeof();

    public static class Array extends VkPipelineCoverageModulationStateCreateInfoNV implements cz.mg.collections.array.ReadonlyArray<VkPipelineCoverageModulationStateCreateInfoNV> {
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
        public VkPipelineCoverageModulationStateCreateInfoNV get(int i){
            return new VkPipelineCoverageModulationStateCreateInfoNV(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkPipelineCoverageModulationStateCreateInfoNV[] a) {
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
