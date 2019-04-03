package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkMemoryHeapFlags.html">khronos documentation</a>
 **/
public class VulkanMemoryHeapFlags extends VulkanFlags {
    public VulkanMemoryHeapFlags(){
        super(new VkMemoryHeapFlags());
    }

    public VulkanMemoryHeapFlags(VkMemoryHeapFlags vk){
        super(vk);
    }

    @Override
    public VkMemoryHeapFlags getVk(){
        return (VkMemoryHeapFlags) super.getVk();
    }

    public VulkanMemoryHeapFlags(int value){
        super(new VkMemoryHeapFlags(value));
    }
}
