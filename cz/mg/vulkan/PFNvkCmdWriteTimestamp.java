package cz.mg.vulkan;

public class PFNvkCmdWriteTimestamp extends VkFunctionPointer {
    public PFNvkCmdWriteTimestamp() {
    }

    public PFNvkCmdWriteTimestamp(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdWriteTimestamp(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdWriteTimestamp(long value) {
        setValue(value);
    }

    public PFNvkCmdWriteTimestamp(VkInstance instance) {
        super(instance, new VkString("vkCmdWriteTimestamp"));
    }

    public void call(VkCommandBuffer commandBuffer, VkPipelineStageFlagBits pipelineStage, VkQueryPool queryPool, VkUInt32 query){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddress(), pipelineStage != null ? pipelineStage.getVkAddress() : VkPointer.getNullAddress(), queryPool != null ? queryPool.getVkAddress() : VkPointer.getNullAddress(), query != null ? query.getVkAddress() : VkPointer.getNullAddress());
    }

    private static native void call(long vkaddress, long commandBuffer, long pipelineStage, long queryPool, long query);
}
