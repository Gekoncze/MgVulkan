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

    public long getValue(){
        return getVk().getValue();
    }

    public void setValue(long value){
        getVk().setValue(value);
    }
}
