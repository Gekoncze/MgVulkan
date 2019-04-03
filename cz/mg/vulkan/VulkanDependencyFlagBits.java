package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDependencyFlagBits.html">khronos documentation</a>
 **/
public class VulkanDependencyFlagBits extends VulkanFlagBits {
    public static final int BY_REGION = VkDependencyFlagBits.VK_DEPENDENCY_BY_REGION_BIT;
    public static final int DEVICE_GROUP = VkDependencyFlagBits.VK_DEPENDENCY_DEVICE_GROUP_BIT;
    public static final int VIEW_LOCAL = VkDependencyFlagBits.VK_DEPENDENCY_VIEW_LOCAL_BIT;
    public static final int VIEW_LOCAL_KHR = VkDependencyFlagBits.VK_DEPENDENCY_VIEW_LOCAL_BIT_KHR;
    public static final int DEVICE_GROUP_KHR = VkDependencyFlagBits.VK_DEPENDENCY_DEVICE_GROUP_BIT_KHR;

    public VulkanDependencyFlagBits(){
        super(new VkDependencyFlagBits());
    }

    public VulkanDependencyFlagBits(VkDependencyFlagBits vk){
        super(vk);
    }

    @Override
    public VkDependencyFlagBits getVk(){
        return (VkDependencyFlagBits) super.getVk();
    }

    public VulkanDependencyFlagBits(int value){
        super(new VkDependencyFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == BY_REGION) s += "BY_REGION";
        if(getValue() == DEVICE_GROUP) s += "DEVICE_GROUP";
        if(getValue() == VIEW_LOCAL) s += "VIEW_LOCAL";
        if(getValue() == VIEW_LOCAL_KHR) s += "VIEW_LOCAL_KHR";
        if(getValue() == DEVICE_GROUP_KHR) s += "DEVICE_GROUP_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
