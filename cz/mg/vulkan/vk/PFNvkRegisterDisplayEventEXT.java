package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkRegisterDisplayEventEXT.html">khronos documentation</a>
 **/
public class PFNvkRegisterDisplayEventEXT extends VkFunctionPointer {
    public PFNvkRegisterDisplayEventEXT() {
    }

    public PFNvkRegisterDisplayEventEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkRegisterDisplayEventEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkRegisterDisplayEventEXT(long value) {
        setValue(value);
    }

    public PFNvkRegisterDisplayEventEXT(VkInstance instance) {
        super(instance, new VkString("vkRegisterDisplayEventEXT"));
    }

    public void call(VkDevice device, VkDisplayKHR display, VkDisplayEventInfoEXT pDisplayEventInfo, VkAllocationCallbacks pAllocator, VkFence pFence, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), display != null ? display.getVkAddress() : VkDisplayKHR.NULL.getVkAddress(), pDisplayEventInfo != null ? pDisplayEventInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pFence != null ? pFence.getVkAddress() : VkFence.NULL.getVkAddress(), rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long display, long pDisplayEventInfo, long pAllocator, long pFence, long rval);
}
