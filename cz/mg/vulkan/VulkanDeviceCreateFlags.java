package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDeviceCreateFlags extends VulkanFlags {
    public VulkanDeviceCreateFlags(){
        super(new VkDeviceCreateFlags());
    }

    public VulkanDeviceCreateFlags(VkDeviceCreateFlags vk){
        super(vk);
    }

    @Override
    public VkDeviceCreateFlags getVk(){
        return (VkDeviceCreateFlags) super.getVk();
    }

    public VulkanDeviceCreateFlags(int value){
        super(new VkDeviceCreateFlags(value));
    }
}
