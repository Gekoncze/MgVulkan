package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateEvent.html">khronos documentation</a>
 **/
public class PFNvkCreateEvent extends VkFunctionPointer {
    public PFNvkCreateEvent() {
    }

    public PFNvkCreateEvent(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreateEvent(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCreateEvent(long value) {
        setValue(value);
    }

    public PFNvkCreateEvent(VkInstance instance) {
        super(instance, new VkString("vkCreateEvent"));
    }

    public void call(VkDevice device, VkEventCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkEvent pEvent, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pEvent != null ? pEvent.getVkAddress() : VkEvent.NULL.getVkAddress(), rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pEvent, long rval);
}
