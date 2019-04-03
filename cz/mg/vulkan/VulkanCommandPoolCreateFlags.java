package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCommandPoolCreateFlags.html">khronos documentation</a>
 **/
public class VulkanCommandPoolCreateFlags extends VulkanFlags {
    public VulkanCommandPoolCreateFlags(){
        super(new VkCommandPoolCreateFlags());
    }

    public VulkanCommandPoolCreateFlags(VkCommandPoolCreateFlags vk){
        super(vk);
    }

    @Override
    public VkCommandPoolCreateFlags getVk(){
        return (VkCommandPoolCreateFlags) super.getVk();
    }

    public VulkanCommandPoolCreateFlags(int value){
        super(new VkCommandPoolCreateFlags(value));
    }
}
