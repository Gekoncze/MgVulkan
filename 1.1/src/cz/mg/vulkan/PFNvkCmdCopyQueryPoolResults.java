package cz.mg.vulkan;

public class PFNvkCmdCopyQueryPoolResults extends VkFunctionPointer {
    public PFNvkCmdCopyQueryPoolResults() {
    }

    protected PFNvkCmdCopyQueryPoolResults(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdCopyQueryPoolResults(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdCopyQueryPoolResults(long value) {
        setValue(value);
    }

    public PFNvkCmdCopyQueryPoolResults(VkInstance instance) {
        super(instance, new VkString("vkCmdCopyQueryPoolResults"));
    }

    public void call(VkCommandBuffer commandBuffer, VkQueryPool queryPool, VkUInt32 firstQuery, VkUInt32 queryCount, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkDeviceSize stride, VkQueryResultFlags flags){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), queryPool != null ? queryPool.getVkAddress() : VkPointer.getNullAddressNative(), firstQuery != null ? firstQuery.getVkAddress() : VkPointer.getNullAddressNative(), queryCount != null ? queryCount.getVkAddress() : VkPointer.getNullAddressNative(), dstBuffer != null ? dstBuffer.getVkAddress() : VkPointer.getNullAddressNative(), dstOffset != null ? dstOffset.getVkAddress() : VkPointer.getNullAddressNative(), stride != null ? stride.getVkAddress() : VkPointer.getNullAddressNative(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void call(long vkaddress, long commandBuffer, long queryPool, long firstQuery, long queryCount, long dstBuffer, long dstOffset, long stride, long flags);
}
