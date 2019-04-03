package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCommandPoolResetFlags.html">khronos documentation</a>
 **/
public class VulkanCommandPoolResetFlags extends VulkanFlags {
    public VulkanCommandPoolResetFlags(){
        super(new VkCommandPoolResetFlags());
    }

    public VulkanCommandPoolResetFlags(VkCommandPoolResetFlags vk){
        super(vk);
    }

    @Override
    public VkCommandPoolResetFlags getVk(){
        return (VkCommandPoolResetFlags) super.getVk();
    }

    public VulkanCommandPoolResetFlags(int value){
        super(new VkCommandPoolResetFlags(value));
    }
}
