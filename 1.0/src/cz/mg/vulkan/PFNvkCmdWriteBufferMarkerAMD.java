package cz.mg.vulkan;

public class PFNvkCmdWriteBufferMarkerAMD extends VkFunctionPointer {
    public PFNvkCmdWriteBufferMarkerAMD() {
    }

    protected PFNvkCmdWriteBufferMarkerAMD(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdWriteBufferMarkerAMD(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdWriteBufferMarkerAMD(long value) {
        setValue(value);
    }

    public PFNvkCmdWriteBufferMarkerAMD(VkInstance instance) {
        super(instance, new VkString("vkCmdWriteBufferMarkerAMD"));
    }

    public void call(VkCommandBuffer commandBuffer, VkPipelineStageFlagBits pipelineStage, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkUInt32 marker){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), pipelineStage != null ? pipelineStage.getVkAddress() : VkPointer.getNullAddressNative(), dstBuffer != null ? dstBuffer.getVkAddress() : VkPointer.getNullAddressNative(), dstOffset != null ? dstOffset.getVkAddress() : VkPointer.getNullAddressNative(), marker != null ? marker.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long pipelineStage, long dstBuffer, long dstOffset, long marker);


    public void call(VkCommandBuffer commandBuffer, int pipelineStage, VkBuffer dstBuffer, long dstOffset, int marker){
        callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), pipelineStage, dstBuffer != null ? dstBuffer.getVkAddress() : VkPointer.getNullAddressNative(), dstOffset, marker);
    }

    protected static native void callSimplifiedNative(long vkaddress, long commandBuffer, int pipelineStage, long dstBuffer, long dstOffset, int marker);

}
