package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkResetCommandPool.html">khronos documentation</a>
 **/
public class PFNvkResetCommandPool extends VkFunctionPointer {
    public PFNvkResetCommandPool() {
    }

    public PFNvkResetCommandPool(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkResetCommandPool(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkResetCommandPool(long value) {
        setValue(value);
    }

    public PFNvkResetCommandPool(VkInstance instance) {
        super(instance, new VkString("vkResetCommandPool"));
    }

    public void call(VkDevice device, VkCommandPool commandPool, VkCommandPoolResetFlags flags, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, commandPool != null ? commandPool.getVkAddress() : VkPointer.NULL_ADDRESS, flags != null ? flags.getVkAddress() : VkPointer.NULL_ADDRESS, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long commandPool, long flags, long rval);
}
