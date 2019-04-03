package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineCoverageToColorStateCreateFlagsNV.html">khronos documentation</a>
 **/
public class VulkanPipelineCoverageToColorStateCreateFlagsNV extends VulkanFlags {
    public VulkanPipelineCoverageToColorStateCreateFlagsNV(){
        super(new VkPipelineCoverageToColorStateCreateFlagsNV());
    }

    public VulkanPipelineCoverageToColorStateCreateFlagsNV(VkPipelineCoverageToColorStateCreateFlagsNV vk){
        super(vk);
    }

    @Override
    public VkPipelineCoverageToColorStateCreateFlagsNV getVk(){
        return (VkPipelineCoverageToColorStateCreateFlagsNV) super.getVk();
    }

    public VulkanPipelineCoverageToColorStateCreateFlagsNV(int value){
        super(new VkPipelineCoverageToColorStateCreateFlagsNV(value));
    }
}
