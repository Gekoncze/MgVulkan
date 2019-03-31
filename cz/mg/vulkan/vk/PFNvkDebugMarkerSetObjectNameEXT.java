package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDebugMarkerSetObjectNameEXT.html">khronos documentation</a>
 **/
public class PFNvkDebugMarkerSetObjectNameEXT extends VkFunctionPointer {
    public PFNvkDebugMarkerSetObjectNameEXT() {
    }

    public PFNvkDebugMarkerSetObjectNameEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDebugMarkerSetObjectNameEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkDebugMarkerSetObjectNameEXT(long value) {
        setValue(value);
    }

    public PFNvkDebugMarkerSetObjectNameEXT(VkInstance instance) {
        super(instance, new VkString("vkDebugMarkerSetObjectNameEXT"));
    }

    public void call(VkDevice device, VkDebugMarkerObjectNameInfoEXT pNameInfo, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), pNameInfo != null ? pNameInfo.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pNameInfo, long rval);
}
