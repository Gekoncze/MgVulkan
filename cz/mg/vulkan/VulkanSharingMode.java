package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSharingMode extends VulkanEnum {
    public static final int EXCLUSIVE = VkSharingMode.VK_SHARING_MODE_EXCLUSIVE;
    public static final int CONCURRENT = VkSharingMode.VK_SHARING_MODE_CONCURRENT;

    public VulkanSharingMode(){
        super(new VkSharingMode());
    }

    public VulkanSharingMode(VkSharingMode vk){
        super(vk);
    }

    @Override
    public VkSharingMode getVk(){
        return (VkSharingMode) super.getVk();
    }

    public VulkanSharingMode(int value){
        super(new VkSharingMode(value));
    }

    @Override
    public String toString() {
        if(getValue() == EXCLUSIVE) return "EXCLUSIVE";
        if(getValue() == CONCURRENT) return "CONCURRENT";
        return "UNKNOWN";
    }
}
