package cz.mg.vulkan.enums;

import cz.mg.vulkan.jna.enums.VkPhysicalDeviceType;


public enum VulkanPhysicalDeviceType {
    OTHER,
    INTEGRATED_GPU,
    DISCRETE_GPU,
    VIRTUAL_GPU,
    CPU;

    public static VulkanPhysicalDeviceType fromNativeEnum(VkPhysicalDeviceType e){
        switch(e.value){
            case VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_OTHER: return OTHER;
            case VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU: return INTEGRATED_GPU;
            case VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU: return DISCRETE_GPU;
            case VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU: return VIRTUAL_GPU;
            case VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_CPU: return CPU;
            default: return null;
        }
    }

    public VkPhysicalDeviceType toNativeEnum(){
        switch(this){
            case OTHER: return new VkPhysicalDeviceType(VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_OTHER);
            case INTEGRATED_GPU: return new VkPhysicalDeviceType(VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU);
            case DISCRETE_GPU: return new VkPhysicalDeviceType(VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU);
            case VIRTUAL_GPU: return new VkPhysicalDeviceType(VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU);
            case CPU: return new VkPhysicalDeviceType(VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_CPU);
            default: throw new RuntimeException();
        }
    }
}
