package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPipelineDiscardRectangleStateCreateFlagsEXT extends VulkanFlags {
    public VulkanPipelineDiscardRectangleStateCreateFlagsEXT(){
        super(new VkPipelineDiscardRectangleStateCreateFlagsEXT());
    }

    public VulkanPipelineDiscardRectangleStateCreateFlagsEXT(VkPipelineDiscardRectangleStateCreateFlagsEXT vk){
        super(vk);
    }

    @Override
    public VkPipelineDiscardRectangleStateCreateFlagsEXT getVk(){
        return (VkPipelineDiscardRectangleStateCreateFlagsEXT) super.getVk();
    }

    public VulkanPipelineDiscardRectangleStateCreateFlagsEXT(int value){
        super(new VkPipelineDiscardRectangleStateCreateFlagsEXT(value));
    }
}
