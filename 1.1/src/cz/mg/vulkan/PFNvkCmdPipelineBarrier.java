package cz.mg.vulkan;

public class PFNvkCmdPipelineBarrier extends VkFunctionPointer {
    public PFNvkCmdPipelineBarrier() {
    }

    protected PFNvkCmdPipelineBarrier(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdPipelineBarrier(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdPipelineBarrier(long value) {
        setValue(value);
    }

    public PFNvkCmdPipelineBarrier(VkInstance instance) {
        super(instance, new VkString("vkCmdPipelineBarrier"));
    }

    public void call(VkCommandBuffer commandBuffer, VkPipelineStageFlags srcStageMask, VkPipelineStageFlags dstStageMask, VkDependencyFlags dependencyFlags, VkUInt32 memoryBarrierCount, VkMemoryBarrier pMemoryBarriers, VkUInt32 bufferMemoryBarrierCount, VkBufferMemoryBarrier pBufferMemoryBarriers, VkUInt32 imageMemoryBarrierCount, VkImageMemoryBarrier pImageMemoryBarriers){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), srcStageMask != null ? srcStageMask.getVkAddress() : VkPointer.getNullAddressNative(), dstStageMask != null ? dstStageMask.getVkAddress() : VkPointer.getNullAddressNative(), dependencyFlags != null ? dependencyFlags.getVkAddress() : VkPointer.getNullAddressNative(), memoryBarrierCount != null ? memoryBarrierCount.getVkAddress() : VkPointer.getNullAddressNative(), pMemoryBarriers != null ? pMemoryBarriers.getVkAddress() : VkPointer.NULL, bufferMemoryBarrierCount != null ? bufferMemoryBarrierCount.getVkAddress() : VkPointer.getNullAddressNative(), pBufferMemoryBarriers != null ? pBufferMemoryBarriers.getVkAddress() : VkPointer.NULL, imageMemoryBarrierCount != null ? imageMemoryBarrierCount.getVkAddress() : VkPointer.getNullAddressNative(), pImageMemoryBarriers != null ? pImageMemoryBarriers.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long srcStageMask, long dstStageMask, long dependencyFlags, long memoryBarrierCount, long pMemoryBarriers, long bufferMemoryBarrierCount, long pBufferMemoryBarriers, long imageMemoryBarrierCount, long pImageMemoryBarriers);


    public void call(VkCommandBuffer commandBuffer, int srcStageMask, int dstStageMask, int dependencyFlags, int memoryBarrierCount, VkMemoryBarrier pMemoryBarriers, int bufferMemoryBarrierCount, VkBufferMemoryBarrier pBufferMemoryBarriers, int imageMemoryBarrierCount, VkImageMemoryBarrier pImageMemoryBarriers){
        callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), srcStageMask, dstStageMask, dependencyFlags, memoryBarrierCount, pMemoryBarriers != null ? pMemoryBarriers.getVkAddress() : VkPointer.NULL, bufferMemoryBarrierCount, pBufferMemoryBarriers != null ? pBufferMemoryBarriers.getVkAddress() : VkPointer.NULL, imageMemoryBarrierCount, pImageMemoryBarriers != null ? pImageMemoryBarriers.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callSimplifiedNative(long vkaddress, long commandBuffer, int srcStageMask, int dstStageMask, int dependencyFlags, int memoryBarrierCount, long pMemoryBarriers, int bufferMemoryBarrierCount, long pBufferMemoryBarriers, int imageMemoryBarrierCount, long pImageMemoryBarriers);

}
