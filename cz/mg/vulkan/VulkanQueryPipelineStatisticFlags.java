package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueryPipelineStatisticFlags.html">khronos documentation</a>
 **/
public class VulkanQueryPipelineStatisticFlags extends VulkanFlags {
    public VulkanQueryPipelineStatisticFlags(){
        super(new VkQueryPipelineStatisticFlags());
    }

    public VulkanQueryPipelineStatisticFlags(VkQueryPipelineStatisticFlags vk){
        super(vk);
    }

    @Override
    public VkQueryPipelineStatisticFlags getVk(){
        return (VkQueryPipelineStatisticFlags) super.getVk();
    }

    public VulkanQueryPipelineStatisticFlags(int value){
        super(new VkQueryPipelineStatisticFlags(value));
    }
}
