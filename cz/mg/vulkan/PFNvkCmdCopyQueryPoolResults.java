package cz.mg.vulkan;

public class PFNvkCmdCopyQueryPoolResults extends VkFunctionPointer {
    public PFNvkCmdCopyQueryPoolResults() {
    }

    public PFNvkCmdCopyQueryPoolResults(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdCopyQueryPoolResults(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdCopyQueryPoolResults(long value) {
        setValue(value);
    }

    public PFNvkCmdCopyQueryPoolResults(VkInstance instance) {
        super(instance, new VkString("vkCmdCopyQueryPoolResults"));
    }

    public void call(VkCommandBuffer commandBuffer, VkQueryPool queryPool, VkUInt32 firstQuery, VkUInt32 queryCount, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkDeviceSize stride, VkQueryResultFlags flags){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, queryPool != null ? queryPool.getVkAddress() : VkPointer.NULL_ADDRESS, firstQuery != null ? firstQuery.getVkAddress() : VkPointer.NULL_ADDRESS, queryCount != null ? queryCount.getVkAddress() : VkPointer.NULL_ADDRESS, dstBuffer != null ? dstBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, dstOffset != null ? dstOffset.getVkAddress() : VkPointer.NULL_ADDRESS, stride != null ? stride.getVkAddress() : VkPointer.NULL_ADDRESS, flags != null ? flags.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long commandBuffer, long queryPool, long firstQuery, long queryCount, long dstBuffer, long dstOffset, long stride, long flags);
}
