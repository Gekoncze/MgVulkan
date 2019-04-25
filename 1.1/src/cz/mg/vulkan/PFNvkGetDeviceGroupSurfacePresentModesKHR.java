package cz.mg.vulkan;

public class PFNvkGetDeviceGroupSurfacePresentModesKHR extends VkFunctionPointer {
    public PFNvkGetDeviceGroupSurfacePresentModesKHR() {
    }

    protected PFNvkGetDeviceGroupSurfacePresentModesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetDeviceGroupSurfacePresentModesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetDeviceGroupSurfacePresentModesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetDeviceGroupSurfacePresentModesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetDeviceGroupSurfacePresentModesKHR"));
    }

    public void call(VkDevice device, VkSurfaceKHR surface, VkDeviceGroupPresentModeFlagsKHR pModes, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), surface != null ? surface.getVkAddress() : VkPointer.getNullAddressNative(), pModes != null ? pModes.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long device, long surface, long pModes, long rval);
}
