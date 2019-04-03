package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanObject {
    private final VkObject vk;

    public VulkanObject(VkObject vk){
        this.vk = vk;
    }

    public VkObject getVk(){
        return vk;
    }

    @Override
    public String toString(){
        return vk.toString();
    }
}
