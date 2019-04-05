package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

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
