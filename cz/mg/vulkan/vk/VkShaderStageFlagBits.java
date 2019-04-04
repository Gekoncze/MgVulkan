package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkShaderStageFlagBits.html">khronos documentation</a>
 **/
public class VkShaderStageFlagBits extends VkFlagBits {
    public static final int VK_SHADER_STAGE_VERTEX_BIT = 0x00000001;
    public static final int VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT = 0x00000002;
    public static final int VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT = 0x00000004;
    public static final int VK_SHADER_STAGE_GEOMETRY_BIT = 0x00000008;
    public static final int VK_SHADER_STAGE_FRAGMENT_BIT = 0x00000010;
    public static final int VK_SHADER_STAGE_COMPUTE_BIT = 0x00000020;
    public static final int VK_SHADER_STAGE_ALL_GRAPHICS = 0x0000001F;
    public static final int VK_SHADER_STAGE_ALL = 0x7FFFFFFF;

    public VkShaderStageFlagBits() {
    }

    public VkShaderStageFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkShaderStageFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkShaderStageFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_SHADER_STAGE_VERTEX_BIT) s += "VK_SHADER_STAGE_VERTEX_BIT";
        if(getValue() == VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT) s += "VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT";
        if(getValue() == VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT) s += "VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT";
        if(getValue() == VK_SHADER_STAGE_GEOMETRY_BIT) s += "VK_SHADER_STAGE_GEOMETRY_BIT";
        if(getValue() == VK_SHADER_STAGE_FRAGMENT_BIT) s += "VK_SHADER_STAGE_FRAGMENT_BIT";
        if(getValue() == VK_SHADER_STAGE_COMPUTE_BIT) s += "VK_SHADER_STAGE_COMPUTE_BIT";
        if(getValue() == VK_SHADER_STAGE_ALL_GRAPHICS) s += "VK_SHADER_STAGE_ALL_GRAPHICS";
        if(getValue() == VK_SHADER_STAGE_ALL) s += "VK_SHADER_STAGE_ALL";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkShaderStageFlagBits implements cz.mg.collections.array.ReadonlyArray<VkShaderStageFlagBits> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkShaderStageFlagBits.sizeof()));
            this.count = count;
        }

        public Array(int count, VkShaderStageFlagBits o){
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
        public VkShaderStageFlagBits get(int i){
            return new VkShaderStageFlagBits(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkShaderStageFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VkShaderStageFlagBits.Pointer> {
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

            public Array(VkShaderStageFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkShaderStageFlagBits.Pointer get(int i){
                return new VkShaderStageFlagBits.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
