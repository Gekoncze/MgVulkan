package cz.mg.vulkan;

public class PFNvkCmdExecuteCommands extends VkFunctionPointer {
    public PFNvkCmdExecuteCommands() {
    }

    protected PFNvkCmdExecuteCommands(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdExecuteCommands(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdExecuteCommands(long value) {
        setValue(value);
    }

    public PFNvkCmdExecuteCommands(VkInstance instance) {
        super(instance, new VkString("vkCmdExecuteCommands"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 commandBufferCount, VkCommandBuffer pCommandBuffers){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), commandBufferCount != null ? commandBufferCount.getVkAddress() : VkPointer.getNullAddressNative(), pCommandBuffers != null ? pCommandBuffers.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long commandBufferCount, long pCommandBuffers);


    public void call(VkCommandBuffer commandBuffer, int commandBufferCount, VkCommandBuffer pCommandBuffers){
        callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), commandBufferCount, pCommandBuffers != null ? pCommandBuffers.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callSimplifiedNative(long vkaddress, long commandBuffer, int commandBufferCount, long pCommandBuffers);

}
