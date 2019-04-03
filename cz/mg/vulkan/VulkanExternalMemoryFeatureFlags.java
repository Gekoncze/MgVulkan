package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalMemoryFeatureFlags.html">khronos documentation</a>
 **/
public class VulkanExternalMemoryFeatureFlags extends VulkanFlags {
    public VulkanExternalMemoryFeatureFlags(){
        super(new VkExternalMemoryFeatureFlags());
    }

    public VulkanExternalMemoryFeatureFlags(VkExternalMemoryFeatureFlags vk){
        super(vk);
    }

    @Override
    public VkExternalMemoryFeatureFlags getVk(){
        return (VkExternalMemoryFeatureFlags) super.getVk();
    }

    public VulkanExternalMemoryFeatureFlags(int value){
        super(new VkExternalMemoryFeatureFlags(value));
    }
}
