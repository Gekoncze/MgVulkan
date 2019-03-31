package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkTrimCommandPool.html">khronos documentation</a>
 **/
public class PFNvkTrimCommandPool extends VkFunctionPointer {
    public PFNvkTrimCommandPool() {
    }

    public PFNvkTrimCommandPool(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkTrimCommandPool(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkTrimCommandPool(long value) {
        setValue(value);
    }

    public PFNvkTrimCommandPool(VkInstance instance) {
        super(instance, new VkString("vkTrimCommandPool"));
    }

    public void call(VkDevice device, VkCommandPool commandPool, VkCommandPoolTrimFlags flags){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), commandPool != null ? commandPool.getVkAddress() : VkCommandPool.NULL.getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long commandPool, long flags);
}
