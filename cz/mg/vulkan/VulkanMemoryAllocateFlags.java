package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkMemoryAllocateFlags.html">khronos documentation</a>
 **/
public class VulkanMemoryAllocateFlags extends VulkanFlags {
    public VulkanMemoryAllocateFlags(){
        super(new VkMemoryAllocateFlags());
    }

    public VulkanMemoryAllocateFlags(VkMemoryAllocateFlags vk){
        super(vk);
    }

    @Override
    public VkMemoryAllocateFlags getVk(){
        return (VkMemoryAllocateFlags) super.getVk();
    }

    public VulkanMemoryAllocateFlags(int value){
        super(new VkMemoryAllocateFlags(value));
    }
}
