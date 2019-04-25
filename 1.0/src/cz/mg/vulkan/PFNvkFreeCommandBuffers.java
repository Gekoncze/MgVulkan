package cz.mg.vulkan;

public class PFNvkFreeCommandBuffers extends VkFunctionPointer {
    public PFNvkFreeCommandBuffers() {
    }

    protected PFNvkFreeCommandBuffers(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkFreeCommandBuffers(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkFreeCommandBuffers(long value) {
        setValue(value);
    }

    public PFNvkFreeCommandBuffers(VkInstance instance) {
        super(instance, new VkString("vkFreeCommandBuffers"));
    }

    public void call(VkDevice device, VkCommandPool commandPool, VkUInt32 commandBufferCount, VkCommandBuffer pCommandBuffers){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), commandPool != null ? commandPool.getVkAddress() : VkPointer.getNullAddressNative(), commandBufferCount != null ? commandBufferCount.getVkAddress() : VkPointer.getNullAddressNative(), pCommandBuffers != null ? pCommandBuffers.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long device, long commandPool, long commandBufferCount, long pCommandBuffers);
}
