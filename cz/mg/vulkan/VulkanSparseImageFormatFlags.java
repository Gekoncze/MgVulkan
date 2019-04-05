package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSparseImageFormatFlags extends VulkanFlags {
    public VulkanSparseImageFormatFlags(){
        super(new VkSparseImageFormatFlags());
    }

    public VulkanSparseImageFormatFlags(VkSparseImageFormatFlags vk){
        super(vk);
    }

    @Override
    public VkSparseImageFormatFlags getVk(){
        return (VkSparseImageFormatFlags) super.getVk();
    }

    public VulkanSparseImageFormatFlags(int value){
        super(new VkSparseImageFormatFlags(value));
    }
}
