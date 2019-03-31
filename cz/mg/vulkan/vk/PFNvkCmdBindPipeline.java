package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdBindPipeline.html">khronos documentation</a>
 **/
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
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkCommandBuffer.NULL.getVkAddress(), pipelineBindPoint != null ? pipelineBindPoint.getVkAddress() : VkPointer.NULL, pipeline != null ? pipeline.getVkAddress() : VkPipeline.NULL.getVkAddress());
    }

    private static native void call(long vkaddress, long commandBuffer, long pipelineBindPoint, long pipeline);
}
