package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkEnumerateDeviceLayerProperties.html">khronos documentation</a>
 **/
public class PFNvkEnumerateDeviceLayerProperties extends VkFunctionPointer {
    public PFNvkEnumerateDeviceLayerProperties() {
    }

    public PFNvkEnumerateDeviceLayerProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkEnumerateDeviceLayerProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkEnumerateDeviceLayerProperties(long value) {
        setValue(value);
    }

    public PFNvkEnumerateDeviceLayerProperties(VkInstance instance) {
        super(instance, new VkString("vkEnumerateDeviceLayerProperties"));
    }

    public void call(VkPhysicalDevice physicalDevice, VkUInt32 pPropertyCount, VkLayerProperties pProperties, VkResult rval){
        call(getValue(), physicalDevice != null ? physicalDevice.getVkAddress() : VkPointer.NULL_ADDRESS, pPropertyCount != null ? pPropertyCount.getVkAddress() : VkPointer.NULL, pProperties != null ? pProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long physicalDevice, long pPropertyCount, long pProperties, long rval);
}
