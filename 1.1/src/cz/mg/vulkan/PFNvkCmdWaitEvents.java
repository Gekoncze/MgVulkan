package cz.mg.vulkan;

public class PFNvkCmdWaitEvents extends VkFunctionPointer {
    public PFNvkCmdWaitEvents() {
    }

    protected PFNvkCmdWaitEvents(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdWaitEvents(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdWaitEvents(long value) {
        setValue(value);
    }

    public PFNvkCmdWaitEvents(VkInstance instance) {
        super(instance, new VkString("vkCmdWaitEvents"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 eventCount, VkEvent pEvents, VkPipelineStageFlags srcStageMask, VkPipelineStageFlags dstStageMask, VkUInt32 memoryBarrierCount, VkMemoryBarrier pMemoryBarriers, VkUInt32 bufferMemoryBarrierCount, VkBufferMemoryBarrier pBufferMemoryBarriers, VkUInt32 imageMemoryBarrierCount, VkImageMemoryBarrier pImageMemoryBarriers){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), eventCount != null ? eventCount.getVkAddress() : VkPointer.getNullAddressNative(), pEvents != null ? pEvents.getVkAddress() : VkPointer.NULL, srcStageMask != null ? srcStageMask.getVkAddress() : VkPointer.getNullAddressNative(), dstStageMask != null ? dstStageMask.getVkAddress() : VkPointer.getNullAddressNative(), memoryBarrierCount != null ? memoryBarrierCount.getVkAddress() : VkPointer.getNullAddressNative(), pMemoryBarriers != null ? pMemoryBarriers.getVkAddress() : VkPointer.NULL, bufferMemoryBarrierCount != null ? bufferMemoryBarrierCount.getVkAddress() : VkPointer.getNullAddressNative(), pBufferMemoryBarriers != null ? pBufferMemoryBarriers.getVkAddress() : VkPointer.NULL, imageMemoryBarrierCount != null ? imageMemoryBarrierCount.getVkAddress() : VkPointer.getNullAddressNative(), pImageMemoryBarriers != null ? pImageMemoryBarriers.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long commandBuffer, long eventCount, long pEvents, long srcStageMask, long dstStageMask, long memoryBarrierCount, long pMemoryBarriers, long bufferMemoryBarrierCount, long pBufferMemoryBarriers, long imageMemoryBarrierCount, long pImageMemoryBarriers);
}
