package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDebugMarkerSetObjectTagEXT.html">khronos documentation</a>
 **/
public class PFNvkDebugMarkerSetObjectTagEXT extends VkFunctionPointer {
    public PFNvkDebugMarkerSetObjectTagEXT() {
    }

    public PFNvkDebugMarkerSetObjectTagEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDebugMarkerSetObjectTagEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkDebugMarkerSetObjectTagEXT(long value) {
        setValue(value);
    }

    public PFNvkDebugMarkerSetObjectTagEXT(VkInstance instance) {
        super(instance, new VkString("vkDebugMarkerSetObjectTagEXT"));
    }

    public void call(VkDevice device, VkDebugMarkerObjectTagInfoEXT pTagInfo, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, pTagInfo != null ? pTagInfo.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long pTagInfo, long rval);
}
