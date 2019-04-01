package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkDisplayPowerControlEXT.html">khronos documentation</a>
 **/
public class PFNvkDisplayPowerControlEXT extends VkFunctionPointer {
    public PFNvkDisplayPowerControlEXT() {
    }

    public PFNvkDisplayPowerControlEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkDisplayPowerControlEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkDisplayPowerControlEXT(long value) {
        setValue(value);
    }

    public PFNvkDisplayPowerControlEXT(VkInstance instance) {
        super(instance, new VkString("vkDisplayPowerControlEXT"));
    }

    public void call(VkDevice device, VkDisplayKHR display, VkDisplayPowerInfoEXT pDisplayPowerInfo, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, display != null ? display.getVkAddress() : VkPointer.NULL_ADDRESS, pDisplayPowerInfo != null ? pDisplayPowerInfo.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long display, long pDisplayPowerInfo, long rval);
}
