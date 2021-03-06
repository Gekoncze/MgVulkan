package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceSparseImageFormatProperties2KHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceSparseImageFormatProperties2KHR() {
    }

    protected PFNvkGetPhysicalDeviceSparseImageFormatProperties2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceSparseImageFormatProperties2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceSparseImageFormatProperties2KHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceSparseImageFormatProperties2KHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceSparseImageFormatProperties2KHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSparseImageFormatInfo2 pFormatInfo, VkUInt32 pPropertyCount, VkSparseImageFormatProperties2 pProperties){
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pFormatInfo != null ? pFormatInfo.getVkAddress() : VkPointer.NULL, pPropertyCount != null ? pPropertyCount.getVkAddress() : VkPointer.NULL, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long physicalDevice, long pFormatInfo, long pPropertyCount, long pProperties);

}
