package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFormatFeatureFlags.html">khronos documentation</a>
 **/
public class VulkanFormatFeatureFlags extends VulkanFlags {
    public VulkanFormatFeatureFlags(){
        super(new VkFormatFeatureFlags());
    }

    public VulkanFormatFeatureFlags(VkFormatFeatureFlags vk){
        super(vk);
    }

    @Override
    public VkFormatFeatureFlags getVk(){
        return (VkFormatFeatureFlags) super.getVk();
    }

    public VulkanFormatFeatureFlags(int value){
        super(new VkFormatFeatureFlags(value));
    }
}
