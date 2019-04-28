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
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), surface != null ? surface.getVkAddress() : VkPointer.getNullAddressNative(), pModes != null ? pModes.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long surface, long pModes, long rval);


    public int call(VkDevice device, VkSurfaceKHR surface, VkDeviceGroupPresentModeFlagsKHR pModes){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), surface != null ? surface.getVkAddress() : VkPointer.getNullAddressNative(), pModes != null ? pModes.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long surface, long pModes);

}
