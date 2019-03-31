package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkWaitForFences.html">khronos documentation</a>
 **/
public class PFNvkWaitForFences extends VkFunctionPointer {
    public PFNvkWaitForFences() {
    }

    public PFNvkWaitForFences(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkWaitForFences(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkWaitForFences(long value) {
        setValue(value);
    }

    public PFNvkWaitForFences(VkInstance instance) {
        super(instance, new VkString("vkWaitForFences"));
    }

    public void call(VkDevice device, VkUInt32 fenceCount, VkFence pFences, VkBool32 waitAll, VkUInt64 timeout, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), fenceCount != null ? fenceCount.getVkAddress() : VkPointer.NULL, pFences != null ? pFences.getVkAddress() : VkFence.NULL.getVkAddress(), waitAll != null ? waitAll.getVkAddress() : VkPointer.NULL, timeout != null ? timeout.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long fenceCount, long pFences, long waitAll, long timeout, long rval);
}
