package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineViewportSwizzleStateCreateFlagsNV.html">khronos documentation</a>
 **/
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
