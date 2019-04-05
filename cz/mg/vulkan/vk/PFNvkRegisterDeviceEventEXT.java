package cz.mg.vulkan.vk;

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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, pDeviceEventInfo != null ? pDeviceEventInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pFence != null ? pFence.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long pDeviceEventInfo, long pAllocator, long pFence, long rval);
}
