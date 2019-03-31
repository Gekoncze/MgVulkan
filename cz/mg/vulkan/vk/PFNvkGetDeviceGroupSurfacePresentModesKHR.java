package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetDeviceGroupSurfacePresentModesKHR.html">khronos documentation</a>
 **/
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
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), surface != null ? surface.getVkAddress() : VkSurfaceKHR.NULL.getVkAddress(), pModes != null ? pModes.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long surface, long pModes, long rval);
}
