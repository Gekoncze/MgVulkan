package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkResetFences.html">khronos documentation</a>
 **/
public class PFNvkResetFences extends VkFunctionPointer {
    public PFNvkResetFences() {
    }

    public PFNvkResetFences(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkResetFences(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkResetFences(long value) {
        setValue(value);
    }

    public PFNvkResetFences(VkInstance instance) {
        super(instance, new VkString("vkResetFences"));
    }

    public void call(VkDevice device, VkUInt32 fenceCount, VkFence pFences, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), fenceCount != null ? fenceCount.getVkAddress() : VkPointer.NULL, pFences != null ? pFences.getVkAddress() : VkFence.NULL.getVkAddress(), rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long fenceCount, long pFences, long rval);
}
