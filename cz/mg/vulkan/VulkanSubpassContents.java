package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSubpassContents extends VulkanEnum {
    public static final int INLINE = VkSubpassContents.VK_SUBPASS_CONTENTS_INLINE;
    public static final int SECONDARY_COMMAND_BUFFERS = VkSubpassContents.VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS;

    public VulkanSubpassContents(){
        super(new VkSubpassContents());
    }

    public VulkanSubpassContents(VkSubpassContents vk){
        super(vk);
    }

    @Override
    public VkSubpassContents getVk(){
        return (VkSubpassContents) super.getVk();
    }

    public VulkanSubpassContents(int value){
        super(new VkSubpassContents(value));
    }

    @Override
    public String toString() {
        if(getValue() == INLINE) return "INLINE";
        if(getValue() == SECONDARY_COMMAND_BUFFERS) return "SECONDARY_COMMAND_BUFFERS";
        return "UNKNOWN";
    }
}
