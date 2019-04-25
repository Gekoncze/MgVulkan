package cz.mg.vulkan;

public class PFNvkGetDeviceGroupPresentCapabilitiesKHX extends VkFunctionPointer {
    public PFNvkGetDeviceGroupPresentCapabilitiesKHX() {
    }

    protected PFNvkGetDeviceGroupPresentCapabilitiesKHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetDeviceGroupPresentCapabilitiesKHX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetDeviceGroupPresentCapabilitiesKHX(long value) {
        setValue(value);
    }

    public PFNvkGetDeviceGroupPresentCapabilitiesKHX(VkInstance instance) {
        super(instance, new VkString("vkGetDeviceGroupPresentCapabilitiesKHX"));
    }

    public void call(VkDevice device, VkDeviceGroupPresentCapabilitiesKHX pDeviceGroupPresentCapabilities, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pDeviceGroupPresentCapabilities != null ? pDeviceGroupPresentCapabilities.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long device, long pDeviceGroupPresentCapabilities, long rval);
}
