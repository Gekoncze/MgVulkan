package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkMemoryPropertyFlags.html">khronos documentation</a>
 **/
public class VulkanMemoryPropertyFlags extends VulkanFlags {
    public VulkanMemoryPropertyFlags(){
        super(new VkMemoryPropertyFlags());
    }

    public VulkanMemoryPropertyFlags(VkMemoryPropertyFlags vk){
        super(vk);
    }

    @Override
    public VkMemoryPropertyFlags getVk(){
        return (VkMemoryPropertyFlags) super.getVk();
    }

    public VulkanMemoryPropertyFlags(int value){
        super(new VkMemoryPropertyFlags(value));
    }
}
