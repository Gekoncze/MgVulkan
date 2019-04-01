package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdWaitEvents.html">khronos documentation</a>
 **/
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
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, eventCount != null ? eventCount.getVkAddress() : VkPointer.NULL_ADDRESS, pEvents != null ? pEvents.getVkAddress() : VkPointer.NULL, srcStageMask != null ? srcStageMask.getVkAddress() : VkPointer.NULL_ADDRESS, dstStageMask != null ? dstStageMask.getVkAddress() : VkPointer.NULL_ADDRESS, memoryBarrierCount != null ? memoryBarrierCount.getVkAddress() : VkPointer.NULL_ADDRESS, pMemoryBarriers != null ? pMemoryBarriers.getVkAddress() : VkPointer.NULL, bufferMemoryBarrierCount != null ? bufferMemoryBarrierCount.getVkAddress() : VkPointer.NULL_ADDRESS, pBufferMemoryBarriers != null ? pBufferMemoryBarriers.getVkAddress() : VkPointer.NULL, imageMemoryBarrierCount != null ? imageMemoryBarrierCount.getVkAddress() : VkPointer.NULL_ADDRESS, pImageMemoryBarriers != null ? pImageMemoryBarriers.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long eventCount, long pEvents, long srcStageMask, long dstStageMask, long memoryBarrierCount, long pMemoryBarriers, long bufferMemoryBarrierCount, long pBufferMemoryBarriers, long imageMemoryBarrierCount, long pImageMemoryBarriers);
}
