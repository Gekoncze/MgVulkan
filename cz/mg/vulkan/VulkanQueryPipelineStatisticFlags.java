package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

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
