package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanQueryControlFlags extends VulkanFlags {
    public VulkanQueryControlFlags(){
        super(new VkQueryControlFlags());
    }

    public VulkanQueryControlFlags(VkQueryControlFlags vk){
        super(vk);
    }

    @Override
    public VkQueryControlFlags getVk(){
        return (VkQueryControlFlags) super.getVk();
    }

    public VulkanQueryControlFlags(int value){
        super(new VkQueryControlFlags(value));
    }
}
