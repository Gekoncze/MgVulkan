package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdWriteBufferMarkerAMD.html">khronos documentation</a>
 **/
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
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, pipelineStage != null ? pipelineStage.getVkAddress() : VkPointer.NULL_ADDRESS, dstBuffer != null ? dstBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, dstOffset != null ? dstOffset.getVkAddress() : VkPointer.NULL_ADDRESS, marker != null ? marker.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long commandBuffer, long pipelineStage, long dstBuffer, long dstOffset, long marker);
}
