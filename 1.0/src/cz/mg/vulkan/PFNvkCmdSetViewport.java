package cz.mg.vulkan;

public class PFNvkCmdSetViewport extends VkFunctionPointer {
    public PFNvkCmdSetViewport() {
    }

    public PFNvkCmdSetViewport(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdSetViewport(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdSetViewport(long value) {
        setValue(value);
    }

    public PFNvkCmdSetViewport(VkInstance instance) {
        super(instance, new VkString("vkCmdSetViewport"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 firstViewport, VkUInt32 viewportCount, VkViewport pViewports){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddress(), firstViewport != null ? firstViewport.getVkAddress() : VkPointer.getNullAddress(), viewportCount != null ? viewportCount.getVkAddress() : VkPointer.getNullAddress(), pViewports != null ? pViewports.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long commandBuffer, long firstViewport, long viewportCount, long pViewports);
}
