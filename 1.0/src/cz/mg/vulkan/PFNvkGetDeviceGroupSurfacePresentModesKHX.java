package cz.mg.vulkan;

public class PFNvkGetDeviceGroupSurfacePresentModesKHX extends VkFunctionPointer {
    public PFNvkGetDeviceGroupSurfacePresentModesKHX() {
    }

    public PFNvkGetDeviceGroupSurfacePresentModesKHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetDeviceGroupSurfacePresentModesKHX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetDeviceGroupSurfacePresentModesKHX(long value) {
        setValue(value);
    }

    public PFNvkGetDeviceGroupSurfacePresentModesKHX(VkInstance instance) {
        super(instance, new VkString("vkGetDeviceGroupSurfacePresentModesKHX"));
    }

    public void call(VkDevice device, VkSurfaceKHR surface, VkDeviceGroupPresentModeFlagsKHX pModes, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), surface != null ? surface.getVkAddress() : VkPointer.getNullAddress(), pModes != null ? pModes.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long device, long surface, long pModes, long rval);
}
