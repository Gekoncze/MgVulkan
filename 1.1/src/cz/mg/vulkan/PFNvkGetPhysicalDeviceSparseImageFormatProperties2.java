package cz.mg.vulkan;

public class PFNvkGetPhysicalDeviceSparseImageFormatProperties2 extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceSparseImageFormatProperties2() {
    }

    protected PFNvkGetPhysicalDeviceSparseImageFormatProperties2(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetPhysicalDeviceSparseImageFormatProperties2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetPhysicalDeviceSparseImageFormatProperties2(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceSparseImageFormatProperties2(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceSparseImageFormatProperties2"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSparseImageFormatInfo2 pFormatInfo, VkUInt32 pPropertyCount, VkSparseImageFormatProperties2 pProperties){
        callNative(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.getNullAddressNative(), pFormatInfo != null ? pFormatInfo.getVkAddress() : VkPointer.NULL, pPropertyCount != null ? pPropertyCount.getVkAddress() : VkPointer.NULL, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long physicalDevice, long pFormatInfo, long pPropertyCount, long pProperties);

}
