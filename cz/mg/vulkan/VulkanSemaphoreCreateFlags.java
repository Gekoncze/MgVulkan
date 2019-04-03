package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSemaphoreCreateFlags.html">khronos documentation</a>
 **/
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
