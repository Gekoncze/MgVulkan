package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanFenceCreateFlags extends VulkanFlags {
    public VulkanFenceCreateFlags(){
        super(new VkFenceCreateFlags());
    }

    public VulkanFenceCreateFlags(VkFenceCreateFlags vk){
        super(vk);
    }

    @Override
    public VkFenceCreateFlags getVk(){
        return (VkFenceCreateFlags) super.getVk();
    }

    public VulkanFenceCreateFlags(int value){
        super(new VkFenceCreateFlags(value));
    }
}
