package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueryPipelineStatisticFlagBits.html">khronos documentation</a>
 **/
public class VulkanQueryPipelineStatisticFlagBits extends VulkanFlagBits {
    public static final int INPUT_ASSEMBLY_VERTICES = VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT;
    public static final int INPUT_ASSEMBLY_PRIMITIVES = VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT;
    public static final int VERTEX_SHADER_INVOCATIONS = VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT;
    public static final int GEOMETRY_SHADER_INVOCATIONS = VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT;
    public static final int GEOMETRY_SHADER_PRIMITIVES = VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT;
    public static final int CLIPPING_INVOCATIONS = VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT;
    public static final int CLIPPING_PRIMITIVES = VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT;
    public static final int FRAGMENT_SHADER_INVOCATIONS = VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT;
    public static final int TESSELLATION_CONTROL_SHADER_PATCHES = VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT;
    public static final int TESSELLATION_EVALUATION_SHADER_INVOCATIONS = VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT;
    public static final int COMPUTE_SHADER_INVOCATIONS = VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT;

    public VulkanQueryPipelineStatisticFlagBits(){
        super(new VkQueryPipelineStatisticFlagBits());
    }

    public VulkanQueryPipelineStatisticFlagBits(VkQueryPipelineStatisticFlagBits vk){
        super(vk);
    }

    @Override
    public VkQueryPipelineStatisticFlagBits getVk(){
        return (VkQueryPipelineStatisticFlagBits) super.getVk();
    }

    public VulkanQueryPipelineStatisticFlagBits(int value){
        super(new VkQueryPipelineStatisticFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == INPUT_ASSEMBLY_VERTICES) s += "INPUT_ASSEMBLY_VERTICES";
        if(getValue() == INPUT_ASSEMBLY_PRIMITIVES) s += "INPUT_ASSEMBLY_PRIMITIVES";
        if(getValue() == VERTEX_SHADER_INVOCATIONS) s += "VERTEX_SHADER_INVOCATIONS";
        if(getValue() == GEOMETRY_SHADER_INVOCATIONS) s += "GEOMETRY_SHADER_INVOCATIONS";
        if(getValue() == GEOMETRY_SHADER_PRIMITIVES) s += "GEOMETRY_SHADER_PRIMITIVES";
        if(getValue() == CLIPPING_INVOCATIONS) s += "CLIPPING_INVOCATIONS";
        if(getValue() == CLIPPING_PRIMITIVES) s += "CLIPPING_PRIMITIVES";
        if(getValue() == FRAGMENT_SHADER_INVOCATIONS) s += "FRAGMENT_SHADER_INVOCATIONS";
        if(getValue() == TESSELLATION_CONTROL_SHADER_PATCHES) s += "TESSELLATION_CONTROL_SHADER_PATCHES";
        if(getValue() == TESSELLATION_EVALUATION_SHADER_INVOCATIONS) s += "TESSELLATION_EVALUATION_SHADER_INVOCATIONS";
        if(getValue() == COMPUTE_SHADER_INVOCATIONS) s += "COMPUTE_SHADER_INVOCATIONS";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanQueryPipelineStatisticFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanQueryPipelineStatisticFlagBits> {
        public Array(VkQueryPipelineStatisticFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkQueryPipelineStatisticFlagBits.Array(count));
        }

        public Array(int count, VulkanQueryPipelineStatisticFlagBits o){
            this(new VkQueryPipelineStatisticFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkQueryPipelineStatisticFlagBits.Array getVk(){
            return (VkQueryPipelineStatisticFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanQueryPipelineStatisticFlagBits get(int i){
            return new VulkanQueryPipelineStatisticFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkQueryPipelineStatisticFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkQueryPipelineStatisticFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkQueryPipelineStatisticFlagBits.Pointer(value));
        }

        @Override
        public VkQueryPipelineStatisticFlagBits.Pointer getVk(){
            return (VkQueryPipelineStatisticFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanQueryPipelineStatisticFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanQueryPipelineStatisticFlagBits.Pointer> {
            public Array(int count) {
                super(new VkQueryPipelineStatisticFlagBits.Pointer.Array(count));
            }

            public Array(VulkanQueryPipelineStatisticFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkQueryPipelineStatisticFlagBits.Pointer.Array getVk(){
                return (VkQueryPipelineStatisticFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanQueryPipelineStatisticFlagBits.Pointer get(int i){
                return new VulkanQueryPipelineStatisticFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
