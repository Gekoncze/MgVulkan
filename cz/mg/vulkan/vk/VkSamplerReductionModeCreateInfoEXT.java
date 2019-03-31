package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSamplerReductionModeCreateInfoEXT.html">khronos documentation</a>
 **/
public class VkSamplerReductionModeCreateInfoEXT extends VkObject {
    public VkSamplerReductionModeCreateInfoEXT() {
        super(sizeof());
    }

    public VkSamplerReductionModeCreateInfoEXT(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkSamplerReductionModeCreateInfoEXT(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkSamplerReductionModeCreateInfoEXT(VkObject pNext, VkSamplerReductionModeEXT reductionMode) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO_EXT));
        setPNext(pNext);
        setReductionMode(reductionMode);
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

    public VkSamplerReductionModeEXT getReductionMode() {
        return new VkSamplerReductionModeEXT(getVkMemory(), getReductionMode(getVkAddress()));
    }

    public void setReductionMode(VkSamplerReductionModeEXT reductionMode) {
        setReductionMode(getVkAddress(), reductionMode.getVkAddress());
    }

    private static native long getReductionMode(long address);
    private static native void setReductionMode(long address, long reductionMode);


    public static native long sizeof();

    public static class Array extends VkSamplerReductionModeCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VkSamplerReductionModeCreateInfoEXT> {
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
        public VkSamplerReductionModeCreateInfoEXT get(int i){
            return new VkSamplerReductionModeCreateInfoEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkSamplerReductionModeCreateInfoEXT[] a) {
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
