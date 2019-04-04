package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineStageFlagBits.html">khronos documentation</a>
 **/
public class VulkanPipelineStageFlagBits extends VulkanFlagBits {
    public static final int TOP_OF_PIPE = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT;
    public static final int DRAW_INDIRECT = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT;
    public static final int VERTEX_INPUT = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_VERTEX_INPUT_BIT;
    public static final int VERTEX_SHADER = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_VERTEX_SHADER_BIT;
    public static final int TESSELLATION_CONTROL_SHADER = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT;
    public static final int TESSELLATION_EVALUATION_SHADER = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT;
    public static final int GEOMETRY_SHADER = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT;
    public static final int FRAGMENT_SHADER = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT;
    public static final int EARLY_FRAGMENT_TESTS = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT;
    public static final int LATE_FRAGMENT_TESTS = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT;
    public static final int COLOR_ATTACHMENT_OUTPUT = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT;
    public static final int COMPUTE_SHADER = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT;
    public static final int TRANSFER = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_TRANSFER_BIT;
    public static final int BOTTOM_OF_PIPE = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT;
    public static final int HOST = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_HOST_BIT;
    public static final int ALL_GRAPHICS = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT;
    public static final int ALL_COMMANDS = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_ALL_COMMANDS_BIT;
    public static final int COMMAND_PROCESS_NVX = VkPipelineStageFlagBits.VK_PIPELINE_STAGE_COMMAND_PROCESS_BIT_NVX;

    public VulkanPipelineStageFlagBits(){
        super(new VkPipelineStageFlagBits());
    }

    public VulkanPipelineStageFlagBits(VkPipelineStageFlagBits vk){
        super(vk);
    }

    @Override
    public VkPipelineStageFlagBits getVk(){
        return (VkPipelineStageFlagBits) super.getVk();
    }

    public VulkanPipelineStageFlagBits(int value){
        super(new VkPipelineStageFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == TOP_OF_PIPE) s += "TOP_OF_PIPE";
        if(getValue() == DRAW_INDIRECT) s += "DRAW_INDIRECT";
        if(getValue() == VERTEX_INPUT) s += "VERTEX_INPUT";
        if(getValue() == VERTEX_SHADER) s += "VERTEX_SHADER";
        if(getValue() == TESSELLATION_CONTROL_SHADER) s += "TESSELLATION_CONTROL_SHADER";
        if(getValue() == TESSELLATION_EVALUATION_SHADER) s += "TESSELLATION_EVALUATION_SHADER";
        if(getValue() == GEOMETRY_SHADER) s += "GEOMETRY_SHADER";
        if(getValue() == FRAGMENT_SHADER) s += "FRAGMENT_SHADER";
        if(getValue() == EARLY_FRAGMENT_TESTS) s += "EARLY_FRAGMENT_TESTS";
        if(getValue() == LATE_FRAGMENT_TESTS) s += "LATE_FRAGMENT_TESTS";
        if(getValue() == COLOR_ATTACHMENT_OUTPUT) s += "COLOR_ATTACHMENT_OUTPUT";
        if(getValue() == COMPUTE_SHADER) s += "COMPUTE_SHADER";
        if(getValue() == TRANSFER) s += "TRANSFER";
        if(getValue() == BOTTOM_OF_PIPE) s += "BOTTOM_OF_PIPE";
        if(getValue() == HOST) s += "HOST";
        if(getValue() == ALL_GRAPHICS) s += "ALL_GRAPHICS";
        if(getValue() == ALL_COMMANDS) s += "ALL_COMMANDS";
        if(getValue() == COMMAND_PROCESS_NVX) s += "COMMAND_PROCESS_NVX";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanPipelineStageFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineStageFlagBits> {
        public Array(VkPipelineStageFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineStageFlagBits.Array(count));
        }

        public Array(int count, VulkanPipelineStageFlagBits o){
            this(new VkPipelineStageFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineStageFlagBits.Array getVk(){
            return (VkPipelineStageFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineStageFlagBits get(int i){
            return new VulkanPipelineStageFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineStageFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineStageFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineStageFlagBits.Pointer(value));
        }

        @Override
        public VkPipelineStageFlagBits.Pointer getVk(){
            return (VkPipelineStageFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineStageFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineStageFlagBits.Pointer> {
            public Array(int count) {
                super(new VkPipelineStageFlagBits.Pointer.Array(count));
            }

            public Array(VulkanPipelineStageFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineStageFlagBits.Pointer.Array getVk(){
                return (VkPipelineStageFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineStageFlagBits.Pointer get(int i){
                return new VulkanPipelineStageFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
