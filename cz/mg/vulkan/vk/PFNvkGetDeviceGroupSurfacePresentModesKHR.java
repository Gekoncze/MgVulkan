package cz.mg.vulkan.vk;

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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, surface != null ? surface.getVkAddress() : VkPointer.NULL_ADDRESS, pModes != null ? pModes.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long surface, long pModes, long rval);
}
