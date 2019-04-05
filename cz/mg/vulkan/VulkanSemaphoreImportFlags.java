package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

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
