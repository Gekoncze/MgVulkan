package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPeerMemoryFeatureFlags.html">khronos documentation</a>
 **/
public class VulkanPeerMemoryFeatureFlags extends VulkanFlags {
    public VulkanPeerMemoryFeatureFlags(){
        super(new VkPeerMemoryFeatureFlags());
    }

    public VulkanPeerMemoryFeatureFlags(VkPeerMemoryFeatureFlags vk){
        super(vk);
    }

    @Override
    public VkPeerMemoryFeatureFlags getVk(){
        return (VkPeerMemoryFeatureFlags) super.getVk();
    }

    public VulkanPeerMemoryFeatureFlags(int value){
        super(new VkPeerMemoryFeatureFlags(value));
    }
}
