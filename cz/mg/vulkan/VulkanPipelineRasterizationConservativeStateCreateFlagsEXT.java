package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPipelineRasterizationConservativeStateCreateFlagsEXT extends VulkanFlags {
    public VulkanPipelineRasterizationConservativeStateCreateFlagsEXT(){
        super(new VkPipelineRasterizationConservativeStateCreateFlagsEXT());
    }

    public VulkanPipelineRasterizationConservativeStateCreateFlagsEXT(VkPipelineRasterizationConservativeStateCreateFlagsEXT vk){
        super(vk);
    }

    @Override
    public VkPipelineRasterizationConservativeStateCreateFlagsEXT getVk(){
        return (VkPipelineRasterizationConservativeStateCreateFlagsEXT) super.getVk();
    }

    public VulkanPipelineRasterizationConservativeStateCreateFlagsEXT(int value){
        super(new VkPipelineRasterizationConservativeStateCreateFlagsEXT(value));
    }
}
