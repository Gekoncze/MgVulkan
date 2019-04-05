package cz.mg.vulkan.vk;

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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pEvent != null ? pEvent.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pEvent, long rval);
}
