package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

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
