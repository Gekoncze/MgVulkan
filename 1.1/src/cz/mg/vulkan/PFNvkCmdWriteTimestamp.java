package cz.mg.vulkan;

public class PFNvkCmdWriteTimestamp extends VkFunctionPointer {
    public PFNvkCmdWriteTimestamp() {
    }

    protected PFNvkCmdWriteTimestamp(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdWriteTimestamp(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdWriteTimestamp(long value) {
        setValue(value);
    }

    public PFNvkCmdWriteTimestamp(VkInstance instance) {
        super(instance, new VkString("vkCmdWriteTimestamp"));
    }

    public void call(VkCommandBuffer commandBuffer, VkPipelineStageFlagBits pipelineStage, VkQueryPool queryPool, VkUInt32 query){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), pipelineStage != null ? pipelineStage.getVkAddress() : VkPointer.getNullAddressNative(), queryPool != null ? queryPool.getVkAddress() : VkPointer.getNullAddressNative(), query != null ? query.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void call(long vkaddress, long commandBuffer, long pipelineStage, long queryPool, long query);
}
