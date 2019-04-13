package cz.mg.vulkan;

public class PFNvkCmdBindPipeline extends VkFunctionPointer {
    public PFNvkCmdBindPipeline() {
    }

    public PFNvkCmdBindPipeline(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdBindPipeline(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdBindPipeline(long value) {
        setValue(value);
    }

    public PFNvkCmdBindPipeline(VkInstance instance) {
        super(instance, new VkString("vkCmdBindPipeline"));
    }

    public void call(VkCommandBuffer commandBuffer, VkPipelineBindPoint pipelineBindPoint, VkPipeline pipeline){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getSinkAddress(), pipelineBindPoint != null ? pipelineBindPoint.getVkAddress() : VkPointer.getSinkAddress(), pipeline != null ? pipeline.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long commandBuffer, long pipelineBindPoint, long pipeline);
}
