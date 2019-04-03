package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSemaphoreImportFlags.html">khronos documentation</a>
 **/
public class VulkanSemaphoreImportFlags extends VulkanFlags {
    public VulkanSemaphoreImportFlags(){
        super(new VkSemaphoreImportFlags());
    }

    public VulkanSemaphoreImportFlags(VkSemaphoreImportFlags vk){
        super(vk);
    }

    @Override
    public VkSemaphoreImportFlags getVk(){
        return (VkSemaphoreImportFlags) super.getVk();
    }

    public VulkanSemaphoreImportFlags(int value){
        super(new VkSemaphoreImportFlags(value));
    }
}
