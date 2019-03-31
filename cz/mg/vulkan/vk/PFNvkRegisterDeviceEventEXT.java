package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkRegisterDeviceEventEXT.html">khronos documentation</a>
 **/
public class PFNvkRegisterDeviceEventEXT extends VkFunctionPointer {
    public PFNvkRegisterDeviceEventEXT() {
    }

    public PFNvkRegisterDeviceEventEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkRegisterDeviceEventEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkRegisterDeviceEventEXT(long value) {
        setValue(value);
    }

    public PFNvkRegisterDeviceEventEXT(VkInstance instance) {
        super(instance, new VkString("vkRegisterDeviceEventEXT"));
    }

    public void call(VkDevice device, VkDeviceEventInfoEXT pDeviceEventInfo, VkAllocationCallbacks pAllocator, VkFence pFence, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), pDeviceEventInfo != null ? pDeviceEventInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pFence != null ? pFence.getVkAddress() : VkFence.NULL.getVkAddress(), rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pDeviceEventInfo, long pAllocator, long pFence, long rval);
}
