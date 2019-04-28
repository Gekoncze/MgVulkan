package cz.mg.vulkan;

public class PFNvkRegisterDeviceEventEXT extends VkFunctionPointer {
    public PFNvkRegisterDeviceEventEXT() {
    }

    protected PFNvkRegisterDeviceEventEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkRegisterDeviceEventEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkRegisterDeviceEventEXT(long value) {
        setValue(value);
    }

    public PFNvkRegisterDeviceEventEXT(VkInstance instance) {
        super(instance, new VkString("vkRegisterDeviceEventEXT"));
    }

    public void call(VkDevice device, VkDeviceEventInfoEXT pDeviceEventInfo, VkAllocationCallbacks pAllocator, VkFence pFence, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pDeviceEventInfo != null ? pDeviceEventInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pFence != null ? pFence.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long pDeviceEventInfo, long pAllocator, long pFence, long rval);


    public int call(VkDevice device, VkDeviceEventInfoEXT pDeviceEventInfo, VkAllocationCallbacks pAllocator, VkFence pFence){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pDeviceEventInfo != null ? pDeviceEventInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pFence != null ? pFence.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long pDeviceEventInfo, long pAllocator, long pFence);

}
