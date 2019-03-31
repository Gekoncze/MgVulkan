package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetDeviceQueue.html">khronos documentation</a>
 **/
public class PFNvkGetDeviceQueue extends VkFunctionPointer {
    public PFNvkGetDeviceQueue() {
    }

    public PFNvkGetDeviceQueue(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetDeviceQueue(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetDeviceQueue(long value) {
        setValue(value);
    }

    public PFNvkGetDeviceQueue(VkInstance instance) {
        super(instance, new VkString("vkGetDeviceQueue"));
    }

    public void call(VkDevice device, VkUInt32 queueFamilyIndex, VkUInt32 queueIndex, VkQueue pQueue){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), queueFamilyIndex != null ? queueFamilyIndex.getVkAddress() : VkPointer.NULL, queueIndex != null ? queueIndex.getVkAddress() : VkPointer.NULL, pQueue != null ? pQueue.getVkAddress() : VkQueue.NULL.getVkAddress());
    }

    private static native void call(long vkaddress, long device, long queueFamilyIndex, long queueIndex, long pQueue);
}
