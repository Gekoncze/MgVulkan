package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSystemAllocationScope.html">khronos documentation</a>
 **/
public class VulkanSystemAllocationScope extends VulkanEnum {
    public static final int COMMAND = VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_COMMAND;
    public static final int OBJECT = VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_OBJECT;
    public static final int CACHE = VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_CACHE;
    public static final int DEVICE = VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_DEVICE;
    public static final int INSTANCE = VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE;

    public VulkanSystemAllocationScope(){
        super(new VkSystemAllocationScope());
    }

    public VulkanSystemAllocationScope(VkSystemAllocationScope vk){
        super(vk);
    }

    @Override
    public VkSystemAllocationScope getVk(){
        return (VkSystemAllocationScope) super.getVk();
    }

    public VulkanSystemAllocationScope(int value){
        super(new VkSystemAllocationScope(value));
    }

    @Override
    public String toString() {
        if(getValue() == COMMAND) return "COMMAND";
        if(getValue() == OBJECT) return "OBJECT";
        if(getValue() == CACHE) return "CACHE";
        if(getValue() == DEVICE) return "DEVICE";
        if(getValue() == INSTANCE) return "INSTANCE";
        return "UNKNOWN";
    }
}
