package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanExternalSemaphoreHandleTypeFlags extends VulkanFlags {
    public VulkanExternalSemaphoreHandleTypeFlags(){
        super(new VkExternalSemaphoreHandleTypeFlags());
    }

    public VulkanExternalSemaphoreHandleTypeFlags(VkExternalSemaphoreHandleTypeFlags vk){
        super(vk);
    }

    @Override
    public VkExternalSemaphoreHandleTypeFlags getVk(){
        return (VkExternalSemaphoreHandleTypeFlags) super.getVk();
    }

    public VulkanExternalSemaphoreHandleTypeFlags(int value){
        super(new VkExternalSemaphoreHandleTypeFlags(value));
    }
}
