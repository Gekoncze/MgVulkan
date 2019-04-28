package cz.mg.vulkan;

public class PFNvkCreateEvent extends VkFunctionPointer {
    public PFNvkCreateEvent() {
    }

    protected PFNvkCreateEvent(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCreateEvent(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCreateEvent(long value) {
        setValue(value);
    }

    public PFNvkCreateEvent(VkInstance instance) {
        super(instance, new VkString("vkCreateEvent"));
    }

    public void call(VkDevice device, VkEventCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkEvent pEvent, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pEvent != null ? pEvent.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pEvent, long rval);


    public int call(VkDevice device, VkEventCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkEvent pEvent){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pEvent != null ? pEvent.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long pCreateInfo, long pAllocator, long pEvent);

}
