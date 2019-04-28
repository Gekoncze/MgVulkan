package cz.mg.vulkan;

public class PFNvkCmdBindPipeline extends VkFunctionPointer {
    public PFNvkCmdBindPipeline() {
    }

    protected PFNvkCmdBindPipeline(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdBindPipeline(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdBindPipeline(long value) {
        setValue(value);
    }

    public PFNvkCmdBindPipeline(VkInstance instance) {
        super(instance, new VkString("vkCmdBindPipeline"));
    }

    public void call(VkCommandBuffer commandBuffer, VkPipelineBindPoint pipelineBindPoint, VkPipeline pipeline){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), pipelineBindPoint != null ? pipelineBindPoint.getVkAddress() : VkPointer.getNullAddressNative(), pipeline != null ? pipeline.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long pipelineBindPoint, long pipeline);


    public void call(VkCommandBuffer commandBuffer, int pipelineBindPoint, VkPipeline pipeline){
        callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), pipelineBindPoint, pipeline != null ? pipeline.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void callSimplifiedNative(long vkaddress, long commandBuffer, int pipelineBindPoint, long pipeline);

}
