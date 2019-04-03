package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceQueueCreateFlagBits.html">khronos documentation</a>
 **/
public class VulkanDeviceQueueCreateFlagBits extends VulkanFlagBits {
    public static final int PROTECTED = VkDeviceQueueCreateFlagBits.VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT;

    public VulkanDeviceQueueCreateFlagBits(){
        super(new VkDeviceQueueCreateFlagBits());
    }

    public VulkanDeviceQueueCreateFlagBits(VkDeviceQueueCreateFlagBits vk){
        super(vk);
    }

    @Override
    public VkDeviceQueueCreateFlagBits getVk(){
        return (VkDeviceQueueCreateFlagBits) super.getVk();
    }

    public VulkanDeviceQueueCreateFlagBits(int value){
        super(new VkDeviceQueueCreateFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == PROTECTED) s += "PROTECTED";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
