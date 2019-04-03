package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceCreateFlags.html">khronos documentation</a>
 **/
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
