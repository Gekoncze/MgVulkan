package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSampleCountFlags extends VulkanFlags {
    public VulkanSampleCountFlags(){
        super(new VkSampleCountFlags());
    }

    public VulkanSampleCountFlags(VkSampleCountFlags vk){
        super(vk);
    }

    @Override
    public VkSampleCountFlags getVk(){
        return (VkSampleCountFlags) super.getVk();
    }

    public VulkanSampleCountFlags(int value){
        super(new VkSampleCountFlags(value));
    }
}
