package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetPhysicalDeviceExternalSemaphorePropertiesKHR.html">khronos documentation</a>
 **/
public class PFNvkGetPhysicalDeviceExternalSemaphorePropertiesKHR extends VkFunctionPointer {
    public PFNvkGetPhysicalDeviceExternalSemaphorePropertiesKHR() {
    }

    public PFNvkGetPhysicalDeviceExternalSemaphorePropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetPhysicalDeviceExternalSemaphorePropertiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetPhysicalDeviceExternalSemaphorePropertiesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetPhysicalDeviceExternalSemaphorePropertiesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetPhysicalDeviceExternalSemaphorePropertiesKHR"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkPhysicalDeviceExternalSemaphoreInfo pExternalSemaphoreInfo, VkExternalSemaphoreProperties pExternalSemaphoreProperties){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.NULL_ADDRESS, pExternalSemaphoreInfo != null ? pExternalSemaphoreInfo.getVkAddress() : VkPointer.NULL, pExternalSemaphoreProperties != null ? pExternalSemaphoreProperties.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long physicalDevice, long pExternalSemaphoreInfo, long pExternalSemaphoreProperties);
}
