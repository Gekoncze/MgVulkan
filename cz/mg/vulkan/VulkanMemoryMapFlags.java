package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkMemoryMapFlags.html">khronos documentation</a>
 **/
public class VulkanMemoryMapFlags extends VulkanFlags {
    public VulkanMemoryMapFlags(){
        super(new VkMemoryMapFlags());
    }

    public VulkanMemoryMapFlags(VkMemoryMapFlags vk){
        super(vk);
    }

    @Override
    public VkMemoryMapFlags getVk(){
        return (VkMemoryMapFlags) super.getVk();
    }

    public VulkanMemoryMapFlags(int value){
        super(new VkMemoryMapFlags(value));
    }
}
