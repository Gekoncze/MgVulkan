package cz.mg.vulkan;

public class PFNvkGetDeviceQueue extends VkFunctionPointer {
    public PFNvkGetDeviceQueue() {
    }

    protected PFNvkGetDeviceQueue(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetDeviceQueue(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetDeviceQueue(long value) {
        setValue(value);
    }

    public PFNvkGetDeviceQueue(VkInstance instance) {
        super(instance, new VkString("vkGetDeviceQueue"));
    }

    public void call(VkDevice device, VkUInt32 queueFamilyIndex, VkUInt32 queueIndex, VkQueue pQueue){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), queueFamilyIndex != null ? queueFamilyIndex.getVkAddress() : VkPointer.getNullAddressNative(), queueIndex != null ? queueIndex.getVkAddress() : VkPointer.getNullAddressNative(), pQueue != null ? pQueue.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long device, long queueFamilyIndex, long queueIndex, long pQueue);
}
