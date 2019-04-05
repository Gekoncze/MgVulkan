package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSemaphoreCreateFlags extends VulkanFlags {
    public VulkanSemaphoreCreateFlags(){
        super(new VkSemaphoreCreateFlags());
    }

    public VulkanSemaphoreCreateFlags(VkSemaphoreCreateFlags vk){
        super(vk);
    }

    @Override
    public VkSemaphoreCreateFlags getVk(){
        return (VkSemaphoreCreateFlags) super.getVk();
    }

    public VulkanSemaphoreCreateFlags(int value){
        super(new VkSemaphoreCreateFlags(value));
    }
}
