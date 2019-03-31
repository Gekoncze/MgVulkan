package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineCreateFlagBits.html">khronos documentation</a>
 **/
public class VkPipelineCreateFlagBits extends VkFlagBits {
    public static final int VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT = 0x00000001;
    public static final int VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT = 0x00000002;
    public static final int VK_PIPELINE_CREATE_DERIVATIVE_BIT = 0x00000004;
    public static final int VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT = 0x00000008;
    public static final int VK_PIPELINE_CREATE_DISPATCH_BASE = 0x00000010;
    public static final int VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR = VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT;
    public static final int VK_PIPELINE_CREATE_DISPATCH_BASE_KHR = VK_PIPELINE_CREATE_DISPATCH_BASE;

    public VkPipelineCreateFlagBits() {
    }

    public VkPipelineCreateFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineCreateFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineCreateFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT) s += "VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT ";
        if(getValue() == VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT) s += "VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT ";
        if(getValue() == VK_PIPELINE_CREATE_DERIVATIVE_BIT) s += "VK_PIPELINE_CREATE_DERIVATIVE_BIT ";
        if(getValue() == VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT) s += "VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT ";
        if(getValue() == VK_PIPELINE_CREATE_DISPATCH_BASE) s += "VK_PIPELINE_CREATE_DISPATCH_BASE ";
        if(getValue() == VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR) s += "VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR ";
        if(getValue() == VK_PIPELINE_CREATE_DISPATCH_BASE_KHR) s += "VK_PIPELINE_CREATE_DISPATCH_BASE_KHR ";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkPipelineCreateFlagBits implements cz.mg.collections.array.ReadonlyArray<VkPipelineCreateFlagBits> {
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
        public VkPipelineCreateFlagBits get(int i){
            return new VkPipelineCreateFlagBits(getVkMemory(), getVkAddress() + sizeof()*i);
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

            public Array(VkPipelineCreateFlagBits[] a) {
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
