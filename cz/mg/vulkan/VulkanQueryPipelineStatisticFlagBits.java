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
}
