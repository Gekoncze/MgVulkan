package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanQueryPoolCreateFlags extends VulkanFlags {
    public VulkanQueryPoolCreateFlags(){
        super(new VkQueryPoolCreateFlags());
    }

    public VulkanQueryPoolCreateFlags(VkQueryPoolCreateFlags vk){
        super(vk);
    }

    @Override
    public VkQueryPoolCreateFlags getVk(){
        return (VkQueryPoolCreateFlags) super.getVk();
    }

    public VulkanQueryPoolCreateFlags(int value){
        super(new VkQueryPoolCreateFlags(value));
    }
}
