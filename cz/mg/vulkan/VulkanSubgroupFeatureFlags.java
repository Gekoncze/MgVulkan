package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSubgroupFeatureFlags.html">khronos documentation</a>
 **/
public class VulkanSubgroupFeatureFlags extends VulkanFlags {
    public VulkanSubgroupFeatureFlags(){
        super(new VkSubgroupFeatureFlags());
    }

    public VulkanSubgroupFeatureFlags(VkSubgroupFeatureFlags vk){
        super(vk);
    }

    @Override
    public VkSubgroupFeatureFlags getVk(){
        return (VkSubgroupFeatureFlags) super.getVk();
    }

    public VulkanSubgroupFeatureFlags(int value){
        super(new VkSubgroupFeatureFlags(value));
    }
}
