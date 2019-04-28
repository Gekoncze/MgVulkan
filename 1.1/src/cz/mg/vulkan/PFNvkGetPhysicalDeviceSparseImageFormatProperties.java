package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceSparseImageFormatProperties extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceSparseImageFormatProperties() {
    }

    protected PFNvkGetPhysicalDeviceSparseImageFormatProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceSparseImageFormatProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceSparseImageFormatProperties(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceSparseImageFormatProperties(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceSparseImageFormatProperties"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkFormat format, VkImageType type, VkSampleCountFlagBits samples, VkImageUsageFlags usage, VkImageTiling tiling, VkUInt32 pPropertyCount, VkSparseImageFormatProperties pProperties){
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), format != null ? format.getVkAddress() : VkPointer.getNullAddressNative(), type != null ? type.getVkAddress() : VkPointer.getNullAddressNative(), samples != null ? samples.getVkAddress() : VkPointer.getNullAddressNative(), usage != null ? usage.getVkAddress() : VkPointer.getNullAddressNative(), tiling != null ? tiling.getVkAddress() : VkPointer.getNullAddressNative(), pPropertyCount != null ? pPropertyCount.getVkAddress() : VkPointer.NULL, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long physicalDevice, long format, long type, long samples, long usage, long tiling, long pPropertyCount, long pProperties);


    public void call(VkPhysicalDevice physicalDevice, int format, int type, int samples, int usage, int tiling, VkUInt32 pPropertyCount, VkSparseImageFormatProperties pProperties){
        callSimplifiedNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), format, type, samples, usage, tiling, pPropertyCount != null ? pPropertyCount.getVkAddress() : VkPointer.NULL, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callSimplifiedNative(long vkaddress, long physicalDevice, int format, int type, int samples, int usage, int tiling, long pPropertyCount, long pProperties);

}
