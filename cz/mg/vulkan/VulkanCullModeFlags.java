package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCullModeFlags.html">khronos documentation</a>
 **/
public class VulkanCullModeFlags extends VulkanFlags {
    public VulkanCullModeFlags(){
        super(new VkCullModeFlags());
    }

    public VulkanCullModeFlags(VkCullModeFlags vk){
        super(vk);
    }

    @Override
    public VkCullModeFlags getVk(){
        return (VkCullModeFlags) super.getVk();
    }

    public VulkanCullModeFlags(int value){
        super(new VkCullModeFlags(value));
    }
}
