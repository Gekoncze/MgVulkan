package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceQueueCreateFlags.html">khronos documentation</a>
 **/
public class VulkanDeviceQueueCreateFlags extends VulkanFlags {
    public VulkanDeviceQueueCreateFlags(){
        super(new VkDeviceQueueCreateFlags());
    }

    public VulkanDeviceQueueCreateFlags(VkDeviceQueueCreateFlags vk){
        super(vk);
    }

    @Override
    public VkDeviceQueueCreateFlags getVk(){
        return (VkDeviceQueueCreateFlags) super.getVk();
    }

    public VulkanDeviceQueueCreateFlags(int value){
        super(new VkDeviceQueueCreateFlags(value));
    }
}
