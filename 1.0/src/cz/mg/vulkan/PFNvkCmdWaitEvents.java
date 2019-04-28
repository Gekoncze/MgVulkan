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
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), eventCount != null ? eventCount.getVkAddress() : VkPointer.getNullAddressNative(), pEvents != null ? pEvents.getVkAddress() : VkPointer.NULL, srcStageMask != null ? srcStageMask.getVkAddress() : VkPointer.getNullAddressNative(), dstStageMask != null ? dstStageMask.getVkAddress() : VkPointer.getNullAddressNative(), memoryBarrierCount != null ? memoryBarrierCount.getVkAddress() : VkPointer.getNullAddressNative(), pMemoryBarriers != null ? pMemoryBarriers.getVkAddress() : VkPointer.NULL, bufferMemoryBarrierCount != null ? bufferMemoryBarrierCount.getVkAddress() : VkPointer.getNullAddressNative(), pBufferMemoryBarriers != null ? pBufferMemoryBarriers.getVkAddress() : VkPointer.NULL, imageMemoryBarrierCount != null ? imageMemoryBarrierCount.getVkAddress() : VkPointer.getNullAddressNative(), pImageMemoryBarriers != null ? pImageMemoryBarriers.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long eventCount, long pEvents, long srcStageMask, long dstStageMask, long memoryBarrierCount, long pMemoryBarriers, long bufferMemoryBarrierCount, long pBufferMemoryBarriers, long imageMemoryBarrierCount, long pImageMemoryBarriers);


    public void call(VkCommandBuffer commandBuffer, int eventCount, VkEvent pEvents, int srcStageMask, int dstStageMask, int memoryBarrierCount, VkMemoryBarrier pMemoryBarriers, int bufferMemoryBarrierCount, VkBufferMemoryBarrier pBufferMemoryBarriers, int imageMemoryBarrierCount, VkImageMemoryBarrier pImageMemoryBarriers){
        callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), eventCount, pEvents != null ? pEvents.getVkAddress() : VkPointer.NULL, srcStageMask, dstStageMask, memoryBarrierCount, pMemoryBarriers != null ? pMemoryBarriers.getVkAddress() : VkPointer.NULL, bufferMemoryBarrierCount, pBufferMemoryBarriers != null ? pBufferMemoryBarriers.getVkAddress() : VkPointer.NULL, imageMemoryBarrierCount, pImageMemoryBarriers != null ? pImageMemoryBarriers.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callSimplifiedNative(long vkaddress, long commandBuffer, int eventCount, long pEvents, int srcStageMask, int dstStageMask, int memoryBarrierCount, long pMemoryBarriers, int bufferMemoryBarrierCount, long pBufferMemoryBarriers, int imageMemoryBarrierCount, long pImageMemoryBarriers);

}
