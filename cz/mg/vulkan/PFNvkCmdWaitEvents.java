package cz.mg.vulkan;

public class PFNvkCmdWaitEvents extends VkFunctionPointer {
    public PFNvkCmdWaitEvents() {
    }

    public PFNvkCmdWaitEvents(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdWaitEvents(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdWaitEvents(long value) {
        setValue(value);
    }

    public PFNvkCmdWaitEvents(VkInstance instance) {
        super(instance, new VkString("vkCmdWaitEvents"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 eventCount, VkEvent pEvents, VkPipelineStageFlags srcStageMask, VkPipelineStageFlags dstStageMask, VkUInt32 memoryBarrierCount, VkMemoryBarrier pMemoryBarriers, VkUInt32 bufferMemoryBarrierCount, VkBufferMemoryBarrier pBufferMemoryBarriers, VkUInt32 imageMemoryBarrierCount, VkImageMemoryBarrier pImageMemoryBarriers){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddress(), eventCount != null ? eventCount.getVkAddress() : VkPointer.getNullAddress(), pEvents != null ? pEvents.getVkAddress() : VkPointer.NULL, srcStageMask != null ? srcStageMask.getVkAddress() : VkPointer.getNullAddress(), dstStageMask != null ? dstStageMask.getVkAddress() : VkPointer.getNullAddress(), memoryBarrierCount != null ? memoryBarrierCount.getVkAddress() : VkPointer.getNullAddress(), pMemoryBarriers != null ? pMemoryBarriers.getVkAddress() : VkPointer.NULL, bufferMemoryBarrierCount != null ? bufferMemoryBarrierCount.getVkAddress() : VkPointer.getNullAddress(), pBufferMemoryBarriers != null ? pBufferMemoryBarriers.getVkAddress() : VkPointer.NULL, imageMemoryBarrierCount != null ? imageMemoryBarrierCount.getVkAddress() : VkPointer.getNullAddress(), pImageMemoryBarriers != null ? pImageMemoryBarriers.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long eventCount, long pEvents, long srcStageMask, long dstStageMask, long memoryBarrierCount, long pMemoryBarriers, long bufferMemoryBarrierCount, long pBufferMemoryBarriers, long imageMemoryBarrierCount, long pImageMemoryBarriers);
}
