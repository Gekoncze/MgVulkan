package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceSparseImageFormatProperties2KHR.html">khronos documentation</a>
 **/
public class PFNvkGetPhysicalDeviceSparseImageFormatProperties2KHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceSparseImageFormatProperties2KHR() {
    }

    public PFNvkGetPhysicalDeviceSparseImageFormatProperties2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceSparseImageFormatProperties2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceSparseImageFormatProperties2KHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceSparseImageFormatProperties2KHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceSparseImageFormatProperties2KHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSparseImageFormatInfo2 pFormatInfo, VkUInt32 pPropertyCount, VkSparseImageFormatProperties2 pProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPhysicalDevice.NULL.getVkAddress(), pFormatInfo != null ? pFormatInfo.getVkAddress() : VkPointer.NULL, pPropertyCount != null ? pPropertyCount.getVkAddress() : VkPointer.NULL, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long pFormatInfo, long pPropertyCount, long pProperties);
}
