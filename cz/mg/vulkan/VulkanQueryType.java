package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueryType.html">khronos documentation</a>
 **/
public class VulkanQueryType extends VulkanEnum {
    public static final int OCCLUSION = VkQueryType.VK_QUERY_TYPE_OCCLUSION;
    public static final int PIPELINE_STATISTICS = VkQueryType.VK_QUERY_TYPE_PIPELINE_STATISTICS;
    public static final int TIMESTAMP = VkQueryType.VK_QUERY_TYPE_TIMESTAMP;

    public VulkanQueryType(){
        super(new VkQueryType());
    }

    public VulkanQueryType(VkQueryType vk){
        super(vk);
    }

    @Override
    public VkQueryType getVk(){
        return (VkQueryType) super.getVk();
    }

    public VulkanQueryType(int value){
        super(new VkQueryType(value));
    }

    @Override
    public String toString() {
        if(getValue() == OCCLUSION) return "OCCLUSION";
        if(getValue() == PIPELINE_STATISTICS) return "PIPELINE_STATISTICS";
        if(getValue() == TIMESTAMP) return "TIMESTAMP";
        return "UNKNOWN";
    }
}
