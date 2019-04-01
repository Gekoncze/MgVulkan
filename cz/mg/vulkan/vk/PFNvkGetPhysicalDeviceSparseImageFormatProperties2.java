package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceSparseImageFormatProperties2.html">khronos documentation</a>
 **/
public class PFNvkGetPhysicalDeviceSparseImageFormatProperties2 extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceSparseImageFormatProperties2() {
    }

    public PFNvkGetPhysicalDeviceSparseImageFormatProperties2(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceSparseImageFormatProperties2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceSparseImageFormatProperties2(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceSparseImageFormatProperties2(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceSparseImageFormatProperties2"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceSparseImageFormatInfo2 pFormatInfo, VkUInt32 pPropertyCount, VkSparseImageFormatProperties2 pProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.NULL_ADDRESS, pFormatInfo != null ? pFormatInfo.getVkAddress() : VkPointer.NULL, pPropertyCount != null ? pPropertyCount.getVkAddress() : VkPointer.NULL, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long pFormatInfo, long pPropertyCount, long pProperties);
}
