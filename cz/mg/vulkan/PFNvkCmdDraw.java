package cz.mg.vulkan;

public class PFNvkCmdDraw extends VkFunctionPointer {
    public PFNvkCmdDraw() {
    }

    public PFNvkCmdDraw(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdDraw(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdDraw(long value) {
        setValue(value);
    }

    public PFNvkCmdDraw(VkInstance instance) {
        super(instance, new VkString("vkCmdDraw"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 vertexCount, VkUInt32 instanceCount, VkUInt32 firstVertex, VkUInt32 firstInstance){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getSinkAddress(), vertexCount != null ? vertexCount.getVkAddress() : VkPointer.getSinkAddress(), instanceCount != null ? instanceCount.getVkAddress() : VkPointer.getSinkAddress(), firstVertex != null ? firstVertex.getVkAddress() : VkPointer.getSinkAddress(), firstInstance != null ? firstInstance.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long commandBuffer, long vertexCount, long instanceCount, long firstVertex, long firstInstance);
}
