package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public abstract class VulkanHandle extends VulkanObject {
    public VulkanHandle(VkHandle vk){
        super(vk);
    }

    @Override
    public VkHandle getVk(){
        return (VkHandle) super.getVk();
    }
}
