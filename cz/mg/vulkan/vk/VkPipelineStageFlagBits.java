package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineStageFlagBits.html">khronos documentation</a>
 **/
public class VkPipelineStageFlagBits extends VkFlagBits {
    public static final int VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT = 0x00000001;
    public static final int VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT = 0x00000002;
    public static final int VK_PIPELINE_STAGE_VERTEX_INPUT_BIT = 0x00000004;
    public static final int VK_PIPELINE_STAGE_VERTEX_SHADER_BIT = 0x00000008;
    public static final int VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT = 0x00000010;
    public static final int VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT = 0x00000020;
    public static final int VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT = 0x00000040;
    public static final int VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT = 0x00000080;
    public static final int VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT = 0x00000100;
    public static final int VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT = 0x00000200;
    public static final int VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT = 0x00000400;
    public static final int VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT = 0x00000800;
    public static final int VK_PIPELINE_STAGE_TRANSFER_BIT = 0x00001000;
    public static final int VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT = 0x00002000;
    public static final int VK_PIPELINE_STAGE_HOST_BIT = 0x00004000;
    public static final int VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT = 0x00008000;
    public static final int VK_PIPELINE_STAGE_ALL_COMMANDS_BIT = 0x00010000;
    public static final int VK_PIPELINE_STAGE_COMMAND_PROCESS_BIT_NVX = 0x00020000;

    public VkPipelineStageFlagBits() {
    }

    public VkPipelineStageFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineStageFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPipelineStageFlagBits(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT) s += "VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT";
        if(getValue() == VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT) s += "VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT";
        if(getValue() == VK_PIPELINE_STAGE_VERTEX_INPUT_BIT) s += "VK_PIPELINE_STAGE_VERTEX_INPUT_BIT";
        if(getValue() == VK_PIPELINE_STAGE_VERTEX_SHADER_BIT) s += "VK_PIPELINE_STAGE_VERTEX_SHADER_BIT";
        if(getValue() == VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT) s += "VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT";
        if(getValue() == VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT) s += "VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT";
        if(getValue() == VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT) s += "VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT";
        if(getValue() == VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT) s += "VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT";
        if(getValue() == VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT) s += "VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT";
        if(getValue() == VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT) s += "VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT";
        if(getValue() == VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT) s += "VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT";
        if(getValue() == VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT) s += "VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT";
        if(getValue() == VK_PIPELINE_STAGE_TRANSFER_BIT) s += "VK_PIPELINE_STAGE_TRANSFER_BIT";
        if(getValue() == VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT) s += "VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT";
        if(getValue() == VK_PIPELINE_STAGE_HOST_BIT) s += "VK_PIPELINE_STAGE_HOST_BIT";
        if(getValue() == VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT) s += "VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT";
        if(getValue() == VK_PIPELINE_STAGE_ALL_COMMANDS_BIT) s += "VK_PIPELINE_STAGE_ALL_COMMANDS_BIT";
        if(getValue() == VK_PIPELINE_STAGE_COMMAND_PROCESS_BIT_NVX) s += "VK_PIPELINE_STAGE_COMMAND_PROCESS_BIT_NVX";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VkPipelineStageFlagBits implements cz.mg.collections.array.ReadonlyArray<VkPipelineStageFlagBits> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineStageFlagBits.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPipelineStageFlagBits o){
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
        public VkPipelineStageFlagBits get(int i){
            return new VkPipelineStageFlagBits(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPipelineStageFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkPipelineStageFlagBits[] a) {
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
