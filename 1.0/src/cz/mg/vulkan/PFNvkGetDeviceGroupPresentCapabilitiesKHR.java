package cz.mg.vulkan;

public class PFNvkGetDeviceGroupPresentCapabilitiesKHR extends VkFunctionPointer {
    public PFNvkGetDeviceGroupPresentCapabilitiesKHR() {
    }

    protected PFNvkGetDeviceGroupPresentCapabilitiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetDeviceGroupPresentCapabilitiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetDeviceGroupPresentCapabilitiesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetDeviceGroupPresentCapabilitiesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetDeviceGroupPresentCapabilitiesKHR"));
    }

    public void call(VkDevice device, VkDeviceGroupPresentCapabilitiesKHR pDeviceGroupPresentCapabilities, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pDeviceGroupPresentCapabilities != null ? pDeviceGroupPresentCapabilities.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long pDeviceGroupPresentCapabilities, long rval);


    public int call(VkDevice device, VkDeviceGroupPresentCapabilitiesKHR pDeviceGroupPresentCapabilities){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pDeviceGroupPresentCapabilities != null ? pDeviceGroupPresentCapabilities.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long pDeviceGroupPresentCapabilities);

}
