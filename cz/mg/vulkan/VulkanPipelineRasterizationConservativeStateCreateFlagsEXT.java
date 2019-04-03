package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineRasterizationConservativeStateCreateFlagsEXT.html">khronos documentation</a>
 **/
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
