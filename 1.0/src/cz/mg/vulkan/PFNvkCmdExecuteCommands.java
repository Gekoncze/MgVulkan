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
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), commandBufferCount != null ? commandBufferCount.getVkAddress() : VkPointer.getNullAddressNative(), pCommandBuffers != null ? pCommandBuffers.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long commandBuffer, long commandBufferCount, long pCommandBuffers);
}
