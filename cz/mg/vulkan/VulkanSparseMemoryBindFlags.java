package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSparseMemoryBindFlags.html">khronos documentation</a>
 **/
public class VulkanSparseMemoryBindFlags extends VulkanFlags {
    public VulkanSparseMemoryBindFlags(){
        super(new VkSparseMemoryBindFlags());
    }

    public VulkanSparseMemoryBindFlags(VkSparseMemoryBindFlags vk){
        super(vk);
    }

    @Override
    public VkSparseMemoryBindFlags getVk(){
        return (VkSparseMemoryBindFlags) super.getVk();
    }

    public VulkanSparseMemoryBindFlags(int value){
        super(new VkSparseMemoryBindFlags(value));
    }
}
