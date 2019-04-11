package cz.mg.vulkan;

public class PFNvkGetDeviceGroupPresentCapabilitiesKHR extends VkFunctionPointer {
    public PFNvkGetDeviceGroupPresentCapabilitiesKHR() {
    }

    public PFNvkGetDeviceGroupPresentCapabilitiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetDeviceGroupPresentCapabilitiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetDeviceGroupPresentCapabilitiesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetDeviceGroupPresentCapabilitiesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetDeviceGroupPresentCapabilitiesKHR"));
    }

    public void call(VkDevice device, VkDeviceGroupPresentCapabilitiesKHR pDeviceGroupPresentCapabilities, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), pDeviceGroupPresentCapabilities != null ? pDeviceGroupPresentCapabilities.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getNullAddress());
    }

    private static native void call(long vkaddress, long device, long pDeviceGroupPresentCapabilities, long rval);
}
