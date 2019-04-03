package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineCoverageModulationStateCreateFlagsNV.html">khronos documentation</a>
 **/
public class VulkanPipelineCoverageModulationStateCreateFlagsNV extends VulkanFlags {
    public VulkanPipelineCoverageModulationStateCreateFlagsNV(){
        super(new VkPipelineCoverageModulationStateCreateFlagsNV());
    }

    public VulkanPipelineCoverageModulationStateCreateFlagsNV(VkPipelineCoverageModulationStateCreateFlagsNV vk){
        super(vk);
    }

    @Override
    public VkPipelineCoverageModulationStateCreateFlagsNV getVk(){
        return (VkPipelineCoverageModulationStateCreateFlagsNV) super.getVk();
    }

    public VulkanPipelineCoverageModulationStateCreateFlagsNV(int value){
        super(new VkPipelineCoverageModulationStateCreateFlagsNV(value));
    }
}
