package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceProperties2.html">khronos documentation</a>
 **/
public class PFNvkGetPhysicalDeviceProperties2 extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceProperties2() {
    }

    public PFNvkGetPhysicalDeviceProperties2(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceProperties2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceProperties2(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceProperties2(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceProperties2"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceProperties2 pProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.NULL_ADDRESS, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long pProperties);
}
