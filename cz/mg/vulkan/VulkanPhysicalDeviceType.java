package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceType.html">khronos documentation</a>
 **/
public class VulkanPhysicalDeviceType extends VulkanEnum {
    public static final int OTHER = VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_OTHER;
    public static final int INTEGRATED_GPU = VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU;
    public static final int DISCRETE_GPU = VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU;
    public static final int VIRTUAL_GPU = VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU;
    public static final int CPU = VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_CPU;

    public VulkanPhysicalDeviceType(){
        super(new VkPhysicalDeviceType());
    }

    public VulkanPhysicalDeviceType(VkPhysicalDeviceType vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceType getVk(){
        return (VkPhysicalDeviceType) super.getVk();
    }

    public VulkanPhysicalDeviceType(int value){
        super(new VkPhysicalDeviceType(value));
    }

    @Override
    public String toString() {
        if(getValue() == OTHER) return "OTHER";
        if(getValue() == INTEGRATED_GPU) return "INTEGRATED_GPU";
        if(getValue() == DISCRETE_GPU) return "DISCRETE_GPU";
        if(getValue() == VIRTUAL_GPU) return "VIRTUAL_GPU";
        if(getValue() == CPU) return "CPU";
        return "UNKNOWN";
    }
}
