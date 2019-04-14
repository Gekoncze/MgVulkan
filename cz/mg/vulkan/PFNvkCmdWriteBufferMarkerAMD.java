package cz.mg.vulkan;

public class PFNvkCmdWriteBufferMarkerAMD extends VkFunctionPointer {
    public PFNvkCmdWriteBufferMarkerAMD() {
    }

    public PFNvkCmdWriteBufferMarkerAMD(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdWriteBufferMarkerAMD(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdWriteBufferMarkerAMD(long value) {
        setValue(value);
    }

    public PFNvkCmdWriteBufferMarkerAMD(VkInstance instance) {
        super(instance, new VkString("vkCmdWriteBufferMarkerAMD"));
    }

    public void call(VkCommandBuffer commandBuffer, VkPipelineStageFlagBits pipelineStage, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkUInt32 marker){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddress(), pipelineStage != null ? pipelineStage.getVkAddress() : VkPointer.getNullAddress(), dstBuffer != null ? dstBuffer.getVkAddress() : VkPointer.getNullAddress(), dstOffset != null ? dstOffset.getVkAddress() : VkPointer.getNullAddress(), marker != null ? marker.getVkAddress() : VkPointer.getNullAddress());
    }

    private static native void call(long vkaddress, long commandBuffer, long pipelineStage, long dstBuffer, long dstOffset, long marker);
}
