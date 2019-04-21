package cz.mg.vulkan;

public class PFNvkGetDeviceGroupSurfacePresentModesKHR extends VkFunctionPointer {
    public PFNvkGetDeviceGroupSurfacePresentModesKHR() {
    }

    public PFNvkGetDeviceGroupSurfacePresentModesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetDeviceGroupSurfacePresentModesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetDeviceGroupSurfacePresentModesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetDeviceGroupSurfacePresentModesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetDeviceGroupSurfacePresentModesKHR"));
    }

    public void call(VkDevice device, VkSurfaceKHR surface, VkDeviceGroupPresentModeFlagsKHR pModes, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), surface != null ? surface.getVkAddress() : VkPointer.getNullAddress(), pModes != null ? pModes.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long device, long surface, long pModes, long rval);
}
