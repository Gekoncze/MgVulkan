package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueueFlags.html">khronos documentation</a>
 **/
public class VulkanQueueFlags extends VulkanFlags {
    public VulkanQueueFlags(){
        super(new VkQueueFlags());
    }

    public VulkanQueueFlags(VkQueueFlags vk){
        super(vk);
    }

    @Override
    public VkQueueFlags getVk(){
        return (VkQueueFlags) super.getVk();
    }

    public VulkanQueueFlags(int value){
        super(new VkQueueFlags(value));
    }
}
