package cz.mg.vulkan;

public class PFNvkGetDeviceQueue2 extends VkFunctionPointer {
    public PFNvkGetDeviceQueue2() {
    }

    protected PFNvkGetDeviceQueue2(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetDeviceQueue2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetDeviceQueue2(long value) {
        setValue(value);
    }

    public PFNvkGetDeviceQueue2(VkInstance instance) {
        super(instance, new VkString("vkGetDeviceQueue2"));
    }

    public void call(VkDevice device, VkDeviceQueueInfo2 pQueueInfo, VkQueue pQueue){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pQueueInfo != null ? pQueueInfo.getVkAddress() : VkPointer.NULL, pQueue != null ? pQueue.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long pQueueInfo, long pQueue);

}
