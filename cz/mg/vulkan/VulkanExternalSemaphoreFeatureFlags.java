package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalSemaphoreFeatureFlags.html">khronos documentation</a>
 **/
public class VulkanExternalSemaphoreFeatureFlags extends VulkanFlags {
    public VulkanExternalSemaphoreFeatureFlags(){
        super(new VkExternalSemaphoreFeatureFlags());
    }

    public VulkanExternalSemaphoreFeatureFlags(VkExternalSemaphoreFeatureFlags vk){
        super(vk);
    }

    @Override
    public VkExternalSemaphoreFeatureFlags getVk(){
        return (VkExternalSemaphoreFeatureFlags) super.getVk();
    }

    public VulkanExternalSemaphoreFeatureFlags(int value){
        super(new VkExternalSemaphoreFeatureFlags(value));
    }
}
