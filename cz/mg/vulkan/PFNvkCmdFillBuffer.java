package cz.mg.vulkan;

public class PFNvkCmdFillBuffer extends VkFunctionPointer {
    public PFNvkCmdFillBuffer() {
    }

    public PFNvkCmdFillBuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdFillBuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdFillBuffer(long value) {
        setValue(value);
    }

    public PFNvkCmdFillBuffer(VkInstance instance) {
        super(instance, new VkString("vkCmdFillBuffer"));
    }

    public void call(VkCommandBuffer commandBuffer, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkDeviceSize size, VkUInt32 data){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getSinkAddress(), dstBuffer != null ? dstBuffer.getVkAddress() : VkPointer.getSinkAddress(), dstOffset != null ? dstOffset.getVkAddress() : VkPointer.getSinkAddress(), size != null ? size.getVkAddress() : VkPointer.getSinkAddress(), data != null ? data.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long commandBuffer, long dstBuffer, long dstOffset, long size, long data);
}
