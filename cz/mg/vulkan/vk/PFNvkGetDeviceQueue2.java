package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetDeviceQueue2.html">khronos documentation</a>
 **/
public class PFNvkGetDeviceQueue2 extends VkFunctionPointer {
    public PFNvkGetDeviceQueue2() {
    }

    public PFNvkGetDeviceQueue2(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetDeviceQueue2(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetDeviceQueue2(long value) {
        setValue(value);
    }

    public PFNvkGetDeviceQueue2(VkInstance instance) {
        super(instance, new VkString("vkGetDeviceQueue2"));
    }

    public void call(VkDevice device, VkDeviceQueueInfo2 pQueueInfo, VkQueue pQueue){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), pQueueInfo != null ? pQueueInfo.getVkAddress() : VkPointer.NULL, pQueue != null ? pQueue.getVkAddress() : VkQueue.NULL.getVkAddress());
    }

    private static native void call(long vkaddress, long device, long pQueueInfo, long pQueue);
}
