package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceSparseImageFormatProperties extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceSparseImageFormatProperties() {
    }

    public PFNvkGetPhysicalDeviceSparseImageFormatProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceSparseImageFormatProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceSparseImageFormatProperties(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceSparseImageFormatProperties(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceSparseImageFormatProperties"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkFormat format, VkImageType type, VkSampleCountFlagBits samples, VkImageUsageFlags usage, VkImageTiling tiling, VkUInt32 pPropertyCount, VkSparseImageFormatProperties pProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getSinkAddress(), format != null ? format.getVkAddress() : VkPointer.getSinkAddress(), type != null ? type.getVkAddress() : VkPointer.getSinkAddress(), samples != null ? samples.getVkAddress() : VkPointer.getSinkAddress(), usage != null ? usage.getVkAddress() : VkPointer.getSinkAddress(), tiling != null ? tiling.getVkAddress() : VkPointer.getSinkAddress(), pPropertyCount != null ? pPropertyCount.getVkAddress() : VkPointer.NULL, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long format, long type, long samples, long usage, long tiling, long pPropertyCount, long pProperties);
}
