package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkShaderStageFlagBits.html">khronos documentation</a>
 **/
public class VulkanShaderStageFlagBits extends VulkanFlagBits {
    public static final int VERTEX = VkShaderStageFlagBits.VK_SHADER_STAGE_VERTEX_BIT;
    public static final int TESSELLATION_CONTROL = VkShaderStageFlagBits.VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT;
    public static final int TESSELLATION_EVALUATION = VkShaderStageFlagBits.VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT;
    public static final int GEOMETRY = VkShaderStageFlagBits.VK_SHADER_STAGE_GEOMETRY_BIT;
    public static final int FRAGMENT = VkShaderStageFlagBits.VK_SHADER_STAGE_FRAGMENT_BIT;
    public static final int COMPUTE = VkShaderStageFlagBits.VK_SHADER_STAGE_COMPUTE_BIT;
    public static final int ALL_GRAPHICS = VkShaderStageFlagBits.VK_SHADER_STAGE_ALL_GRAPHICS;
    public static final int ALL = VkShaderStageFlagBits.VK_SHADER_STAGE_ALL;

    public VulkanShaderStageFlagBits(){
        super(new VkShaderStageFlagBits());
    }

    public VulkanShaderStageFlagBits(VkShaderStageFlagBits vk){
        super(vk);
    }

    @Override
    public VkShaderStageFlagBits getVk(){
        return (VkShaderStageFlagBits) super.getVk();
    }

    public VulkanShaderStageFlagBits(int value){
        super(new VkShaderStageFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VERTEX) s += "VERTEX";
        if(getValue() == TESSELLATION_CONTROL) s += "TESSELLATION_CONTROL";
        if(getValue() == TESSELLATION_EVALUATION) s += "TESSELLATION_EVALUATION";
        if(getValue() == GEOMETRY) s += "GEOMETRY";
        if(getValue() == FRAGMENT) s += "FRAGMENT";
        if(getValue() == COMPUTE) s += "COMPUTE";
        if(getValue() == ALL_GRAPHICS) s += "ALL_GRAPHICS";
        if(getValue() == ALL) s += "ALL";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanShaderStageFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanShaderStageFlagBits> {
        public Array(VkShaderStageFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkShaderStageFlagBits.Array(count));
        }

        public Array(int count, VulkanShaderStageFlagBits o){
            this(new VkShaderStageFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkShaderStageFlagBits.Array getVk(){
            return (VkShaderStageFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanShaderStageFlagBits get(int i){
            return new VulkanShaderStageFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkShaderStageFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkShaderStageFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkShaderStageFlagBits.Pointer(value));
        }

        @Override
        public VkShaderStageFlagBits.Pointer getVk(){
            return (VkShaderStageFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanShaderStageFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanShaderStageFlagBits.Pointer> {
            public Array(int count) {
                super(new VkShaderStageFlagBits.Pointer.Array(count));
            }

            public Array(VulkanShaderStageFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkShaderStageFlagBits.Pointer.Array getVk(){
                return (VkShaderStageFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanShaderStageFlagBits.Pointer get(int i){
                return new VulkanShaderStageFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
