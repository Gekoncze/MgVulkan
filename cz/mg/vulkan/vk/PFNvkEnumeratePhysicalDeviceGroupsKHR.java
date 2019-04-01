package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkEnumeratePhysicalDeviceGroupsKHR.html">khronos documentation</a>
 **/
public class PFNvkEnumeratePhysicalDeviceGroupsKHR extends VkFunctionPointer {
    public PFNvkEnumeratePhysicalDeviceGroupsKHR() {
    }

    public PFNvkEnumeratePhysicalDeviceGroupsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkEnumeratePhysicalDeviceGroupsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkEnumeratePhysicalDeviceGroupsKHR(long value) {
        setValue(value);
    }

    public PFNvkEnumeratePhysicalDeviceGroupsKHR(VkInstance instance) {
        super(instance, new VkString("vkEnumeratePhysicalDeviceGroupsKHR"));
    }

    public void call(VkInstance instance, VkUInt32 pPhysicalDeviceGroupCount, VkPhysicalDeviceGroupProperties pPhysicalDeviceGroupProperties, VkResult rval){
        call(getValue(), instance != null ? instance.getVkAddress() : VkPointer.NULL_ADDRESS, pPhysicalDeviceGroupCount != null ? pPhysicalDeviceGroupCount.getVkAddress() : VkPointer.NULL, pPhysicalDeviceGroupProperties != null ? pPhysicalDeviceGroupProperties.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long instance, long pPhysicalDeviceGroupCount, long pPhysicalDeviceGroupProperties, long rval);
}
