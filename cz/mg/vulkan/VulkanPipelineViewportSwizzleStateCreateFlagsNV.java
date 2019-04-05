package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPipelineViewportSwizzleStateCreateFlagsNV extends VulkanFlags {
    public VulkanPipelineViewportSwizzleStateCreateFlagsNV(){
        super(new VkPipelineViewportSwizzleStateCreateFlagsNV());
    }

    public VulkanPipelineViewportSwizzleStateCreateFlagsNV(VkPipelineViewportSwizzleStateCreateFlagsNV vk){
        super(vk);
    }

    @Override
    public VkPipelineViewportSwizzleStateCreateFlagsNV getVk(){
        return (VkPipelineViewportSwizzleStateCreateFlagsNV) super.getVk();
    }

    public VulkanPipelineViewportSwizzleStateCreateFlagsNV(int value){
        super(new VkPipelineViewportSwizzleStateCreateFlagsNV(value));
    }
}
