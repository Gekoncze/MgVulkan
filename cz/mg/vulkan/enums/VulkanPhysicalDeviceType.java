package cz.mg.vulkan.enums;

import cz.mg.vulkan.jna.enums.VkPhysicalDeviceType;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanPhysicalDeviceType {
    public static final int OTHER = VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_OTHER;
    public static final int INTEGRATED_GPU = VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU;
    public static final int DISCRETE_GPU = VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU;
    public static final int VIRTUAL_GPU = VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU;
    public static final int CPU = VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_CPU;

    public final VkPhysicalDeviceType enums;

    public VulkanPhysicalDeviceType() {
        this(0);
    }

    public VulkanPhysicalDeviceType(int value) {
        this(new VkPhysicalDeviceType(value));
    }

    public VulkanPhysicalDeviceType(VkPhysicalDeviceType enums) {
        this.enums = enums;
    }

    public boolean is(int value){
        return this.enums.value == value;
    }

    public void set(int value){
        this.enums.value = value;
    }

    @Override
    public String toString() {
        return ToString.constantToString(enums.value, VkPhysicalDeviceType.class);
    }
}
