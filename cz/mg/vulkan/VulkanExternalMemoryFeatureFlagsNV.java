package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalMemoryFeatureFlagsNV.html">khronos documentation</a>
 **/
public class VulkanExternalMemoryFeatureFlagsNV extends VulkanFlags {
    public VulkanExternalMemoryFeatureFlagsNV(){
        super(new VkExternalMemoryFeatureFlagsNV());
    }

    public VulkanExternalMemoryFeatureFlagsNV(VkExternalMemoryFeatureFlagsNV vk){
        super(vk);
    }

    @Override
    public VkExternalMemoryFeatureFlagsNV getVk(){
        return (VkExternalMemoryFeatureFlagsNV) super.getVk();
    }

    public VulkanExternalMemoryFeatureFlagsNV(int value){
        super(new VkExternalMemoryFeatureFlagsNV(value));
    }
}
