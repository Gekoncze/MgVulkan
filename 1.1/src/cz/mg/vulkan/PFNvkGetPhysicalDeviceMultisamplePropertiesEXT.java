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
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), samples != null ? samples.getVkAddress() : VkPointer.getNullAddressNative(), pMultisampleProperties != null ? pMultisampleProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long physicalDevice, long samples, long pMultisampleProperties);


    public void call(VkPhysicalDevice physicalDevice, int samples, VkMultisamplePropertiesEXT pMultisampleProperties){
        callSimplifiedNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), samples, pMultisampleProperties != null ? pMultisampleProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callSimplifiedNative(long vkaddress, long physicalDevice, int samples, long pMultisampleProperties);

}
