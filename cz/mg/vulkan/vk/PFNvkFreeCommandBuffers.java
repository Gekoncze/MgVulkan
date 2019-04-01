package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkFreeCommandBuffers.html">khronos documentation</a>
 **/
public class PFNvkFreeCommandBuffers extends VkFunctionPointer {
    public PFNvkFreeCommandBuffers() {
    }

    public PFNvkFreeCommandBuffers(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkFreeCommandBuffers(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkFreeCommandBuffers(long value) {
        setValue(value);
    }

    public PFNvkFreeCommandBuffers(VkInstance instance) {
        super(instance, new VkString("vkFreeCommandBuffers"));
    }

    public void call(VkDevice device, VkCommandPool commandPool, VkUInt32 commandBufferCount, VkCommandBuffer pCommandBuffers){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, commandPool != null ? commandPool.getVkAddress() : VkPointer.NULL_ADDRESS, commandBufferCount != null ? commandBufferCount.getVkAddress() : VkPointer.NULL_ADDRESS, pCommandBuffers != null ? pCommandBuffers.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long commandPool, long commandBufferCount, long pCommandBuffers);
}
