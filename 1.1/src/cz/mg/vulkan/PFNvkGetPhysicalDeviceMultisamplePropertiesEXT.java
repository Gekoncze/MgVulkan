package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceMultisamplePropertiesEXT extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceMultisamplePropertiesEXT() {
    }

    protected PFNvkGetPhysicalDeviceMultisamplePropertiesEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceMultisamplePropertiesEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceMultisamplePropertiesEXT(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceMultisamplePropertiesEXT(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceMultisamplePropertiesEXT"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkSampleCountFlagBits samples, VkMultisamplePropertiesEXT pMultisampleProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), samples != null ? samples.getVkAddress() : VkPointer.getNullAddressNative(), pMultisampleProperties != null ? pMultisampleProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long physicalDevice, long samples, long pMultisampleProperties);
}
