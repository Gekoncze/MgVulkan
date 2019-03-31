package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceMemoryProperties2.html">khronos documentation</a>
 **/
public class PFNvkGetPhysicalDeviceMemoryProperties2 extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceMemoryProperties2() {
    }

    public PFNvkGetPhysicalDeviceMemoryProperties2(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceMemoryProperties2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceMemoryProperties2(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceMemoryProperties2(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceMemoryProperties2"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties2 pMemoryProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPhysicalDevice.NULL.getVkAddress(), pMemoryProperties != null ? pMemoryProperties.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long pMemoryProperties);
}
