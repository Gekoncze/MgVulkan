package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceFormatProperties2.html">khronos documentation</a>
 **/
public class PFNvkGetPhysicalDeviceFormatProperties2 extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceFormatProperties2() {
    }

    public PFNvkGetPhysicalDeviceFormatProperties2(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceFormatProperties2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceFormatProperties2(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceFormatProperties2(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceFormatProperties2"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkFormat format, VkFormatProperties2 pFormatProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPhysicalDevice.NULL.getVkAddress(), format != null ? format.getVkAddress() : VkPointer.NULL, pFormatProperties != null ? pFormatProperties.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long format, long pFormatProperties);
}
