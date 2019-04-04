package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineCoverageToColorStateCreateInfoNV.html">khronos documentation</a>
 **/
public class VkPipelineCoverageToColorStateCreateInfoNV extends VkObject {
    public VkPipelineCoverageToColorStateCreateInfoNV() {
        super(sizeof());
    }

    public VkPipelineCoverageToColorStateCreateInfoNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineCoverageToColorStateCreateInfoNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineCoverageToColorStateCreateInfoNV(VkObject pNext, VkPipelineCoverageToColorStateCreateFlagsNV flags, VkBool32 coverageToColorEnable, VkUInt32 coverageToColorLocation) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO_NV));
        setPNext(pNext);
        setFlags(flags);
        setCoverageToColorEnable(coverageToColorEnable);
        setCoverageToColorLocation(coverageToColorLocation);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkPipelineCoverageToColorStateCreateFlagsNV getFlags() {
        return new VkPipelineCoverageToColorStateCreateFlagsNV(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkPipelineCoverageToColorStateCreateFlagsNV flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkBool32 getCoverageToColorEnable() {
        return new VkBool32(getVkMemory(), getCoverageToColorEnable(getVkAddress()));
    }

    
    public void setCoverageToColorEnable(VkBool32 coverageToColorEnable) {
        setCoverageToColorEnable(getVkAddress(), coverageToColorEnable != null ? coverageToColorEnable.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getCoverageToColorEnable(long address);
    private static native void setCoverageToColorEnable(long address, long coverageToColorEnable);

    public VkUInt32 getCoverageToColorLocation() {
        return new VkUInt32(getVkMemory(), getCoverageToColorLocation(getVkAddress()));
    }

    
    public void setCoverageToColorLocation(VkUInt32 coverageToColorLocation) {
        setCoverageToColorLocation(getVkAddress(), coverageToColorLocation != null ? coverageToColorLocation.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getCoverageToColorLocation(long address);
    private static native void setCoverageToColorLocation(long address, long coverageToColorLocation);


    public static native long sizeof();

    public static class Array extends VkPipelineCoverageToColorStateCreateInfoNV implements cz.mg.collections.array.ReadonlyArray<VkPipelineCoverageToColorStateCreateInfoNV> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineCoverageToColorStateCreateInfoNV.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPipelineCoverageToColorStateCreateInfoNV o){
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
        public VkPipelineCoverageToColorStateCreateInfoNV get(int i){
            return new VkPipelineCoverageToColorStateCreateInfoNV(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPipelineCoverageToColorStateCreateInfoNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPipelineCoverageToColorStateCreateInfoNV.Pointer> {
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

            public Array(VkPipelineCoverageToColorStateCreateInfoNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPipelineCoverageToColorStateCreateInfoNV.Pointer get(int i){
                return new VkPipelineCoverageToColorStateCreateInfoNV.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
