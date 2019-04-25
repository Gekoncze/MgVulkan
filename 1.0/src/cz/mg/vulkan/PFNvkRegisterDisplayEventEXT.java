package cz.mg.vulkan;

public class PFNvkRegisterDisplayEventEXT extends VkFunctionPointer {
    public PFNvkRegisterDisplayEventEXT() {
    }

    protected PFNvkRegisterDisplayEventEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkRegisterDisplayEventEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkRegisterDisplayEventEXT(long value) {
        setValue(value);
    }

    public PFNvkRegisterDisplayEventEXT(VkInstance instance) {
        super(instance, new VkString("vkRegisterDisplayEventEXT"));
    }

    public void call(VkDevice device, VkDisplayKHR display, VkDisplayEventInfoEXT pDisplayEventInfo, VkAllocationCallbacks pAllocator, VkFence pFence, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), display != null ? display.getVkAddress() : VkPointer.getNullAddressNative(), pDisplayEventInfo != null ? pDisplayEventInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pFence != null ? pFence.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long device, long display, long pDisplayEventInfo, long pAllocator, long pFence, long rval);
}
