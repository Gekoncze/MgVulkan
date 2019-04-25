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
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), format != null ? format.getVkAddress() : VkPointer.getNullAddressNative(), type != null ? type.getVkAddress() : VkPointer.getNullAddressNative(), samples != null ? samples.getVkAddress() : VkPointer.getNullAddressNative(), usage != null ? usage.getVkAddress() : VkPointer.getNullAddressNative(), tiling != null ? tiling.getVkAddress() : VkPointer.getNullAddressNative(), pPropertyCount != null ? pPropertyCount.getVkAddress() : VkPointer.NULL, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long physicalDevice, long format, long type, long samples, long usage, long tiling, long pPropertyCount, long pProperties);
}
