package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanInstanceCreateFlags extends VulkanFlags {
    public VulkanInstanceCreateFlags(){
        super(new VkInstanceCreateFlags());
    }

    public VulkanInstanceCreateFlags(VkInstanceCreateFlags vk){
        super(vk);
    }

    @Override
    public VkInstanceCreateFlags getVk(){
        return (VkInstanceCreateFlags) super.getVk();
    }

    public VulkanInstanceCreateFlags(int value){
        super(new VkInstanceCreateFlags(value));
    }
}
