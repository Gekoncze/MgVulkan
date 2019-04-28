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

    public void call(VkCommandBuffer commandBuffer, int pipelineStage, VkQueryPool queryPool, int query){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), pipelineStage, queryPool != null ? queryPool.getVkAddress() : VkPointer.getNullAddressNative(), query);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, int pipelineStage, long queryPool, int query);

}
