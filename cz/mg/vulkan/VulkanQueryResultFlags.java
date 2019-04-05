package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanQueryResultFlags extends VulkanFlags {
    public VulkanQueryResultFlags(){
        super(new VkQueryResultFlags());
    }

    public VulkanQueryResultFlags(VkQueryResultFlags vk){
        super(vk);
    }

    @Override
    public VkQueryResultFlags getVk(){
        return (VkQueryResultFlags) super.getVk();
    }

    public VulkanQueryResultFlags(int value){
        super(new VkQueryResultFlags(value));
    }
}
