package cz.mg.vulkan.vk;

public class PFNvkGetPhysicalDeviceMultisamplePropertiesEXT extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceMultisamplePropertiesEXT() {
    }

    public PFNvkGetPhysicalDeviceMultisamplePropertiesEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceMultisamplePropertiesEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceMultisamplePropertiesEXT(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceMultisamplePropertiesEXT(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceMultisamplePropertiesEXT"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkSampleCountFlagBits samples, VkMultisamplePropertiesEXT pMultisampleProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.NULL_ADDRESS, samples != null ? samples.getVkAddress() : VkPointer.NULL_ADDRESS, pMultisampleProperties != null ? pMultisampleProperties.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long samples, long pMultisampleProperties);
}
